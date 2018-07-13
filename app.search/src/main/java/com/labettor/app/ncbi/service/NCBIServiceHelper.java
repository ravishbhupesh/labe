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
import com.labettor.app.ncbi.utils.Logger;
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
		Logger.log("Request Received : " + searchDTO);
		String infoUrl = urlBuilder.searchURL(searchDTO);
		Logger.log("URL : " + infoUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(infoUrl, String.class);
		Logger.log("StatusCode : " + response.getStatusCode());
		Logger.log(response.getBody());
		NCBISearchResultsDTO searchResultsDTO = new NCBISearchResultsDTO(searchDTO);
		return searchResultsDTO;
	}

	public List<Integer> esearchoai(NCBISearchDTO searchDTO) {
		Logger.log("NCBIServiceHelper::esearchoai::START");
		NCBISearchDTO searchDTO1 = null;
		try {
			searchDTO1 = (NCBISearchDTO) searchDTO.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
		searchDTO1.setDb("pmc");
		Logger.log("NCBIServiceHelper::esearchoai::END");
		return esearch(searchDTO1);
	}

	public List<Integer> esearch(NCBISearchDTO searchDTO) {
		Logger.log("NCBIServiceHelper::esearch::START");
		Logger.log("Request Received : " + searchDTO);
		String searchUrl = urlBuilder.searchURL(searchDTO);
		Logger.log("URL : " + searchUrl);
		System.out.println("URL : " + searchUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(searchUrl, String.class);
		Logger.log("StatusCode : " + response.getStatusCode());
		Logger.log(response.getBody());
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ESearchResult.class);
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlStreamReader = xmlInputFactory
					.createXMLStreamReader(new StreamSource(new ByteArrayInputStream(response.getBody().getBytes())));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			ESearchResult eSearchResult = (ESearchResult) unmarshaller.unmarshal(xmlStreamReader);
			Logger.log("eSearchResult :: " + eSearchResult);
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
						ids.add(new Integer(id.getvalue()));
						// if (ids.size() >= MAX_ID)
						if (ids.size() >= 1)
							break;
					}
				}
			}
			Logger.log("ids : " + ids);
			Logger.log("NCBIServiceHelper::esearch::END");
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
		Logger.log("NCBIServiceHelper::efetch::START");
		Logger.log("Request a list : " + uIds);
		// String fetchUrl = urlBuilder.fetchURL(searchResultDTO.getDb(),
		// convertToCommaSeperatedString(uIds));

		String fetchUrl = urlBuilder.fetchURL(searchResultsDTO.getSearchDTO().getDb(),
				uIds.stream().map(number -> String.valueOf(number)).collect(Collectors.joining(",")));

		Logger.log("URL : " + fetchUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(fetchUrl, String.class);
		Logger.log("StatusCode : " + response.getStatusCode());
		Logger.log("Headers : " + response.getHeaders());
		// Logger.log("Body : " + response.getBody());
		System.out.println("Body : " + response.getBody());
		ESearchResponseParser parser = eSearchResponseParserFactory
				.getESearchResponseParser(searchResultsDTO.getSearchDTO().getDb());
		try {
			List<NCBISearchResultDTO> results = parser.parser(response.getBody().getBytes("UTF-8"));
			if (results.size() > 0)
				searchResultsDTO.getResults().addAll(results);
		} catch (UnsupportedEncodingException e) {
			searchResultsDTO.setStatus("Error parsing response!");
		}
		Logger.log("NCBIServiceHelper::efetch::END");
		return searchResultsDTO;
	}

	public NCBISearchResultsDTO getRecords(List<Integer> uIds, NCBISearchResultsDTO searchResultsDTO) {
		Logger.log("NCBIServiceHelper::getRecords::START");
		Logger.log("Request a list : " + uIds);
		// String fetchUrl = urlBuilder.fetchURL(searchResultDTO.getDb(),
		// convertToCommaSeperatedString(uIds));
		ESearchResponseParser parser = eSearchResponseParserFactory
				.getESearchResponseParser(searchResultsDTO.getSearchDTO().getDb());
		for (Integer uId : uIds) {
			System.out.println("uId:" + uId);
			String url = urlBuilder.getRecordsURL(uId);
			Logger.log("URL : " + url);
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
			Logger.log("StatusCode : " + response.getStatusCode());
			Logger.log("Headers : " + response.getHeaders());
			// Logger.log("Body : " + response.getBody());
			System.out.println("Body : " + response.getBody());
			try {
				List<NCBISearchResultDTO> results = parser.parser(response.getBody().getBytes("UTF-8"));
				if (results.size() > 0)
					searchResultsDTO.getResults().addAll(results);
			} catch (UnsupportedEncodingException e) {
				searchResultsDTO.setStatus("Error parsing response!");
			}
		}

		Logger.log("NCBIServiceHelper::getRecords::END");
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

}
