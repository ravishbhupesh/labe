//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.13 at 12:51:46 PM CEST 
//


package com.labettor.thirdparty.oai;

import java.util.ArrayList;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;group ref="{https://jats.nlm.nih.gov/ns/archiving/1.0/}td.content" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;attribute name="abbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="align"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="center"/&gt;
 *             &lt;enumeration value="char"/&gt;
 *             &lt;enumeration value="justify"/&gt;
 *             &lt;enumeration value="left"/&gt;
 *             &lt;enumeration value="right"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="axis" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="char" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="charoff" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="colspan" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="headers" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *       &lt;attribute name="scope"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="col"/&gt;
 *             &lt;enumeration value="colgroup"/&gt;
 *             &lt;enumeration value="row"/&gt;
 *             &lt;enumeration value="rowgroup"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="valign"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="baseline"/&gt;
 *             &lt;enumeration value="bottom"/&gt;
 *             &lt;enumeration value="middle"/&gt;
 *             &lt;enumeration value="top"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
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
    "content"
})
@XmlRootElement(name = "td")
public class Td {

    @XmlElementRefs({
        @XmlElementRef(name = "roman", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Roman.class),
        @XmlElementRef(name = "styled-content", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = StyledContent.class),
        @XmlElementRef(name = "citation-alternatives", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = CitationAlternatives.class),
        @XmlElementRef(name = "graphic", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Graphic.class),
        @XmlElementRef(name = "array", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Array.class),
        @XmlElementRef(name = "email", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Email.class),
        @XmlElementRef(name = "monospace", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Monospace.class),
        @XmlElementRef(name = "disp-formula", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = DispFormula.class),
        @XmlElementRef(name = "overline-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = OverlineStart.class),
        @XmlElementRef(name = "underline", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Underline.class),
        @XmlElementRef(name = "target", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Target.class),
        @XmlElementRef(name = "uri", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Uri.class),
        @XmlElementRef(name = "sup", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Sup.class),
        @XmlElementRef(name = "element-citation", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ElementCitation.class),
        @XmlElementRef(name = "ruby", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Ruby.class),
        @XmlElementRef(name = "chem-struct", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ChemStruct.class),
        @XmlElementRef(name = "code", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Code.class),
        @XmlElementRef(name = "sc", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Sc.class),
        @XmlElementRef(name = "named-content", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = NamedContent.class),
        @XmlElementRef(name = "break", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Break.class),
        @XmlElementRef(name = "inline-supplementary-material", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = InlineSupplementaryMaterial.class),
        @XmlElementRef(name = "milestone-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = MilestoneEnd.class),
        @XmlElementRef(name = "alternatives", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Alternatives.class),
        @XmlElementRef(name = "hr", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Hr.class),
        @XmlElementRef(name = "nlm-citation", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = NlmCitation.class),
        @XmlElementRef(name = "private-char", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = PrivateChar.class),
        @XmlElementRef(name = "fn", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Fn.class),
        @XmlElementRef(name = "sub", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Sub.class),
        @XmlElementRef(name = "underline-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = UnderlineStart.class),
        @XmlElementRef(name = "inline-formula", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = InlineFormula.class),
        @XmlElementRef(name = "overline", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Overline.class),
        @XmlElementRef(name = "strike", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Strike.class),
        @XmlElementRef(name = "x", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = X.class),
        @XmlElementRef(name = "chem-struct-wrap", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ChemStructWrap.class),
        @XmlElementRef(name = "media", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Media.class),
        @XmlElementRef(name = "related-object", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = RelatedObject.class),
        @XmlElementRef(name = "disp-formula-group", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = DispFormulaGroup.class),
        @XmlElementRef(name = "mixed-citation", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = MixedCitation.class),
        @XmlElementRef(name = "overline-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = OverlineEnd.class),
        @XmlElementRef(name = "milestone-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = MilestoneStart.class),
        @XmlElementRef(name = "p", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = P.class),
        @XmlElementRef(name = "related-article", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = RelatedArticle.class),
        @XmlElementRef(name = "ext-link", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ExtLink.class),
        @XmlElementRef(name = "preformat", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Preformat.class),
        @XmlElementRef(name = "abbrev", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Abbrev.class),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class),
        @XmlElementRef(name = "fixed-case", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = FixedCase.class),
        @XmlElementRef(name = "bold", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Bold.class),
        @XmlElementRef(name = "underline-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = UnderlineEnd.class),
        @XmlElementRef(name = "inline-graphic", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = InlineGraphic.class),
        @XmlElementRef(name = "sans-serif", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = SansSerif.class),
        @XmlElementRef(name = "def-list", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = DefList.class),
        @XmlElementRef(name = "xref", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Xref.class),
        @XmlElementRef(name = "italic", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Italic.class),
        @XmlElementRef(name = "tex-math", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = TexMath.class),
        @XmlElementRef(name = "list", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = com.labettor.thirdparty.oai.List.class)
    })
    @XmlMixed
    protected java.util.List<Object> content;
    @XmlAttribute(name = "abbr")
    protected String abbr;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute(name = "axis")
    protected String axis;
    @XmlAttribute(name = "char")
    protected String _char;
    @XmlAttribute(name = "charoff")
    protected String charoff;
    @XmlAttribute(name = "colspan")
    protected String colspan;
    @XmlAttribute(name = "content-type")
    protected String contentType;
    @XmlAttribute(name = "headers")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected java.util.List<Object> headers;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "rowspan")
    protected String rowspan;
    @XmlAttribute(name = "scope")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scope;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "valign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valign;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

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
     * {@link Roman }
     * {@link StyledContent }
     * {@link CitationAlternatives }
     * {@link Graphic }
     * {@link Array }
     * {@link Email }
     * {@link Monospace }
     * {@link DispFormula }
     * {@link OverlineStart }
     * {@link Underline }
     * {@link Target }
     * {@link Uri }
     * {@link Sup }
     * {@link ElementCitation }
     * {@link Ruby }
     * {@link ChemStruct }
     * {@link Code }
     * {@link Sc }
     * {@link NamedContent }
     * {@link Break }
     * {@link InlineSupplementaryMaterial }
     * {@link MilestoneEnd }
     * {@link Alternatives }
     * {@link Hr }
     * {@link NlmCitation }
     * {@link PrivateChar }
     * {@link Fn }
     * {@link Sub }
     * {@link UnderlineStart }
     * {@link InlineFormula }
     * {@link Overline }
     * {@link Strike }
     * {@link X }
     * {@link ChemStructWrap }
     * {@link Media }
     * {@link RelatedObject }
     * {@link DispFormulaGroup }
     * {@link MixedCitation }
     * {@link OverlineEnd }
     * {@link MilestoneStart }
     * {@link P }
     * {@link RelatedArticle }
     * {@link ExtLink }
     * {@link String }
     * {@link Preformat }
     * {@link Abbrev }
     * {@link JAXBElement }{@code <}{@link MathType }{@code >}
     * {@link FixedCase }
     * {@link Bold }
     * {@link UnderlineEnd }
     * {@link InlineGraphic }
     * {@link SansSerif }
     * {@link DefList }
     * {@link Xref }
     * {@link Italic }
     * {@link TexMath }
     * {@link com.labettor.thirdparty.oai.List }
     * 
     * 
     */
    public java.util.List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the abbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * Sets the value of the abbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbr(String value) {
        this.abbr = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the axis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis() {
        return axis;
    }

    /**
     * Sets the value of the axis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis(String value) {
        this.axis = value;
    }

    /**
     * Gets the value of the char property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChar() {
        return _char;
    }

    /**
     * Sets the value of the char property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChar(String value) {
        this._char = value;
    }

    /**
     * Gets the value of the charoff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharoff() {
        return charoff;
    }

    /**
     * Sets the value of the charoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharoff(String value) {
        this.charoff = value;
    }

    /**
     * Gets the value of the colspan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColspan() {
        if (colspan == null) {
            return "1";
        } else {
            return colspan;
        }
    }

    /**
     * Sets the value of the colspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColspan(String value) {
        this.colspan = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public java.util.List<Object> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<Object>();
        }
        return this.headers;
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
     * Gets the value of the rowspan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowspan() {
        if (rowspan == null) {
            return "1";
        } else {
            return rowspan;
        }
    }

    /**
     * Sets the value of the rowspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowspan(String value) {
        this.rowspan = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the valign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValign() {
        return valign;
    }

    /**
     * Sets the value of the valign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValign(String value) {
        this.valign = value;
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
