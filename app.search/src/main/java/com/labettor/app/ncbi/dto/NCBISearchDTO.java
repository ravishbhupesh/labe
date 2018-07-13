package com.labettor.app.ncbi.dto;

public class NCBISearchDTO implements Cloneable {

	private String db;
	private String hostCellOrCellType;
	private String experiment;
	private boolean freeFullText;
	private String dateFrom;

	public NCBISearchDTO() {
	}

	public NCBISearchDTO(String db, String hostCellOrCellType, String experiment, boolean freeFullText,
			String dateFrom) {
		this.db = db;
		this.hostCellOrCellType = hostCellOrCellType;
		this.experiment = experiment;
		this.freeFullText = freeFullText;
		this.dateFrom = dateFrom;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getHostCellOrCellType() {
		return hostCellOrCellType;
	}

	public void setHostCellOrCellType(String hostCellOrCellType) {
		this.hostCellOrCellType = hostCellOrCellType;
	}

	public String getExperiment() {
		return experiment;
	}

	public void setExperiment(String experiment) {
		this.experiment = experiment;
	}

	public boolean isFreeFullText() {
		return freeFullText;
	}

	public void setFreeFullText(boolean freeFullText) {
		this.freeFullText = freeFullText;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Db : " + this.getDb());
		sb.append("\n");
		sb.append("HostCell/CellType : " + this.getHostCellOrCellType());
		sb.append("\n");
		sb.append("Experiment : " + this.getExperiment());
		sb.append("\n");
		sb.append("Free Full Text : " + this.isFreeFullText());
		sb.append("\n");
		sb.append("Date From : " + this.getDateFrom());
		return sb.toString();
	}
}
