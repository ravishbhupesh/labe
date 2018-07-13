//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.13 at 12:51:46 PM CEST 
//


package com.labettor.thirdparty.oai;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thickness.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="thickness"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="thin"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="thick"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "thickness", namespace = "http://www.w3.org/1998/Math/MathML")
@XmlEnum
public enum Thickness {

    @XmlEnumValue("thin")
    THIN("thin"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("thick")
    THICK("thick");
    private final String value;

    Thickness(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Thickness fromValue(String v) {
        for (Thickness c: Thickness.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
