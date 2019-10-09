package com.tradeo.exp.common.xml.exp.mesg;

import java.util.List;

import com.google.common.collect.Lists;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.xml.exp.send.EnvelopInfo;
import com.tradeo.exp.common.xml.exp.send.ExpBaseEntity;
import com.tradeo.exp.common.xml.exp.send.exp301.Entry;
import com.tradeo.exp.common.xml.exp.send.exp301.EntryDocu;
import com.tradeo.exp.common.xml.exp.send.exp301.EntryHead;
import com.tradeo.exp.common.xml.exp.send.exp301.Exp301;


/***
 * 武汉专用  申报单 实体
 * @author duwenjie
 *
 */
public class DExp301Message extends ExpBaseMessage {
	
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
		
		Exp301 exp301 = (Exp301) baseEntity.getData();
		
		if(!CommonUtils.isEmptyObj(exp301)){
			// xmlns=\"http://www.chinaport.gov.cn/Exp\"
			bodySB.append("<EXP301 xmlns=\"http://www.chinaport.gov.cn/Exp\">");
			
			EntryHead entryHead = exp301.getEntryHead();
			if (!CommonUtils.isEmptyObj(entryHead)) {
				bodySB.append("<EntryHead>");
				
				bodySB.append("<OpType>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getOpType()) +"</OpType>");
				bodySB.append("<PreEntryId>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getPreEntryId()) +"</PreEntryId>");
				bodySB.append("<EntryId>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getEntryId()) +"</EntryId>");
				bodySB.append("<IEFlag>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getiEFlag()) +"</IEFlag>");
				bodySB.append("<IEPort>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getiEPort()) +"</IEPort>");
				bodySB.append("<IEDate>"+ CommonUtils.formatDateToStringYMD(entryHead.getiEDate()) +"</IEDate>");
				bodySB.append("<DDate>"+ CommonUtils.formatDateToStringYMDHMS(entryHead.getdDate()) +"</DDate>");
				bodySB.append("<DestinationPort>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getDestinationPort()) +"</DestinationPort>");
				bodySB.append("<TrafName>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getTrafName()) +"</TrafName>");
				bodySB.append("<VoyageNo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getVoyageNo()) +"</VoyageNo>");
				bodySB.append("<TrafMode>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getTrafMode()) +"</TrafMode>");
				bodySB.append("<TradeCo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getTradeCo()) +"</TradeCo>");
				bodySB.append("<TradeName>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getTradeName()) +"</TradeName>");
				bodySB.append("<DistrictCode>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getDistrictCode()) +"</DistrictCode>");
				bodySB.append("<OwnerCode>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getOwnerCode()) +"</OwnerCode>");
				bodySB.append("<OwnerName>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getOwnerName()) +"</OwnerName>");
				bodySB.append("<AgentType>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getAgentType()) +"</AgentType>");
				bodySB.append("<AgentCode>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getAgentCode()) +"</AgentCode>");
				bodySB.append("<AgentName>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getAgentName()) +"</AgentName>");
				bodySB.append("<ContrNo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getContrNo()) +"</ContrNo>");
				bodySB.append("<BillNo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getBillNo()) +"</BillNo>");
				bodySB.append("<AssBillNo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getAssBillNo()) +"</AssBillNo>");
				bodySB.append("<TradeCountry>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getTradeCountry()) +"</TradeCountry>");
				bodySB.append("<TradeMode>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getTradeMode()) +"</TradeMode>");
				bodySB.append("<CutMode>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getCutMode()) +"</CutMode>");
				bodySB.append("<TransMode>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getTransMode()) +"</TransMode>");
				bodySB.append("<FeeMark>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getFeeMark()) +"</FeeMark>");
				bodySB.append("<FeeCurr>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getFeeCurr()) +"</FeeCurr>");
				bodySB.append("<FeeRate>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getFeeRate()) +"</FeeRate>");
//				bodySB.append("<FeeRate>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getFeeRate()) +"</FeeRate>");
				bodySB.append("<InsurMark>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getInsurMark()) +"</InsurMark>");
				bodySB.append("<InsurCurr>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getInsurCurr()) +"</InsurCurr>");
				bodySB.append("<InsurRate>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getInsurRate()) +"</InsurRate>");
				bodySB.append("<OtherMark>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getOtherMark()) +"</OtherMark>");
				bodySB.append("<OtherCurr>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getOtherCurr()) +"</OtherCurr>");
				bodySB.append("<OtherRate>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getOtherRate()) +"</OtherRate>");
				bodySB.append("<PackNo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getPackNo()) +"</PackNo>");
				bodySB.append("<GrossWt>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getGrossWt()) +"</GrossWt>");
				bodySB.append("<NetWt>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getNetWt()) +"</NetWt>");
				bodySB.append("<WrapType>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getWrapType()) +"</WrapType>");
				bodySB.append("<NoteS>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getNoteS()) +"</NoteS>");
				bodySB.append("<DeclPort>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getDeclPort()) +"</DeclPort>");
				bodySB.append("<CoOwner>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getCoOwner()) +"</CoOwner>");
				bodySB.append("<RelativeId>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getRelativeId()) +"</RelativeId>");
				bodySB.append("<InputNo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getInputNo()) +"</InputNo>");
				bodySB.append("<InputCompanyCo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getInputCompanyCo()) +"</InputCompanyCo>");
				bodySB.append("<InputCompanyName>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getInputCompanyName()) +"</InputCompanyName>");
				bodySB.append("<DeclareNo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getDeclareNo()) +"</DeclareNo>");
				bodySB.append("<CustomsField>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getCustomsField()) +"</CustomsField>");
				bodySB.append("<KjId>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getKjId()) +"</KjId>");
				bodySB.append("<SendName>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getSendName()) +"</SendName>");
				bodySB.append("<ReceiveName>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getReceiveName()) +"</ReceiveName>");
				bodySB.append("<SendCountry>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getSendCountry()) +"</SendCountry>");
				bodySB.append("<SendCity>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getSendCity()) +"</SendCity>");
				bodySB.append("<SendId>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getSendId()) +"</SendId>");
				bodySB.append("<TotalValue>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getTotalValue()) +"</TotalValue>");
				bodySB.append("<CurrCode>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getCurrCode()) +"</CurrCode>");
				bodySB.append("<MainGName>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getMainGName()) +"</MainGName>");
				bodySB.append("<EntryType>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getEntryType()) +"</EntryType>");
				bodySB.append("<SendIdType>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getSendIdType()) +"</SendIdType>");
				
				
				bodySB.append("<TradeScc>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getTradeScc()) +"</TradeScc>");
				bodySB.append("<OwnerScc>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getOwnerScc()) +"</OwnerScc>");
				bodySB.append("<AgentScc>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getAgentScc()) +"</AgentScc>");
				bodySB.append("<SendAddress>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getSendAddress()) +"</SendAddress>");
				bodySB.append("<SendTelNo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getSendTelNo()) +"</SendTelNo>");
				bodySB.append("<ReceiveAddress>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getReceiveAddress()) +"</ReceiveAddress>");
				bodySB.append("<ReceiveTelNo>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getReceiveTelNo()) +"</ReceiveTelNo>");
				bodySB.append("<ReceiveCountry>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getReceiveCountry()) +"</ReceiveCountry>");
				bodySB.append("<ReceiveCity>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getReceiveCity()) +"</ReceiveCity>");
				bodySB.append("<StopCityEn>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getStopCityEn()) +"</StopCityEn>");
				bodySB.append("<SendNameEn>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getSendNameEn()) +"</SendNameEn>");
				bodySB.append("<SendAddressEn>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getSendAddressEn()) +"</SendAddressEn>");
				bodySB.append("<SendCityEn>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getSendCityEn()) +"</SendCityEn>");
				bodySB.append("<ReceiveNameEn>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getReceiveNameEn()) +"</ReceiveNameEn>");
				bodySB.append("<ReceiveAddressEn>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getReceiveAddressEn()) +"</ReceiveAddressEn>");
				bodySB.append("<WoodWrap>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getWoodWrap()) +"</WoodWrap>");
				bodySB.append("<MainGNameEn>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getMainGNameEn()) +"</MainGNameEn>");
				bodySB.append("<GoodsUsed>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getGoodsUsed()) +"</GoodsUsed>");
				bodySB.append("<LowTempTrans>"+ CommonUtils.xmlSpceialCharDeal(entryHead.getLowTempTrans()) +"</LowTempTrans>");
				
				bodySB.append("</EntryHead>");
			}
			
			List<Entry>	 entryList = exp301.getEntryList();
			if(!CommonUtils.isEmptyCollection(entryList)){
				for (Entry entry : entryList) {
					bodySB.append("<EntryList>");
					bodySB.append("<OpType>"+ CommonUtils.xmlSpceialCharDeal(entry.getOpType()) +"</OpType>");
					bodySB.append("<GNo>"+ CommonUtils.xmlSpceialCharDeal(entry.getgNo()) +"</GNo>");
					bodySB.append("<CodeTS>"+ CommonUtils.xmlSpceialCharDeal(entry.getCodeTS()) +"</CodeTS>");
					bodySB.append("<GName>"+ CommonUtils.xmlSpceialCharDeal(entry.getgName()) +"</GName>");
					bodySB.append("<GModel>"+ CommonUtils.xmlSpceialCharDeal(entry.getgModel()) +"</GModel>");
					bodySB.append("<OriginCountry>"+ CommonUtils.xmlSpceialCharDeal(entry.getOriginCountry()) +"</OriginCountry>");
					bodySB.append("<TradeCurr>"+ CommonUtils.xmlSpceialCharDeal(entry.getTradeCurr()) +"</TradeCurr>");
					
					bodySB.append("<ExchangeRate>"+ CommonUtils.xmlSpceialCharDeal(entry.getExchangeRate()) +"</ExchangeRate>");//xsd 没有
					
					bodySB.append("<TradeTotal>"+ CommonUtils.xmlSpceialCharDeal(entry.getTradeTotal()) +"</TradeTotal>");
					bodySB.append("<DeclPrice>"+ CommonUtils.xmlSpceialCharDeal(entry.getDeclPrice()) +"</DeclPrice>");
					bodySB.append("<DeclTotal>"+ CommonUtils.xmlSpceialCharDeal(entry.getDeclTotal()) +"</DeclTotal>");
					bodySB.append("<UseTo>"+ CommonUtils.xmlSpceialCharDeal(entry.getUseTo()) +"</UseTo>");
					bodySB.append("<DutyMode>"+ CommonUtils.xmlSpceialCharDeal(entry.getDutyMode()) +"</DutyMode>");
					bodySB.append("<GQty>"+ CommonUtils.xmlSpceialCharDeal(entry.getgQty()) +"</GQty>");
					bodySB.append("<GUnit>"+ CommonUtils.xmlSpceialCharDeal(entry.getgUnit()) +"</GUnit>");
					bodySB.append("<Qty1>"+ CommonUtils.xmlSpceialCharDeal(entry.getQty1()) +"</Qty1>");
					bodySB.append("<Unit1>"+ CommonUtils.xmlSpceialCharDeal(entry.getUnit1()) +"</Unit1>");
					bodySB.append("<Qty2>"+ CommonUtils.xmlSpceialCharDeal(entry.getQty2()) +"</Qty2>");
					bodySB.append("<Unit2>"+ CommonUtils.xmlSpceialCharDeal(entry.getUnit2()) +"</Unit2>");
					
					bodySB.append("<ClassMark>"+ CommonUtils.xmlSpceialCharDeal(entry.getClassMark()) +"</ClassMark>");//xsd 没有
					bodySB.append("<GGrossWt>"+ CommonUtils.xmlSpceialCharDeal(entry.getgGrossWt()) +"</GGrossWt>");
					
					//xsd 下面没有
					bodySB.append("<MName>"+ CommonUtils.xmlSpceialCharDeal(entry.getmName()) +"</MName>");
					bodySB.append("<OriginCity>"+ CommonUtils.xmlSpceialCharDeal(entry.getOriginCity()) +"</OriginCity>");
					bodySB.append("<GNameEn>"+ CommonUtils.xmlSpceialCharDeal(entry.getgNameEn()) +"</GNameEn>");
					bodySB.append("<Backup1>"+ CommonUtils.xmlSpceialCharDeal(entry.getBackup1()) +"</Backup1>");
					bodySB.append("<Backup2>"+ CommonUtils.xmlSpceialCharDeal(entry.getBackup2()) +"</Backup2>");
					bodySB.append("<Backup3>"+ CommonUtils.xmlSpceialCharDeal(entry.getBackup3()) +"</Backup3>");
					bodySB.append("<Backup4>"+ CommonUtils.xmlSpceialCharDeal(entry.getBackup4()) +"</Backup4>");
					bodySB.append("<Backup5>"+ CommonUtils.xmlSpceialCharDeal(entry.getBackup5()) +"</Backup5>");
					
					bodySB.append("</EntryList>");
				}
			}
			
			List<EntryDocu> entryDocuList = exp301.getEntryDocuList();
			if(!CommonUtils.isEmptyCollection(entryDocuList)){
				for (EntryDocu entryDocu : entryDocuList) {
					bodySB.append("<EntryDocu>");
					bodySB.append("<OpType>" + CommonUtils.xmlSpceialCharDeal(entryDocu.getOpType())+ "</OpType>");
					bodySB.append("<OrderNo>" + CommonUtils.xmlSpceialCharDeal(entryDocu.getOrderNo())+ "</OrderNo>");
					bodySB.append("<DocuCode>" + CommonUtils.xmlSpceialCharDeal(entryDocu.getDocuCode())+ "</DocuCode>");
					bodySB.append("<CertCode>" + CommonUtils.xmlSpceialCharDeal(entryDocu.getCertCode())+ "</CertCode>");
					bodySB.append("</EntryDocu>");
				}
			}
			
			bodySB.append("</EXP301>");
		}
		

		
		return bodySB;
	}
	
	public static void main(String[] args) {
		
		ExpBaseEntity<Exp301>  baseEntity= new ExpBaseEntity<>();
		EnvelopInfo envelopInfo = new EnvelopInfo();
		baseEntity.setEnvelopInfo(envelopInfo);
		
		Exp301 exp301 = new Exp301();
		baseEntity.setData(exp301);
		
		
		EntryHead entryHead = new EntryHead();
		entryHead.setAgentCode("");
		exp301.setEntryHead(entryHead);
		
		List<Entry> entryList = Lists.newArrayList();
		Entry entry = new Entry();
		entryList.add(entry);
		exp301.setEntryList(entryList);
		
		List<EntryDocu> entryDocuList = Lists.newArrayList();
		EntryDocu entryDocu = new EntryDocu();
		entryDocuList.add(entryDocu);
		exp301.setEntryDocuList(entryDocuList);
		
		DExp301Message baseMessage = new DExp301Message();
		
		System.out.println(baseMessage.getMessage(baseEntity));
		
	}

}
