//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 10:38:20 AM CEST 
//


package com.labettor.thirdparty.esearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "term",
    "field",
    "count",
    "explode"
})
@XmlRootElement(name = "TermSet")
public class TermSet {

    @XmlElement(name = "Term", required = true)
    protected String term;
    @XmlElement(name = "Field", required = true)
    protected String field;
    @XmlElement(name = "Count", required = true)
    protected Count count;
    @XmlElement(name = "Explode", required = true)
    protected String explode;

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Count }
     *     
     */
    public Count getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Count }
     *     
     */
    public void setCount(Count value) {
        this.count = value;
    }

    /**
     * Gets the value of the explode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplode() {
        return explode;
    }

    /**
     * Sets the value of the explode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplode(String value) {
        this.explode = value;
    }

}
