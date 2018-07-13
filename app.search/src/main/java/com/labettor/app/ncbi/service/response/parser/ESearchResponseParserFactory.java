package com.labettor.app.ncbi.service.response.parser;

import com.labettor.app.ncbi.service.response.parser.impl.OAIPMHResponseParser;
import com.labettor.app.ncbi.service.response.parser.impl.PMCESearchResponseParser;
import com.labettor.app.ncbi.service.response.parser.impl.PubmedESearchResponseParser;
import com.labettor.app.ncbi.utils.Logger;

public class ESearchResponseParserFactory {

	private static ESearchResponseParserFactory INSTANCE = new ESearchResponseParserFactory();

	private ESearchResponseParserFactory() {
	}

	public static ESearchResponseParserFactory getInstance() {
		return INSTANCE;
	}

	public ESearchResponseParser getESearchResponseParser(String db) {
		Logger.log("ESearchResponseParserFactory::getESearchResponseParser::START");
		if ("pubmed".equals(db)) {
			Logger.log("ESearchResponseParserFactory::getESearchResponseParser::END");
			return new PubmedESearchResponseParser();
		} else if ("pmc".equals(db)) {
			Logger.log("ESearchResponseParserFactory::getESearchResponseParser::END");
			return new PMCESearchResponseParser();
		} else if ("OAI".equals(db)) {
			Logger.log("ESearchResponseParserFactory::getESearchResponseParser::END");
			return new OAIPMHResponseParser();
		}
		return null;
	}
}
