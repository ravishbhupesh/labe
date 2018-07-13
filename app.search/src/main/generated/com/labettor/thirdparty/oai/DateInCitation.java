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
 *         &lt;group ref="{https://jats.nlm.nih.gov/ns/archiving/1.0/}date-in-citation-elements"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="calendar" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="iso-8601-date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "content"
})
@XmlRootElement(name = "date-in-citation")
public class DateInCitation {

    @XmlElementRefs({
        @XmlElementRef(name = "roman", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Roman.class),
        @XmlElementRef(name = "season", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Season.class),
        @XmlElementRef(name = "underline-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = UnderlineStart.class),
        @XmlElementRef(name = "overline", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Overline.class),
        @XmlElementRef(name = "sc", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Sc.class),
        @XmlElementRef(name = "strike", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Strike.class),
        @XmlElementRef(name = "x", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = X.class),
        @XmlElementRef(name = "monospace", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Monospace.class),
        @XmlElementRef(name = "overline-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = OverlineEnd.class),
        @XmlElementRef(name = "month", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Month.class),
        @XmlElementRef(name = "fixed-case", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = FixedCase.class),
        @XmlElementRef(name = "overline-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = OverlineStart.class),
        @XmlElementRef(name = "bold", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Bold.class),
        @XmlElementRef(name = "underline-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = UnderlineEnd.class),
        @XmlElementRef(name = "underline", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Underline.class),
        @XmlElementRef(name = "day", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Day.class),
        @XmlElementRef(name = "year", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Year.class),
        @XmlElementRef(name = "sans-serif", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = SansSerif.class),
        @XmlElementRef(name = "ruby", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Ruby.class),
        @XmlElementRef(name = "era", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Era.class),
        @XmlElementRef(name = "italic", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Italic.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "calendar")
    protected String calendar;
    @XmlAttribute(name = "content-type")
    protected String contentType;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "iso-8601-date")
    protected String iso8601Date;
    @XmlAttribute(name = "specific-use")
    protected String specificUse;
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
     * {@link Roman }
     * {@link Season }
     * {@link UnderlineStart }
     * {@link Overline }
     * {@link Sc }
     * {@link Strike }
     * {@link X }
     * {@link Monospace }
     * {@link OverlineEnd }
     * {@link Month }
     * {@link FixedCase }
     * {@link OverlineStart }
     * {@link Bold }
     * {@link UnderlineEnd }
     * {@link Underline }
     * {@link Day }
     * {@link Year }
     * {@link SansSerif }
     * {@link Ruby }
     * {@link Era }
     * {@link Italic }
     * {@link String }
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
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendar(String value) {
        this.calendar = value;
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
     * Gets the value of the iso8601Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso8601Date() {
        return iso8601Date;
    }

    /**
     * Sets the value of the iso8601Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso8601Date(String value) {
        this.iso8601Date = value;
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
