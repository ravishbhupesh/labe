//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.13 at 09:30:13 AM CEST 
//


package com.labettor.thirdparty.pubmed;

import java.util.ArrayList;
import java.util.List;
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
    "bookDocument",
    "deleteDocument"
})
@XmlRootElement(name = "BookDocumentSet")
public class BookDocumentSet {

    @XmlElement(name = "BookDocument")
    protected List<BookDocument> bookDocument;
    @XmlElement(name = "DeleteDocument")
    protected DeleteDocument deleteDocument;

    /**
     * Gets the value of the bookDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookDocument }
     * 
     * 
     */
    public List<BookDocument> getBookDocument() {
        if (bookDocument == null) {
            bookDocument = new ArrayList<BookDocument>();
        }
        return this.bookDocument;
    }

    /**
     * Gets the value of the deleteDocument property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteDocument }
     *     
     */
    public DeleteDocument getDeleteDocument() {
        return deleteDocument;
    }

    /**
     * Sets the value of the deleteDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteDocument }
     *     
     */
    public void setDeleteDocument(DeleteDocument value) {
        this.deleteDocument = value;
    }

}
