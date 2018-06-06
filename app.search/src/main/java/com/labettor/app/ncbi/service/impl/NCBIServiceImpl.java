/**
 * 
 */
package com.labettor.app.ncbi.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.labettor.app.ncbi.dto.NCBISearchDTO;
import com.labettor.app.ncbi.dto.NCBISearchResultDTO;
import com.labettor.app.ncbi.service.NCBIService;
import com.labettor.app.ncbi.utils.NCBIEUtilURLBuilder;

/**
 * @author RavishB
 *
 */
public class NCBIServiceImpl implements NCBIService {
	
	private final NCBIEUtilURLBuilder urlBuilder = NCBIEUtilURLBuilder.getInstance();

	@Override
	public NCBISearchResultDTO info(NCBISearchDTO searchDTO) {
		System.out.println("Request Received : " + searchDTO);
		String infoUrl = urlBuilder.infoURL();
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
		System.out.println("Request Received : " + searchDTO);
		String infoUrl = urlBuilder.infoURL();
		System.out.println("URL : " + infoUrl);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(infoUrl, String.class);
		System.out.println("StatusCode : " + response.getStatusCode());
		System.out.println(response.getBody());
		NCBISearchResultDTO searchResultDTO = new NCBISearchResultDTO.NCBISearchResultDTOBuilder(searchDTO.getHost(),
				searchDTO.getExperiment(), searchDTO.getCellType()).build();
		return searchResultDTO;
	}

}
