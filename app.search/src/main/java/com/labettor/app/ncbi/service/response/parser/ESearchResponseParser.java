package com.labettor.app.ncbi.service.response.parser;

import java.util.List;

public interface ESearchResponseParser {

	List<Object> parser(byte[] response);
}
