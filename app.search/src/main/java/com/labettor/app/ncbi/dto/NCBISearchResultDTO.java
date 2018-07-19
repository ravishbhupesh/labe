package com.labettor.app.ncbi.dto;

import java.util.HashMap;
import java.util.Map;

public class NCBISearchResultDTO {

	public NCBISearchResultDTO() {
	}

	private String articleTitle;
	private String catalogueNumber;
	private String author;
	private String productLink;
	private String publicationLink;
	private String protocol;
	private Map<String, String> additionalInformations = new HashMap<>();

	/**
	 * status = 0 : Response Received <br/>
	 * status = 1 : No Search Records
	 */
	private int status = 0;

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
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

	public Map<String, String> getAdditionalInformations() {
		return additionalInformations;
	}

	public void addToAdditionalInformations(String key, String value) {
		this.additionalInformations.put(key, value);
	}

	public void addToAdditionalInformations(Map<String, String> info) {
		this.additionalInformations.putAll(info);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Brand Name : " + this.getArticleTitle());
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
		sb.append("Additional Information : " + this.getAdditionalInformations());
		return sb.toString();
	}
}