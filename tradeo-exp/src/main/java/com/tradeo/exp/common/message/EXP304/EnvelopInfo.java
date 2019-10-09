package com.tradeo.exp.common.message.EXP304;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "EnvelopInfo")
public class EnvelopInfo {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(name = "message_id", required = true)
    protected String messageId;
    @XmlElement(name = "file_name", required = true)
    protected String fileName;
    @XmlElement(name = "message_type", required = true)
    protected String messageType;
    @XmlElement(name = "sender_id", required = true)
    protected String senderId;
    @XmlElement(name = "receiver_id", required = true)
    protected String receiverId;
    @XmlElement(name = "send_time", required = true)
    protected String sendTime;


    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        this.version = value;
    }


    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the senderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sets the value of the senderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderId(String value) {
        this.senderId = value;
    }

    /**
     * Gets the value of the receiverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverId() {
        return receiverId;
    }

    /**
     * Sets the value of the receiverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverId(String value) {
        this.receiverId = value;
    }

    /**
     * Gets the value of the sendTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendTime() {
        return sendTime;
    }

    /**
     * Sets the value of the sendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendTime(String value) {
        this.sendTime = value;
    }

}
