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
 *       &lt;group ref="{https://jats.nlm.nih.gov/ns/archiving/1.0/}sec-meta-model"/&gt;
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
    "contribGroup",
    "_abstract",
    "kwdGroup",
    "permissions"
})
@XmlRootElement(name = "sec-meta")
public class SecMeta {

    @XmlElement(name = "contrib-group")
    protected List<ContribGroup> contribGroup;
    @XmlElement(name = "abstract")
    protected List<Abstract> _abstract;
    @XmlElement(name = "kwd-group")
    protected List<KwdGroup> kwdGroup;
    protected Permissions permissions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    /**
     * Gets the value of the contribGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contribGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContribGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContribGroup }
     * 
     * 
     */
    public List<ContribGroup> getContribGroup() {
        if (contribGroup == null) {
            contribGroup = new ArrayList<ContribGroup>();
        }
        return this.contribGroup;
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
