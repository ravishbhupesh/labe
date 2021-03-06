//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.13 at 12:51:46 PM CEST 
//


package com.labettor.thirdparty.oai;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{https://jats.nlm.nih.gov/ns/archiving/1.0/}article-meta-model"/&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "articleId",
    "articleVersion",
    "articleVersionAlternatives",
    "articleCategories",
    "titleGroup",
    "contribGroupOrAffOrAffAlternatives",
    "authorNotes",
    "dateNotAvailableOrPubDate",
    "volume",
    "volumeId",
    "volumeSeries",
    "issue",
    "issueId",
    "issueTitle",
    "issueSponsor",
    "issuePart",
    "volumeIssueGroup",
    "isbn",
    "supplement",
    "fpage",
    "lpage",
    "pageRange",
    "elocationId",
    "emailOrExtLinkOrUri",
    "history",
    "pubHistory",
    "permissions",
    "selfUri",
    "relatedArticleOrRelatedObject",
    "_abstract",
    "transAbstract",
    "kwdGroup",
    "fundingGroup",
    "conference",
    "counts",
    "customMetaGroup"
})
@XmlRootElement(name = "article-meta")
public class ArticleMeta {

    @XmlElement(name = "article-id")
    protected List<ArticleId> articleId;
    @XmlElement(name = "article-version")
    protected ArticleVersion articleVersion;
    @XmlElement(name = "article-version-alternatives")
    protected ArticleVersionAlternatives articleVersionAlternatives;
    @XmlElement(name = "article-categories")
    protected ArticleCategories articleCategories;
    @XmlElement(name = "title-group")
    protected TitleGroup titleGroup;
    @XmlElements({
        @XmlElement(name = "contrib-group", type = ContribGroup.class),
        @XmlElement(name = "aff", type = Aff.class),
        @XmlElement(name = "aff-alternatives", type = AffAlternatives.class),
        @XmlElement(name = "x", type = X.class)
    })
    protected List<Object> contribGroupOrAffOrAffAlternatives;
    @XmlElement(name = "author-notes")
    protected AuthorNotes authorNotes;
    @XmlElements({
        @XmlElement(name = "date-not-available", type = DateNotAvailable.class),
        @XmlElement(name = "pub-date", type = PubDate.class)
    })
    protected List<Object> dateNotAvailableOrPubDate;
    protected List<Volume> volume;
    @XmlElement(name = "volume-id")
    protected List<VolumeId> volumeId;
    @XmlElement(name = "volume-series")
    protected VolumeSeries volumeSeries;
    protected List<Issue> issue;
    @XmlElement(name = "issue-id")
    protected List<IssueId> issueId;
    @XmlElement(name = "issue-title")
    protected List<IssueTitle> issueTitle;
    @XmlElement(name = "issue-sponsor")
    protected List<IssueSponsor> issueSponsor;
    @XmlElement(name = "issue-part")
    protected IssuePart issuePart;
    @XmlElement(name = "volume-issue-group")
    protected List<VolumeIssueGroup> volumeIssueGroup;
    protected List<Isbn> isbn;
    protected Supplement supplement;
    protected Fpage fpage;
    protected Lpage lpage;
    @XmlElement(name = "page-range")
    protected PageRange pageRange;
    @XmlElement(name = "elocation-id")
    protected ElocationId elocationId;
    @XmlElements({
        @XmlElement(name = "email", type = Email.class),
        @XmlElement(name = "ext-link", type = ExtLink.class),
        @XmlElement(name = "uri", type = Uri.class),
        @XmlElement(name = "product", type = Product.class),
        @XmlElement(name = "supplementary-material", type = SupplementaryMaterial.class)
    })
    protected List<Object> emailOrExtLinkOrUri;
    protected History history;
    @XmlElement(name = "pub-history")
    protected PubHistory pubHistory;
    protected Permissions permissions;
    @XmlElement(name = "self-uri")
    protected List<SelfUri> selfUri;
    @XmlElements({
        @XmlElement(name = "related-article", type = RelatedArticle.class),
        @XmlElement(name = "related-object", type = RelatedObject.class)
    })
    protected List<Object> relatedArticleOrRelatedObject;
    @XmlElement(name = "abstract")
    protected List<Abstract> _abstract;
    @XmlElement(name = "trans-abstract")
    protected List<TransAbstract> transAbstract;
    @XmlElement(name = "kwd-group")
    protected List<KwdGroup> kwdGroup;
    @XmlElement(name = "funding-group")
    protected List<FundingGroup> fundingGroup;
    protected List<Conference> conference;
    protected Counts counts;
    @XmlElement(name = "custom-meta-group")
    protected CustomMetaGroup customMetaGroup;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    /**
     * Gets the value of the articleId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articleId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticleId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticleId }
     * 
     * 
     */
    public List<ArticleId> getArticleId() {
        if (articleId == null) {
            articleId = new ArrayList<ArticleId>();
        }
        return this.articleId;
    }

    /**
     * Gets the value of the articleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleVersion }
     *     
     */
    public ArticleVersion getArticleVersion() {
        return articleVersion;
    }

    /**
     * Sets the value of the articleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleVersion }
     *     
     */
    public void setArticleVersion(ArticleVersion value) {
        this.articleVersion = value;
    }

    /**
     * Gets the value of the articleVersionAlternatives property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleVersionAlternatives }
     *     
     */
    public ArticleVersionAlternatives getArticleVersionAlternatives() {
        return articleVersionAlternatives;
    }

    /**
     * Sets the value of the articleVersionAlternatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleVersionAlternatives }
     *     
     */
    public void setArticleVersionAlternatives(ArticleVersionAlternatives value) {
        this.articleVersionAlternatives = value;
    }

    /**
     * Gets the value of the articleCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleCategories }
     *     
     */
    public ArticleCategories getArticleCategories() {
        return articleCategories;
    }

    /**
     * Sets the value of the articleCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleCategories }
     *     
     */
    public void setArticleCategories(ArticleCategories value) {
        this.articleCategories = value;
    }

    /**
     * Gets the value of the titleGroup property.
     * 
     * @return
     *     possible object is
     *     {@link TitleGroup }
     *     
     */
    public TitleGroup getTitleGroup() {
        return titleGroup;
    }

    /**
     * Sets the value of the titleGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleGroup }
     *     
     */
    public void setTitleGroup(TitleGroup value) {
        this.titleGroup = value;
    }

    /**
     * Gets the value of the contribGroupOrAffOrAffAlternatives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contribGroupOrAffOrAffAlternatives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContribGroupOrAffOrAffAlternatives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContribGroup }
     * {@link Aff }
     * {@link AffAlternatives }
     * {@link X }
     * 
     * 
     */
    public List<Object> getContribGroupOrAffOrAffAlternatives() {
        if (contribGroupOrAffOrAffAlternatives == null) {
            contribGroupOrAffOrAffAlternatives = new ArrayList<Object>();
        }
        return this.contribGroupOrAffOrAffAlternatives;
    }

    /**
     * Gets the value of the authorNotes property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorNotes }
     *     
     */
    public AuthorNotes getAuthorNotes() {
        return authorNotes;
    }

    /**
     * Sets the value of the authorNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorNotes }
     *     
     */
    public void setAuthorNotes(AuthorNotes value) {
        this.authorNotes = value;
    }

    /**
     * Gets the value of the dateNotAvailableOrPubDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateNotAvailableOrPubDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateNotAvailableOrPubDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateNotAvailable }
     * {@link PubDate }
     * 
     * 
     */
    public List<Object> getDateNotAvailableOrPubDate() {
        if (dateNotAvailableOrPubDate == null) {
            dateNotAvailableOrPubDate = new ArrayList<Object>();
        }
        return this.dateNotAvailableOrPubDate;
    }

    /**
     * Gets the value of the volume property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volume property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolume().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Volume }
     * 
     * 
     */
    public List<Volume> getVolume() {
        if (volume == null) {
            volume = new ArrayList<Volume>();
        }
        return this.volume;
    }

    /**
     * Gets the value of the volumeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolumeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolumeId }
     * 
     * 
     */
    public List<VolumeId> getVolumeId() {
        if (volumeId == null) {
            volumeId = new ArrayList<VolumeId>();
        }
        return this.volumeId;
    }

    /**
     * Gets the value of the volumeSeries property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeSeries }
     *     
     */
    public VolumeSeries getVolumeSeries() {
        return volumeSeries;
    }

    /**
     * Sets the value of the volumeSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeSeries }
     *     
     */
    public void setVolumeSeries(VolumeSeries value) {
        this.volumeSeries = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Issue }
     * 
     * 
     */
    public List<Issue> getIssue() {
        if (issue == null) {
            issue = new ArrayList<Issue>();
        }
        return this.issue;
    }

    /**
     * Gets the value of the issueId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueId }
     * 
     * 
     */
    public List<IssueId> getIssueId() {
        if (issueId == null) {
            issueId = new ArrayList<IssueId>();
        }
        return this.issueId;
    }

    /**
     * Gets the value of the issueTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueTitle }
     * 
     * 
     */
    public List<IssueTitle> getIssueTitle() {
        if (issueTitle == null) {
            issueTitle = new ArrayList<IssueTitle>();
        }
        return this.issueTitle;
    }

    /**
     * Gets the value of the issueSponsor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueSponsor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueSponsor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueSponsor }
     * 
     * 
     */
    public List<IssueSponsor> getIssueSponsor() {
        if (issueSponsor == null) {
            issueSponsor = new ArrayList<IssueSponsor>();
        }
        return this.issueSponsor;
    }

    /**
     * Gets the value of the issuePart property.
     * 
     * @return
     *     possible object is
     *     {@link IssuePart }
     *     
     */
    public IssuePart getIssuePart() {
        return issuePart;
    }

    /**
     * Sets the value of the issuePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuePart }
     *     
     */
    public void setIssuePart(IssuePart value) {
        this.issuePart = value;
    }

    /**
     * Gets the value of the volumeIssueGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumeIssueGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolumeIssueGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolumeIssueGroup }
     * 
     * 
     */
    public List<VolumeIssueGroup> getVolumeIssueGroup() {
        if (volumeIssueGroup == null) {
            volumeIssueGroup = new ArrayList<VolumeIssueGroup>();
        }
        return this.volumeIssueGroup;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isbn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsbn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Isbn }
     * 
     * 
     */
    public List<Isbn> getIsbn() {
        if (isbn == null) {
            isbn = new ArrayList<Isbn>();
        }
        return this.isbn;
    }

    /**
     * Gets the value of the supplement property.
     * 
     * @return
     *     possible object is
     *     {@link Supplement }
     *     
     */
    public Supplement getSupplement() {
        return supplement;
    }

    /**
     * Sets the value of the supplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplement }
     *     
     */
    public void setSupplement(Supplement value) {
        this.supplement = value;
    }

    /**
     * Gets the value of the fpage property.
     * 
     * @return
     *     possible object is
     *     {@link Fpage }
     *     
     */
    public Fpage getFpage() {
        return fpage;
    }

    /**
     * Sets the value of the fpage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fpage }
     *     
     */
    public void setFpage(Fpage value) {
        this.fpage = value;
    }

    /**
     * Gets the value of the lpage property.
     * 
     * @return
     *     possible object is
     *     {@link Lpage }
     *     
     */
    public Lpage getLpage() {
        return lpage;
    }

    /**
     * Sets the value of the lpage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lpage }
     *     
     */
    public void setLpage(Lpage value) {
        this.lpage = value;
    }

    /**
     * Gets the value of the pageRange property.
     * 
     * @return
     *     possible object is
     *     {@link PageRange }
     *     
     */
    public PageRange getPageRange() {
        return pageRange;
    }

    /**
     * Sets the value of the pageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageRange }
     *     
     */
    public void setPageRange(PageRange value) {
        this.pageRange = value;
    }

    /**
     * Gets the value of the elocationId property.
     * 
     * @return
     *     possible object is
     *     {@link ElocationId }
     *     
     */
    public ElocationId getElocationId() {
        return elocationId;
    }

    /**
     * Sets the value of the elocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElocationId }
     *     
     */
    public void setElocationId(ElocationId value) {
        this.elocationId = value;
    }

    /**
     * Gets the value of the emailOrExtLinkOrUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailOrExtLinkOrUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailOrExtLinkOrUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * {@link ExtLink }
     * {@link Uri }
     * {@link Product }
     * {@link SupplementaryMaterial }
     * 
     * 
     */
    public List<Object> getEmailOrExtLinkOrUri() {
        if (emailOrExtLinkOrUri == null) {
            emailOrExtLinkOrUri = new ArrayList<Object>();
        }
        return this.emailOrExtLinkOrUri;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link History }
     *     
     */
    public History getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link History }
     *     
     */
    public void setHistory(History value) {
        this.history = value;
    }

    /**
     * Gets the value of the pubHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PubHistory }
     *     
     */
    public PubHistory getPubHistory() {
        return pubHistory;
    }

    /**
     * Sets the value of the pubHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PubHistory }
     *     
     */
    public void setPubHistory(PubHistory value) {
        this.pubHistory = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link Permissions }
     *     
     */
    public Permissions getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Permissions }
     *     
     */
    public void setPermissions(Permissions value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the selfUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selfUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelfUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelfUri }
     * 
     * 
     */
    public List<SelfUri> getSelfUri() {
        if (selfUri == null) {
            selfUri = new ArrayList<SelfUri>();
        }
        return this.selfUri;
    }

    /**
     * Gets the value of the relatedArticleOrRelatedObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedArticleOrRelatedObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedArticleOrRelatedObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedArticle }
     * {@link RelatedObject }
     * 
     * 
     */
    public List<Object> getRelatedArticleOrRelatedObject() {
        if (relatedArticleOrRelatedObject == null) {
            relatedArticleOrRelatedObject = new ArrayList<Object>();
        }
        return this.relatedArticleOrRelatedObject;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Abstract }
     * 
     * 
     */
    public List<Abstract> getAbstract() {
        if (_abstract == null) {
            _abstract = new ArrayList<Abstract>();
        }
        return this._abstract;
    }

    /**
     * Gets the value of the transAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransAbstract }
     * 
     * 
     */
    public List<TransAbstract> getTransAbstract() {
        if (transAbstract == null) {
            transAbstract = new ArrayList<TransAbstract>();
        }
        return this.transAbstract;
    }

    /**
     * Gets the value of the kwdGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kwdGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKwdGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KwdGroup }
     * 
     * 
     */
    public List<KwdGroup> getKwdGroup() {
        if (kwdGroup == null) {
            kwdGroup = new ArrayList<KwdGroup>();
        }
        return this.kwdGroup;
    }

    /**
     * Gets the value of the fundingGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingGroup }
     * 
     * 
     */
    public List<FundingGroup> getFundingGroup() {
        if (fundingGroup == null) {
            fundingGroup = new ArrayList<FundingGroup>();
        }
        return this.fundingGroup;
    }

    /**
     * Gets the value of the conference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Conference }
     * 
     * 
     */
    public List<Conference> getConference() {
        if (conference == null) {
            conference = new ArrayList<Conference>();
        }
        return this.conference;
    }

    /**
     * Gets the value of the counts property.
     * 
     * @return
     *     possible object is
     *     {@link Counts }
     *     
     */
    public Counts getCounts() {
        return counts;
    }

    /**
     * Sets the value of the counts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counts }
     *     
     */
    public void setCounts(Counts value) {
        this.counts = value;
    }

    /**
     * Gets the value of the customMetaGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CustomMetaGroup }
     *     
     */
    public CustomMetaGroup getCustomMetaGroup() {
        return customMetaGroup;
    }

    /**
     * Sets the value of the customMetaGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomMetaGroup }
     *     
     */
    public void setCustomMetaGroup(CustomMetaGroup value) {
        this.customMetaGroup = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

}
