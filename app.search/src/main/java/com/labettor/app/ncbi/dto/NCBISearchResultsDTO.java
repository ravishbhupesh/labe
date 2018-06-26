package com.labettor.app.ncbi.dto;

import java.util.ArrayList;
import java.util.List;

public class NCBISearchResultsDTO {

	public NCBISearchResultsDTO() {
		status = "SUCCESS";
	}

	public NCBISearchResultsDTO(NCBISearchDTO searchDTO) {
		this.searchDTO = searchDTO;
		status = "SUCCESS";
	}

	/**
	 * Inputs
	 */
	private NCBISearchDTO searchDTO;
	/**
	 * Results
	 */
	private List<NCBISearchResultDTO> results = new ArrayList<>();

	private String status;

	public NCBISearchDTO getSearchDTO() {
		return searchDTO;
	}

	public void setSearchDTO(NCBISearchDTO searchDTO) {
		this.searchDTO = searchDTO;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<NCBISearchResultDTO> getResults() {

		return results;
	}

	public void setResults(List<NCBISearchResultDTO> results) {
		this.results = results;
	}

	public void addToResults(NCBISearchResultDTO result) {
		this.results.add(result);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Db : " + this.getSearchDTO().getDb());
		sb.append("\n");
		sb.append("Host : " + this.getSearchDTO().getHostCellOrCellType());
		sb.append("\n");
		sb.append("Experiment : " + this.getSearchDTO().getExperiment());
		sb.append("\n");
		sb.append("freeFullText : " + this.getSearchDTO().isFreeFullText());
		sb.append("\n");
		sb.append("DateFrom : " + this.getSearchDTO().getDateFrom());
		sb.append("\n");
		for (NCBISearchResultDTO dto : results) {
			sb.append("<----START---->");
			sb.append("Brand Name : " + dto.getBrandName());
			sb.append("\n");
			sb.append("Catalogue Number : " + dto.getCatalogueNumber());
			sb.append("\n");
			sb.append("Author : " + dto.getAuthor());
			sb.append("\n");
			sb.append("Product Link : " + dto.getProductLink());
			sb.append("\n");
			sb.append("Publication Link : " + dto.getPublicationLink());
			sb.append("\n");
			sb.append("Protocol : " + dto.getProtocol());
			sb.append("\n");
			sb.append("Additional Information : " + dto.getAdditionalInformation());
			sb.append("<----END---->");
		}
		return sb.toString();
	}
}