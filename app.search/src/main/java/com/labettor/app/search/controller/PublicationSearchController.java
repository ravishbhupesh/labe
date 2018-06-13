package com.labettor.app.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.labettor.app.ncbi.dto.NCBISearchDTO;
import com.labettor.app.ncbi.dto.NCBISearchResultDTO;
import com.labettor.app.ncbi.service.NCBIService;
import com.labettor.app.search.constants.SearchConstants;

/**
 * 
 * REST controller for the searching the publications from PUBMED based on
 * supplied parameters to this REST service.
 * 
 */
@RestController
@RequestMapping("/labettor")
public class PublicationSearchController {

	private NCBIService ncbiService;

	@Autowired
	public PublicationSearchController(NCBIService ncbiService) {
		this.ncbiService = ncbiService;
	}

	@RequestMapping("/search")
	public String search(@RequestParam(value = "db") String db,
			@RequestParam(value = "hostCellOrCellType") String hostCellOrCellType,
			@RequestParam(value = "experiment") String experiment,
			@RequestParam(value = "addParams") String addParams) {
		System.out.println("Got a search request with HostCellOrCellType : " + hostCellOrCellType + ": EXPERIMENT : "
				+ experiment);
		if (ncbiService == null) {
			System.out.println("NCBIService is NULL!");
			return SearchConstants.SEARCH_FAILURE;
		}
		NCBISearchResultDTO searchResultDTO = ncbiService
				.search(new NCBISearchDTO(db, hostCellOrCellType, experiment, addParams));
		if (null == searchResultDTO)
			return SearchConstants.SEARCH_FAILURE;
		System.out.println(searchResultDTO);
		return SearchConstants.SEARCH_SUCCESS;
	}
}
