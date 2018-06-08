/**
 * 
 */
package com.labettor.app.ncbi.utils;

import com.labettor.app.ncbi.constants.NCBIEUtilitiesConstants;

/**
 *
 */
public final class NCBIEUtilURLBuilder {

	private NCBIEUtilURLBuilder() {
	}

	private static NCBIEUtilURLBuilder INSTANCE = new NCBIEUtilURLBuilder();

	public static NCBIEUtilURLBuilder getInstance() {
		return INSTANCE;
	}

	public String infoURL() {
		StringBuilder sb = new StringBuilder(NCBIEUtilitiesConstants.BASE_URL);
		sb.append(NCBIEUtilitiesConstants.URL_EXT_EINFO);
		return sb.toString();
	}

	public String searchURL() {
		StringBuilder sb = new StringBuilder(NCBIEUtilitiesConstants.BASE_URL);
		sb.append(NCBIEUtilitiesConstants.URL_EXT_ESEARCH);
		return sb.toString();
	}

	/**
	 * https://eutils.ncbi.nlm.nih.gov/entrez/eutils/esearch.fcgi?db=pmc&term=stem+cells+AND+free+fulltext
	 * https://eutils.ncbi.nlm.nih.gov/entrez/eutils/esearch.fcgi?db=pmc&term=stem+cells+AND+free+fulltext%5bfilter%5d
	 * 
	 * https://www.ncbi.nlm.nih.gov/pubmed/?term=human+cell+migration+SH-SY5Y
	 * https://eutils.ncbi.nlm.nih.gov/entrez/eutils/esearch.fcgi?db=pmc&term=human+cell+migration+SH-SY5Y
	 */
	public String searchURL(String termInfo) {
		StringBuilder sb = new StringBuilder(NCBIEUtilitiesConstants.BASE_URL);
		sb.append(NCBIEUtilitiesConstants.URL_EXT_ESEARCH);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_START);
		sb.append(NCBIEUtilitiesConstants.DB_PUBMED);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_SEP);
		sb.append(termInfo);
		return sb.toString();
	}

	public String fetchURL(String idInfo) {
		StringBuilder sb = new StringBuilder(NCBIEUtilitiesConstants.BASE_URL);
		sb.append(NCBIEUtilitiesConstants.URL_EXT_EFETCH);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_START);
		sb.append(NCBIEUtilitiesConstants.DB_PUBMED);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_SEP);
		sb.append("id=" + idInfo);
		return sb.toString();
	}

	public static void main(String[] args) {
		NCBIEUtilURLBuilder builder = NCBIEUtilURLBuilder.getInstance();
		System.out.println(builder.searchURL("term=human+cell+migration+SH-SY5Y"));
	}

}
