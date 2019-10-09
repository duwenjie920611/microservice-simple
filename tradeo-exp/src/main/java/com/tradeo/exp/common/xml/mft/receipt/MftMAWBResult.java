package com.tradeo.exp.common.xml.mft.receipt;

import java.util.Date;

/**
 * 仓库回执  总长度 91
 * @author duwenjie
 *
 */
public class MftMAWBResult {
	
	// 15
	private String shipId;
	
	//32
	private String  voyageNo;
	
	//12
	private Date entryDate;
	
	//2
	private String rtnFalg; 
	
	//30
	private String notes;

	public String getShipId() {
		return shipId;
	}

	public void setShipId(String shipId) {
		this.shipId = shipId;
	}

	public String getVoyageNo() {
		return voyageNo;
	}

	public void setVoyageNo(String voyageNo) {
		this.voyageNo = voyageNo;
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
