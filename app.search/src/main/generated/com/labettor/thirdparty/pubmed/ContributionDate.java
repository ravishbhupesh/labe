//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 12:24:58 PM CEST 
//


package com.labettor.thirdparty.pubmed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "year",
    "monthOrDayOrSeason"
})
@XmlRootElement(name = "ContributionDate")
public class ContributionDate {

    @XmlElement(name = "Year", required = true)
    protected Year year;
    @XmlElements({
        @XmlElement(name = "Month", type = Month.class),
        @XmlElement(name = "Day", type = Day.class),
        @XmlElement(name = "Season", type = Season.class)
    })
    protected List<java.lang.Object> monthOrDayOrSeason;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Year }
     *     
     */
    public Year getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Year }
     *     
     */
    public void setYear(Year value) {
        this.year = value;
    }

    /**
     * Gets the value of the monthOrDayOrSeason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthOrDayOrSeason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthOrDayOrSeason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Month }
     * {@link Day }
     * {@link Season }
     * 
     * 
     */
    public List<java.lang.Object> getMonthOrDayOrSeason() {
        if (monthOrDayOrSeason == null) {
            monthOrDayOrSeason = new ArrayList<java.lang.Object>();
        }
        return this.monthOrDayOrSeason;
    }

}
