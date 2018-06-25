/**
 * 
 */
package com.labettor.app.ncbi.service;

import com.labettor.app.ncbi.dto.NCBISearchDTO;
import com.labettor.app.ncbi.dto.NCBISearchResultsDTO;

/**
 *
 */
public interface NCBIService {

	NCBISearchResultsDTO info(NCBISearchDTO searchDTO);

	NCBISearchResultsDTO search(NCBISearchDTO searchDTO);
}
