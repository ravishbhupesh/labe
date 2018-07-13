//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.13 at 12:51:46 PM CEST 
//


package com.labettor.thirdparty.oai;

import java.util.ArrayList;
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
 *       &lt;group ref="{https://jats.nlm.nih.gov/ns/archiving/1.0/}ack-model"/&gt;
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "secMeta",
    "label",
    "title1",
    "addressOrAlternativesOrArray",
    "sec",
    "notesOrFnGroupOrGlossary"
})
@XmlRootElement(name = "ack")
public class Ack {

    @XmlElement(name = "sec-meta")
    protected SecMeta secMeta;
    protected Label label;
    @XmlElement(name = "title")
    protected Title title1;
    @XmlElements({
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "alternatives", type = Alternatives.class),
        @XmlElement(name = "array", type = Array.class),
        @XmlElement(name = "boxed-text", type = BoxedText.class),
        @XmlElement(name = "chem-struct-wrap", type = ChemStructWrap.class),
        @XmlElement(name = "code", type = Code.class),
        @XmlElement(name = "fig", type = Fig.class),
        @XmlElement(name = "fig-group", type = FigGroup.class),
        @XmlElement(name = "graphic", type = Graphic.class),
        @XmlElement(name = "media", type = Media.class),
        @XmlElement(name = "preformat", type = Preformat.class),
        @XmlElement(name = "supplementary-material", type = SupplementaryMaterial.class),
        @XmlElement(name = "table-wrap", type = TableWrap.class),
        @XmlElement(name = "table-wrap-group", type = TableWrapGroup.class),
        @XmlElement(name = "disp-formula", type = DispFormula.class),
        @XmlElement(name = "disp-formula-group", type = DispFormulaGroup.class),
        @XmlElement(name = "def-list", type = DefList.class),
        @XmlElement(name = "list", type = com.labettor.thirdparty.oai.List.class),
        @XmlElement(name = "tex-math", type = TexMath.class),
        @XmlElement(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = MathType.class),
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "related-article", type = RelatedArticle.class),
        @XmlElement(name = "related-object", type = RelatedObject.class),
        @XmlElement(name = "ack", type = Ack.class),
        @XmlElement(name = "disp-quote", type = DispQuote.class),
        @XmlElement(name = "speech", type = Speech.class),
        @XmlElement(name = "statement", type = Statement.class),
        @XmlElement(name = "verse-group", type = VerseGroup.class),
        @XmlElement(name = "x", type = X.class)
    })
    protected java.util.List<Object> addressOrAlternativesOrArray;
    protected java.util.List<Sec> sec;
    @XmlElements({
        @XmlElement(name = "notes", type = Notes.class),
        @XmlElement(name = "fn-group", type = FnGroup.class),
        @XmlElement(name = "glossary", type = Glossary.class),
        @XmlElement(name = "ref-list", type = RefList.class)
    })
    protected java.util.List<Object> notesOrFnGroupOrGlossary;
    @XmlAttribute(name = "content-type")
    protected String contentType;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "specific-use")
    protected String specificUse;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Gets the value of the secMeta property.
     * 
     * @return
     *     possible object is
     *     {@link SecMeta }
     *     
     */
    public SecMeta getSecMeta() {
        return secMeta;
    }

    /**
     * Sets the value of the secMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecMeta }
     *     
     */
    public void setSecMeta(SecMeta value) {
        this.secMeta = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the title1 property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle1() {
        return title1;
    }

    /**
     * Sets the value of the title1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle1(Title value) {
        this.title1 = value;
    }

    /**
     * Gets the value of the addressOrAlternativesOrArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressOrAlternativesOrArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressOrAlternativesOrArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * {@link Alternatives }
     * {@link Array }
     * {@link BoxedText }
     * {@link ChemStructWrap }
     * {@link Code }
     * {@link Fig }
     * {@link FigGroup }
     * {@link Graphic }
     * {@link Media }
     * {@link Preformat }
     * {@link SupplementaryMaterial }
     * {@link TableWrap }
     * {@link TableWrapGroup }
     * {@link DispFormula }
     * {@link DispFormulaGroup }
     * {@link DefList }
     * {@link com.labettor.thirdparty.oai.List }
     * {@link TexMath }
     * {@link MathType }
     * {@link P }
     * {@link RelatedArticle }
     * {@link RelatedObject }
     * {@link Ack }
     * {@link DispQuote }
     * {@link Speech }
     * {@link Statement }
     * {@link VerseGroup }
     * {@link X }
     * 
     * 
     */
    public java.util.List<Object> getAddressOrAlternativesOrArray() {
        if (addressOrAlternativesOrArray == null) {
            addressOrAlternativesOrArray = new ArrayList<Object>();
        }
        return this.addressOrAlternativesOrArray;
    }

    /**
     * Gets the value of the sec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sec }
     * 
     * 
     */
    public java.util.List<Sec> getSec() {
        if (sec == null) {
            sec = new ArrayList<Sec>();
        }
        return this.sec;
    }

    /**
     * Gets the value of the notesOrFnGroupOrGlossary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesOrFnGroupOrGlossary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesOrFnGroupOrGlossary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notes }
     * {@link FnGroup }
     * {@link Glossary }
     * {@link RefList }
     * 
     * 
     */
    public java.util.List<Object> getNotesOrFnGroupOrGlossary() {
        if (notesOrFnGroupOrGlossary == null) {
            notesOrFnGroupOrGlossary = new ArrayList<Object>();
        }
        return this.notesOrFnGroupOrGlossary;
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