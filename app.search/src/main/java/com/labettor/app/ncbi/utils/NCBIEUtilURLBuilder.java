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
		Logger.log("NCBIEUtilURLBuilder::searchURL::START");
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
		} else {
			searchInfo.append("+");
			searchInfo.append("open+access%5Bfilter%5D");
		}
		searchInfo.append("&");
		searchInfo.append("reldate=1825&datetype=edat");
		sb.append(searchInfo.toString());
		Logger.log("NCBIEUtilURLBuilder::searchURL::END");
		return sb.toString();
	}

	/*
	 * public static void main(String[] args) { NCBIEUtilURLBuilder builder =
	 * NCBIEUtilURLBuilder.getInstance(); System.out.println(builder.searchURL(new
	 * NCBISearchDTO("pubmed", "HUVEC", "cytotixity", true, ""))); }
	 */

	public String fetchURL(String db, String idInfo) {
		Logger.log("NCBIEUtilURLBuilder::fetchURL::START");
		StringBuilder sb = new StringBuilder(NCBIEUtilitiesConstants.BASE_URL);
		sb.append(NCBIEUtilitiesConstants.URL_EXT_EFETCH);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_START);
		sb.append(NCBIEUtilitiesConstants.DB);
		sb.append(db);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_SEP);
		sb.append("id=" + idInfo);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_SEP);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_RTRN_MODE);
		Logger.log("NCBIEUtilURLBuilder::fetchURL::END");
		return sb.toString();
	}

	public String getRecordsURL(int id) {
		Logger.log("NCBIEUtilURLBuilder::fetchURL::START");
		StringBuilder sb = new StringBuilder(NCBIEUtilitiesConstants.BASE_URL_OAI);
		sb.append("?verb=GetRecord");
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_SEP);
		sb.append("identifier=oai:pubmedcentral.nih.gov:");
		sb.append(id);
		sb.append(NCBIEUtilitiesConstants.URL_PARAM_SEP);
		sb.append("metadataPrefix=pmc");
		Logger.log("NCBIEUtilURLBuilder::fetchURL::END");
		return sb.toString();
	}

}
