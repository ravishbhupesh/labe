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
		System.out.println("ESearchResponseParserFactory::getESearchResponseParser::START");
		if ("pubmed".equals(db)) {
			System.out.println("ESearchResponseParserFactory::getESearchResponseParser::END");
			return new PubmedESearchResponseParser();
		} else if ("pmc".equals(db)) {
			System.out.println("ESearchResponseParserFactory::getESearchResponseParser::END");
			return new PMCESearchResponseParser();
		}
		return null;
	}
}
