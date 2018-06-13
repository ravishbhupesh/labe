package com.labettor.app.ncbi.service.response.parser.impl;

import java.io.ByteArrayInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.labettor.app.ncbi.service.response.parser.ESearchResponseParser;
import com.labettor.thirdparty.pubmed.Abstract;
import com.labettor.thirdparty.pubmed.AbstractText;
import com.labettor.thirdparty.pubmed.AffiliationInfo;
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
	public List<Object> parser(byte[] response) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(PubmedArticleSet.class);
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new ByteArrayInputStream(response));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			PubmedArticleSet pubmedArticleSet = (PubmedArticleSet) unmarshaller.unmarshal(xmlStreamReader);
			System.out.println("pubmedArticleSet :: " + pubmedArticleSet);
			List<Object> pubmedArticleSetObjects = pubmedArticleSet.getPubmedArticleOrPubmedBookArticle();
			/**
			 * {@link PubmedArticle } {@link PubmedBookArticle }
			 */

			for (Object o : pubmedArticleSetObjects) {
				if (o instanceof PubmedArticle) {
					System.out.println("<!-------------------- ARTICLE INFO START --------------------!>");
					PubmedArticle pubmedArticle = (PubmedArticle) o;
					MedlineCitation medlineCitation = pubmedArticle.getMedlineCitation();
					Article article = medlineCitation.getArticle();
					/**
					 * Brand name / Journal Information
					 */

					Journal journal = article.getJournal();
					System.out.println("<<<< Brand Name(Journal) : " + journal.getTitle() + ">>>>");
					/**
					 * Catalogue Number
					 */

					System.out
							.println("<<<< Catalogue Number(PMID) : " + medlineCitation.getPMID().getvalue() + ">>>>");
					/**
					 * Authors
					 */

					System.out.println("<<<< Article Title : " + article.getArticleTitle().getvalue() + ">>>>");
					AuthorList authorList = article.getAuthorList();
					System.out.println("Number of authors : " + authorList.getAuthor().size());
					System.out.println("<!----- AUTHORS START ----->");
					int j = 1;
					for (Author author : authorList.getAuthor()) {
						System.out.println(j++ + ". Name : "
								+ formatAuthorName(author.getLastNameOrForeNameOrInitialsOrSuffixOrCollectiveName()));
						System.out.println("Affiliated To : ");
						for (AffiliationInfo affiliationInfo : author.getAffiliationInfo()) {
							System.out.println("- " + affiliationInfo.getAffiliation());
						}
					}
					System.out.println("<!----- AUTHORS END ----->");
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
					System.out.println("<!----- Additional information(abstract) START -----!>");
					for (AbstractText abstractText : articleAbstract.getAbstractText()) {
						System.out.println("->" + abstractText.getLabel() + " - " + abstractText.getvalue());
					}
					System.out.println("<!----- Additional information(abstract) END -----!>");
					System.out.println("<!-------------------- ARTICLE INFO END   --------------------!>");
				}
				if (o instanceof PubmedBookArticle) {
					PubmedBookArticle pubmedBookArticle = (PubmedBookArticle) o;
					System.out.println(pubmedBookArticle);
				}
			}
			return null;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		} catch (XMLStreamException e) {
			e.printStackTrace();
			return null;
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
