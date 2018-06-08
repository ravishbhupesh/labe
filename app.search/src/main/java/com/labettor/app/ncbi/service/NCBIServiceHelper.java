package com.labettor.app.ncbi.service;

import java.io.ByteArrayInputStream;
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
		String infoUrl = urlBuilder.searchURL("term=stem+cells+AND+free+fulltext");
		System.out.println("URL : " + infoUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(infoUrl, String.class);
		System.out.println("StatusCode : " + response.getStatusCode());
		System.out.println(response.getBody());
		NCBISearchResultDTO searchResultDTO = new NCBISearchResultDTO.NCBISearchResultDTOBuilder(searchDTO.getHost(),
				searchDTO.getExperiment(), searchDTO.getCellType()).build();
		return searchResultDTO;
	}

	public List<Integer> esearch(NCBISearchDTO searchDTO) {
		System.out.println("Request Received : " + searchDTO);
		StringBuilder searchInfo = new StringBuilder("term=");
		searchInfo.append(searchDTO.getHost());
		searchInfo.append("+");
		searchInfo.append(searchDTO.getExperiment());
		searchInfo.append("+");
		searchInfo.append(searchDTO.getCellType());
		// String searchUrl = urlBuilder.searchURL("term=human+cell+migration+SH-SY5Y");
		String searchUrl = urlBuilder.searchURL(searchInfo.toString());
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
		String fetchUrl = urlBuilder
				.fetchURL(uIds.stream().map(number -> String.valueOf(number)).collect(Collectors.joining(",")));
		System.out.println("URL : " + fetchUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(fetchUrl, String.class);
		System.out.println("StatusCode : " + response.getStatusCode());
		System.out.println(response.getBody());
		return null;
	}

}
