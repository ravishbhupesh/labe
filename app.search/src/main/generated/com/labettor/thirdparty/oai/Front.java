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
 *       &lt;group ref="{https://jats.nlm.nih.gov/ns/archiving/1.0/}front-model"/&gt;
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
    "journalMeta",
    "articleMeta",
    "defListOrListOrAck"
})
@XmlRootElement(name = "front")
public class Front {

    @XmlElement(name = "journal-meta")
    protected JournalMeta journalMeta;
    @XmlElement(name = "article-meta", required = true)
    protected ArticleMeta articleMeta;
    @XmlElements({
        @XmlElement(name = "def-list", type = DefList.class),
        @XmlElement(name = "list", type = com.labettor.thirdparty.oai.List.class),
        @XmlElement(name = "ack", type = Ack.class),
        @XmlElement(name = "bio", type = Bio.class),
        @XmlElement(name = "fn-group", type = FnGroup.class),
        @XmlElement(name = "glossary", type = Glossary.class),
        @XmlElement(name = "notes", type = Notes.class)
    })
    protected java.util.List<Object> defListOrListOrAck;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    /**
     * Gets the value of the journalMeta property.
     * 
     * @return
     *     possible object is
     *     {@link JournalMeta }
     *     
     */
    public JournalMeta getJournalMeta() {
        return journalMeta;
    }

    /**
     * Sets the value of the journalMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalMeta }
     *     
     */
    public void setJournalMeta(JournalMeta value) {
        this.journalMeta = value;
    }

    /**
     * Gets the value of the articleMeta property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleMeta }
     *     
     */
    public ArticleMeta getArticleMeta() {
        return articleMeta;
    }

    /**
     * Sets the value of the articleMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleMeta }
     *     
     */
    public void setArticleMeta(ArticleMeta value) {
        this.articleMeta = value;
    }

    /**
     * Gets the value of the defListOrListOrAck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defListOrListOrAck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefListOrListOrAck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefList }
     * {@link com.labettor.thirdparty.oai.List }
     * {@link Ack }
     * {@link Bio }
     * {@link FnGroup }
     * {@link Glossary }
     * {@link Notes }
     * 
     * 
     */
    public java.util.List<Object> getDefListOrListOrAck() {
        if (defListOrListOrAck == null) {
            defListOrListOrAck = new ArrayList<Object>();
        }
        return this.defListOrListOrAck;
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
