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
import com.labettor.app.ncbi.dto.NCBISearchResultsDTO;
import com.labettor.app.ncbi.service.response.parser.ESearchResponseParser;
import com.labettor.app.ncbi.service.response.parser.ESearchResponseParserFactory;
import com.labettor.app.ncbi.utils.NCBIEUtilURLBuilder;
import com.labettor.thirdparty.esearch.Count;
import com.labettor.thirdparty.esearch.ESearchResult;
import com.labettor.thirdparty.esearch.Id;
import com.labettor.thirdparty.esearch.IdList;

public class NCBIServiceHelper {

	private final static NCBIServiceHelper INSTANCE = new NCBIServiceHelper();

	private NCBIServiceHelper() {
	}

	public static NCBIServiceHelper getInstance() {
		return INSTANCE;
	}

	private final int MAX_ID = 3;
	private final NCBIEUtilURLBuilder urlBuilder = NCBIEUtilURLBuilder.getInstance();
	private final ESearchResponseParserFactory eSearchResponseParserFactory = ESearchResponseParserFactory
			.getInstance();

	public NCBISearchResultsDTO einfo(NCBISearchDTO searchDTO) {
		log("Request Received : " + searchDTO);
		String infoUrl = urlBuilder.searchURL(searchDTO);
		log("URL : " + infoUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(infoUrl, String.class);
		log("StatusCode : " + response.getStatusCode());
		log(response.getBody());
		NCBISearchResultsDTO searchResultsDTO = new NCBISearchResultsDTO(searchDTO);
		return searchResultsDTO;
	}

	public List<Integer> esearch(NCBISearchDTO searchDTO) {
		log("Request Received : " + searchDTO);
		String searchUrl = urlBuilder.searchURL(searchDTO);
		log("URL : " + searchUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(searchUrl, String.class);
		log("StatusCode : " + response.getStatusCode());
		log(response.getBody());
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ESearchResult.class);
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlStreamReader = xmlInputFactory
					.createXMLStreamReader(new StreamSource(new ByteArrayInputStream(response.getBody().getBytes())));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			ESearchResult eSearchResult = (ESearchResult) unmarshaller.unmarshal(xmlStreamReader);
			log("eSearchResult :: " + eSearchResult);
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
			log("ids : " + ids);
			return ids;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		} catch (XMLStreamException e) {
			e.printStackTrace();
			return null;
		}
	}

	public NCBISearchResultsDTO efetch(List<Integer> uIds, NCBISearchResultsDTO searchResultsDTO) {
		log("Request a list : " + uIds);
		// String fetchUrl = urlBuilder.fetchURL(searchResultDTO.getDb(),
		// convertToCommaSeperatedString(uIds));

		String fetchUrl = urlBuilder.fetchURL(searchResultsDTO.getSearchDTO().getDb(),
				uIds.stream().map(number -> String.valueOf(number)).collect(Collectors.joining(",")));

		log("URL : " + fetchUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(fetchUrl, String.class);
		log("StatusCode : " + response.getStatusCode());
		log("Headers : " + response.getHeaders());
		log("Body : " + response.getBody());
		ESearchResponseParser parser = eSearchResponseParserFactory
				.getESearchResponseParser(searchResultsDTO.getSearchDTO().getDb());
		try {
			List<NCBISearchResultDTO> results = parser.parser(response.getBody().getBytes("UTF-8"));
			if (results.size() > 0)
				searchResultsDTO.getResults().addAll(results);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return searchResultsDTO;
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

	private void log(String msg) {
		// System.out.println(msg);
	}

}
