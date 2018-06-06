/**
 * 
 */
package com.labettor.app.ncbi.utils;

import com.labettor.app.ncbi.constants.NCBIEUtilitiesConstants;

/**
 *
 */
public final class NCBIEUtilURLBuilder {
	
	private NCBIEUtilURLBuilder() {}

	private static NCBIEUtilURLBuilder INSTANCE = new NCBIEUtilURLBuilder();

	public static NCBIEUtilURLBuilder getInstance() {
		return INSTANCE;
	}
	
	public String infoURL() {
		StringBuilder sb = new StringBuilder(NCBIEUtilitiesConstants.BASE_URL);
		sb.append(NCBIEUtilitiesConstants.URL_EXT_EINFO);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		NCBIEUtilURLBuilder builder = NCBIEUtilURLBuilder.getInstance();
		System.out.println(builder.infoURL());
	}
}
