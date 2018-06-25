/**
 * 
 */
package com.labettor.app.ncbi.service.impl;

import java.util.List;

import com.labettor.app.ncbi.dto.NCBISearchDTO;
import com.labettor.app.ncbi.dto.NCBISearchResultsDTO;
import com.labettor.app.ncbi.service.NCBIService;
import com.labettor.app.ncbi.service.NCBIServiceHelper;

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
		System.out.println("NCBIServiceImpl::search::START");
		NCBISearchResultsDTO searchResultsDTO = new NCBISearchResultsDTO(searchDTO);
		List<Integer> uIds = HELPER.esearch(searchDTO);
		if (null != uIds && uIds.size() == 0) {
			return searchResultsDTO;
		}
		searchResultsDTO = HELPER.efetch(uIds, searchResultsDTO);
		if (null == searchResultsDTO)
			return null;
		System.out.println("NCBIServiceImpl::search::END");
		return searchResultsDTO;
	}

}
