/**
 * 
 */
package com.labettor.app.ncbi.service;

import com.labettor.app.ncbi.dto.NCBISearchDTO;
import com.labettor.app.ncbi.dto.NCBISearchResultDTO;

/**
 *
 */
public interface NCBIService {

	NCBISearchResultDTO info(NCBISearchDTO searchDTO);
	
	NCBISearchResultDTO search(NCBISearchDTO searchDTO);
}
