package com.tradeo.exp.common.xml.exp.receipt;

import com.tradeo.exp.common.message.EXP302.EXP302;
import com.tradeo.exp.common.message.EXP304.EXP304;
import com.tradeo.exp.common.message.EXP306.EXP306;
import com.tradeo.exp.common.message.EXP308.EXP308;
import com.tradeo.exp.common.message.EXP310.EXP310;
import com.tradeo.exp.common.message.EXP312.Package.DataInfo.SignedData.Data.EXP312;
import com.tradeo.exp.common.xml.exp.send.EnvelopInfo;

/**
 * 快件回执接受实体
 * @author duwenjie
 *
 */
public class ExpReceipt {
	
	private EnvelopInfo envelopInfo;
	
	private EXP302 exp302;
	
	private EXP304 exp304;
	
	private EXP306 exp306;
	
	private EXP308 exp308;
	
	private EXP310 exp310;
	
	private EXP312 exp312;
	
	//原始报文
	private String orginalMessage;
	
	public String getOrginalMessage() {
		return orginalMessage;
	}

	public void setOrginalMessage(String orginalMessage) {
		this.orginalMessage = orginalMessage;
	}

	public EXP302 getExp302() {
		return exp302;
	}

	public void setExp302(EXP302 exp302) {
		this.exp302 = exp302;
	}

	public EXP304 getExp304() {
		return exp304;
	}

	public void setExp304(EXP304 exp304) {
		this.exp304 = exp304;
	}

	public EXP306 getExp306() {
		return exp306;
	}

	public void setExp306(EXP306 exp306) {
		this.exp306 = exp306;
	}

	public EXP308 getExp308() {
		return exp308;
	}

	public void setExp308(EXP308 exp308) {
		this.exp308 = exp308;
	}

	public EXP310 getExp310() {
		return exp310;
	}

	public void setExp310(EXP310 exp310) {
		this.exp310 = exp310;
	}

	public EXP312 getExp312() {
		return exp312;
	}

	public void setExp312(EXP312 exp312) {
		this.exp312 = exp312;
	}

	public EnvelopInfo getEnvelopInfo() {
		return envelopInfo;
	}

	public void setEnvelopInfo(EnvelopInfo envelopInfo) {
		this.envelopInfo = envelopInfo;
	}

}
