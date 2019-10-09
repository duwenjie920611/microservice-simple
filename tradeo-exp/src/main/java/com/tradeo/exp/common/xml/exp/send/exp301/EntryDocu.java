package com.tradeo.exp.common.xml.exp.send.exp301;

public class EntryDocu {
	
	//操作类型
	private String opType;
	
	//序号 必填
	private String orderNo;
	
	//随附单证类型 	选填
	private String docuCode;
	
	//随附单证号码	选填
	private String CertCode;

	public String getOpType() {
		return opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getDocuCode() {
		return docuCode;
	}

	public void setDocuCode(String docuCode) {
		this.docuCode = docuCode;
	}

	public String getCertCode() {
		return CertCode;
	}

	public void setCertCode(String certCode) {
		CertCode = certCode;
	}

}
