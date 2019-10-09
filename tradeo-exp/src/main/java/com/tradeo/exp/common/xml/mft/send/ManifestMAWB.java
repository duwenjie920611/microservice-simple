package com.tradeo.exp.common.xml.mft.send;

import java.util.Date;

/**
 * 舱单 总运单 实体
 * @author duwenjie
 *
 */
public class ManifestMAWB {
	
	//1
	private String applyType;
	
	//VOYAGE_NO   32
	private String voyageNo; 
	
	//SHIP_ID  15
	private String shipId;
	
	//I_E_FLAG 1
	private String  ieFlag;
	
	//SHIP_NAME_CN 32
	private String shipNameCN;

	// 32
	private String shipNameEN;
	
	// 18 T_GROSS_WT
	private String tGrossWt;
	
	//T_PACK_NO 18
	private String tPackNo;
	
	//BILL_NUM 4
	private String billNum;
	
	// TRAF_MODE 1
	private String trafMode;

	// 12 
	private Date ieDate;
	
	//L_D_PORT 6
	private String ldPort;
	
	// I_E_PORT  4
	private String iePort;

	public String getApplyType() {
		return applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getVoyageNo() {
		return voyageNo;
	}

	public void setVoyageNo(String voyageNo) {
		this.voyageNo = voyageNo;
	}

	public String getShipId() {
		return shipId;
	}

	public void setShipId(String shipId) {
		this.shipId = shipId;
	}

	public String getIeFlag() {
		return ieFlag;
	}

	public void setIeFlag(String ieFlag) {
		this.ieFlag = ieFlag;
	}

	public String getShipNameCN() {
		return shipNameCN;
	}

	public void setShipNameCN(String shipNameCN) {
		this.shipNameCN = shipNameCN;
	}

	public String getShipNameEN() {
		return shipNameEN;
	}

	public void setShipNameEN(String shipNameEN) {
		this.shipNameEN = shipNameEN;
	}

	public String gettGrossWt() {
		return tGrossWt;
	}

	public void settGrossWt(String tGrossWt) {
		this.tGrossWt = tGrossWt;
	}

	public String gettPackNo() {
		return tPackNo;
	}

	public void settPackNo(String tPackNo) {
		this.tPackNo = tPackNo;
	}

	public String getBillNum() {
		return billNum;
	}

	public void setBillNum(String billNum) {
		this.billNum = billNum;
	}

	public String getTrafMode() {
		return trafMode;
	}

	public void setTrafMode(String trafMode) {
		this.trafMode = trafMode;
	}

	public Date getIeDate() {
		return ieDate;
	}

	public void setIeDate(Date ieDate) {
		this.ieDate = ieDate;
	}

	public String getLdPort() {
		return ldPort;
	}

	public void setLdPort(String ldPort) {
		this.ldPort = ldPort;
	}

	public String getIePort() {
		return iePort;
	}

	public void setIePort(String iePort) {
		this.iePort = iePort;
	}
	
}
