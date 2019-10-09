package com.tradeo.exp.common.message.EXP306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "envelopInfo",
    "dataInfo"
})
@XmlRootElement(name = "Package")
public class Package {

    @XmlElement(name = "EnvelopInfo", required = true)
    protected EnvelopInfo envelopInfo;
    @XmlElement(name = "DataInfo", required = true)
    protected Package.DataInfo dataInfo;

    /**
     * Gets the value of the envelopInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopInfo }
     *     
     */
    public EnvelopInfo getEnvelopInfo() {
        return envelopInfo;
    }

    /**
     * Sets the value of the envelopInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopInfo }
     *     
     */
    public void setEnvelopInfo(EnvelopInfo value) {
        this.envelopInfo = value;
    }

    /**
     * Gets the value of the dataInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Package.DataInfo }
     *     
     */
    public Package.DataInfo getDataInfo() {
        return dataInfo;
    }

    /**
     * Sets the value of the dataInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Package.DataInfo }
     *     
     */
    public void setDataInfo(Package.DataInfo value) {
        this.dataInfo = value;
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
     *         &lt;element name="SignedData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Data">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://www.chinaport.gov.cn/exp}EXP306"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;sequence>
     *                     &lt;element name="HashSign" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="SignerInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;/sequence>
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
        "signedData"
    })
    public static class DataInfo {

        @XmlElement(name = "SignedData", required = true)
        protected Package.DataInfo.SignedData signedData;

        /**
         * Gets the value of the signedData property.
         * 
         * @return
         *     possible object is
         *     {@link Package.DataInfo.SignedData }
         *     
         */
        public Package.DataInfo.SignedData getSignedData() {
            return signedData;
        }

        /**
         * Sets the value of the signedData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Package.DataInfo.SignedData }
         *     
         */
        public void setSignedData(Package.DataInfo.SignedData value) {
            this.signedData = value;
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
         *         &lt;element name="Data">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://www.chinaport.gov.cn/exp}EXP306"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;sequence>
         *           &lt;element name="HashSign" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *           &lt;element name="SignerInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;/sequence>
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
            "data",
            "hashSign",
            "signerInfo"
        })
        public static class SignedData {

            @XmlElement(name = "Data", required = true)
            protected Package.DataInfo.SignedData.Data data;
            @XmlElement(name = "HashSign", required = true)
            protected String hashSign;
            @XmlElement(name = "SignerInfo", required = true)
            protected String signerInfo;

            /**
             * Gets the value of the data property.
             * 
             * @return
             *     possible object is
             *     {@link Package.DataInfo.SignedData.Data }
             *     
             */
            public Package.DataInfo.SignedData.Data getData() {
                return data;
            }

            /**
             * Sets the value of the data property.
             * 
             * @param value
             *     allowed object is
             *     {@link Package.DataInfo.SignedData.Data }
             *     
             */
            public void setData(Package.DataInfo.SignedData.Data value) {
                this.data = value;
            }

            /**
             * Gets the value of the hashSign property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHashSign() {
                return hashSign;
            }

            /**
             * Sets the value of the hashSign property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHashSign(String value) {
                this.hashSign = value;
            }

            /**
             * Gets the value of the signerInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignerInfo() {
                return signerInfo;
            }

            /**
             * Sets the value of the signerInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignerInfo(String value) {
                this.signerInfo = value;
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
             *         &lt;element ref="{http://www.chinaport.gov.cn/exp}EXP306"/>
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
                "exp306"
            })
            public static class Data {

                @XmlElement(name = "EXP306", required = true)
                protected EXP306 exp306;

                /**
                 * Gets the value of the exp306 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EXP306 }
                 *     
                 */
                public EXP306 getEXP306() {
                    return exp306;
                }

                /**
                 * Sets the value of the exp306 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EXP306 }
                 *     
                 */
                public void setEXP306(EXP306 value) {
                    this.exp306 = value;
                }

            }

        }

    }

}
