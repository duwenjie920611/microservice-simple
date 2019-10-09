package com.tradeo.exp.common.xml.exp.mesg;

import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.xml.exp.send.EnvelopInfo;
import com.tradeo.exp.common.xml.exp.send.ExpBaseEntity;

public abstract class ExpBaseMessage {
	
	protected StringBuilder getHead(ExpBaseEntity<?> baseEntity){
		StringBuilder headSB = new StringBuilder();
		headSB.append("<Package>");
		
		EnvelopInfo envelopInfo = baseEntity.getEnvelopInfo();
		
		if(!CommonUtils.isEmptyObj(envelopInfo)){
			headSB.append("<EnvelopInfo>");
			headSB.append("<version>").append(CommonUtils.emptyStringDeal(envelopInfo.getVersion())).append("</version>");
			headSB.append("<message_id>").append(CommonUtils.emptyStringDeal(envelopInfo.getMessageId())).append("</message_id>");
			headSB.append("<file_name>").append(CommonUtils.emptyStringDeal(envelopInfo.getFileName())).append("</file_name>");
			headSB.append("<message_type>").append(CommonUtils.emptyStringDeal(envelopInfo.getMessageType())).append("</message_type>");
			headSB.append("<sender_id>").append(CommonUtils.emptyStringDeal(envelopInfo.getSenderId())).append("</sender_id>");
			headSB.append("<receiver_id>").append(CommonUtils.emptyStringDeal(envelopInfo.getReceiverId())).append("</receiver_id>");
			headSB.append("<send_time>").append(CommonUtils.formatDateToStringYMDTHMS(envelopInfo.getSendTime())).append("</send_time>");
			headSB.append("</EnvelopInfo>");
		}
		
		headSB.append("<DataInfo><SignedData><Data>");
		
		return headSB;
	}
	
	protected abstract StringBuilder getBody(ExpBaseEntity<?> baseEntity);
	
	protected StringBuilder getTail(){
		StringBuilder tailSB = new StringBuilder();
		tailSB.append("</Data></SignedData></DataInfo></Package>");
		return tailSB;
	}
	
	public String getMessage(ExpBaseEntity<?> baseEntity){
		return getHead(baseEntity).append(getBody(baseEntity)).append(getTail()).toString();
	}

}
