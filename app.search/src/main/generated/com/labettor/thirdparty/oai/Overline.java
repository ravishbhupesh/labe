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
 *         &lt;group ref="{https://jats.nlm.nih.gov/ns/archiving/1.0/}emphasized-text"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="toggle"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="no"/&gt;
 *             &lt;enumeration value="yes"/&gt;
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
@XmlRootElement(name = "overline")
public class Overline {

    @XmlElementRefs({
        @XmlElementRef(name = "roman", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Roman.class),
        @XmlElementRef(name = "styled-content", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = StyledContent.class),
        @XmlElementRef(name = "underline-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = UnderlineStart.class),
        @XmlElementRef(name = "inline-formula", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = InlineFormula.class),
        @XmlElementRef(name = "overline", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Overline.class),
        @XmlElementRef(name = "strike", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Strike.class),
        @XmlElementRef(name = "x", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = X.class),
        @XmlElementRef(name = "email", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Email.class),
        @XmlElementRef(name = "related-object", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = RelatedObject.class),
        @XmlElementRef(name = "monospace", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Monospace.class),
        @XmlElementRef(name = "overline-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = OverlineEnd.class),
        @XmlElementRef(name = "overline-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = OverlineStart.class),
        @XmlElementRef(name = "underline", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Underline.class),
        @XmlElementRef(name = "milestone-start", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = MilestoneStart.class),
        @XmlElementRef(name = "target", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Target.class),
        @XmlElementRef(name = "related-article", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = RelatedArticle.class),
        @XmlElementRef(name = "uri", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Uri.class),
        @XmlElementRef(name = "sup", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Sup.class),
        @XmlElementRef(name = "ruby", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Ruby.class),
        @XmlElementRef(name = "chem-struct", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ChemStruct.class),
        @XmlElementRef(name = "ext-link", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = ExtLink.class),
        @XmlElementRef(name = "sc", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Sc.class),
        @XmlElementRef(name = "abbrev", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Abbrev.class),
        @XmlElementRef(name = "named-content", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = NamedContent.class),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class),
        @XmlElementRef(name = "break", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Break.class),
        @XmlElementRef(name = "inline-supplementary-material", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = InlineSupplementaryMaterial.class),
        @XmlElementRef(name = "fixed-case", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = FixedCase.class),
        @XmlElementRef(name = "milestone-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = MilestoneEnd.class),
        @XmlElementRef(name = "alternatives", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Alternatives.class),
        @XmlElementRef(name = "bold", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Bold.class),
        @XmlElementRef(name = "underline-end", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = UnderlineEnd.class),
        @XmlElementRef(name = "inline-graphic", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = InlineGraphic.class),
        @XmlElementRef(name = "hr", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Hr.class),
        @XmlElementRef(name = "sans-serif", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = SansSerif.class),
        @XmlElementRef(name = "xref", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Xref.class),
        @XmlElementRef(name = "private-char", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = PrivateChar.class),
        @XmlElementRef(name = "fn", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Fn.class),
        @XmlElementRef(name = "sub", namespace = "https://jats.nlm.nih.gov/ns/archiving/1.0/", type = Sub.class),
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
    @XmlAttribute(name = "specific-use")
    protected String specificUse;
    @XmlAttribute(name = "toggle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String toggle;
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
     * {@link UnderlineStart }
     * {@link InlineFormula }
     * {@link Overline }
     * {@link Strike }
     * {@link X }
     * {@link Email }
     * {@link RelatedObject }
     * {@link Monospace }
     * {@link OverlineEnd }
     * {@link OverlineStart }
     * {@link Underline }
     * {@link MilestoneStart }
     * {@link Target }
     * {@link RelatedArticle }
     * {@link Uri }
     * {@link Sup }
     * {@link Ruby }
     * {@link ChemStruct }
     * {@link ExtLink }
     * {@link String }
     * {@link Sc }
     * {@link Abbrev }
     * {@link NamedContent }
     * {@link JAXBElement }{@code <}{@link MathType }{@code >}
     * {@link Break }
     * {@link InlineSupplementaryMaterial }
     * {@link FixedCase }
     * {@link MilestoneEnd }
     * {@link Alternatives }
     * {@link Bold }
     * {@link UnderlineEnd }
     * {@link InlineGraphic }
     * {@link Hr }
     * {@link SansSerif }
     * {@link Xref }
     * {@link PrivateChar }
     * {@link Fn }
     * {@link Sub }
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
     * Gets the value of the toggle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToggle() {
        return toggle;
    }

    /**
     * Sets the value of the toggle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToggle(String value) {
        this.toggle = value;
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
