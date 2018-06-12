package com.labettor.app.ncbi.dto;

public class NCBISearchDTO {

	private String db;
	private String hostCellOrCellType;
	private String experiment;

	public NCBISearchDTO(String db, String hostCellOrCellType, String experiment) {
		this.db = db;
		this.hostCellOrCellType = hostCellOrCellType;
		this.experiment = experiment;
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
