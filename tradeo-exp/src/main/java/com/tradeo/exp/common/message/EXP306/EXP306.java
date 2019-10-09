package com.tradeo.exp.common.message.EXP306;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DutyFormHead">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TaxEntryId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DutyFormFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IEPort">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeclPort">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PayerCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PayerName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OwnerCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OwnerName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TradeCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TradeName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AgentCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AgentName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DDate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="17"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PayerScc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DutyFormList" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DelayMark">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                         &lt;minLength value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DutyFlag">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DutyFlagNote">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TaxType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RealTax">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PLimit">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="17"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GenDate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="17"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EntryList" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EntryId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="19"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CodeTS">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RealDuty">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RealTax">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RealReg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RealAnti">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RealRsv1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RealRsv2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RealNcad">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dutyFormHead",
    "dutyFormList",
    "entryList"
})
@XmlRootElement(name = "EXP306")
public class EXP306 {

    @XmlElement(name = "DutyFormHead", required = true)
    protected EXP306 .DutyFormHead dutyFormHead;
    @XmlElement(name = "DutyFormList", required = true)
    protected List<EXP306 .DutyFormList> dutyFormList;
    @XmlElement(name = "EntryList", required = true)
    protected List<EXP306 .EntryList> entryList;

    /**
     * Gets the value of the dutyFormHead property.
     * 
     * @return
     *     possible object is
     *     {@link EXP306 .DutyFormHead }
     *     
     */
    public EXP306 .DutyFormHead getDutyFormHead() {
        return dutyFormHead;
    }

    /**
     * Sets the value of the dutyFormHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXP306 .DutyFormHead }
     *     
     */
    public void setDutyFormHead(EXP306 .DutyFormHead value) {
        this.dutyFormHead = value;
    }

    /**
     * Gets the value of the dutyFormList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFormList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFormList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXP306 .DutyFormList }
     * 
     * 
     */
    public List<EXP306 .DutyFormList> getDutyFormList() {
        if (dutyFormList == null) {
            dutyFormList = new ArrayList<EXP306 .DutyFormList>();
        }
        return this.dutyFormList;
    }

    /**
     * Gets the value of the entryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXP306 .EntryList }
     * 
     * 
     */
    public List<EXP306 .EntryList> getEntryList() {
        if (entryList == null) {
            entryList = new ArrayList<EXP306 .EntryList>();
        }
        return this.entryList;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TaxEntryId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DutyFormFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IEPort">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeclPort">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PayerCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PayerName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OwnerCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OwnerName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TradeCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TradeName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AgentCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AgentName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DDate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="17"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PayerScc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "opType",
        "taxEntryId",
        "dutyFormFlag",
        "iePort",
        "declPort",
        "payerCode",
        "payerName",
        "ownerCode",
        "ownerName",
        "tradeCode",
        "tradeName",
        "agentCode",
        "agentName",
        "dDate",
        "payerScc"
    })
    public static class DutyFormHead {

        @XmlElement(name = "OpType", required = true)
        protected String opType;
        @XmlElement(name = "TaxEntryId", required = true)
        protected String taxEntryId;
        @XmlElement(name = "DutyFormFlag", required = true)
        protected String dutyFormFlag;
        @XmlElement(name = "IEPort", required = true)
        protected String iePort;
        @XmlElement(name = "DeclPort", required = true)
        protected String declPort;
        @XmlElement(name = "PayerCode", required = true)
        protected String payerCode;
        @XmlElement(name = "PayerName", required = true)
        protected String payerName;
        @XmlElement(name = "OwnerCode", required = true)
        protected String ownerCode;
        @XmlElement(name = "OwnerName", required = true)
        protected String ownerName;
        @XmlElement(name = "TradeCode", required = true)
        protected String tradeCode;
        @XmlElement(name = "TradeName", required = true)
        protected String tradeName;
        @XmlElement(name = "AgentCode", required = true)
        protected String agentCode;
        @XmlElement(name = "AgentName", required = true)
        protected String agentName;
        @XmlElement(name = "DDate", required = true)
        protected String dDate;
        @XmlElement(name = "PayerScc", required = true)
        protected String payerScc;

        /**
         * Gets the value of the opType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpType() {
            return opType;
        }

        /**
         * Sets the value of the opType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpType(String value) {
            this.opType = value;
        }

        /**
         * Gets the value of the taxEntryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxEntryId() {
            return taxEntryId;
        }

        /**
         * Sets the value of the taxEntryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxEntryId(String value) {
            this.taxEntryId = value;
        }

        /**
         * Gets the value of the dutyFormFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDutyFormFlag() {
            return dutyFormFlag;
        }

        /**
         * Sets the value of the dutyFormFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDutyFormFlag(String value) {
            this.dutyFormFlag = value;
        }

        /**
         * Gets the value of the iePort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIEPort() {
            return iePort;
        }

        /**
         * Sets the value of the iePort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIEPort(String value) {
            this.iePort = value;
        }

        /**
         * Gets the value of the declPort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclPort() {
            return declPort;
        }

        /**
         * Sets the value of the declPort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclPort(String value) {
            this.declPort = value;
        }

        /**
         * Gets the value of the payerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayerCode() {
            return payerCode;
        }

        /**
         * Sets the value of the payerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayerCode(String value) {
            this.payerCode = value;
        }

        /**
         * Gets the value of the payerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayerName() {
            return payerName;
        }

        /**
         * Sets the value of the payerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayerName(String value) {
            this.payerName = value;
        }

        /**
         * Gets the value of the ownerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerCode() {
            return ownerCode;
        }

        /**
         * Sets the value of the ownerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerCode(String value) {
            this.ownerCode = value;
        }

        /**
         * Gets the value of the ownerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerName() {
            return ownerName;
        }

        /**
         * Sets the value of the ownerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerName(String value) {
            this.ownerName = value;
        }

        /**
         * Gets the value of the tradeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeCode() {
            return tradeCode;
        }

        /**
         * Sets the value of the tradeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeCode(String value) {
            this.tradeCode = value;
        }

        /**
         * Gets the value of the tradeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeName() {
            return tradeName;
        }

        /**
         * Sets the value of the tradeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeName(String value) {
            this.tradeName = value;
        }

        /**
         * Gets the value of the agentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentCode() {
            return agentCode;
        }

        /**
         * Sets the value of the agentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentCode(String value) {
            this.agentCode = value;
        }

        /**
         * Gets the value of the agentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentName() {
            return agentName;
        }

        /**
         * Sets the value of the agentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentName(String value) {
            this.agentName = value;
        }

        /**
         * Gets the value of the dDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDDate() {
            return dDate;
        }

        /**
         * Sets the value of the dDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDDate(String value) {
            this.dDate = value;
        }

        /**
         * Gets the value of the payerScc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayerScc() {
            return payerScc;
        }

        /**
         * Sets the value of the payerScc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayerScc(String value) {
            this.payerScc = value;
        }

    }


    /**
     * 税单列表
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TaxID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DelayMark">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *               &lt;minLength value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DutyFlag">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DutyFlagNote">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TaxType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RealTax">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PLimit">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="17"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GenDate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="17"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxID",
        "delayMark",
        "dutyFlag",
        "dutyFlagNote",
        "taxType",
        "realTax",
        "pLimit",
        "genDate"
    })
    public static class DutyFormList {

        @XmlElement(name = "TaxID", required = true)
        protected String taxID;
        @XmlElement(name = "DelayMark", required = true)
        protected String delayMark;
        @XmlElement(name = "DutyFlag", required = true)
        protected String dutyFlag;
        @XmlElement(name = "DutyFlagNote", required = true)
        protected String dutyFlagNote;
        @XmlElement(name = "TaxType", required = true)
        protected String taxType;
        @XmlElement(name = "RealTax", required = true)
        protected String realTax;
        @XmlElement(name = "PLimit", required = true)
        protected String pLimit;
        @XmlElement(name = "GenDate", required = true)
        protected String genDate;

        /**
         * Gets the value of the taxID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxID() {
            return taxID;
        }

        /**
         * Sets the value of the taxID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxID(String value) {
            this.taxID = value;
        }

        /**
         * Gets the value of the delayMark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDelayMark() {
            return delayMark;
        }

        /**
         * Sets the value of the delayMark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDelayMark(String value) {
            this.delayMark = value;
        }

        /**
         * Gets the value of the dutyFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDutyFlag() {
            return dutyFlag;
        }

        /**
         * Sets the value of the dutyFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDutyFlag(String value) {
            this.dutyFlag = value;
        }

        /**
         * Gets the value of the dutyFlagNote property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDutyFlagNote() {
            return dutyFlagNote;
        }

        /**
         * Sets the value of the dutyFlagNote property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDutyFlagNote(String value) {
            this.dutyFlagNote = value;
        }

        /**
         * Gets the value of the taxType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxType() {
            return taxType;
        }

        /**
         * Sets the value of the taxType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxType(String value) {
            this.taxType = value;
        }

        /**
         * Gets the value of the realTax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealTax() {
            return realTax;
        }

        /**
         * Sets the value of the realTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealTax(String value) {
            this.realTax = value;
        }

        /**
         * Gets the value of the pLimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPLimit() {
            return pLimit;
        }

        /**
         * Sets the value of the pLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPLimit(String value) {
            this.pLimit = value;
        }

        /**
         * Gets the value of the genDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenDate() {
            return genDate;
        }

        /**
         * Sets the value of the genDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenDate(String value) {
            this.genDate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EntryId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="19"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CodeTS">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RealDuty">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RealTax">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RealReg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RealAnti">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RealRsv1">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RealRsv2">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RealNcad">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entryId",
        "gNo",
        "codeTS",
        "gName",
        "realDuty",
        "realTax",
        "realReg",
        "realAnti",
        "realRsv1",
        "realRsv2",
        "realNcad"
    })
    public static class EntryList {

        @XmlElement(name = "EntryId", required = true)
        protected String entryId;
        @XmlElement(name = "GNo", required = true)
        protected String gNo;
        @XmlElement(name = "CodeTS", required = true)
        protected String codeTS;
        @XmlElement(name = "GName", required = true)
        protected String gName;
        @XmlElement(name = "RealDuty", required = true)
        protected String realDuty;
        @XmlElement(name = "RealTax", required = true)
        protected String realTax;
        @XmlElement(name = "RealReg", required = true)
        protected String realReg;
        @XmlElement(name = "RealAnti", required = true)
        protected String realAnti;
        @XmlElement(name = "RealRsv1", required = true)
        protected String realRsv1;
        @XmlElement(name = "RealRsv2", required = true)
        protected String realRsv2;
        @XmlElement(name = "RealNcad", required = true)
        protected String realNcad;

        /**
         * Gets the value of the entryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryId() {
            return entryId;
        }

        /**
         * Sets the value of the entryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryId(String value) {
            this.entryId = value;
        }

        /**
         * Gets the value of the gNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGNo() {
            return gNo;
        }

        /**
         * Sets the value of the gNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGNo(String value) {
            this.gNo = value;
        }

        /**
         * Gets the value of the codeTS property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeTS() {
            return codeTS;
        }

        /**
         * Sets the value of the codeTS property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeTS(String value) {
            this.codeTS = value;
        }

        /**
         * Gets the value of the gName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGName() {
            return gName;
        }

        /**
         * Sets the value of the gName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGName(String value) {
            this.gName = value;
        }

        /**
         * Gets the value of the realDuty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealDuty() {
            return realDuty;
        }

        /**
         * Sets the value of the realDuty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealDuty(String value) {
            this.realDuty = value;
        }

        /**
         * Gets the value of the realTax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealTax() {
            return realTax;
        }

        /**
         * Sets the value of the realTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealTax(String value) {
            this.realTax = value;
        }

        /**
         * Gets the value of the realReg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealReg() {
            return realReg;
        }

        /**
         * Sets the value of the realReg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealReg(String value) {
            this.realReg = value;
        }

        /**
         * Gets the value of the realAnti property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealAnti() {
            return realAnti;
        }

        /**
         * Sets the value of the realAnti property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealAnti(String value) {
            this.realAnti = value;
        }

        /**
         * Gets the value of the realRsv1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealRsv1() {
            return realRsv1;
        }

        /**
         * Sets the value of the realRsv1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealRsv1(String value) {
            this.realRsv1 = value;
        }

        /**
         * Gets the value of the realRsv2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealRsv2() {
            return realRsv2;
        }

        /**
         * Sets the value of the realRsv2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealRsv2(String value) {
            this.realRsv2 = value;
        }

        /**
         * Gets the value of the realNcad property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealNcad() {
            return realNcad;
        }

        /**
         * Sets the value of the realNcad property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealNcad(String value) {
            this.realNcad = value;
        }

    }

}
