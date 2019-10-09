package com.tradeo.exp.common.xml.mft.receipt;

import java.util.Date;

public class MftHAWBResult {
	
	//32 总云单号
	private String voyageNo;
	
	//32 分运单号
	private String billNo;
	
	//12 入库时间
	private Date entryDate;
	
	//2 回执结果
	private String rtnFalg; 
	
	//30  备注
	private String notes;

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

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getRtnFalg() {
		return rtnFalg;
	}

	public void setRtnFalg(String rtnFalg) {
		this.rtnFalg = rtnFalg;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
