//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.13 at 12:51:46 PM CEST 
//


package com.labettor.thirdparty.oai;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;group ref="{https://jats.nlm.nih.gov/ns/archiving/1.0/}product-elements"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="product-type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}actuate"/&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}role"/&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}show"/&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}title"/&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}type fixed="simple""/&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "product")
public class Product {

    @XmlElementRefs({
        @XmlElementRef(name = "styled-content", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = StyledContent.class),
        @XmlElementRef(name = "edition", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Edition.class),
        @XmlElementRef(name = "email", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Email.class),
        @XmlElementRef(name = "monospace", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Monospace.class),
        @XmlElementRef(name = "gov", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Gov.class),
        @XmlElementRef(name = "volume-series", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = VolumeSeries.class),
        @XmlElementRef(name = "issue", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Issue.class),
        @XmlElementRef(name = "underline", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Underline.class),
        @XmlElementRef(name = "target", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Target.class),
        @XmlElementRef(name = "year", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Year.class),
        @XmlElementRef(name = "sup", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Sup.class),
        @XmlElementRef(name = "chem-struct", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ChemStruct.class),
        @XmlElementRef(name = "price", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Price.class),
        @XmlElementRef(name = "name", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Name.class),
        @XmlElementRef(name = "std", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Std.class),
        @XmlElementRef(name = "supplement", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Supplement.class),
        @XmlElementRef(name = "milestone-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = MilestoneEnd.class),
        @XmlElementRef(name = "institution-wrap", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = InstitutionWrap.class),
        @XmlElementRef(name = "alternatives", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Alternatives.class),
        @XmlElementRef(name = "elocation-id", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ElocationId.class),
        @XmlElementRef(name = "hr", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Hr.class),
        @XmlElementRef(name = "string-date", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = StringDate.class),
        @XmlElementRef(name = "conf-date", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ConfDate.class),
        @XmlElementRef(name = "fn", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Fn.class),
        @XmlElementRef(name = "inline-formula", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = InlineFormula.class),
        @XmlElementRef(name = "overline", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Overline.class),
        @XmlElementRef(name = "strike", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Strike.class),
        @XmlElementRef(name = "x", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = X.class),
        @XmlElementRef(name = "overline-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = OverlineEnd.class),
        @XmlElementRef(name = "institution", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Institution.class),
        @XmlElementRef(name = "issue-part", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = IssuePart.class),
        @XmlElementRef(name = "date-in-citation", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = DateInCitation.class),
        @XmlElementRef(name = "collab-alternatives", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = CollabAlternatives.class),
        @XmlElementRef(name = "isbn", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Isbn.class),
        @XmlElementRef(name = "version", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Version.class),
        @XmlElementRef(name = "data-title", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = DataTitle.class),
        @XmlElementRef(name = "ext-link", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ExtLink.class),
        @XmlElementRef(name = "season", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Season.class),
        @XmlElementRef(name = "abbrev", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Abbrev.class),
        @XmlElementRef(name = "pub-id", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = PubId.class),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class),
        @XmlElementRef(name = "label", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Label.class),
        @XmlElementRef(name = "inline-graphic", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = InlineGraphic.class),
        @XmlElementRef(name = "sans-serif", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = SansSerif.class),
        @XmlElementRef(name = "source", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Source.class),
        @XmlElementRef(name = "roman", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Roman.class),
        @XmlElementRef(name = "conf-name", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ConfName.class),
        @XmlElementRef(name = "patent", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Patent.class),
        @XmlElementRef(name = "object-id", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ObjectId.class),
        @XmlElementRef(name = "publisher-loc", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = PublisherLoc.class),
        @XmlElementRef(name = "chapter-title", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ChapterTitle.class),
        @XmlElementRef(name = "series", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Series.class),
        @XmlElementRef(name = "month", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Month.class),
        @XmlElementRef(name = "overline-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = OverlineStart.class),
        @XmlElementRef(name = "uri", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Uri.class),
        @XmlElementRef(name = "conf-sponsor", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ConfSponsor.class),
        @XmlElementRef(name = "fpage", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Fpage.class),
        @XmlElementRef(name = "ruby", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Ruby.class),
        @XmlElementRef(name = "trans-title", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = TransTitle.class),
        @XmlElementRef(name = "part-title", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = PartTitle.class),
        @XmlElementRef(name = "sc", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Sc.class),
        @XmlElementRef(name = "comment", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Comment.class),
        @XmlElementRef(name = "volume-id", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = VolumeId.class),
        @XmlElementRef(name = "named-content", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = NamedContent.class),
        @XmlElementRef(name = "break", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Break.class),
        @XmlElementRef(name = "inline-supplementary-material", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = InlineSupplementaryMaterial.class),
        @XmlElementRef(name = "volume", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Volume.class),
        @XmlElementRef(name = "person-group", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = PersonGroup.class),
        @XmlElementRef(name = "size", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Size.class),
        @XmlElementRef(name = "role", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Role.class),
        @XmlElementRef(name = "issue-id", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = IssueId.class),
        @XmlElementRef(name = "private-char", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = PrivateChar.class),
        @XmlElementRef(name = "sub", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Sub.class),
        @XmlElementRef(name = "issue-title", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = IssueTitle.class),
        @XmlElementRef(name = "article-title", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ArticleTitle.class),
        @XmlElementRef(name = "name-alternatives", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = NameAlternatives.class),
        @XmlElementRef(name = "underline-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = UnderlineStart.class),
        @XmlElementRef(name = "page-range", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = PageRange.class),
        @XmlElementRef(name = "related-object", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = RelatedObject.class),
        @XmlElementRef(name = "issn-l", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = IssnL.class),
        @XmlElementRef(name = "string-name", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = StringName.class),
        @XmlElementRef(name = "publisher-name", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = PublisherName.class),
        @XmlElementRef(name = "milestone-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = MilestoneStart.class),
        @XmlElementRef(name = "related-article", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = RelatedArticle.class),
        @XmlElementRef(name = "collab", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Collab.class),
        @XmlElementRef(name = "etal", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Etal.class),
        @XmlElementRef(name = "issn", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Issn.class),
        @XmlElementRef(name = "date", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Date.class),
        @XmlElementRef(name = "conf-acronym", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ConfAcronym.class),
        @XmlElementRef(name = "fixed-case", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = FixedCase.class),
        @XmlElementRef(name = "bold", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Bold.class),
        @XmlElementRef(name = "underline-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = UnderlineEnd.class),
        @XmlElementRef(name = "day", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Day.class),
        @XmlElementRef(name = "annotation", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Annotation.class),
        @XmlElementRef(name = "lpage", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Lpage.class),
        @XmlElementRef(name = "xref", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Xref.class),
        @XmlElementRef(name = "conf-loc", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ConfLoc.class),
        @XmlElementRef(name = "trans-source", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = TransSource.class),
        @XmlElementRef(name = "italic", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Italic.class),
        @XmlElementRef(name = "tex-math", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = TexMath.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "product-type")
    protected String productType;
    @XmlAttribute(name = "specific-use")
    protected String specificUse;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected String actuate;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected String show;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected String type;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StyledContent }
     * {@link Edition }
     * {@link Email }
     * {@link Monospace }
     * {@link Gov }
     * {@link VolumeSeries }
     * {@link Issue }
     * {@link Underline }
     * {@link Target }
     * {@link Year }
     * {@link Sup }
     * {@link ChemStruct }
     * {@link Price }
     * {@link Name }
     * {@link Std }
     * {@link Supplement }
     * {@link MilestoneEnd }
     * {@link InstitutionWrap }
     * {@link Alternatives }
     * {@link ElocationId }
     * {@link Hr }
     * {@link StringDate }
     * {@link ConfDate }
     * {@link Fn }
     * {@link InlineFormula }
     * {@link Overline }
     * {@link Strike }
     * {@link X }
     * {@link OverlineEnd }
     * {@link Institution }
     * {@link IssuePart }
     * {@link DateInCitation }
     * {@link CollabAlternatives }
     * {@link Isbn }
     * {@link Version }
     * {@link DataTitle }
     * {@link ExtLink }
     * {@link String }
     * {@link Season }
     * {@link Abbrev }
     * {@link PubId }
     * {@link JAXBElement }{@code <}{@link MathType }{@code >}
     * {@link Label }
     * {@link InlineGraphic }
     * {@link SansSerif }
     * {@link Source }
     * {@link Roman }
     * {@link ConfName }
     * {@link Patent }
     * {@link ObjectId }
     * {@link PublisherLoc }
     * {@link ChapterTitle }
     * {@link Series }
     * {@link Month }
     * {@link OverlineStart }
     * {@link Uri }
     * {@link ConfSponsor }
     * {@link Fpage }
     * {@link Ruby }
     * {@link TransTitle }
     * {@link PartTitle }
     * {@link Sc }
     * {@link Comment }
     * {@link VolumeId }
     * {@link NamedContent }
     * {@link Break }
     * {@link InlineSupplementaryMaterial }
     * {@link Volume }
     * {@link PersonGroup }
     * {@link Size }
     * {@link Role }
     * {@link IssueId }
     * {@link PrivateChar }
     * {@link Sub }
     * {@link IssueTitle }
     * {@link ArticleTitle }
     * {@link NameAlternatives }
     * {@link UnderlineStart }
     * {@link PageRange }
     * {@link RelatedObject }
     * {@link IssnL }
     * {@link StringName }
     * {@link PublisherName }
     * {@link MilestoneStart }
     * {@link RelatedArticle }
     * {@link Collab }
     * {@link Etal }
     * {@link Issn }
     * {@link Date }
     * {@link ConfAcronym }
     * {@link FixedCase }
     * {@link Bold }
     * {@link UnderlineEnd }
     * {@link Day }
     * {@link Annotation }
     * {@link Lpage }
     * {@link Xref }
     * {@link ConfLoc }
     * {@link TransSource }
     * {@link Italic }
     * {@link TexMath }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "simple";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
