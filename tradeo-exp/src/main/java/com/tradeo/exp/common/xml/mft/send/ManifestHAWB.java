package com.tradeo.exp.common.xml.mft.send;

/**
 * 舱单 分运单  
 * @author duwenjie
 *
 */
public class ManifestHAWB {
	
	// 1 
	private String applyType;
	
	//32
	private String voyageNo;
	
	//32
	private String billNo;
	
	//SHIP_ID  15
	private String shipId;
	
	//50
	private String mainGName;
	
	//18
	private String packNo;
	
	//(18,5)  19
	private String grossWt;
	
	//(11,2) 12长
	private String totalValue;
	
	//3
	private String currCode;

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

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getShipId() {
		return shipId;
	}

	public void setShipId(String shipId) {
		this.shipId = shipId;
	}

	public String getMainGName() {
		return mainGName;
	}

	public void setMainGName(String mainGName) {
		this.mainGName = mainGName;
	}

	public String getPackNo() {
		return packNo;
	}

	public void setPackNo(String packNo) {
		this.packNo = packNo;
	}

	public String getGrossWt() {
		return grossWt;
	}

	public void setGrossWt(String grossWt) {
		this.grossWt = grossWt;
	}

	public String getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}
	
	

}
