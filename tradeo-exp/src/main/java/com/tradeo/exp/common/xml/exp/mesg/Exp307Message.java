package com.tradeo.exp.common.xml.exp.mesg;

import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.xml.exp.send.EXP307;
import com.tradeo.exp.common.xml.exp.send.EnvelopInfo;
import com.tradeo.exp.common.xml.exp.send.ExpBaseEntity;

public class Exp307Message extends ExpBaseMessage {

	@Override
	protected StringBuilder getBody(ExpBaseEntity<?> baseEntity) {
		StringBuilder bodySB = new StringBuilder();
		EXP307 exp307Entity = (EXP307) baseEntity.getData();
		if(!CommonUtils.isEmptyObj(exp307Entity)){
			//xmlns=\"http://www.chinaport.gov.cn/Exp\"
			bodySB.append("<EXP307>");
			bodySB.append("<AgentCode>" + CommonUtils.emptyStringDeal(exp307Entity.getAgentCode()) + "</AgentCode>");
			bodySB.append("<TradeCode>" + CommonUtils.emptyStringDeal(exp307Entity.getTradeCode()) + "</TradeCode>");
			bodySB.append("<BeginDate>" + CommonUtils.formatDateToStringYMD(exp307Entity.getBeginDate()) + "</BeginDate>");
			bodySB.append("<EndDate>" + CommonUtils.formatDateToStringYMD(exp307Entity.getEndDate()) + "</EndDate>");
			bodySB.append("<CustomsCode>" + CommonUtils.emptyStringDeal(exp307Entity.getCustomsCode()) + "</CustomsCode>");
			bodySB.append("<InputNo>" + CommonUtils.emptyStringDeal(exp307Entity.getInputNo()) + "</InputNo>");
			bodySB.append("<AgentScc>" + CommonUtils.emptyStringDeal(exp307Entity.getAgentScc()) + "</AgentScc>");
			bodySB.append("<TradeScc>" + CommonUtils.emptyStringDeal(exp307Entity.getTradeScc()) + "</TradeScc>");					
			bodySB.append("</EXP307>");
		}
		return bodySB;
	}
	
	public static void main(String[] args) {
		ExpBaseEntity<EXP307> baseEntity = new ExpBaseEntity<>();
		
		EnvelopInfo envelopInfo = new EnvelopInfo();
		baseEntity.setEnvelopInfo(envelopInfo);
		
		EXP307 exp307 = new EXP307();
		baseEntity.setData(exp307);
		
		ExpBaseMessage baseMessage = new Exp307Message();
		
		System.out.println(baseMessage.getMessage(baseEntity));
		
		
	}
}
