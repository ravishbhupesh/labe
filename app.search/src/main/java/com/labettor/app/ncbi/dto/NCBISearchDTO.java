package com.labettor.app.ncbi.dto;

public class NCBISearchDTO {

	private String host;
	private String experiment; 
	private String cellType;
	
	public NCBISearchDTO(String host, String experiment, String cellType) {
		this.host = host;
		this.experiment = experiment;
		this.cellType = cellType;
	}
	
	public String getHost() {
		return host;
	}
	public String getExperiment() {
		return experiment;
	}
	public String getCellType() {
		return cellType;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Host : " + this.getHost());
		sb.append("\n");
		sb.append("Experiment : " + this.getExperiment());
		sb.append("\n");
		sb.append("Cell Type : " + this.getCellType());
		return sb.toString();
	}
}
