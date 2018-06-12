package com.labettor.app.ncbi.service;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.labettor.app.ncbi.dto.NCBISearchDTO;
import com.labettor.app.ncbi.dto.NCBISearchResultDTO;
import com.labettor.app.ncbi.utils.NCBIEUtilURLBuilder;
import com.labettor.thirdparty.esearch.Count;
import com.labettor.thirdparty.esearch.ESearchResult;
import com.labettor.thirdparty.esearch.Id;
import com.labettor.thirdparty.esearch.IdList;
import com.labettor.thirdparty.pubmed.Abstract;
import com.labettor.thirdparty.pubmed.AbstractText;
import com.labettor.thirdparty.pubmed.AffiliationInfo;
import com.labettor.thirdparty.pubmed.Article;
import com.labettor.thirdparty.pubmed.Author;
import com.labettor.thirdparty.pubmed.AuthorList;
import com.labettor.thirdparty.pubmed.ForeName;
import com.labettor.thirdparty.pubmed.Initials;
import com.labettor.thirdparty.pubmed.Journal;
import com.labettor.thirdparty.pubmed.LastName;
import com.labettor.thirdparty.pubmed.MedlineCitation;
import com.labettor.thirdparty.pubmed.PubmedArticle;
import com.labettor.thirdparty.pubmed.PubmedArticleSet;
import com.labettor.thirdparty.pubmed.PubmedBookArticle;

public class NCBIServiceHelper {

	private final static NCBIServiceHelper INSTANCE = new NCBIServiceHelper();

	private NCBIServiceHelper() {
	}

	public static NCBIServiceHelper getInstance() {
		return INSTANCE;
	}

	private final int MAX_ID = 2;

	private final NCBIEUtilURLBuilder urlBuilder = NCBIEUtilURLBuilder.getInstance();

	public NCBISearchResultDTO einfo(NCBISearchDTO searchDTO) {
		System.out.println("Request Received : " + searchDTO);
		String infoUrl = urlBuilder.searchURL(searchDTO);
		System.out.println("URL : " + infoUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(infoUrl, String.class);
		System.out.println("StatusCode : " + response.getStatusCode());
		System.out.println(response.getBody());
		NCBISearchResultDTO searchResultDTO = new NCBISearchResultDTO.NCBISearchResultDTOBuilder(searchDTO.getDb(),
				searchDTO.getHostCellOrCellType(), searchDTO.getExperiment()).build();
		return searchResultDTO;
	}

	public List<Integer> esearch(NCBISearchDTO searchDTO) {
		System.out.println("Request Received : " + searchDTO);
		String searchUrl = urlBuilder.searchURL(searchDTO);
		System.out.println("URL : " + searchUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(searchUrl, String.class);
		System.out.println("StatusCode : " + response.getStatusCode());
		System.out.println(response.getBody());
		// ObjectFactory objectFactory = new ObjectFactory();

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ESearchResult.class);
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlStreamReader = xmlInputFactory
					.createXMLStreamReader(new StreamSource(new ByteArrayInputStream(response.getBody().getBytes())));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			ESearchResult eSearchResult = (ESearchResult) unmarshaller.unmarshal(xmlStreamReader);
			System.out.println("eSearchResult :: " + eSearchResult);
			List<Object> eSearchResultObjects = eSearchResult
					.getCountOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR();
			/**
			 * {@link Count } {@link RetMax } {@link RetStart } {@link QueryKey }
			 * {@link WebEnv } {@link IdList } {@link TranslationSet }
			 * {@link TranslationStack } {@link QueryTranslation } {@link ERROR }
			 */
			int totalCount = 0;
			List<Integer> ids = new ArrayList<>();
			for (Object o : eSearchResultObjects) {
				if (o instanceof Count) {
					Count count = (Count) o;
					totalCount = Integer.parseInt(count.getvalue());
				}
				if (o instanceof IdList && totalCount > 0) {
					IdList idList = (IdList) o;
					for (Id id : idList.getId()) {
						if (ids.size() >= MAX_ID)
							break;
						ids.add(new Integer(id.getvalue()));
					}
				}
			}
			System.out.println("ids : " + ids);
			return ids;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		} catch (XMLStreamException e) {
			e.printStackTrace();
			return null;
		}
	}

	public NCBISearchResultDTO efetch(List<Integer> uIds, NCBISearchResultDTO searchResultDTO) {
		System.out.println("Request a list : " + uIds);
		// String fetchUrl = urlBuilder.fetchURL(searchResultDTO.getDb(),
		// convertToCommaSeperatedString(uIds));

		String fetchUrl = urlBuilder.fetchURL(searchResultDTO.getDb(),
				uIds.stream().map(number -> String.valueOf(number)).collect(Collectors.joining(",")));

		System.out.println("URL : " + fetchUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(fetchUrl, String.class);
		System.out.println("StatusCode : " + response.getStatusCode());
		System.out.println("Headers : " + response.getHeaders());
		System.out.println("Body : " + response.getBody());
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(PubmedArticleSet.class);
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlStreamReader = xmlInputFactory
					.createXMLStreamReader(new ByteArrayInputStream(response.getBody().getBytes("UTF-8")));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			PubmedArticleSet pubmedArticleSet = (PubmedArticleSet) unmarshaller.unmarshal(xmlStreamReader);
			System.out.println("pubmedArticleSet :: " + pubmedArticleSet);
			List<Object> pubmedArticleSetObjects = pubmedArticleSet.getPubmedArticleOrPubmedBookArticle();
			/**
			 * {@link PubmedArticle } {@link PubmedBookArticle }
			 */

			for (Object o : pubmedArticleSetObjects) {
				if (o instanceof PubmedArticle) {
					System.out.println("<!-------------------- ARTICLE INFO START --------------------!>");
					PubmedArticle pubmedArticle = (PubmedArticle) o;
					MedlineCitation medlineCitation = pubmedArticle.getMedlineCitation();
					Article article = medlineCitation.getArticle();
					/**
					 * Brand name / Journal Information
					 */

					Journal journal = article.getJournal();
					System.out.println("Brand Name(Journal) : " + journal.getTitle());
					/**
					 * Catalogue Number
					 */

					System.out.println("Catalogue Number(PMID) : " + medlineCitation.getPMID().getvalue());
					/**
					 * Authors
					 */

					System.out.println("Article Title : " + article.getArticleTitle().getvalue());
					AuthorList authorList = article.getAuthorList();
					System.out.println("Number of authors : " + authorList.getAuthor().size());
					for (Author author : authorList.getAuthor()) {
						System.out.println("Name : "
								+ formatAuthorName(author.getLastNameOrForeNameOrInitialsOrSuffixOrCollectiveName()));
						System.out.println("Affiliated To : ");
						int i = 1;
						for (AffiliationInfo affiliationInfo : author.getAffiliationInfo()) {
							System.out.println(i++ + ". " + affiliationInfo.getAffiliation());
						}
					}
					/**
					 * Product Link
					 */

					/**
					 * Publication Link
					 */

					/**
					 * Protocol
					 */

					/**
					 * Additional information
					 */
					Abstract articleAbstract = article.getAbstract();
					System.out.println("Additional information(abstract) : ");
					for (AbstractText abstractText : articleAbstract.getAbstractText()) {
						System.out.println(" - " + abstractText.getvalue());
					}
					System.out.println("<!-------------------- ARTICLE INFO END   --------------------!>");
				}
				if (o instanceof PubmedBookArticle) {
					PubmedBookArticle pubmedBookArticle = (PubmedBookArticle) o;
					System.out.println(pubmedBookArticle);
				}
			}
			return null;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		} catch (XMLStreamException e) {
			e.printStackTrace();
			return null;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

	private String formatAuthorName(List<Object> lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName) {
		String lastName = null, firstName = null, initials = null;
		for (Object o : lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName) {
			/**
			 * * {@link LastName } {@link ForeName } {@link Initials } {@link Suffix }
			 * {@link CollectiveName }
			 */
			if (o instanceof LastName)
				lastName = ((LastName) o).getvalue();
			if (o instanceof ForeName)
				firstName = ((ForeName) o).getvalue();
			if (o instanceof Initials)
				initials = ((Initials) o).getvalue();
		}
		return initials + ". " + firstName + " " + lastName;
	}

	protected static String convertToCommaSeperatedString(List<Integer> uIds) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (Integer id : uIds) {
			sb.append(Integer.toString(id));
			if (++i < uIds.size())
				sb.append(",");
		}
		return sb.toString();
	}

}
