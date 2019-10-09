

package com.tradeo.exp.common.message.EXP304;

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
 *         &lt;element name="EntryHead">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreEntryId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EntryId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IEFlag">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IEPort">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IEDate" type="{http://www.chinaport.gov.cn/exp}yyyyMMddHHmmss"/>
 *                   &lt;element name="DDate" type="{http://www.chinaport.gov.cn/exp}yyyyMMddHHmmss"/>
 *                   &lt;element name="DestinationPort">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TrafName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VoyageNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TrafMode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TradeCo">
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
 *                   &lt;element name="DistrictCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="5"/>
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
 *                   &lt;element name="AgentType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
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
 *                   &lt;element name="ContrNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BillNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AssBillNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TradeCountry">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TradeMode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CutMode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TransMode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FeeMark">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FeeCurr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FeeRate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InsurMark">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InsurCurr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InsurRate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OtherMark">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OtherCurr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OtherRate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PackNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="19"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GrossWt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NetWt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="WrapType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NoteS">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
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
 *                   &lt;element name="CoOwner">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MnlJgfFlag">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ServiceRate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ServiceFee">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RelativeId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TypistNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InputNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InputCompanyCo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InputCompanyName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PDate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="17"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeclareNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CustomsField">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SpecialFlag">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="KjId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ReceiveName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendCountry">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendCity">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotalValue">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="12"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CurrCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ReceiveDate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="17"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ChannelEr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MainGName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EntryType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendIdType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TradeScc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OwnerScc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AgentScc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendAddress">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendTelNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="64"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ReceiveAddress">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ReceiveTelNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="64"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ReceiveCountry">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ReceiveCity">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="StopCityEn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="512"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendNameEn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendAddressEn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendCityEn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ReceiveNameEn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ReceiveAddressEn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="WoodWrap">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MainGNameEn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GoodsUsed">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LowTempTrans">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EntryList" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="19"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CodeTS">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GModel">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OriginCountry">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TradeCurr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeclPrice">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeclTotal">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="UseTo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DutyMode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GQty">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GUnit">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Qty1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Qty2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Unit1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Unit2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TradeTotal">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ClassMark">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GGrossWt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OriginCity">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GNameEn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Backup1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Backup2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Backup3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Backup4">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Backup5">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EntryDocu" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrderNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="19"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DocuCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CertCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
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
    "entryHead",
    "entryList",
    "entryDocu"
})
@XmlRootElement(name = "EXP304")
public class EXP304 {

    @XmlElement(name = "EntryHead", required = true)
    protected EXP304 .EntryHead entryHead;
    @XmlElement(name = "EntryList")
    protected List<EXP304 .EntryList> entryList;
    @XmlElement(name = "EntryDocu")
    protected List<EXP304 .EntryDocu> entryDocu;

    /**
     * Gets the value of the entryHead property.
     * 
     * @return
     *     possible object is
     *     {@link EXP304 .EntryHead }
     *     
     */
    public EXP304 .EntryHead getEntryHead() {
        return entryHead;
    }

    /**
     * Sets the value of the entryHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXP304 .EntryHead }
     *     
     */
    public void setEntryHead(EXP304 .EntryHead value) {
        this.entryHead = value;
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
     * {@link EXP304 .EntryList }
     * 
     * 
     */
    public List<EXP304 .EntryList> getEntryList() {
        if (entryList == null) {
            entryList = new ArrayList<EXP304 .EntryList>();
        }
        return this.entryList;
    }

    /**
     * Gets the value of the entryDocu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryDocu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryDocu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXP304 .EntryDocu }
     * 
     * 
     */
    public List<EXP304 .EntryDocu> getEntryDocu() {
        if (entryDocu == null) {
            entryDocu = new ArrayList<EXP304 .EntryDocu>();
        }
        return this.entryDocu;
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
     *         &lt;element name="OrderNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="19"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DocuCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CertCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
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
        "orderNo",
        "docuCode",
        "certCode"
    })
    public static class EntryDocu {

        @XmlElement(name = "OrderNo", required = true)
        protected String orderNo;
        @XmlElement(name = "DocuCode", required = true)
        protected String docuCode;
        @XmlElement(name = "CertCode", required = true)
        protected String certCode;

        /**
         * Gets the value of the orderNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderNo() {
            return orderNo;
        }

        /**
         * Sets the value of the orderNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderNo(String value) {
            this.orderNo = value;
        }

        /**
         * Gets the value of the docuCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocuCode() {
            return docuCode;
        }

        /**
         * Sets the value of the docuCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocuCode(String value) {
            this.docuCode = value;
        }

        /**
         * Gets the value of the certCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertCode() {
            return certCode;
        }

        /**
         * Sets the value of the certCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertCode(String value) {
            this.certCode = value;
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
     *         &lt;element name="PreEntryId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EntryId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IEFlag">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IEPort">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IEDate" type="{http://www.chinaport.gov.cn/exp}yyyyMMddHHmmss"/>
     *         &lt;element name="DDate" type="{http://www.chinaport.gov.cn/exp}yyyyMMddHHmmss"/>
     *         &lt;element name="DestinationPort">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TrafName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VoyageNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TrafMode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TradeCo">
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
     *         &lt;element name="DistrictCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="5"/>
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
     *         &lt;element name="AgentType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
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
     *         &lt;element name="ContrNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BillNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AssBillNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TradeCountry">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TradeMode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CutMode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TransMode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FeeMark">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FeeCurr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FeeRate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InsurMark">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InsurCurr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InsurRate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OtherMark">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OtherCurr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OtherRate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PackNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="19"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GrossWt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NetWt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="WrapType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NoteS">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
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
     *         &lt;element name="CoOwner">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MnlJgfFlag">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ServiceRate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ServiceFee">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RelativeId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TypistNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InputNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InputCompanyCo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InputCompanyName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PDate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="17"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeclareNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CustomsField">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SpecialFlag">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="KjId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ReceiveName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendCountry">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendCity">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotalValue">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="12"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CurrCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ReceiveDate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="17"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ChannelEr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MainGName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EntryType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendIdType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TradeScc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OwnerScc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AgentScc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendAddress">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendTelNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="64"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ReceiveAddress">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ReceiveTelNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="64"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ReceiveCountry">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ReceiveCity">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="StopCityEn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="512"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendNameEn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendAddressEn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendCityEn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ReceiveNameEn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ReceiveAddressEn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="WoodWrap">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MainGNameEn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GoodsUsed">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LowTempTrans">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
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
        "preEntryId",
        "entryId",
        "ieFlag",
        "iePort",
        "ieDate",
        "dDate",
        "destinationPort",
        "trafName",
        "voyageNo",
        "trafMode",
        "tradeCo",
        "tradeName",
        "districtCode",
        "ownerCode",
        "ownerName",
        "agentType",
        "agentCode",
        "agentName",
        "contrNo",
        "billNo",
        "assBillNo",
        "tradeCountry",
        "tradeMode",
        "cutMode",
        "transMode",
        "feeMark",
        "feeCurr",
        "feeRate",
        "insurMark",
        "insurCurr",
        "insurRate",
        "otherMark",
        "otherCurr",
        "otherRate",
        "packNo",
        "grossWt",
        "netWt",
        "wrapType",
        "noteS",
        "declPort",
        "coOwner",
        "mnlJgfFlag",
        "serviceRate",
        "serviceFee",
        "relativeId",
        "typistNo",
        "inputNo",
        "inputCompanyCo",
        "inputCompanyName",
        "pDate",
        "declareNo",
        "customsField",
        "specialFlag",
        "kjId",
        "sendName",
        "receiveName",
        "sendCountry",
        "sendCity",
        "sendId",
        "totalValue",
        "currCode",
        "receiveDate",
        "channelEr",
        "mainGName",
        "entryType",
        "sendIdType",
        "tradeScc",
        "ownerScc",
        "agentScc",
        "sendAddress",
        "sendTelNo",
        "receiveAddress",
        "receiveTelNo",
        "receiveCountry",
        "receiveCity",
        "stopCityEn",
        "sendNameEn",
        "sendAddressEn",
        "sendCityEn",
        "receiveNameEn",
        "receiveAddressEn",
        "woodWrap",
        "mainGNameEn",
        "goodsUsed",
        "lowTempTrans"
    })
    public static class EntryHead {

        @XmlElement(name = "PreEntryId", required = true)
        protected String preEntryId;
        @XmlElement(name = "EntryId", required = true)
        protected String entryId;
        @XmlElement(name = "IEFlag", required = true)
        protected String ieFlag;
        @XmlElement(name = "IEPort", required = true)
        protected String iePort;
        @XmlElement(name = "IEDate", required = true)
        protected String ieDate;
        @XmlElement(name = "DDate", required = true)
        protected String dDate;
        @XmlElement(name = "DestinationPort", required = true)
        protected String destinationPort;
        @XmlElement(name = "TrafName", required = true)
        protected String trafName;
        @XmlElement(name = "VoyageNo", required = true)
        protected String voyageNo;
        @XmlElement(name = "TrafMode", required = true)
        protected String trafMode;
        @XmlElement(name = "TradeCo", required = true)
        protected String tradeCo;
        @XmlElement(name = "TradeName", required = true)
        protected String tradeName;
        @XmlElement(name = "DistrictCode", required = true)
        protected String districtCode;
        @XmlElement(name = "OwnerCode", required = true)
        protected String ownerCode;
        @XmlElement(name = "OwnerName", required = true)
        protected String ownerName;
        @XmlElement(name = "AgentType", required = true)
        protected String agentType;
        @XmlElement(name = "AgentCode", required = true)
        protected String agentCode;
        @XmlElement(name = "AgentName", required = true)
        protected String agentName;
        @XmlElement(name = "ContrNo", required = true)
        protected String contrNo;
        @XmlElement(name = "BillNo", required = true)
        protected String billNo;
        @XmlElement(name = "AssBillNo", required = true)
        protected String assBillNo;
        @XmlElement(name = "TradeCountry", required = true)
        protected String tradeCountry;
        @XmlElement(name = "TradeMode", required = true)
        protected String tradeMode;
        @XmlElement(name = "CutMode", required = true)
        protected String cutMode;
        @XmlElement(name = "TransMode", required = true)
        protected String transMode;
        @XmlElement(name = "FeeMark", required = true)
        protected String feeMark;
        @XmlElement(name = "FeeCurr", required = true)
        protected String feeCurr;
        @XmlElement(name = "FeeRate", required = true)
        protected String feeRate;
        @XmlElement(name = "InsurMark", required = true)
        protected String insurMark;
        @XmlElement(name = "InsurCurr", required = true)
        protected String insurCurr;
        @XmlElement(name = "InsurRate", required = true)
        protected String insurRate;
        @XmlElement(name = "OtherMark", required = true)
        protected String otherMark;
        @XmlElement(name = "OtherCurr", required = true)
        protected String otherCurr;
        @XmlElement(name = "OtherRate", required = true)
        protected String otherRate;
        @XmlElement(name = "PackNo", required = true)
        protected String packNo;
        @XmlElement(name = "GrossWt", required = true)
        protected String grossWt;
        @XmlElement(name = "NetWt", required = true)
        protected String netWt;
        @XmlElement(name = "WrapType", required = true)
        protected String wrapType;
        @XmlElement(name = "NoteS", required = true)
        protected String noteS;
        @XmlElement(name = "DeclPort", required = true)
        protected String declPort;
        @XmlElement(name = "CoOwner", required = true)
        protected String coOwner;
        @XmlElement(name = "MnlJgfFlag", required = true)
        protected String mnlJgfFlag;
        @XmlElement(name = "ServiceRate", required = true)
        protected String serviceRate;
        @XmlElement(name = "ServiceFee", required = true)
        protected String serviceFee;
        @XmlElement(name = "RelativeId", required = true)
        protected String relativeId;
        @XmlElement(name = "TypistNo", required = true)
        protected String typistNo;
        @XmlElement(name = "InputNo", required = true)
        protected String inputNo;
        @XmlElement(name = "InputCompanyCo", required = true)
        protected String inputCompanyCo;
        @XmlElement(name = "InputCompanyName", required = true)
        protected String inputCompanyName;
        @XmlElement(name = "PDate", required = true)
        protected String pDate;
        @XmlElement(name = "DeclareNo", required = true)
        protected String declareNo;
        @XmlElement(name = "CustomsField", required = true)
        protected String customsField;
        @XmlElement(name = "SpecialFlag", required = true)
        protected String specialFlag;
        @XmlElement(name = "KjId", required = true)
        protected String kjId;
        @XmlElement(name = "SendName", required = true)
        protected String sendName;
        @XmlElement(name = "ReceiveName", required = true)
        protected String receiveName;
        @XmlElement(name = "SendCountry", required = true)
        protected String sendCountry;
        @XmlElement(name = "SendCity", required = true)
        protected String sendCity;
        @XmlElement(name = "SendId", required = true)
        protected String sendId;
        @XmlElement(name = "TotalValue", required = true)
        protected String totalValue;
        @XmlElement(name = "CurrCode", required = true)
        protected String currCode;
        @XmlElement(name = "ReceiveDate", required = true)
        protected String receiveDate;
        @XmlElement(name = "ChannelEr", required = true)
        protected String channelEr;
        @XmlElement(name = "MainGName", required = true)
        protected String mainGName;
        @XmlElement(name = "EntryType", required = true)
        protected String entryType;
        @XmlElement(name = "SendIdType", required = true)
        protected String sendIdType;
        @XmlElement(name = "TradeScc", required = true)
        protected String tradeScc;
        @XmlElement(name = "OwnerScc", required = true)
        protected String ownerScc;
        @XmlElement(name = "AgentScc", required = true)
        protected String agentScc;
        @XmlElement(name = "SendAddress", required = true)
        protected String sendAddress;
        @XmlElement(name = "SendTelNo", required = true)
        protected String sendTelNo;
        @XmlElement(name = "ReceiveAddress", required = true)
        protected String receiveAddress;
        @XmlElement(name = "ReceiveTelNo", required = true)
        protected String receiveTelNo;
        @XmlElement(name = "ReceiveCountry", required = true)
        protected String receiveCountry;
        @XmlElement(name = "ReceiveCity", required = true)
        protected String receiveCity;
        @XmlElement(name = "StopCityEn", required = true)
        protected String stopCityEn;
        @XmlElement(name = "SendNameEn", required = true)
        protected String sendNameEn;
        @XmlElement(name = "SendAddressEn", required = true)
        protected String sendAddressEn;
        @XmlElement(name = "SendCityEn", required = true)
        protected String sendCityEn;
        @XmlElement(name = "ReceiveNameEn", required = true)
        protected String receiveNameEn;
        @XmlElement(name = "ReceiveAddressEn", required = true)
        protected String receiveAddressEn;
        @XmlElement(name = "WoodWrap", required = true)
        protected String woodWrap;
        @XmlElement(name = "MainGNameEn", required = true)
        protected String mainGNameEn;
        @XmlElement(name = "GoodsUsed", required = true)
        protected String goodsUsed;
        @XmlElement(name = "LowTempTrans", required = true)
        protected String lowTempTrans;

        /**
         * Gets the value of the preEntryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreEntryId() {
            return preEntryId;
        }

        /**
         * Sets the value of the preEntryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreEntryId(String value) {
            this.preEntryId = value;
        }

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
         * Gets the value of the ieFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIEFlag() {
            return ieFlag;
        }

        /**
         * Sets the value of the ieFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIEFlag(String value) {
            this.ieFlag = value;
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
         * Gets the value of the ieDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIEDate() {
            return ieDate;
        }

        /**
         * Sets the value of the ieDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIEDate(String value) {
            this.ieDate = value;
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
         * Gets the value of the destinationPort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationPort() {
            return destinationPort;
        }

        /**
         * Sets the value of the destinationPort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationPort(String value) {
            this.destinationPort = value;
        }

        /**
         * Gets the value of the trafName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrafName() {
            return trafName;
        }

        /**
         * Sets the value of the trafName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrafName(String value) {
            this.trafName = value;
        }

        /**
         * Gets the value of the voyageNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoyageNo() {
            return voyageNo;
        }

        /**
         * Sets the value of the voyageNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoyageNo(String value) {
            this.voyageNo = value;
        }

        /**
         * Gets the value of the trafMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrafMode() {
            return trafMode;
        }

        /**
         * Sets the value of the trafMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrafMode(String value) {
            this.trafMode = value;
        }

        /**
         * Gets the value of the tradeCo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeCo() {
            return tradeCo;
        }

        /**
         * Sets the value of the tradeCo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeCo(String value) {
            this.tradeCo = value;
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
         * Gets the value of the districtCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistrictCode() {
            return districtCode;
        }

        /**
         * Sets the value of the districtCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistrictCode(String value) {
            this.districtCode = value;
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
         * Gets the value of the agentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentType() {
            return agentType;
        }

        /**
         * Sets the value of the agentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentType(String value) {
            this.agentType = value;
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
         * Gets the value of the contrNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContrNo() {
            return contrNo;
        }

        /**
         * Sets the value of the contrNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContrNo(String value) {
            this.contrNo = value;
        }

        /**
         * Gets the value of the billNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillNo() {
            return billNo;
        }

        /**
         * Sets the value of the billNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillNo(String value) {
            this.billNo = value;
        }

        /**
         * Gets the value of the assBillNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssBillNo() {
            return assBillNo;
        }

        /**
         * Sets the value of the assBillNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssBillNo(String value) {
            this.assBillNo = value;
        }

        /**
         * Gets the value of the tradeCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeCountry() {
            return tradeCountry;
        }

        /**
         * Sets the value of the tradeCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeCountry(String value) {
            this.tradeCountry = value;
        }

        /**
         * Gets the value of the tradeMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeMode() {
            return tradeMode;
        }

        /**
         * Sets the value of the tradeMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeMode(String value) {
            this.tradeMode = value;
        }

        /**
         * Gets the value of the cutMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCutMode() {
            return cutMode;
        }

        /**
         * Sets the value of the cutMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCutMode(String value) {
            this.cutMode = value;
        }

        /**
         * Gets the value of the transMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransMode() {
            return transMode;
        }

        /**
         * Sets the value of the transMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransMode(String value) {
            this.transMode = value;
        }

        /**
         * Gets the value of the feeMark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeMark() {
            return feeMark;
        }

        /**
         * Sets the value of the feeMark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeMark(String value) {
            this.feeMark = value;
        }

        /**
         * Gets the value of the feeCurr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeCurr() {
            return feeCurr;
        }

        /**
         * Sets the value of the feeCurr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeCurr(String value) {
            this.feeCurr = value;
        }

        /**
         * Gets the value of the feeRate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeRate() {
            return feeRate;
        }

        /**
         * Sets the value of the feeRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeRate(String value) {
            this.feeRate = value;
        }

        /**
         * Gets the value of the insurMark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsurMark() {
            return insurMark;
        }

        /**
         * Sets the value of the insurMark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsurMark(String value) {
            this.insurMark = value;
        }

        /**
         * Gets the value of the insurCurr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsurCurr() {
            return insurCurr;
        }

        /**
         * Sets the value of the insurCurr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsurCurr(String value) {
            this.insurCurr = value;
        }

        /**
         * Gets the value of the insurRate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsurRate() {
            return insurRate;
        }

        /**
         * Sets the value of the insurRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsurRate(String value) {
            this.insurRate = value;
        }

        /**
         * Gets the value of the otherMark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherMark() {
            return otherMark;
        }

        /**
         * Sets the value of the otherMark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherMark(String value) {
            this.otherMark = value;
        }

        /**
         * Gets the value of the otherCurr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherCurr() {
            return otherCurr;
        }

        /**
         * Sets the value of the otherCurr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherCurr(String value) {
            this.otherCurr = value;
        }

        /**
         * Gets the value of the otherRate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherRate() {
            return otherRate;
        }

        /**
         * Sets the value of the otherRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherRate(String value) {
            this.otherRate = value;
        }

        /**
         * Gets the value of the packNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackNo() {
            return packNo;
        }

        /**
         * Sets the value of the packNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackNo(String value) {
            this.packNo = value;
        }

        /**
         * Gets the value of the grossWt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGrossWt() {
            return grossWt;
        }

        /**
         * Sets the value of the grossWt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGrossWt(String value) {
            this.grossWt = value;
        }

        /**
         * Gets the value of the netWt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetWt() {
            return netWt;
        }

        /**
         * Sets the value of the netWt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetWt(String value) {
            this.netWt = value;
        }

        /**
         * Gets the value of the wrapType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWrapType() {
            return wrapType;
        }

        /**
         * Sets the value of the wrapType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWrapType(String value) {
            this.wrapType = value;
        }

        /**
         * Gets the value of the noteS property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoteS() {
            return noteS;
        }

        /**
         * Sets the value of the noteS property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoteS(String value) {
            this.noteS = value;
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
         * Gets the value of the coOwner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoOwner() {
            return coOwner;
        }

        /**
         * Sets the value of the coOwner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoOwner(String value) {
            this.coOwner = value;
        }

        /**
         * Gets the value of the mnlJgfFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMnlJgfFlag() {
            return mnlJgfFlag;
        }

        /**
         * Sets the value of the mnlJgfFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMnlJgfFlag(String value) {
            this.mnlJgfFlag = value;
        }

        /**
         * Gets the value of the serviceRate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceRate() {
            return serviceRate;
        }

        /**
         * Sets the value of the serviceRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceRate(String value) {
            this.serviceRate = value;
        }

        /**
         * Gets the value of the serviceFee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceFee() {
            return serviceFee;
        }

        /**
         * Sets the value of the serviceFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceFee(String value) {
            this.serviceFee = value;
        }

        /**
         * Gets the value of the relativeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelativeId() {
            return relativeId;
        }

        /**
         * Sets the value of the relativeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelativeId(String value) {
            this.relativeId = value;
        }

        /**
         * Gets the value of the typistNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypistNo() {
            return typistNo;
        }

        /**
         * Sets the value of the typistNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypistNo(String value) {
            this.typistNo = value;
        }

        /**
         * Gets the value of the inputNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInputNo() {
            return inputNo;
        }

        /**
         * Sets the value of the inputNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInputNo(String value) {
            this.inputNo = value;
        }

        /**
         * Gets the value of the inputCompanyCo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInputCompanyCo() {
            return inputCompanyCo;
        }

        /**
         * Sets the value of the inputCompanyCo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInputCompanyCo(String value) {
            this.inputCompanyCo = value;
        }

        /**
         * Gets the value of the inputCompanyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInputCompanyName() {
            return inputCompanyName;
        }

        /**
         * Sets the value of the inputCompanyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInputCompanyName(String value) {
            this.inputCompanyName = value;
        }

        /**
         * Gets the value of the pDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPDate() {
            return pDate;
        }

        /**
         * Sets the value of the pDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPDate(String value) {
            this.pDate = value;
        }

        /**
         * Gets the value of the declareNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclareNo() {
            return declareNo;
        }

        /**
         * Sets the value of the declareNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclareNo(String value) {
            this.declareNo = value;
        }

        /**
         * Gets the value of the customsField property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomsField() {
            return customsField;
        }

        /**
         * Sets the value of the customsField property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomsField(String value) {
            this.customsField = value;
        }

        /**
         * Gets the value of the specialFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialFlag() {
            return specialFlag;
        }

        /**
         * Sets the value of the specialFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialFlag(String value) {
            this.specialFlag = value;
        }

        /**
         * Gets the value of the kjId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKjId() {
            return kjId;
        }

        /**
         * Sets the value of the kjId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKjId(String value) {
            this.kjId = value;
        }

        /**
         * Gets the value of the sendName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendName() {
            return sendName;
        }

        /**
         * Sets the value of the sendName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendName(String value) {
            this.sendName = value;
        }

        /**
         * Gets the value of the receiveName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiveName() {
            return receiveName;
        }

        /**
         * Sets the value of the receiveName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiveName(String value) {
            this.receiveName = value;
        }

        /**
         * Gets the value of the sendCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendCountry() {
            return sendCountry;
        }

        /**
         * Sets the value of the sendCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendCountry(String value) {
            this.sendCountry = value;
        }

        /**
         * Gets the value of the sendCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendCity() {
            return sendCity;
        }

        /**
         * Sets the value of the sendCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendCity(String value) {
            this.sendCity = value;
        }

        /**
         * Gets the value of the sendId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendId() {
            return sendId;
        }

        /**
         * Sets the value of the sendId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendId(String value) {
            this.sendId = value;
        }

        /**
         * Gets the value of the totalValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalValue() {
            return totalValue;
        }

        /**
         * Sets the value of the totalValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalValue(String value) {
            this.totalValue = value;
        }

        /**
         * Gets the value of the currCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrCode() {
            return currCode;
        }

        /**
         * Sets the value of the currCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrCode(String value) {
            this.currCode = value;
        }

        /**
         * Gets the value of the receiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiveDate() {
            return receiveDate;
        }

        /**
         * Sets the value of the receiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiveDate(String value) {
            this.receiveDate = value;
        }

        /**
         * Gets the value of the channelEr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannelEr() {
            return channelEr;
        }

        /**
         * Sets the value of the channelEr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannelEr(String value) {
            this.channelEr = value;
        }

        /**
         * Gets the value of the mainGName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMainGName() {
            return mainGName;
        }

        /**
         * Sets the value of the mainGName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMainGName(String value) {
            this.mainGName = value;
        }

        /**
         * Gets the value of the entryType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryType() {
            return entryType;
        }

        /**
         * Sets the value of the entryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryType(String value) {
            this.entryType = value;
        }

        /**
         * Gets the value of the sendIdType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendIdType() {
            return sendIdType;
        }

        /**
         * Sets the value of the sendIdType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendIdType(String value) {
            this.sendIdType = value;
        }

        /**
         * Gets the value of the tradeScc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeScc() {
            return tradeScc;
        }

        /**
         * Sets the value of the tradeScc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeScc(String value) {
            this.tradeScc = value;
        }

        /**
         * Gets the value of the ownerScc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerScc() {
            return ownerScc;
        }

        /**
         * Sets the value of the ownerScc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerScc(String value) {
            this.ownerScc = value;
        }

        /**
         * Gets the value of the agentScc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentScc() {
            return agentScc;
        }

        /**
         * Sets the value of the agentScc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentScc(String value) {
            this.agentScc = value;
        }

        /**
         * Gets the value of the sendAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendAddress() {
            return sendAddress;
        }

        /**
         * Sets the value of the sendAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendAddress(String value) {
            this.sendAddress = value;
        }

        /**
         * Gets the value of the sendTelNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendTelNo() {
            return sendTelNo;
        }

        /**
         * Sets the value of the sendTelNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendTelNo(String value) {
            this.sendTelNo = value;
        }

        /**
         * Gets the value of the receiveAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiveAddress() {
            return receiveAddress;
        }

        /**
         * Sets the value of the receiveAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiveAddress(String value) {
            this.receiveAddress = value;
        }

        /**
         * Gets the value of the receiveTelNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiveTelNo() {
            return receiveTelNo;
        }

        /**
         * Sets the value of the receiveTelNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiveTelNo(String value) {
            this.receiveTelNo = value;
        }

        /**
         * Gets the value of the receiveCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiveCountry() {
            return receiveCountry;
        }

        /**
         * Sets the value of the receiveCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiveCountry(String value) {
            this.receiveCountry = value;
        }

        /**
         * Gets the value of the receiveCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiveCity() {
            return receiveCity;
        }

        /**
         * Sets the value of the receiveCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiveCity(String value) {
            this.receiveCity = value;
        }

        /**
         * Gets the value of the stopCityEn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStopCityEn() {
            return stopCityEn;
        }

        /**
         * Sets the value of the stopCityEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStopCityEn(String value) {
            this.stopCityEn = value;
        }

        /**
         * Gets the value of the sendNameEn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendNameEn() {
            return sendNameEn;
        }

        /**
         * Sets the value of the sendNameEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendNameEn(String value) {
            this.sendNameEn = value;
        }

        /**
         * Gets the value of the sendAddressEn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendAddressEn() {
            return sendAddressEn;
        }

        /**
         * Sets the value of the sendAddressEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendAddressEn(String value) {
            this.sendAddressEn = value;
        }

        /**
         * Gets the value of the sendCityEn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendCityEn() {
            return sendCityEn;
        }

        /**
         * Sets the value of the sendCityEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendCityEn(String value) {
            this.sendCityEn = value;
        }

        /**
         * Gets the value of the receiveNameEn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiveNameEn() {
            return receiveNameEn;
        }

        /**
         * Sets the value of the receiveNameEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiveNameEn(String value) {
            this.receiveNameEn = value;
        }

        /**
         * Gets the value of the receiveAddressEn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiveAddressEn() {
            return receiveAddressEn;
        }

        /**
         * Sets the value of the receiveAddressEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiveAddressEn(String value) {
            this.receiveAddressEn = value;
        }

        /**
         * Gets the value of the woodWrap property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWoodWrap() {
            return woodWrap;
        }

        /**
         * Sets the value of the woodWrap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWoodWrap(String value) {
            this.woodWrap = value;
        }

        /**
         * Gets the value of the mainGNameEn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMainGNameEn() {
            return mainGNameEn;
        }

        /**
         * Sets the value of the mainGNameEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMainGNameEn(String value) {
            this.mainGNameEn = value;
        }

        /**
         * Gets the value of the goodsUsed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGoodsUsed() {
            return goodsUsed;
        }

        /**
         * Sets the value of the goodsUsed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGoodsUsed(String value) {
            this.goodsUsed = value;
        }

        /**
         * Gets the value of the lowTempTrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLowTempTrans() {
            return lowTempTrans;
        }

        /**
         * Sets the value of the lowTempTrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLowTempTrans(String value) {
            this.lowTempTrans = value;
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
     *         &lt;element name="GNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="19"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CodeTS">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GModel">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OriginCountry">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TradeCurr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeclPrice">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeclTotal">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="UseTo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DutyMode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GQty">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GUnit">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Qty1">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Qty2">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Unit1">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Unit2">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TradeTotal">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ClassMark">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GGrossWt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OriginCity">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GNameEn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Backup1">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Backup2">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Backup3">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Backup4">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Backup5">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
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
        "gNo",
        "codeTS",
        "gName",
        "gModel",
        "originCountry",
        "tradeCurr",
        "declPrice",
        "declTotal",
        "useTo",
        "dutyMode",
        "gQty",
        "gUnit",
        "qty1",
        "qty2",
        "unit1",
        "unit2",
        "tradeTotal",
        "classMark",
        "gGrossWt",
        "mName",
        "originCity",
        "gNameEn",
        "backup1",
        "backup2",
        "backup3",
        "backup4",
        "backup5"
    })
    public static class EntryList {

        @XmlElement(name = "GNo", required = true)
        protected String gNo;
        @XmlElement(name = "CodeTS", required = true)
        protected String codeTS;
        @XmlElement(name = "GName", required = true)
        protected String gName;
        @XmlElement(name = "GModel", required = true)
        protected String gModel;
        @XmlElement(name = "OriginCountry", required = true)
        protected String originCountry;
        @XmlElement(name = "TradeCurr", required = true)
        protected String tradeCurr;
        @XmlElement(name = "DeclPrice", required = true)
        protected String declPrice;
        @XmlElement(name = "DeclTotal", required = true)
        protected String declTotal;
        @XmlElement(name = "UseTo", required = true)
        protected String useTo;
        @XmlElement(name = "DutyMode", required = true)
        protected String dutyMode;
        @XmlElement(name = "GQty", required = true)
        protected String gQty;
        @XmlElement(name = "GUnit", required = true)
        protected String gUnit;
        @XmlElement(name = "Qty1", required = true)
        protected String qty1;
        @XmlElement(name = "Qty2", required = true)
        protected String qty2;
        @XmlElement(name = "Unit1", required = true)
        protected String unit1;
        @XmlElement(name = "Unit2", required = true)
        protected String unit2;
        @XmlElement(name = "TradeTotal", required = true)
        protected String tradeTotal;
        @XmlElement(name = "ClassMark", required = true)
        protected String classMark;
        @XmlElement(name = "GGrossWt", required = true)
        protected String gGrossWt;
        @XmlElement(name = "MName", required = true)
        protected String mName;
        @XmlElement(name = "OriginCity", required = true)
        protected String originCity;
        @XmlElement(name = "GNameEn", required = true)
        protected String gNameEn;
        @XmlElement(name = "Backup1", required = true)
        protected String backup1;
        @XmlElement(name = "Backup2", required = true)
        protected String backup2;
        @XmlElement(name = "Backup3", required = true)
        protected String backup3;
        @XmlElement(name = "Backup4", required = true)
        protected String backup4;
        @XmlElement(name = "Backup5", required = true)
        protected String backup5;

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
         * Gets the value of the gModel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGModel() {
            return gModel;
        }

        /**
         * Sets the value of the gModel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGModel(String value) {
            this.gModel = value;
        }

        /**
         * Gets the value of the originCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginCountry() {
            return originCountry;
        }

        /**
         * Sets the value of the originCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginCountry(String value) {
            this.originCountry = value;
        }

        /**
         * Gets the value of the tradeCurr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeCurr() {
            return tradeCurr;
        }

        /**
         * Sets the value of the tradeCurr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeCurr(String value) {
            this.tradeCurr = value;
        }

        /**
         * Gets the value of the declPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclPrice() {
            return declPrice;
        }

        /**
         * Sets the value of the declPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclPrice(String value) {
            this.declPrice = value;
        }

        /**
         * Gets the value of the declTotal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclTotal() {
            return declTotal;
        }

        /**
         * Sets the value of the declTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclTotal(String value) {
            this.declTotal = value;
        }

        /**
         * Gets the value of the useTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseTo() {
            return useTo;
        }

        /**
         * Sets the value of the useTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseTo(String value) {
            this.useTo = value;
        }

        /**
         * Gets the value of the dutyMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDutyMode() {
            return dutyMode;
        }

        /**
         * Sets the value of the dutyMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDutyMode(String value) {
            this.dutyMode = value;
        }

        /**
         * Gets the value of the gQty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGQty() {
            return gQty;
        }

        /**
         * Sets the value of the gQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGQty(String value) {
            this.gQty = value;
        }

        /**
         * Gets the value of the gUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGUnit() {
            return gUnit;
        }

        /**
         * Sets the value of the gUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGUnit(String value) {
            this.gUnit = value;
        }

        /**
         * Gets the value of the qty1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQty1() {
            return qty1;
        }

        /**
         * Sets the value of the qty1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQty1(String value) {
            this.qty1 = value;
        }

        /**
         * Gets the value of the qty2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQty2() {
            return qty2;
        }

        /**
         * Sets the value of the qty2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQty2(String value) {
            this.qty2 = value;
        }

        /**
         * Gets the value of the unit1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit1() {
            return unit1;
        }

        /**
         * Sets the value of the unit1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit1(String value) {
            this.unit1 = value;
        }

        /**
         * Gets the value of the unit2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit2() {
            return unit2;
        }

        /**
         * Sets the value of the unit2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit2(String value) {
            this.unit2 = value;
        }

        /**
         * Gets the value of the tradeTotal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeTotal() {
            return tradeTotal;
        }

        /**
         * Sets the value of the tradeTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeTotal(String value) {
            this.tradeTotal = value;
        }

        /**
         * Gets the value of the classMark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassMark() {
            return classMark;
        }

        /**
         * Sets the value of the classMark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassMark(String value) {
            this.classMark = value;
        }

        /**
         * Gets the value of the gGrossWt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGGrossWt() {
            return gGrossWt;
        }

        /**
         * Sets the value of the gGrossWt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGGrossWt(String value) {
            this.gGrossWt = value;
        }

        /**
         * Gets the value of the mName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMName() {
            return mName;
        }

        /**
         * Sets the value of the mName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMName(String value) {
            this.mName = value;
        }

        /**
         * Gets the value of the originCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginCity() {
            return originCity;
        }

        /**
         * Sets the value of the originCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginCity(String value) {
            this.originCity = value;
        }

        /**
         * Gets the value of the gNameEn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGNameEn() {
            return gNameEn;
        }

        /**
         * Sets the value of the gNameEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGNameEn(String value) {
            this.gNameEn = value;
        }

        /**
         * Gets the value of the backup1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBackup1() {
            return backup1;
        }

        /**
         * Sets the value of the backup1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBackup1(String value) {
            this.backup1 = value;
        }

        /**
         * Gets the value of the backup2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBackup2() {
            return backup2;
        }

        /**
         * Sets the value of the backup2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBackup2(String value) {
            this.backup2 = value;
        }

        /**
         * Gets the value of the backup3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBackup3() {
            return backup3;
        }

        /**
         * Sets the value of the backup3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBackup3(String value) {
            this.backup3 = value;
        }

        /**
         * Gets the value of the backup4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBackup4() {
            return backup4;
        }

        /**
         * Sets the value of the backup4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBackup4(String value) {
            this.backup4 = value;
        }

        /**
         * Gets the value of the backup5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBackup5() {
            return backup5;
        }

        /**
         * Sets the value of the backup5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBackup5(String value) {
            this.backup5 = value;
        }

    }

}
