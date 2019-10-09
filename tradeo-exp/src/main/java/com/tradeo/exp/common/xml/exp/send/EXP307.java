package com.tradeo.exp.common.xml.exp.send;

import java.util.Date;

/**
 * 报关委托协议申报报文  实体
 * @author duwenjie
 *
 */
public class EXP307 extends Data {
	
	private String agentCode;
	
	private String tradeCode;
	
	private Date beginDate;
	
	private Date endDate;
	
	private String customsCode;
	
	private String inputNo;
	
	private String agentScc;
	
	private String tradeScc;

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCustomsCode() {
		return customsCode;
	}

	public void setCustomsCode(String customsCode) {
		this.customsCode = customsCode;
	}

	public String getInputNo() {
		return inputNo;
	}

	public void setInputNo(String inputNo) {
		this.inputNo = inputNo;
	}

	public String getAgentScc() {
		return agentScc;
	}

	public void setAgentScc(String agentScc) {
		this.agentScc = agentScc;
	}

	public String getTradeScc() {
		return tradeScc;
	}

	public void setTradeScc(String tradeScc) {
		this.tradeScc = tradeScc;
	}

}
