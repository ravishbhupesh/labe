//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.13 at 12:51:35 PM CEST 
//


package com.labettor.thirdparty.pubmed;

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
    "publisherName",
    "publisherLocation"
})
@XmlRootElement(name = "Publisher")
public class Publisher {

    @XmlElement(name = "PublisherName", required = true)
    protected String publisherName;
    @XmlElement(name = "PublisherLocation")
    protected String publisherLocation;

    /**
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    /**
     * Gets the value of the publisherLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherLocation() {
        return publisherLocation;
    }

    /**
     * Sets the value of the publisherLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherLocation(String value) {
        this.publisherLocation = value;
    }

}
