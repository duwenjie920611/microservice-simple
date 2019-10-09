package com.tradeo.exp.common.xml.exp.mesg;

import java.util.List;

import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.xml.exp.send.ExpBaseEntity;
import com.tradeo.exp.common.xml.exp.send.exp311.Exp311;
import com.tradeo.exp.common.xml.exp.send.exp311.ExpMft;
import com.tradeo.exp.common.xml.exp.send.exp311.ExpMftHead;

public class Exp311Message extends ExpBaseMessage{

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
				bodySB.append("<OpType>"+ CommonUtils.emptyStringDeal(expMftHead.getOpType()) +"</OpType>");
				bodySB.append("<BillNo>"+ CommonUtils.emptyStringDeal(expMftHead.getBillNo()) +"</BillNo>");
				bodySB.append("<VoyageNo>"+ CommonUtils.emptyStringDeal(expMftHead.getVoyageNo()) +"</VoyageNo>");
				bodySB.append("<IEFlag>"+ CommonUtils.emptyStringDeal(expMftHead.getIeFlag()) +"</IEFlag>");
				bodySB.append("<TrafCnName>"+ CommonUtils.emptyStringDeal(expMftHead.getTrafCnName()) +"</TrafCnName>");
				bodySB.append("<TrafEnName>"+ CommonUtils.emptyStringDeal(expMftHead.getTrafEnName()) +"</TrafEnName>");
				bodySB.append("<GrossWt>"+ CommonUtils.emptyStringDeal(expMftHead.getGrossWt()) +"</GrossWt>");
				bodySB.append("<PackNo>"+ CommonUtils.emptyStringDeal(expMftHead.getPackNo()) +"</PackNo>");
				bodySB.append("<BillNum>"+ CommonUtils.emptyStringDeal(expMftHead.getBillNum()) +"</BillNum>");
				bodySB.append("<TrafMode>"+ CommonUtils.emptyStringDeal(expMftHead.getTrafMode()) +"</TrafMode>");
				bodySB.append("<IEDate>"+ CommonUtils.formatDateToStringYMD(expMftHead.getIeDate()) +"</IEDate>");
				bodySB.append("<DestinationPort>"+ CommonUtils.emptyStringDeal(expMftHead.getDestinationPort()) +"</DestinationPort>");
				bodySB.append("<IEPort>"+ CommonUtils.emptyStringDeal(expMftHead.getIePort()) +"</IEPort>");
				bodySB.append("<TradeCo>"+ CommonUtils.emptyStringDeal(expMftHead.getTradeCo()) +"</TradeCo>");
				bodySB.append("<TradeName>"+ CommonUtils.emptyStringDeal(expMftHead.getTradeName()) +"</TradeName>");
				bodySB.append("<InputNo>"+ CommonUtils.emptyStringDeal(expMftHead.getInputNo()) +"</InputNo>");
				bodySB.append("<InputOpName>"+ CommonUtils.emptyStringDeal(expMftHead.getInputOpName()) +"</InputOpName>");
				bodySB.append("<InputCompanyCode>"+ CommonUtils.emptyStringDeal(expMftHead.getInputCompanyCode()) +"</InputCompanyCode>");
				bodySB.append("<InputCompanyName>"+ CommonUtils.emptyStringDeal(expMftHead.getInputCompanyName()) +"</InputCompanyName>");
				bodySB.append("</ExpMftHead>");
			}
			
			List<ExpMft> expMftList = exp311.getExpMftList();
			if(!CommonUtils.isEmptyCollection(expMftList)){
				for (ExpMft expMft : expMftList) {
					bodySB.append("<ExpMftList>");
					bodySB.append("<BillNo>"+ CommonUtils.emptyStringDeal(expMft.getBillNo()) +"</BillNo>");
					bodySB.append("<AssBillNo>"+ CommonUtils.emptyStringDeal(expMft.getAssBillNo()) +"</AssBillNo>");
					bodySB.append("<VoyageNo>"+ CommonUtils.emptyStringDeal(expMft.getVoyageNo()) +"</VoyageNo>");
					bodySB.append("<MainGName>"+ CommonUtils.xmlSpceialCharDeal(expMft.getMainGName()) +"</MainGName>");
					bodySB.append("<PackNo>"+ CommonUtils.emptyStringDeal(expMft.getPackNo()) +"</PackNo>");
					bodySB.append("<GrossWt>"+ CommonUtils.emptyStringDeal(expMft.getGrossWt()) +"</GrossWt>");
					bodySB.append("<TradeTotal>"+ CommonUtils.emptyStringDeal(expMft.getTradeTotal()) +"</TradeTotal>");
					bodySB.append("<TradeCurr>"+ CommonUtils.emptyStringDeal(expMft.getTradeCurr()) +"</TradeCurr>");
					bodySB.append("</ExpMftList>");
				}
			}
			
			bodySB.append("</EXP311>");
		}
		
		return bodySB;
	}

}
