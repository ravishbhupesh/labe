package com.labettor.app.ncbi.dto;

public class NCBISearchDTO {

	private String db;
	private String hostCellOrCellType;
	private String experiment;
	private String addParams;

	public NCBISearchDTO(String db, String hostCellOrCellType, String experiment, String addParams) {
		this.db = db;
		this.hostCellOrCellType = hostCellOrCellType;
		this.experiment = experiment;
		this.addParams = addParams;
	}

	public String getDb() {
		return db;
	}

	public String getHostCellOrCellType() {
		return hostCellOrCellType;
	}

	public String getExperiment() {
		return experiment;
	}

	public String getAddParams() {
		return addParams;
	}

	public void setAddParams(String addParams) {
		this.addParams = addParams;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Db : " + this.getDb());
		sb.append("\n");
		sb.append("HostCellOrCellType : " + this.getHostCellOrCellType());
		sb.append("\n");
		sb.append("Experiment : " + this.getExperiment());
		return sb.toString();
	}
}
