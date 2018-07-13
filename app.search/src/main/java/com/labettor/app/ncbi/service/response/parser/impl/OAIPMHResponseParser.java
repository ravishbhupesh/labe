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
import com.labettor.thirdparty.oai.Article;
import com.labettor.thirdparty.oai.ArticleTitle;
import com.labettor.thirdparty.oai.Body;
import com.labettor.thirdparty.oai.Contrib;
import com.labettor.thirdparty.oai.ContribGroup;
import com.labettor.thirdparty.oai.Front;
import com.labettor.thirdparty.oai.GetRecordType;
import com.labettor.thirdparty.oai.GivenNames;
import com.labettor.thirdparty.oai.MetadataType;
import com.labettor.thirdparty.oai.Name;
import com.labettor.thirdparty.oai.OAIPMHtype;
import com.labettor.thirdparty.oai.P;
import com.labettor.thirdparty.oai.RecordType;
import com.labettor.thirdparty.oai.RequestType;
import com.labettor.thirdparty.oai.Sec;
import com.labettor.thirdparty.oai.Sub;
import com.labettor.thirdparty.oai.Surname;
import com.labettor.thirdparty.oai.Title;

public class OAIPMHResponseParser implements ESearchResponseParser {

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
				StringBuilder sb = new StringBuilder();
				for (Object o : articleTitle.getContent()) {
					sb.append(o.toString());
				}
				/**
				 * BRAND NAME
				 */
				dto.setBrandName(sb.toString());

				for (Object o : front.getArticleMeta().getContribGroupOrAffOrAffAlternatives()) {
					Logger.log("ContribGroupOrAffOrAffAlternatives::" + o);
					List<String> authors = new ArrayList<>();
					if (o instanceof ContribGroup) {
						ContribGroup contribGroup = (ContribGroup) o;
						for (Object o1 : contribGroup.getContribGroupModel()) {
							if (o1 instanceof Contrib) {
								Contrib contrib = (Contrib) o1;
								if ("author".equals(contrib.getContribType())) {
									for (Object o2 : contrib.getContribModel()) {
										if (o2 instanceof Name) {
											Name name = (Name) o2;
											String lastName = null;
											String firstName = null;
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
											authors.add(firstName + " " + lastName);
										}
									}
								}
							}
						}
					}
					Logger.log("authors:" + authors);
					dto.setAuthor(authors.stream().collect(Collectors.joining("\n")));
				}

				Body body = article.getBody();
				for (Sec sec : body.getSec()) {
					Logger.log("sec" + sec + "::sec type:" + sec.getSecType());
					if (sec.getSecType() != null && sec.getSecType().contains("methods")) {
						Map<String, String> mnm = new HashMap<>();
						for (Sec s : sec.getSec()) {
							Title title = s.getTitle();
							StringBuilder mapKey = new StringBuilder();
							for (Object o : title.getContent())
								mapKey.append(o);
							for (Object o : s.getAddressOrAlternativesOrArray()) {
								StringBuilder mapVal = new StringBuilder();
								if (o instanceof P) {
									P p = (P) o;
									for (Object o1 : p.getContent()) {
										if (!(o1 instanceof Sub)) {
											mapVal.append(o1);
										}
									}
								}
								Logger.log(">>>" + mapKey + "::" + mapVal);
								if (mapVal.toString().length() > 0) {
									// mnm.put(mapKey.toString(), mapVal.toString());
									dto.addToAdditionalInformations(mapKey.toString(), mapVal.toString());
								}
								mapVal = null;
							}
							mapKey = null;
						}
					}
				}
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

}
