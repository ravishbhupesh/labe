package com.labettor.app.ncbi.service.response.parser;

import com.labettor.app.ncbi.service.response.parser.impl.PMCESearchResponseParser;
import com.labettor.app.ncbi.service.response.parser.impl.PubmedESearchResponseParser;

public class ESearchResponseParserFactory {

	private static ESearchResponseParserFactory INSTANCE = new ESearchResponseParserFactory();

	private ESearchResponseParserFactory() {
	}

	public static ESearchResponseParserFactory getInstance() {
		return INSTANCE;
	}

	public ESearchResponseParser getESearchResponseParser(String db) {
		if ("pubmed".equals(db))
			return new PubmedESearchResponseParser();
		else if ("pmc".equals(db))
			return new PMCESearchResponseParser();
		return null;
	}
}
