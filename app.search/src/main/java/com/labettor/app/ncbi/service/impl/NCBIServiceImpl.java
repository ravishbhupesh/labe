/**
 * 
 */
package com.labettor.app.ncbi.service.impl;

import java.util.List;

import com.labettor.app.ncbi.dto.NCBISearchDTO;
import com.labettor.app.ncbi.dto.NCBISearchResultsDTO;
import com.labettor.app.ncbi.service.NCBIService;
import com.labettor.app.ncbi.service.NCBIServiceHelper;
import com.labettor.app.ncbi.utils.Logger;

/**
 * @author RavishB
 *
 */
public class NCBIServiceImpl implements NCBIService {

	private final NCBIServiceHelper HELPER = NCBIServiceHelper.getInstance();

	@Override
	public NCBISearchResultsDTO info(NCBISearchDTO searchDTO) {
		return HELPER.einfo(searchDTO);
	}

	@Override
	public NCBISearchResultsDTO search(NCBISearchDTO searchDTO) {
		Logger.log("NCBIServiceImpl::search::START");
		if ("OAI".equals(searchDTO.getDb())) {
			return searchOAI(searchDTO);
		}
		NCBISearchResultsDTO searchResultsDTO = new NCBISearchResultsDTO(searchDTO);
		List<Integer> uIds = HELPER.esearch(searchDTO);
		if (null != uIds && uIds.size() == 0) {
			searchResultsDTO.setStatus("No Results Found!");
			return searchResultsDTO;
		}
		searchResultsDTO = HELPER.efetch(uIds, searchResultsDTO);
		Logger.log("NCBIServiceImpl::search::END");
		return searchResultsDTO;
	}

	protected NCBISearchResultsDTO searchOAI(NCBISearchDTO searchDTO) {
		Logger.log("NCBIServiceImpl::searchOAI::START");
		NCBISearchResultsDTO searchResultsDTO = new NCBISearchResultsDTO(searchDTO);
		List<Integer> uIds = HELPER.esearchoai(searchDTO);
		if (null != uIds && uIds.size() == 0) {
			searchResultsDTO.setStatus("No Results Found!");
			return searchResultsDTO;
		}
		searchResultsDTO = HELPER.getRecords(uIds, searchResultsDTO);
		Logger.log("NCBIServiceImpl::searchOAI::END");
		return searchResultsDTO;
	}

}
