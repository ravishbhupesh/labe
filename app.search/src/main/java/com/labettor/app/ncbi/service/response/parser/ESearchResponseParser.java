package com.labettor.app.ncbi.service.response.parser;

import java.util.List;

import com.labettor.app.ncbi.dto.NCBISearchResultDTO;

public interface ESearchResponseParser {

	List<NCBISearchResultDTO> parser(byte[] response);
}
