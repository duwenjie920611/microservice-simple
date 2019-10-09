package com.tradeo.exp.common.xml.exp.mesg;

import java.util.List;

import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.xml.exp.send.EnvelopInfo;
import com.tradeo.exp.common.xml.exp.send.ExpBaseEntity;
import com.tradeo.exp.common.xml.exp.send.exp311.Exp311;
import com.tradeo.exp.common.xml.exp.send.exp311.ExpMft;
import com.tradeo.exp.common.xml.exp.send.exp311.ExpMftHead;

public class DExp311Message extends ExpBaseMessage{
	
	protected StringBuilder getHead(ExpBaseEntity<?> baseEntity){
		StringBuilder headSB = new StringBuilder();
		headSB.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><Package>");
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

	@Override
	protected StringBuilder getBody(ExpBaseEntity<?> baseEntity) {
		StringBuilder bodySB = new StringBuilder();
		
		Exp311 exp311 = (Exp311) baseEntity.getData();
		
		if(!CommonUtils.isEmptyObj(exp311)){
			// xmlns="http://www.chinaport.gov.cn/Exp"
			bodySB.append("<EXP311>");
			ExpMftHead expMftHead = exp311.getExpMftHead();
			if(!CommonUtils.isEmptyObj(expMftHead)){
				bodySB.append("<ExpMftHead>");
				bodySB.append("<OpType>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getOpType()) +"</OpType>");
				bodySB.append("<BillNo>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getBillNo()) +"</BillNo>");
				bodySB.append("<VoyageNo>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getVoyageNo()) +"</VoyageNo>");
				bodySB.append("<IEFlag>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getIeFlag()) +"</IEFlag>");
				bodySB.append("<TrafCnName>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getTrafCnName()) +"</TrafCnName>");
				bodySB.append("<TrafEnName>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getTrafEnName()) +"</TrafEnName>");
				bodySB.append("<GrossWt>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getGrossWt()) +"</GrossWt>");
				bodySB.append("<PackNo>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getPackNo()) +"</PackNo>");
				bodySB.append("<BillNum>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getBillNum()) +"</BillNum>");
				bodySB.append("<TrafMode>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getTrafMode()) +"</TrafMode>");
				bodySB.append("<IEDate>"+ CommonUtils.formatDateToStringYMD(expMftHead.getIeDate()) +"</IEDate>");
				bodySB.append("<DestinationPort>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getDestinationPort()) +"</DestinationPort>");
				bodySB.append("<IEPort>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getIePort()) +"</IEPort>");
				bodySB.append("<TradeCo>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getTradeCo()) +"</TradeCo>");
				bodySB.append("<TradeName>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getTradeName()) +"</TradeName>");
				bodySB.append("<InputNo>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getInputNo()) +"</InputNo>");
				bodySB.append("<InputOpName>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getInputOpName()) +"</InputOpName>");
				bodySB.append("<InputCompanyCode>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getInputCompanyCode()) +"</InputCompanyCode>");
				bodySB.append("<InputCompanyName>"+ CommonUtils.xmlSpceialCharDeal(expMftHead.getInputCompanyName()) +"</InputCompanyName>");
				bodySB.append("</ExpMftHead>");
			}
			
			List<ExpMft> expMftList = exp311.getExpMftList();
			if(!CommonUtils.isEmptyCollection(expMftList)){
				for (ExpMft expMft : expMftList) {
					bodySB.append("<ExpMftList>");
					bodySB.append("<BillNo>"+ CommonUtils.xmlSpceialCharDeal(expMft.getBillNo()) +"</BillNo>");
					bodySB.append("<AssBillNo>"+ CommonUtils.xmlSpceialCharDeal(expMft.getAssBillNo()) +"</AssBillNo>");
					bodySB.append("<VoyageNo>"+ CommonUtils.xmlSpceialCharDeal(expMft.getVoyageNo()) +"</VoyageNo>");
					bodySB.append("<MainGName>"+ CommonUtils.xmlSpceialCharDeal(expMft.getMainGName()) +"</MainGName>");
					bodySB.append("<PackNo>"+ CommonUtils.xmlSpceialCharDeal(expMft.getPackNo()) +"</PackNo>");
					bodySB.append("<GrossWt>"+ CommonUtils.xmlSpceialCharDeal(expMft.getGrossWt()) +"</GrossWt>");
					bodySB.append("<TradeTotal>"+ CommonUtils.xmlSpceialCharDeal(expMft.getTradeTotal()) +"</TradeTotal>");
					bodySB.append("<TradeCurr>"+ CommonUtils.xmlSpceialCharDeal(expMft.getTradeCurr()) +"</TradeCurr>");
					bodySB.append("</ExpMftList>");
				}
			}
			
			bodySB.append("</EXP311>");
		}
		
		return bodySB;
	}
	
	public static void main(String[] args) {
	}

}

