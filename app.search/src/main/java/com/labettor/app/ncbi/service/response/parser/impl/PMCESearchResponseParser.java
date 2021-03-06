package com.labettor.app.ncbi.service.response.parser.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import com.labettor.app.ncbi.dto.NCBISearchResultDTO;
import com.labettor.app.ncbi.service.response.parser.ESearchResponseParser;
import com.labettor.app.ncbi.utils.Logger;
import com.labettor.thirdparty.pmc.Article;
import com.labettor.thirdparty.pmc.PmcArticleset;

public class PMCESearchResponseParser implements ESearchResponseParser {

	@Override
	public List<NCBISearchResultDTO> parser(byte[] response) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(PmcArticleset.class);
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlStreamReader = xmlInputFactory
					.createXMLStreamReader(new StreamSource(new ByteArrayInputStream(response)));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			PmcArticleset pmcArticleSet = (PmcArticleset) unmarshaller.unmarshal(xmlStreamReader);
			Logger.log("eSearchResult :: " + pmcArticleSet);
			List<Article> articles = pmcArticleSet.getArticle();
			/**
			 * {@link Count } {@link RetMax } {@link RetStart } {@link QueryKey }
			 * {@link WebEnv } {@link IdList } {@link TranslationSet }
			 * {@link TranslationStack } {@link QueryTranslation } {@link ERROR }
			 */
			List<NCBISearchResultDTO> results = new ArrayList<>();
			for (Article a : articles) {
				Logger.log(a.toString());
				Logger.log("a.getArticleType() -> " + a.getArticleType());
			}
			return results;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		} catch (XMLStreamException e) {
			e.printStackTrace();
			return null;
		}
	}

}
