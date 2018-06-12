/**
 * 
 */
package com.labettor.app.ncbi.service.impl;

import java.util.List;

import com.labettor.app.ncbi.dto.NCBISearchDTO;
import com.labettor.app.ncbi.dto.NCBISearchResultDTO;
import com.labettor.app.ncbi.service.NCBIService;
import com.labettor.app.ncbi.service.NCBIServiceHelper;

/**
 * @author RavishB
 *
 */
public class NCBIServiceImpl implements NCBIService {

	private final NCBIServiceHelper HELPER = NCBIServiceHelper.getInstance();

	@Override
	public NCBISearchResultDTO info(NCBISearchDTO searchDTO) {
		return HELPER.einfo(searchDTO);
	}

	@Override
	public NCBISearchResultDTO search(NCBISearchDTO searchDTO) {
		NCBISearchResultDTO searchResultDTO = new NCBISearchResultDTO.NCBISearchResultDTOBuilder(searchDTO.getDb(),
				searchDTO.getHostCellOrCellType(), searchDTO.getExperiment()).build();
		List<Integer> uIds = HELPER.esearch(searchDTO);
		searchResultDTO = HELPER.efetch(uIds, searchResultDTO);
		return searchResultDTO;
	}

}
