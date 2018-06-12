package com.labettor.app.ncbi.dto;

public class NCBISearchResultDTO {

	private NCBISearchResultDTO() {
	}

	/**
	 * Inputs
	 */
	private String db;
	private String hostCellOrCellType;
	private String experiment;
	/**
	 * Results
	 */
	private String brandName;
	private String catalogueNumber;
	private String author;
	private String productLink;
	private String publicationLink;
	private String protocol;
	private String additionalInformation;

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

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCatalogueNumber() {
		return catalogueNumber;
	}

	public void setCatalogueNumber(String catalogueNumber) {
		this.catalogueNumber = catalogueNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getProductLink() {
		return productLink;
	}

	public void setProductLink(String productLink) {
		this.productLink = productLink;
	}

	public String getPublicationLink() {
		return publicationLink;
	}

	public void setPublicationLink(String publicationLink) {
		this.publicationLink = publicationLink;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Db : " + this.getDb());
		sb.append("\n");
		sb.append("Host : " + this.getHostCellOrCellType());
		sb.append("\n");
		sb.append("Experiment : " + this.getExperiment());
		sb.append("\n");
		sb.append("Brand Name : " + this.getBrandName());
		sb.append("\n");
		sb.append("Catalogue Number : " + this.getCatalogueNumber());
		sb.append("\n");
		sb.append("Author : " + this.getAuthor());
		sb.append("\n");
		sb.append("Product Link : " + this.getProductLink());
		sb.append("\n");
		sb.append("Publication Link : " + this.getPublicationLink());
		sb.append("\n");
		sb.append("Protocol : " + this.getProtocol());
		sb.append("\n");
		sb.append("Additional Information : " + this.getAdditionalInformation());
		return sb.toString();
	}

	public static class NCBISearchResultDTOBuilder {

		private String db;
		private String hostCellOrCellType;
		private String experiment;
		private String brandName;
		private String catalogueNumber;
		private String author;
		private String productLink;
		private String publicationLink;
		private String protocol;
		private String additionalInformation;

		public NCBISearchResultDTOBuilder(String db, String hostCellOrCellType, String experiment) {
			this.db = db;
			this.hostCellOrCellType = hostCellOrCellType;
			this.experiment = experiment;
		}

		public NCBISearchResultDTOBuilder setBrandName(String brandName) {
			this.brandName = brandName;
			return this;
		}

		public NCBISearchResultDTOBuilder setCatalogueNumber(String catalogueNumber) {
			this.catalogueNumber = catalogueNumber;
			return this;
		}

		public NCBISearchResultDTOBuilder setAuthor(String author) {
			this.author = author;
			return this;
		}

		public NCBISearchResultDTOBuilder setProductLink(String productLink) {
			this.productLink = productLink;
			return this;
		}

		public NCBISearchResultDTOBuilder setPublicationLink(String publicationLink) {
			this.publicationLink = publicationLink;
			return this;
		}

		public NCBISearchResultDTOBuilder setProtocol(String protocol) {
			this.protocol = protocol;
			return this;
		}

		public NCBISearchResultDTOBuilder setAdditionalInformation(String additionalInformation) {
			this.additionalInformation = additionalInformation;
			return this;
		}

		public NCBISearchResultDTO build() {
			NCBISearchResultDTO dto = new NCBISearchResultDTO();
			dto.setDb(this.db);
			dto.setHostCellOrCellType(this.hostCellOrCellType);
			dto.setExperiment(this.experiment);
			dto.setBrandName(this.brandName);
			dto.setCatalogueNumber(this.catalogueNumber);
			dto.setAuthor(this.author);
			dto.setProductLink(this.productLink);
			dto.setPublicationLink(this.publicationLink);
			dto.setProtocol(this.protocol);
			dto.setAdditionalInformation(this.additionalInformation);
			return dto;
		}
	}

}
