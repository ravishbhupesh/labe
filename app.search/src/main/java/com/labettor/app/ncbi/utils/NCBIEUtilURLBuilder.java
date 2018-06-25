/**
 * 
 */
package com.labettor.app.ncbi.utils;

import com.labettor.app.ncbi.constants.NCBIEUtilitiesConstants;
import com.labettor.app.ncbi.dto.NCBISearchDTO;

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
	 * https://eutils.ncbi.nlm.nih.gov/entrez/eutils/esearch.fcgi?db=pubmed&term=RNA
	 * isolation Staphylococcus aureus
	 */
	public String searchURL(NCBISearchDTO searchDTO) {
		System.out.println("NCBIEUtilURLBuilder::searchURL::START");
		StringBuilder sb = new StringBuilder(NCBIEUtilitiesConstants.BASE_URL);
		sb.append(NCBIEUtilitiesConstants.URL_EXT_ESEARCH);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_START);
		sb.append(NCBIEUtilitiesConstants.DB);
		sb.append(searchDTO.getDb());
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_SEP);
		StringBuilder searchInfo = new StringBuilder("term=");
		searchInfo.append(searchDTO.getExperiment());
		searchInfo.append("+");
		searchInfo.append(searchDTO.getHostCellOrCellType());
		if (searchDTO.isFreeFullText()) {
			searchInfo.append("+");
			searchInfo.append("AND+free+fulltext%5filter%5");
		}
		sb.append(searchInfo.toString());
		System.out.println("NCBIEUtilURLBuilder::searchURL::END");
		return sb.toString();
	}

	public String fetchURL(String db, String idInfo) {
		System.out.println("NCBIEUtilURLBuilder::fetchURL::START");
		StringBuilder sb = new StringBuilder(NCBIEUtilitiesConstants.BASE_URL);
		sb.append(NCBIEUtilitiesConstants.URL_EXT_EFETCH);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_START);
		sb.append(NCBIEUtilitiesConstants.DB);
		sb.append(db);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_SEP);
		sb.append("id=" + idInfo);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_SEP);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_RTRN_MODE);
		System.out.println("NCBIEUtilURLBuilder::fetchURL::END");
		return sb.toString();
	}

}
