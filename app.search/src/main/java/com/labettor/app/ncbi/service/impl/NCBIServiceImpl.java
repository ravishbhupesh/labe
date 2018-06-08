/**
 * 
 */
package com.labettor.app.ncbi.service.impl;

import java.io.ByteArrayInputStream;
import java.util.List;

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
import com.labettor.app.ncbi.service.NCBIService;
import com.labettor.app.ncbi.utils.NCBIEUtilURLBuilder;
import com.labettor.thirdparty.esearch.Count;
import com.labettor.thirdparty.esearch.ERROR;
import com.labettor.thirdparty.esearch.ESearchResult;
import com.labettor.thirdparty.esearch.Id;
import com.labettor.thirdparty.esearch.IdList;
import com.labettor.thirdparty.esearch.QueryKey;
import com.labettor.thirdparty.esearch.QueryTranslation;
import com.labettor.thirdparty.esearch.RetMax;
import com.labettor.thirdparty.esearch.RetStart;
import com.labettor.thirdparty.esearch.TranslationSet;
import com.labettor.thirdparty.esearch.TranslationStack;
import com.labettor.thirdparty.esearch.WebEnv;

/**
 * @author RavishB
 *
 */
public class NCBIServiceImpl implements NCBIService {
	
	private final NCBIEUtilURLBuilder urlBuilder = NCBIEUtilURLBuilder.getInstance();

	@Override
	public NCBISearchResultDTO info(NCBISearchDTO searchDTO) {
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
	
	@Override
	public NCBISearchResultDTO search(NCBISearchDTO searchDTO) {
		
		NCBISearchResultDTO searchResultDTO = new NCBISearchResultDTO.NCBISearchResultDTOBuilder(searchDTO.getHost(),
				searchDTO.getExperiment(), searchDTO.getCellType()).build();
		
		System.out.println("Request Received : " + searchDTO);
		String searchUrl = urlBuilder.searchURL("term=stem+cells+AND+free+fulltext%5bfilter%5d");
		System.out.println("URL : " + searchUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(searchUrl, String.class);
		System.out.println("StatusCode : " + response.getStatusCode());
		System.out.println(response.getBody());
		//ObjectFactory objectFactory = new ObjectFactory();
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ESearchResult.class);
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new StreamSource(new ByteArrayInputStream(response.getBody().getBytes())));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			ESearchResult eSearchResult = (ESearchResult) unmarshaller.unmarshal(xmlStreamReader);
			System.out.println("eSearchResult :: " + eSearchResult);
			List<Object> eSearchResultObjects = eSearchResult.getCountOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR();
			/**
			 * {@link Count }
     * {@link RetMax }
     * {@link RetStart }
     * {@link QueryKey }
     * {@link WebEnv }
     * {@link IdList }
     * {@link TranslationSet }
     * {@link TranslationStack }
     * {@link QueryTranslation }
     * {@link ERROR }
			 */
			int totalCount = 0;
			for(Object o : eSearchResultObjects) {
				if(o instanceof Count) {
					Count count = (Count)o;
					System.out.println("Total records found : " + count.getvalue());
					totalCount = Integer.parseInt(count.getvalue());
				}
				if(o instanceof RetMax) {
					RetMax retMax = (RetMax)o;
					System.out.println("Total records returned : " + retMax.getvalue());
				}
				if(o instanceof IdList && totalCount > 0) {
					IdList idList = (IdList)o;
					for(Id id : idList.getId()) {
						System.out.println("Id : " + id.getvalue());
					}
				}
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		
		return searchResultDTO;
	}

}
