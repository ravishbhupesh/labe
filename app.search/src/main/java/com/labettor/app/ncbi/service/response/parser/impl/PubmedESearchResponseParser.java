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

import com.labettor.app.ncbi.dto.NCBISearchResultDTO;
import com.labettor.app.ncbi.service.response.parser.ESearchResponseParser;
import com.labettor.app.ncbi.utils.Logger;
import com.labettor.thirdparty.pubmed.Abstract;
import com.labettor.thirdparty.pubmed.AbstractText;
import com.labettor.thirdparty.pubmed.Article;
import com.labettor.thirdparty.pubmed.Author;
import com.labettor.thirdparty.pubmed.AuthorList;
import com.labettor.thirdparty.pubmed.ForeName;
import com.labettor.thirdparty.pubmed.Initials;
import com.labettor.thirdparty.pubmed.Journal;
import com.labettor.thirdparty.pubmed.LastName;
import com.labettor.thirdparty.pubmed.MedlineCitation;
import com.labettor.thirdparty.pubmed.PubmedArticle;
import com.labettor.thirdparty.pubmed.PubmedArticleSet;
import com.labettor.thirdparty.pubmed.PubmedBookArticle;

public class PubmedESearchResponseParser implements ESearchResponseParser {

	@Override
	public List<NCBISearchResultDTO> parser(byte[] response) {
		Logger.log("PubmedESearchResponseParser::parser::START");
		List<NCBISearchResultDTO> results = new ArrayList<>();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(PubmedArticleSet.class);
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new ByteArrayInputStream(response));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			PubmedArticleSet pubmedArticleSet = (PubmedArticleSet) unmarshaller.unmarshal(xmlStreamReader);
			Logger.log("pubmedArticleSet :: " + pubmedArticleSet);
			List<Object> pubmedArticleSetObjects = pubmedArticleSet.getPubmedArticleOrPubmedBookArticle();
			/**
			 * {@link PubmedArticle } {@link PubmedBookArticle }
			 */

			for (Object o : pubmedArticleSetObjects) {
				if (o instanceof PubmedArticle) {
					NCBISearchResultDTO dto = new NCBISearchResultDTO();
					Logger.log("<!-------------------- ARTICLE INFO START --------------------!>");
					PubmedArticle pubmedArticle = (PubmedArticle) o;
					MedlineCitation medlineCitation = pubmedArticle.getMedlineCitation();
					Article article = medlineCitation.getArticle();
					/**
					 * Brand name / Journal Information
					 */

					Journal journal = article.getJournal();
					// dto.setBrandName(journal.getTitle());
					dto.setBrandName(article.getArticleTitle().getvalue());
					Logger.log("<<<< Brand Name(Journal) : " + journal.getTitle() + ">>>>");
					/**
					 * Catalogue Number
					 */

					Logger.log("<<<< Catalogue Number(PMID) : " + medlineCitation.getPMID().getvalue() + ">>>>");
					dto.setCatalogueNumber(medlineCitation.getPMID().getvalue());
					/**
					 * Authors
					 */

					Logger.log("<<<< Article Title : " + article.getArticleTitle().getvalue() + ">>>>");
					AuthorList authorList = article.getAuthorList();
					Logger.log("Number of authors : " + authorList.getAuthor().size());
					Logger.log("<!----- AUTHORS START ----->");
					int j = 1;
					StringBuilder authors = new StringBuilder();
					for (Author author : authorList.getAuthor()) {
						authors.append(
								formatAuthorName(author.getLastNameOrForeNameOrInitialsOrSuffixOrCollectiveName()));
						authors.append(", ");
						Logger.log(j++ + ". Name : "
								+ formatAuthorName(author.getLastNameOrForeNameOrInitialsOrSuffixOrCollectiveName()));
						/*
						 * log("Affiliated To : "); for (AffiliationInfo affiliationInfo :
						 * author.getAffiliationInfo()) { log("- " + affiliationInfo.getAffiliation());
						 * }
						 */
					}
					dto.setAuthor(authors.toString());
					Logger.log("<!----- AUTHORS END ----->");
					/**
					 * Product Link
					 */

					/**
					 * Publication Link
					 */

					/**
					 * Protocol
					 */

					/**
					 * Additional information
					 */
					Abstract articleAbstract = article.getAbstract();
					Logger.log("<!----- Additional information(abstract) START -----!>");
					for (AbstractText abstractText : articleAbstract.getAbstractText()) {
						// Logger.log("->" + abstractText.getLabel() + " - " + abstractText.getvalue());
						// System.out.println("->" + abstractText.getLabel() + " - " +
						// abstractText.getvalue());
						dto.addToAdditionalInformations(
								abstractText.getLabel() == null ? "DEFAULT" : abstractText.getLabel(),
								abstractText.getvalue());
						if (abstractText.getLabel() != null && (abstractText.getLabel().contains("METHODS")
								|| abstractText.getLabel().contains("Methods")
								|| abstractText.getLabel().contains("methods")
								|| abstractText.getLabel().contains("MATERIALS AND METHODS")))
							dto.setProtocol(abstractText.getvalue());
					}
					Logger.log("<!----- Additional information(abstract) END -----!>");
					Logger.log("<!-------------------- ARTICLE INFO END   --------------------!>");

					results.add(dto);
				}
				if (o instanceof PubmedBookArticle) {
					PubmedBookArticle pubmedBookArticle = (PubmedBookArticle) o;
					Logger.log(pubmedBookArticle.toString());
				}
			}
			Logger.log("PubmedESearchResponseParser::parser::END");
			return results;
		} catch (JAXBException e) {
			e.printStackTrace();
			Logger.log("PubmedESearchResponseParser::parser::EXCEPTION");
			return results;
		} catch (XMLStreamException e) {
			e.printStackTrace();
			Logger.log("PubmedESearchResponseParser::parser::EXCEPTION");
			return results;
		}
	}

	private String formatAuthorName(List<Object> lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName) {
		String lastName = null, firstName = null, initials = null;
		for (Object o : lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName) {
			/**
			 * * {@link LastName } {@link ForeName } {@link Initials } {@link Suffix }
			 * {@link CollectiveName }
			 */
			if (o instanceof LastName)
				lastName = ((LastName) o).getvalue();
			if (o instanceof ForeName)
				firstName = ((ForeName) o).getvalue();
			if (o instanceof Initials)
				initials = ((Initials) o).getvalue();
		}
		return initials + ". " + firstName + " " + lastName;
	}

}
