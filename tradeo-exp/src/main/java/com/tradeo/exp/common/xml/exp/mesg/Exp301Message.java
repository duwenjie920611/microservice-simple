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

public class Exp301Message extends ExpBaseMessage{

	@Override
	protected StringBuilder getBody(ExpBaseEntity<?> baseEntity) {
		StringBuilder bodySB = new StringBuilder();
		
		Exp301 exp301 = (Exp301) baseEntity.getData();
		
		if(!CommonUtils.isEmptyObj(exp301)){
			// xmlns=\"http://www.chinaport.gov.cn/Exp\"
			bodySB.append("<EXP301>");
			
			EntryHead entryHead = exp301.getEntryHead();
			if (!CommonUtils.isEmptyObj(entryHead)) {
				bodySB.append("<EntryHead>");
				
				bodySB.append("<OpType>"+ CommonUtils.emptyStringDeal(entryHead.getOpType()) +"</OpType>");
				bodySB.append("<PreEntryId>"+ CommonUtils.emptyStringDeal(entryHead.getPreEntryId()) +"</PreEntryId>");
				bodySB.append("<EntryId>"+ CommonUtils.emptyStringDeal(entryHead.getEntryId()) +"</EntryId>");
				bodySB.append("<IEFlag>"+ CommonUtils.emptyStringDeal(entryHead.getiEFlag()) +"</IEFlag>");
				bodySB.append("<IEPort>"+ CommonUtils.emptyStringDeal(entryHead.getiEPort()) +"</IEPort>");
				bodySB.append("<IEDate>"+ CommonUtils.formatDateToStringYMD(entryHead.getiEDate()) +"</IEDate>");
				bodySB.append("<DDate>"+ CommonUtils.formatDateToStringYMDHMS(entryHead.getdDate()) +"</DDate>");
				bodySB.append("<DestinationPort>"+ CommonUtils.emptyStringDeal(entryHead.getDestinationPort()) +"</DestinationPort>");
				bodySB.append("<TrafName>"+ CommonUtils.emptyStringDeal(entryHead.getTrafName()) +"</TrafName>");
				bodySB.append("<VoyageNo>"+ CommonUtils.emptyStringDeal(entryHead.getVoyageNo()) +"</VoyageNo>");
				bodySB.append("<TrafMode>"+ CommonUtils.emptyStringDeal(entryHead.getTrafMode()) +"</TrafMode>");
				bodySB.append("<TradeCo>"+ CommonUtils.emptyStringDeal(entryHead.getTradeCo()) +"</TradeCo>");
				bodySB.append("<TradeName>"+ CommonUtils.emptyStringDeal(entryHead.getTradeName()) +"</TradeName>");
				bodySB.append("<DistrictCode>"+ CommonUtils.emptyStringDeal(entryHead.getDistrictCode()) +"</DistrictCode>");
				bodySB.append("<OwnerCode>"+ CommonUtils.emptyStringDeal(entryHead.getOwnerCode()) +"</OwnerCode>");
				bodySB.append("<OwnerName>"+ CommonUtils.emptyStringDeal(entryHead.getOwnerName()) +"</OwnerName>");
				bodySB.append("<AgentType>"+ CommonUtils.emptyStringDeal(entryHead.getAgentType()) +"</AgentType>");
				bodySB.append("<AgentCode>"+ CommonUtils.emptyStringDeal(entryHead.getAgentCode()) +"</AgentCode>");
				bodySB.append("<AgentName>"+ CommonUtils.emptyStringDeal(entryHead.getAgentName()) +"</AgentName>");
				bodySB.append("<ContrNo>"+ CommonUtils.emptyStringDeal(entryHead.getContrNo()) +"</ContrNo>");
				bodySB.append("<BillNo>"+ CommonUtils.emptyStringDeal(entryHead.getBillNo()) +"</BillNo>");
				bodySB.append("<AssBillNo>"+ CommonUtils.emptyStringDeal(entryHead.getAssBillNo()) +"</AssBillNo>");
				bodySB.append("<TradeCountry>"+ CommonUtils.emptyStringDeal(entryHead.getTradeCountry()) +"</TradeCountry>");
				bodySB.append("<TradeMode>"+ CommonUtils.emptyStringDeal(entryHead.getTradeMode()) +"</TradeMode>");
				bodySB.append("<CutMode>"+ CommonUtils.emptyStringDeal(entryHead.getCutMode()) +"</CutMode>");
				bodySB.append("<TransMode>"+ CommonUtils.emptyStringDeal(entryHead.getTransMode()) +"</TransMode>");
				bodySB.append("<FeeMark>"+ CommonUtils.emptyStringDeal(entryHead.getFeeMark()) +"</FeeMark>");
				bodySB.append("<FeeCurr>"+ CommonUtils.emptyStringDeal(entryHead.getFeeCurr()) +"</FeeCurr>");
				bodySB.append("<FeeRate>"+ CommonUtils.emptyStringDeal(entryHead.getFeeRate()) +"</FeeRate>");
//				bodySB.append("<FeeRate>"+ CommonUtils.emptyStringDeal(entryHead.getFeeRate()) +"</FeeRate>");
				bodySB.append("<InsurMark>"+ CommonUtils.emptyStringDeal(entryHead.getInsurMark()) +"</InsurMark>");
				bodySB.append("<InsurCurr>"+ CommonUtils.emptyStringDeal(entryHead.getInsurCurr()) +"</InsurCurr>");
				bodySB.append("<InsurRate>"+ CommonUtils.emptyStringDeal(entryHead.getInsurRate()) +"</InsurRate>");
				bodySB.append("<OtherMark>"+ CommonUtils.emptyStringDeal(entryHead.getOtherMark()) +"</OtherMark>");
				bodySB.append("<OtherCurr>"+ CommonUtils.emptyStringDeal(entryHead.getOtherCurr()) +"</OtherCurr>");
				bodySB.append("<OtherRate>"+ CommonUtils.emptyStringDeal(entryHead.getOtherRate()) +"</OtherRate>");
				bodySB.append("<PackNo>"+ CommonUtils.emptyStringDeal(entryHead.getPackNo()) +"</PackNo>");
				bodySB.append("<GrossWt>"+ CommonUtils.emptyStringDeal(entryHead.getGrossWt()) +"</GrossWt>");
				bodySB.append("<NetWt>"+ CommonUtils.emptyStringDeal(entryHead.getNetWt()) +"</NetWt>");
				bodySB.append("<WrapType>"+ CommonUtils.emptyStringDeal(entryHead.getWrapType()) +"</WrapType>");
				bodySB.append("<NoteS>"+ CommonUtils.emptyStringDeal(entryHead.getNoteS()) +"</NoteS>");
				bodySB.append("<DeclPort>"+ CommonUtils.emptyStringDeal(entryHead.getDeclPort()) +"</DeclPort>");
				bodySB.append("<CoOwner>"+ CommonUtils.emptyStringDeal(entryHead.getCoOwner()) +"</CoOwner>");
				bodySB.append("<RelativeId>"+ CommonUtils.emptyStringDeal(entryHead.getRelativeId()) +"</RelativeId>");
				bodySB.append("<InputNo>"+ CommonUtils.emptyStringDeal(entryHead.getInputNo()) +"</InputNo>");
				bodySB.append("<InputCompanyCo>"+ CommonUtils.emptyStringDeal(entryHead.getInputCompanyCo()) +"</InputCompanyCo>");
				bodySB.append("<InputCompanyName>"+ CommonUtils.emptyStringDeal(entryHead.getInputCompanyName()) +"</InputCompanyName>");
				bodySB.append("<DeclareNo>"+ CommonUtils.emptyStringDeal(entryHead.getDeclareNo()) +"</DeclareNo>");
				bodySB.append("<CustomsField>"+ CommonUtils.emptyStringDeal(entryHead.getCustomsField()) +"</CustomsField>");
				bodySB.append("<KjId>"+ CommonUtils.emptyStringDeal(entryHead.getKjId()) +"</KjId>");
				bodySB.append("<SendName>"+ CommonUtils.emptyStringDeal(entryHead.getSendName()) +"</SendName>");
				bodySB.append("<ReceiveName>"+ CommonUtils.emptyStringDeal(entryHead.getReceiveName()) +"</ReceiveName>");
				bodySB.append("<SendCountry>"+ CommonUtils.emptyStringDeal(entryHead.getSendCountry()) +"</SendCountry>");
				bodySB.append("<SendCity>"+ CommonUtils.emptyStringDeal(entryHead.getSendCity()) +"</SendCity>");
				bodySB.append("<SendId>"+ CommonUtils.emptyStringDeal(entryHead.getSendId()) +"</SendId>");
				bodySB.append("<TotalValue>"+ CommonUtils.emptyStringDeal(entryHead.getTotalValue()) +"</TotalValue>");
				bodySB.append("<CurrCode>"+ CommonUtils.emptyStringDeal(entryHead.getCurrCode()) +"</CurrCode>");
				bodySB.append("<MainGName>"+ CommonUtils.emptyStringDeal(entryHead.getMainGName()) +"</MainGName>");
				bodySB.append("<EntryType>"+ CommonUtils.emptyStringDeal(entryHead.getEntryType()) +"</EntryType>");
				bodySB.append("<SendIdType>"+ CommonUtils.emptyStringDeal(entryHead.getSendIdType()) +"</SendIdType>");
				
				
				bodySB.append("<TradeScc>"+ CommonUtils.emptyStringDeal(entryHead.getTradeScc()) +"</TradeScc>");
				bodySB.append("<OwnerScc>"+ CommonUtils.emptyStringDeal(entryHead.getOwnerScc()) +"</OwnerScc>");
				bodySB.append("<AgentScc>"+ CommonUtils.emptyStringDeal(entryHead.getAgentScc()) +"</AgentScc>");
				bodySB.append("<SendAddress>"+ CommonUtils.emptyStringDeal(entryHead.getSendAddress()) +"</SendAddress>");
				bodySB.append("<SendTelNo>"+ CommonUtils.emptyStringDeal(entryHead.getSendTelNo()) +"</SendTelNo>");
				bodySB.append("<ReceiveAddress>"+ CommonUtils.emptyStringDeal(entryHead.getReceiveAddress()) +"</ReceiveAddress>");
				bodySB.append("<ReceiveTelNo>"+ CommonUtils.emptyStringDeal(entryHead.getReceiveTelNo()) +"</ReceiveTelNo>");
				bodySB.append("<ReceiveCountry>"+ CommonUtils.emptyStringDeal(entryHead.getReceiveCountry()) +"</ReceiveCountry>");
				bodySB.append("<ReceiveCity>"+ CommonUtils.emptyStringDeal(entryHead.getReceiveCity()) +"</ReceiveCity>");
				bodySB.append("<StopCityEn>"+ CommonUtils.emptyStringDeal(entryHead.getSendNameEn()) +"</StopCityEn>");
				bodySB.append("<SendNameEn>"+ CommonUtils.emptyStringDeal(entryHead.getSendNameEn()) +"</SendNameEn>");
				bodySB.append("<SendAddressEn>"+ CommonUtils.emptyStringDeal(entryHead.getSendAddressEn()) +"</SendAddressEn>");
				bodySB.append("<SendCityEn>"+ CommonUtils.emptyStringDeal(entryHead.getSendCityEn()) +"</SendCityEn>");
				bodySB.append("<ReceiveNameEn>"+ CommonUtils.emptyStringDeal(entryHead.getReceiveNameEn()) +"</ReceiveNameEn>");
				bodySB.append("<ReceiveAddressEn>"+ CommonUtils.emptyStringDeal(entryHead.getReceiveAddressEn()) +"</ReceiveAddressEn>");
				bodySB.append("<WoodWrap>"+ CommonUtils.emptyStringDeal(entryHead.getWoodWrap()) +"</WoodWrap>");
				bodySB.append("<MainGNameEn>"+ CommonUtils.emptyStringDeal(entryHead.getMainGNameEn()) +"</MainGNameEn>");
				bodySB.append("<GoodsUsed>"+ CommonUtils.emptyStringDeal(entryHead.getGoodsUsed()) +"</GoodsUsed>");
				bodySB.append("<LowTempTrans>"+ CommonUtils.emptyStringDeal(entryHead.getLowTempTrans()) +"</LowTempTrans>");
				
				bodySB.append("</EntryHead>");
			}
			
			List<Entry>	 entryList = exp301.getEntryList();
			if(!CommonUtils.isEmptyCollection(entryList)){
				for (Entry entry : entryList) {
					bodySB.append("<EntryList>");
					bodySB.append("<OpType>"+ CommonUtils.emptyStringDeal(entry.getOpType()) +"</OpType>");
					bodySB.append("<GNo>"+ CommonUtils.emptyStringDeal(entry.getgNo()) +"</GNo>");
					bodySB.append("<CodeTS>"+ CommonUtils.emptyStringDeal(entry.getCodeTS()) +"</CodeTS>");
					bodySB.append("<GName>"+ CommonUtils.emptyStringDeal(entry.getgName()) +"</GName>");
					bodySB.append("<GModel>"+ CommonUtils.emptyStringDeal(entry.getgModel()) +"</GModel>");
					bodySB.append("<OriginCountry>"+ CommonUtils.emptyStringDeal(entry.getOriginCountry()) +"</OriginCountry>");
					bodySB.append("<TradeCurr>"+ CommonUtils.emptyStringDeal(entry.getTradeCurr()) +"</TradeCurr>");
					
					bodySB.append("<ExchangeRate>"+ CommonUtils.emptyStringDeal(entry.getExchangeRate()) +"</ExchangeRate>");//xsd 没有
					
					bodySB.append("<TradeTotal>"+ CommonUtils.emptyStringDeal(entry.getTradeTotal()) +"</TradeTotal>");
					bodySB.append("<DeclPrice>"+ CommonUtils.emptyStringDeal(entry.getDeclPrice()) +"</DeclPrice>");
					bodySB.append("<DeclTotal>"+ CommonUtils.emptyStringDeal(entry.getDeclTotal()) +"</DeclTotal>");
					bodySB.append("<UseTo>"+ CommonUtils.emptyStringDeal(entry.getUseTo()) +"</UseTo>");
					bodySB.append("<DutyMode>"+ CommonUtils.emptyStringDeal(entry.getDutyMode()) +"</DutyMode>");
					bodySB.append("<GQty>"+ CommonUtils.emptyStringDeal(entry.getgQty()) +"</GQty>");
					bodySB.append("<GUnit>"+ CommonUtils.emptyStringDeal(entry.getgUnit()) +"</GUnit>");
					bodySB.append("<Qty1>"+ CommonUtils.emptyStringDeal(entry.getQty1()) +"</Qty1>");
					bodySB.append("<Unit1>"+ CommonUtils.emptyStringDeal(entry.getUnit1()) +"</Unit1>");
					bodySB.append("<Qty2>"+ CommonUtils.emptyStringDeal(entry.getQty2()) +"</Qty2>");
					bodySB.append("<Unit2>"+ CommonUtils.emptyStringDeal(entry.getUnit2()) +"</Unit2>");
					
					bodySB.append("<ClassMark>"+ CommonUtils.emptyStringDeal(entry.getClassMark()) +"</ClassMark>");//xsd 没有
					
					bodySB.append("<GGrossWt>"+ CommonUtils.emptyStringDeal(entry.getgGrossWt()) +"</GGrossWt>");
					
					//xsd 下面没有
					bodySB.append("<MName>"+ CommonUtils.emptyStringDeal(entry.getmName()) +"</MName>");
					bodySB.append("<OriginCity>"+ CommonUtils.emptyStringDeal(entry.getOriginCity()) +"</OriginCity>");
					bodySB.append("<GNameEn>"+ CommonUtils.emptyStringDeal(entry.getgNameEn()) +"</GNameEn>");
					bodySB.append("<Backup1>"+ CommonUtils.emptyStringDeal(entry.getBackup1()) +"</Backup1>");
					bodySB.append("<Backup2>"+ CommonUtils.emptyStringDeal(entry.getBackup2()) +"</Backup2>");
					bodySB.append("<Backup3>"+ CommonUtils.emptyStringDeal(entry.getBackup3()) +"</Backup3>");
					bodySB.append("<Backup4>"+ CommonUtils.emptyStringDeal(entry.getBackup4()) +"</Backup4>");
					bodySB.append("<Backup5>"+ CommonUtils.emptyStringDeal(entry.getBackup5()) +"</Backup5>");
					
					bodySB.append("</EntryList>");
				}
			}
			
			List<EntryDocu> entryDocuList = exp301.getEntryDocuList();
			if(!CommonUtils.isEmptyCollection(entryDocuList)){
				for (EntryDocu entryDocu : entryDocuList) {
					bodySB.append("<EntryDocu>");
					bodySB.append("<OpType>" + CommonUtils.emptyStringDeal(entryDocu.getOpType())+ "</OpType>");
					bodySB.append("<OrderNo>" + CommonUtils.emptyStringDeal(entryDocu.getOrderNo())+ "</OrderNo>");
					bodySB.append("<DocuCode>" + CommonUtils.emptyStringDeal(entryDocu.getDocuCode())+ "</DocuCode>");
					bodySB.append("<CertCode>" + CommonUtils.emptyStringDeal(entryDocu.getCertCode())+ "</CertCode>");
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
		
		
		ExpBaseMessage baseMessage = new Exp301Message();
		System.out.println(baseMessage.getMessage(baseEntity));
	}
	
	
	

}
