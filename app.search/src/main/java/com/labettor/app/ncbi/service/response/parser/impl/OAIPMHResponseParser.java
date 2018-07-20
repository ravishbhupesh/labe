package com.labettor.app.ncbi.service.response.parser.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import com.labettor.app.ncbi.dto.NCBISearchResultDTO;
import com.labettor.app.ncbi.service.response.parser.ESearchResponseParser;
import com.labettor.app.ncbi.utils.Logger;
import com.labettor.thirdparty.oai.Address;
import com.labettor.thirdparty.oai.Article;
import com.labettor.thirdparty.oai.ArticleMeta;
import com.labettor.thirdparty.oai.ArticleTitle;
import com.labettor.thirdparty.oai.Back;
import com.labettor.thirdparty.oai.Body;
import com.labettor.thirdparty.oai.Contrib;
import com.labettor.thirdparty.oai.ContribGroup;
import com.labettor.thirdparty.oai.Email;
import com.labettor.thirdparty.oai.ExtLink;
import com.labettor.thirdparty.oai.Front;
import com.labettor.thirdparty.oai.GetRecordType;
import com.labettor.thirdparty.oai.GivenNames;
import com.labettor.thirdparty.oai.Italic;
import com.labettor.thirdparty.oai.MetadataType;
import com.labettor.thirdparty.oai.Monospace;
import com.labettor.thirdparty.oai.Name;
import com.labettor.thirdparty.oai.OAIPMHtype;
import com.labettor.thirdparty.oai.P;
import com.labettor.thirdparty.oai.RecordType;
import com.labettor.thirdparty.oai.RequestType;
import com.labettor.thirdparty.oai.Sec;
import com.labettor.thirdparty.oai.Sub;
import com.labettor.thirdparty.oai.Sup;
import com.labettor.thirdparty.oai.Surname;
import com.labettor.thirdparty.oai.Title;
import com.labettor.thirdparty.oai.Uri;
import com.labettor.thirdparty.oai.Xref;

public class OAIPMHResponseParser implements ESearchResponseParser {

	// @Override
	/*
	 * public List<NCBISearchResultDTO> parser1(byte[] response) {
	 * List<NCBISearchResultDTO> results = new ArrayList<>(); try { JAXBContext
	 * jaxbContext = JAXBContext.newInstance("com.labettor.thirdparty.oai");
	 * XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
	 * xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
	 * XMLStreamReader xmlStreamReader = xmlInputFactory .createXMLStreamReader(new
	 * StreamSource(new ByteArrayInputStream(response))); Unmarshaller unmarshaller
	 * = jaxbContext.createUnmarshaller(); JAXBElement<OAIPMHtype> oaipmh =
	 * (JAXBElement<OAIPMHtype>) unmarshaller.unmarshal(xmlStreamReader);
	 * Logger.log(oaipmh.toString()); OAIPMHtype oaipmHtype = oaipmh.getValue();
	 * Logger.log("oaipmh: " + oaipmHtype); RequestType requestType =
	 * oaipmHtype.getRequest(); if (null != requestType && requestType.getVerb() !=
	 * null && "GetRecord".equals(requestType.getVerb().value())) {
	 * NCBISearchResultDTO dto = new NCBISearchResultDTO(); GetRecordType
	 * getRecordType = oaipmHtype.getGetRecord(); RecordType recordType =
	 * getRecordType.getRecord(); Logger.log(recordType.toString()); MetadataType
	 * metadataType = recordType.getMetadata(); Logger.log(metadataType.toString());
	 * Logger.log("metadataType.getAny()::" + metadataType.getAny());
	 * Logger.log("metadataType.getAny()::" + metadataType.getAny().getClass());
	 * 
	 * Article article = (Article) metadataType.getAny();
	 * Logger.log(article.toString());
	 * 
	 * Front front = article.getFront(); ArticleTitle articleTitle =
	 * front.getArticleMeta().getTitleGroup().getArticleTitle();
	 * 
	 *//**
		 * BRAND NAME
		 *//*
			 * dto.setBrandName(parseArticleTitle(articleTitle));
			 * 
			 * for (Object o :
			 * front.getArticleMeta().getContribGroupOrAffOrAffAlternatives()) {
			 * Logger.log("ContribGroupOrAffOrAffAlternatives::" + o); List<String> authors
			 * = new ArrayList<>(); if (o instanceof ContribGroup) { ContribGroup
			 * contribGroup = (ContribGroup) o; for (Object o1 :
			 * contribGroup.getContribGroupModel()) { if (o1 instanceof Contrib) { Contrib
			 * contrib = (Contrib) o1; if ("author".equals(contrib.getContribType())) {
			 * String lastName = null; String firstName = null; String email = null; for
			 * (Object o2 : contrib.getContribModel()) { if (o2 instanceof Name) { Name name
			 * = (Name) o2; for (Object o4 : name.getContent()) { if (o4 instanceof Surname)
			 * { Surname surname = (Surname) o4; StringBuilder namel = new StringBuilder();
			 * for (Object o5 : surname.getContent()) namel.append(o5); lastName =
			 * namel.toString(); } else if (o4 instanceof GivenNames) { GivenNames
			 * givenNames = (GivenNames) o4; StringBuilder namef = new StringBuilder(); for
			 * (Object o6 : givenNames.getContent()) namef.append(o6); firstName =
			 * namef.toString(); } } } if (o2 instanceof Address) { Address address =
			 * (Address) o2; for (Object o3 : address.getAddressModel()) { if (o3 instanceof
			 * Email) { Email email2 = (Email) o3; StringBuilder emailsb = new
			 * StringBuilder(); for (Object o4 : email2.getContent()) emailsb.append(o4);
			 * email = emailsb.toString(); emailsb = null; } } } } if (email == null)
			 * authors.add(firstName + " " + lastName); else authors.add(firstName + " " +
			 * lastName + "{" + email + "}"); } } } } Logger.log("authors:" + authors);
			 * dto.setAuthor(authors.stream().collect(Collectors.joining(","))); }
			 * 
			 * Body body = article.getBody(); for (Sec sec : body.getSec()) {
			 * Logger.log("sec" + sec + "::sec type:" + sec.getSecType()); if
			 * (sec.getSecType() != null && (sec.getSecType().contains("methods") ||
			 * sec.getSecType().contains("Methods") ||
			 * sec.getSecType().contains("METHODS"))) { Map<String, String> mnm = new
			 * HashMap<>(); for (Sec s : sec.getSec()) { Title title = s.getTitle();
			 * StringBuilder mapKey = new StringBuilder(); for (Object o :
			 * title.getContent()) mapKey.append(o); for (Object o :
			 * s.getAddressOrAlternativesOrArray()) { StringBuilder mapVal = new
			 * StringBuilder(); if (o instanceof P) { P p = (P) o; for (Object o1 :
			 * p.getContent()) { if (!(o1 instanceof Sub)) { mapVal.append(o1); } } }
			 * Logger.log(">>>" + mapKey + "::" + mapVal); if (mapVal.toString().length() >
			 * 0) { // mnm.put(mapKey.toString(), mapVal.toString());
			 * dto.addToAdditionalInformations(mapKey.toString(), mapVal.toString()); }
			 * mapVal = null; } mapKey = null; } } } results.add(dto); }
			 * Logger.log("eSearchResult :: " + oaipmh); return results; } catch
			 * (JAXBException e) { e.printStackTrace(); return new ArrayList<>(); } catch
			 * (XMLStreamException e) { e.printStackTrace(); return new ArrayList<>(); } }
			 */

	@Override
	public List<NCBISearchResultDTO> parser(byte[] response) {
		List<NCBISearchResultDTO> results = new ArrayList<>();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance("com.labettor.thirdparty.oai");
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlStreamReader = xmlInputFactory
					.createXMLStreamReader(new StreamSource(new ByteArrayInputStream(response)));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			JAXBElement<OAIPMHtype> oaipmh = (JAXBElement<OAIPMHtype>) unmarshaller.unmarshal(xmlStreamReader);
			Logger.log(oaipmh.toString());
			OAIPMHtype oaipmHtype = oaipmh.getValue();
			Logger.log("oaipmh: " + oaipmHtype);
			RequestType requestType = oaipmHtype.getRequest();
			if (null != requestType && requestType.getVerb() != null
					&& "GetRecord".equals(requestType.getVerb().value())) {
				NCBISearchResultDTO dto = new NCBISearchResultDTO();
				GetRecordType getRecordType = oaipmHtype.getGetRecord();
				RecordType recordType = getRecordType.getRecord();
				Logger.log(recordType.toString());
				MetadataType metadataType = recordType.getMetadata();
				Logger.log(metadataType.toString());
				Logger.log("metadataType.getAny()::" + metadataType.getAny());
				Logger.log("metadataType.getAny()::" + metadataType.getAny().getClass());

				Article article = (Article) metadataType.getAny();
				Logger.log(article.toString());

				Front front = article.getFront();
				ArticleTitle articleTitle = front.getArticleMeta().getTitleGroup().getArticleTitle();
				/**
				 * ARTICLE TITLE
				 */
				dto.setArticleTitle(parseArticleTitle(articleTitle));

				/**
				 * AUTHORS
				 */
				// dto.setAuthor(authors.stream().collect(Collectors.joining(",")));
				dto.setAuthor(parseArticleAuthors(front.getArticleMeta()));

				Body body = article.getBody();
				dto.addToAdditionalInformations(parseSecs(article.getBack(), body.getSec()));
				results.add(dto);
			}
			Logger.log("eSearchResult :: " + oaipmh);
			return results;
		} catch (JAXBException e) {
			e.printStackTrace();
			return new ArrayList<>();
		} catch (XMLStreamException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	private String parseArticleAuthors(ArticleMeta articleMeta) {
		List<String> authors = new ArrayList<>();
		for (Object o : articleMeta.getContribGroupOrAffOrAffAlternatives()) {
			Logger.log("ContribGroupOrAffOrAffAlternatives::" + o);
			if (o instanceof ContribGroup) {
				ContribGroup contribGroup = (ContribGroup) o;
				for (Object o1 : contribGroup.getContribGroupModel()) {
					if (o1 instanceof Contrib) {
						Contrib contrib = (Contrib) o1;
						if ("author".equals(contrib.getContribType())) {
							String lastName = null;
							String firstName = null;
							String email = null;
							for (Object o2 : contrib.getContribModel()) {
								if (o2 instanceof Name) {
									Name name = (Name) o2;
									for (Object o4 : name.getContent()) {
										if (o4 instanceof Surname) {
											Surname surname = (Surname) o4;
											StringBuilder namel = new StringBuilder();
											for (Object o5 : surname.getContent())
												namel.append(o5);
											lastName = namel.toString();
										} else if (o4 instanceof GivenNames) {
											GivenNames givenNames = (GivenNames) o4;
											StringBuilder namef = new StringBuilder();
											for (Object o6 : givenNames.getContent())
												namef.append(o6);
											firstName = namef.toString();
										}
									}
								} else if (o2 instanceof Address) {
									Address address = (Address) o2;
									for (Object o3 : address.getAddressModel()) {
										if (o3 instanceof Email) {
											Email email2 = (Email) o3;
											StringBuilder emailsb = new StringBuilder();
											for (Object o4 : email2.getContent())
												emailsb.append(o4);
											email = emailsb.toString();
											emailsb = null;
										}
									}
								} else if (o2 instanceof Email) {
									Email email2 = (Email) o2;
									email = email2.getContent().stream().map(e -> e.toString())
											.collect(Collectors.joining(","));
								}
							}
							if (email == null)
								authors.add(firstName + " " + lastName);
							else
								authors.add(firstName + " " + lastName + "{" + email + "}");
						}
					}
				}
			}
			Logger.log("authors:" + authors);
		}
		return authors.stream().collect(Collectors.joining(","));
	}

	protected Map<String, String> parseSecs(Back back, List<Sec> secs) {
		Map<String, String> mnm = new HashMap<>();
		Logger.log("No of sections : " + secs.size());
		for (Sec sec : secs) {
			// Logger.log("sec" + sec + "::sec type:" + sec.getSecType());
			Logger.log("sec" + sec + "::sec type:" + sec.getSecType());
			if (sec.getSecType() == null) {
				mnm.putAll(parseSec(back, sec));
			} else if (sec.getSecType().contains("methods") || sec.getSecType().contains("Methods")
					|| sec.getSecType().contains("METHODS")) {
				for (Sec s : sec.getSec()) {
					mnm.putAll(parseSec(back, s));
				}
			}
		}
		return mnm;
	}

	private Map<String, String> parseSec(Back back, Sec sec) {
		Map<String, String> mnm = new HashMap<>();
		Title title = sec.getTitle();
		StringBuilder mapKey = new StringBuilder();
		Logger.log("title.getContentType()::KEY::" + title.getContent());
		for (Object o : title.getContent()) {
			if (o.toString().contains("Summary and Conclusion") || o.toString().contains("Author Contributions")
					|| o.toString().contains("Conflict of Interest Statement")) {
				return mnm;
			}
			mapKey.append(o);
		}
		StringBuilder mapVal = new StringBuilder();
		for (Object o : sec.getAddressOrAlternativesOrArray()) {
			if (o instanceof P) {
				mapVal.append(parseP(back, (P) o));
			}
			Logger.log(">>>" + mapKey + "::" + mapVal);
			// dto.addToAdditionalInformations(mapKey.toString(), mapVal.toString());
		}
		if (mapVal.toString().length() > 0) {
			mnm.put(mapKey.toString(), mapVal.toString());
			mapVal = null;
		}
		mapKey = null;
		return mnm;
	}

	private String parseP(Back back, P p) {
		StringBuilder sb = new StringBuilder();
		for (Object o1 : p.getContent()) {
			if (o1 instanceof Italic) {
				sb.append(parseItalicTag((Italic) o1));
				Logger.log("-->>" + parseItalicTag((Italic) o1));
			} else if (o1 instanceof Xref) {
				Xref xref = (Xref) o1;
				if ("bibr".equals(xref.getRefType())) {
					// sb.append(parseXRefTag(back, xref));
					sb.append("BIBR - ");
				} else if ("table".equals(xref.getRefType())) {
					sb.append("TABLE - ");
				} else if ("fig".equals(xref.getRefType())) {
					sb.append("FIGURE - ");
				}
				sb.append(convertListToString(xref.getContent()));
			} else if (o1 instanceof Sub) {
				Sub sub = (Sub) o1;
				sb.append(convertListToString(sub.getContent()));
				Logger.log("o1-" + o1);
			} else if (o1 instanceof Sup) {
				Sup sup = (Sup) o1;
				sb.append(convertListToString(sup.getContent()));
				Logger.log("o1-" + o1);
			} else if (o1 instanceof Monospace) {
				Monospace monospace = (Monospace) o1;
				sb.append(convertListToString(monospace.getContent()));
				Logger.log("o1-" + o1);
			} else if (o1 instanceof ExtLink) {
				ExtLink extLink = (ExtLink) o1;
				sb.append(convertListToString(extLink.getContent()));
				Logger.log("o1-" + o1);
			} else if (o1 instanceof Uri) {
				Uri uri = (Uri) o1;
				sb.append(convertListToString(uri.getContent()));
				Logger.log("o1-" + o1);
			} else {
				sb.append(o1);
				Logger.log("o1-" + o1);
			}
		}
		return sb.toString();
	}

	private String convertListToString(List<Object> list) {
		return list.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(","));
	}

	private String parseArticleTitle(ArticleTitle articleTitle) {
		StringBuilder sb = new StringBuilder();
		for (Object o : articleTitle.getContent()) {
			if (o instanceof Italic) {
				sb.append(parseItalicTag((Italic) o));
			} else {
				sb.append(o.toString());
			}
			// Logger.log("--" + o.toString());
		}
		// Logger.log("sb.toString()" + sb.toString());
		return sb.toString();
	}

	private String parseItalicTag(Italic italic) {
		StringBuilder sb = new StringBuilder();
		for (Object o1 : italic.getContent()) {
			// Logger.log("--" + o1.toString());
			sb.append(o1.toString());
		}
		return sb.toString();
	}

}
