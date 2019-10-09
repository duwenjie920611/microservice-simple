package com.tradeo.exp.common.utils;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.google.common.collect.Lists;
import com.tradeo.exp.bo.YltBusAgreement;
import com.tradeo.exp.bo.YltBusDeclarebill;
import com.tradeo.exp.bo.YltBusDeclaregoods;
import com.tradeo.exp.bo.YltBusDuty;
import com.tradeo.exp.bo.YltBusDutyEntry;
import com.tradeo.exp.bo.YltBusDutyHead;
import com.tradeo.exp.bo.YltBusShipbill;
import com.tradeo.exp.bo.YltBusShipsubbill;
import com.tradeo.exp.bo.YltBusTax;
import com.tradeo.exp.bo.YltBusVoucher;
import com.tradeo.exp.common.eum.Constant;
import com.tradeo.exp.common.message.EXP306.EXP306.DutyFormHead;
import com.tradeo.exp.common.message.EXP306.EXP306.DutyFormList;
import com.tradeo.exp.common.message.EXP306.EXP306.EntryList;
import com.tradeo.exp.common.xml.exp.send.EXP307;
import com.tradeo.exp.common.xml.exp.send.EnvelopInfo;
import com.tradeo.exp.common.xml.exp.send.exp301.Entry;
import com.tradeo.exp.common.xml.exp.send.exp301.EntryDocu;
import com.tradeo.exp.common.xml.exp.send.exp301.EntryHead;
import com.tradeo.exp.common.xml.exp.send.exp311.ExpMft;
import com.tradeo.exp.common.xml.exp.send.exp311.ExpMftHead;

public class ExpBeanConver {
	
	/**
	 * 生成信封节点
	 * @param sendId
	 * @param messageType
	 * @return
	 */
	public static EnvelopInfo getEnvelop(String sendId,String messageType){
		EnvelopInfo envelopInfo = new EnvelopInfo();
		Date date = new Date();
		envelopInfo.setVersion("1.0");
		envelopInfo.setSenderId(sendId);
		envelopInfo.setReceiverId(Constant.EXPORT_CODE);
		envelopInfo.setMessageType(messageType);
		//sendid + receiveId + yyyymmddhhmmss + 11(序列号)
		envelopInfo.setMessageId(envelopInfo.getSenderId() + envelopInfo.getReceiverId() + 
				CommonUtils.formatDateToStringyMdHmsS(date)+ CommonUtils.createRandomString(11));
		// message_id + ".EXP"
		envelopInfo.setFileName(envelopInfo.getMessageId() + ".EXP");
		envelopInfo.setSendTime(date);
		return envelopInfo;
	}

	/**
	 * 报关单表头数据库实体 转化为 exp301表头实体
	 * @param yltBusDeclarebill
	 * @return
	 */
	public static EntryHead ytlBusDeclarebill2Exp301EntryHead(YltBusDeclarebill yltBusDeclarebill) {
		
		if(!CommonUtils.isEmptyObj(yltBusDeclarebill)){
			EntryHead entryHead = new EntryHead();
			BeanUtils.copyProperties(yltBusDeclarebill, entryHead);
			entryHead.setOpType(yltBusDeclarebill.getOptype());
			entryHead.setPreEntryId(yltBusDeclarebill.getPreEntryId());
			entryHead.setEntryId(yltBusDeclarebill.getEntryId());
			entryHead.setiEFlag(yltBusDeclarebill.getiEFlag());
			entryHead.setiEPort(yltBusDeclarebill.getiEPort());
			entryHead.setiEDate(yltBusDeclarebill.getiEDate());
			entryHead.setdDate(yltBusDeclarebill.getdDate());
			entryHead.setDestinationPort(yltBusDeclarebill.getDestinationPort());
			entryHead.setTrafName(yltBusDeclarebill.getTrafName());
			entryHead.setVoyageNo(yltBusDeclarebill.getVoyageNo());
			entryHead.setTrafMode(yltBusDeclarebill.getTrafMode());
			entryHead.setTradeCo(yltBusDeclarebill.getTradeCo());
			entryHead.setTradeName(yltBusDeclarebill.getTradeName());
			entryHead.setDistrictCode(yltBusDeclarebill.getDistrictCode());
			entryHead.setOwnerCode(yltBusDeclarebill.getOwnerCode());
			entryHead.setOwnerName(yltBusDeclarebill.getOwnerName());
			entryHead.setAgentType(yltBusDeclarebill.getAgentType());
			entryHead.setAgentCode(yltBusDeclarebill.getAgentCode());
			entryHead.setAgentName(yltBusDeclarebill.getAgentName());
			entryHead.setContrNo(yltBusDeclarebill.getContrNo());
			entryHead.setBillNo(yltBusDeclarebill.getBillno());
			entryHead.setAssBillNo(yltBusDeclarebill.getSubbillno());
			entryHead.setTradeCountry(yltBusDeclarebill.getTradeCountry());
			entryHead.setTradeMode(yltBusDeclarebill.getTradeMode());
			entryHead.setCutMode(yltBusDeclarebill.getCutMode());
			entryHead.setTransMode(yltBusDeclarebill.getTransMode());
			entryHead.setFeeMark(yltBusDeclarebill.getFeeMark());
			entryHead.setFeeCurr(yltBusDeclarebill.getFeeCurr());
			entryHead.setFeeRate(CommonUtils.emptyObjectDeal(yltBusDeclarebill.getFeeRate()));
			entryHead.setInsurMark(yltBusDeclarebill.getInsurMark());
			entryHead.setInsurCurr(yltBusDeclarebill.getInsurCurr());
			entryHead.setInsurRate(CommonUtils.emptyObjectDeal(yltBusDeclarebill.getInsurRate()));
			entryHead.setOtherCurr(yltBusDeclarebill.getOtherCurr());
			entryHead.setOtherMark(yltBusDeclarebill.getOtherMark());
			entryHead.setOtherRate(CommonUtils.emptyObjectDeal(yltBusDeclarebill.getOtherRate()));
			entryHead.setPackNo(CommonUtils.emptyObjectDeal(yltBusDeclarebill.getPackNo()));
			entryHead.setGrossWt(CommonUtils.emptyObjectDeal(yltBusDeclarebill.getGrossWt()));
			entryHead.setNetWt(CommonUtils.emptyObjectDeal(yltBusDeclarebill.getNetWt()));
			entryHead.setWrapType(yltBusDeclarebill.getWrapType());
			entryHead.setNoteS(yltBusDeclarebill.getNoteS());
			entryHead.setDeclPort(yltBusDeclarebill.getDeclPort());
			entryHead.setCoOwner(yltBusDeclarebill.getCoOwner());
			entryHead.setRelativeId(yltBusDeclarebill.getRelativeId());
			entryHead.setInputNo(yltBusDeclarebill.getInputNo());
			entryHead.setInputCompanyCo(yltBusDeclarebill.getInputCompanyCo());
			entryHead.setInputCompanyName(yltBusDeclarebill.getInputCompanyName());
			entryHead.setDeclareNo(yltBusDeclarebill.getDeclareNo());
			entryHead.setCustomsField(yltBusDeclarebill.getCustomsField());
			entryHead.setKjId(yltBusDeclarebill.getKjNo());
			entryHead.setSendName(yltBusDeclarebill.getSendName());
			entryHead.setReceiveName(yltBusDeclarebill.getReceiveName());
			entryHead.setSendCountry(yltBusDeclarebill.getSendCountry());
			entryHead.setSendCity(yltBusDeclarebill.getSendCity());
			entryHead.setSendId(yltBusDeclarebill.getSendId());
			entryHead.setTotalValue(CommonUtils.emptyObjectDeal(yltBusDeclarebill.getTotalValue()));
			entryHead.setCurrCode(yltBusDeclarebill.getCurrCode());
			entryHead.setMainGName(yltBusDeclarebill.getMaingname());
			entryHead.setEntryType(yltBusDeclarebill.getEntryType());
			entryHead.setSendIdType(yltBusDeclarebill.getSendIdType());
			entryHead.setTradeScc(yltBusDeclarebill.getTradeScc());
			entryHead.setOwnerScc(yltBusDeclarebill.getOwnerScc());
			entryHead.setAgentScc(yltBusDeclarebill.getAgentScc());
			entryHead.setSendAddress(yltBusDeclarebill.getSendAddress());
			entryHead.setSendTelNo(yltBusDeclarebill.getSendTelNo());
			entryHead.setReceiveAddress(yltBusDeclarebill.getReceiveAddress());
			entryHead.setReceiveTelNo(yltBusDeclarebill.getReceiveTelNo());
			entryHead.setReceiveCountry(yltBusDeclarebill.getReceiveCountry());
			entryHead.setReceiveCity(yltBusDeclarebill.getReceiveCity());
			entryHead.setStopCityEn(yltBusDeclarebill.getStopCityEn());
			entryHead.setSendNameEn(yltBusDeclarebill.getSendNameEn());
			entryHead.setSendAddressEn(yltBusDeclarebill.getSendAddressEn());
			entryHead.setSendCityEn(yltBusDeclarebill.getSendCityEn());
			entryHead.setReceiveNameEn(yltBusDeclarebill.getReceiveNameEn());
			entryHead.setWoodWrap(yltBusDeclarebill.getWoodWrap());
			entryHead.setMainGNameEn(yltBusDeclarebill.getMainGnameEn());
			entryHead.setGoodsUsed(yltBusDeclarebill.getGoodsUsed());
			entryHead.setLowTempTrans(yltBusDeclarebill.getLowTempTrans());
			return entryHead;
		}
		
		return null;
	}

	/**
	 * 报关单 表体集合 转化为 exp301表体实体
	 * @param declareGoodList
	 * @return
	 */
	public static List<Entry> yltBusDeclaregoods2EntryList(List<YltBusDeclaregoods> declareGoodList) {
		
		if(!CommonUtils.isEmptyCollection(declareGoodList)){
			List<Entry> exp301EntryList = Lists.newArrayList();
			for (YltBusDeclaregoods yltBusDeclaregoods : declareGoodList) {
				Entry entry = new Entry();
				BeanUtils.copyProperties(yltBusDeclaregoods, entry);
				entry.setOpType(yltBusDeclaregoods.getOptype());
				entry.setgNo(CommonUtils.emptyObjectDeal(yltBusDeclaregoods.getgNo()));
				entry.setCodeTS(yltBusDeclaregoods.getCodeTs());
				entry.setgName(yltBusDeclaregoods.getgName());
				entry.setgModel(yltBusDeclaregoods.getgModel());
				entry.setOriginCountry(yltBusDeclaregoods.getOriginCountry());
				entry.setTradeCurr(yltBusDeclaregoods.getTradecurr());
//				entry.setExchangeRate(yltBusDeclaregoods.get);// todo
				entry.setTradeTotal(CommonUtils.emptyObjectDeal(yltBusDeclaregoods.getTradeTotal()));
				entry.setDeclPrice(CommonUtils.emptyObjectDeal(yltBusDeclaregoods.getDecprice()));
				entry.setDeclTotal(CommonUtils.emptyObjectDeal(yltBusDeclaregoods.getDeclTotal()));
				entry.setUseTo(yltBusDeclaregoods.getUseTo());
				entry.setDutyMode(yltBusDeclaregoods.getDutyMode());
				entry.setgQty(CommonUtils.emptyObjectDeal(yltBusDeclaregoods.getgQty()));
				entry.setgUnit(yltBusDeclaregoods.getgUnit());
				entry.setQty1(CommonUtils.emptyObjectDeal(yltBusDeclaregoods.getQty1()));
				entry.setUnit1(yltBusDeclaregoods.getUnit1());
				entry.setQty2(CommonUtils.emptyObjectDeal(yltBusDeclaregoods.getQty2()));
				entry.setUnit2(yltBusDeclaregoods.getUnit2());
				entry.setgGrossWt(CommonUtils.emptyObjectDeal(yltBusDeclaregoods.getGcrosswt()));
				entry.setmName(yltBusDeclaregoods.getmName());
				entry.setOriginCity(yltBusDeclaregoods.getOriginCity());
				entry.setgNameEn(yltBusDeclaregoods.getgNameEn());
				entry.setBackup1("");
				entry.setBackup2("");
				entry.setBackup3("");
				entry.setBackup4("");
				entry.setBackup5("");
				
				exp301EntryList.add(entry);
			}
			
			return exp301EntryList;
		}
		
		return null;
	}

	/**
	 * 报关单 随附单据 数据实体对象 转化为 xml301 报文实体
	 * @param declareDocList
	 * @return
	 */
	public static List<EntryDocu> yltBusDeclaredocs2EntryDocList(List<YltBusVoucher> voucherList) {
		if(!CommonUtils.isEmptyCollection(voucherList)){
			List<EntryDocu> entryDocuList = Lists.newArrayList();
			for (YltBusVoucher yltBusVoucher : voucherList) {
				EntryDocu entryDocu = new EntryDocu();
				entryDocu.setOpType(yltBusVoucher.getOptype());
				entryDocu.setOrderNo(CommonUtils.emptyObjectDeal(yltBusVoucher.getOrderNo()));
				entryDocu.setCertCode(yltBusVoucher.getVoutype());
				entryDocu.setDocuCode(yltBusVoucher.getVouno());
				entryDocuList.add(entryDocu);
			}
			return entryDocuList;
		}
		return null;
	}

	/**
	 * 
	 * @param yltBusShipbill
	 * @return
	 */
	public static ExpMftHead yltBusShipbill2Exp311ExpMftHead(YltBusShipbill yltBusShipbill) {
		
		if(!CommonUtils.isEmptyObj(yltBusShipbill)){
			ExpMftHead expMftHead = new ExpMftHead();
			expMftHead.setOpType(yltBusShipbill.getOptype());
			expMftHead.setBillNo(yltBusShipbill.getBillno());
			// 运输工具航次号 15 位
			expMftHead.setVoyageNo(yltBusShipbill.getFlightno());
			expMftHead.setIeFlag(yltBusShipbill.getIeflag());
			expMftHead.setTrafCnName(yltBusShipbill.getTrafficchiname());
			expMftHead.setTrafEnName(yltBusShipbill.getTrafficengname());
			expMftHead.setGrossWt(CommonUtils.emptyObjectDeal(yltBusShipbill.getTotalweight()));
			expMftHead.setPackNo(CommonUtils.emptyObjectDeal(yltBusShipbill.getTotalcount()));
			expMftHead.setBillNum(CommonUtils.emptyObjectDeal(yltBusShipbill.getTotalbillcount()));
			//运输方式代码 
			expMftHead.setTrafMode(yltBusShipbill.getTranstypeen());
			// 进出口日期
			expMftHead.setIeDate(yltBusShipbill.getArrivaldate());
			//抵运港  6  
			expMftHead.setDestinationPort(yltBusShipbill.getDestinationport());
			//进出口岸代码 
			expMftHead.setIePort(yltBusShipbill.getPortcode());
			//经营单位编号
			expMftHead.setTradeCo(yltBusShipbill.getTradeco());
			//经营单位名称
			expMftHead.setTradeName(yltBusShipbill.getTradename());
			//录入人卡号  16位
			expMftHead.setInputNo(yltBusShipbill.getInputno());
			//录入人姓名 20 
			expMftHead.setInputOpName(yltBusShipbill.getInputopname());
			//录入单位代码 18 
			expMftHead.setInputCompanyCode(yltBusShipbill.getInputcompanycode());
			//录入单位名称 100
			expMftHead.setInputCompanyName(yltBusShipbill.getInputcompanyname());
			return expMftHead;
		}
		
		
		return null;
	}

	/**
	 * 舱单 分运单 表实体 转化为 报文实体
	 * @param shipSubBillList
	 * @return
	 */
	public static List<ExpMft> yltBusShipSubbillList2Exp311ExpMftList(List<YltBusShipsubbill> shipSubBillList) {
		if(!CommonUtils.isEmptyCollection(shipSubBillList)){
			List<ExpMft> expMftList = Lists.newArrayList();
			for (YltBusShipsubbill yltBusShipsubbill : shipSubBillList) {
				ExpMft expMft = new ExpMft();
				expMft.setBillNo(yltBusShipsubbill.getBillno());
				expMft.setAssBillNo(yltBusShipsubbill.getSubbillno());
				//缺少字段 航次号  
				expMft.setVoyageNo(yltBusShipsubbill.getFlightNo());
				expMft.setMainGName(yltBusShipsubbill.getMaingoodsname());
				expMft.setPackNo(CommonUtils.emptyObjectDeal(yltBusShipsubbill.getTotalcount()));
				expMft.setGrossWt(CommonUtils.emptyObjectDeal(yltBusShipsubbill.getTotalweight()));
				expMft.setTradeTotal(CommonUtils.emptyObjectDeal(yltBusShipsubbill.getTotalvalume()));
				expMft.setTradeCurr(yltBusShipsubbill.getCurrency());
				expMftList.add(expMft);
			}
			return expMftList;
		}
		
		return null;
	}

	/**
	 * 
	 * @param entryHead
	 * @return
	 */
	public static YltBusDeclarebill exp304EntryHead2YltBusDeclarebill(com.tradeo.exp.common.message.EXP304.EXP304.EntryHead entryHead) {
		
		if(!CommonUtils.isEmptyObj(entryHead)){
			
			YltBusDeclarebill yltBusDeclarebill = new YltBusDeclarebill();
			yltBusDeclarebill.setPreEntryId(CommonUtils.emptyStringDealNull(entryHead.getPreEntryId()));
			yltBusDeclarebill.setEntryId(CommonUtils.emptyStringDealNull(entryHead.getEntryId()));
			yltBusDeclarebill.setiEFlag(CommonUtils.emptyStringDealNull(entryHead.getIEFlag()));
			yltBusDeclarebill.setiEPort(CommonUtils.emptyStringDealNull(entryHead.getIEPort()));
			yltBusDeclarebill.setiEDate(CommonUtils.formatStringtToDateyMdHms(entryHead.getIEDate()));
			yltBusDeclarebill.setdDate(CommonUtils.formatStringtToDateyMdHms(entryHead.getDDate()));
			yltBusDeclarebill.setDestinationPort(CommonUtils.emptyStringDealNull(entryHead.getDestinationPort()));
			yltBusDeclarebill.setTrafName(CommonUtils.emptyStringDealNull(entryHead.getTrafName()));
			yltBusDeclarebill.setVoyageNo(CommonUtils.emptyStringDealNull(entryHead.getVoyageNo()));
			yltBusDeclarebill.setTrafMode(CommonUtils.emptyStringDealNull(entryHead.getTrafMode()));
			yltBusDeclarebill.setTradeCo(CommonUtils.emptyStringDealNull(entryHead.getTradeCo()));
			yltBusDeclarebill.setTradeName(CommonUtils.emptyStringDealNull(entryHead.getTradeName()));
			yltBusDeclarebill.setDistrictCode(CommonUtils.emptyStringDealNull(entryHead.getDistrictCode()));
			yltBusDeclarebill.setOwnerCode(CommonUtils.emptyStringDealNull(entryHead.getOwnerCode()));
			yltBusDeclarebill.setOwnerName(CommonUtils.emptyStringDealNull(entryHead.getOwnerName()));
			yltBusDeclarebill.setAgentType(CommonUtils.emptyStringDealNull(entryHead.getAgentType()));
			yltBusDeclarebill.setAgentCode(CommonUtils.emptyStringDealNull(entryHead.getAgentCode()));
			yltBusDeclarebill.setAgentName(CommonUtils.emptyStringDealNull(entryHead.getAgentName()));
			yltBusDeclarebill.setContrNo(CommonUtils.emptyStringDealNull(entryHead.getContrNo()));
			yltBusDeclarebill.setBillno(CommonUtils.emptyStringDealNull(entryHead.getBillNo()));
			//分运单号
			yltBusDeclarebill.setSubbillno(CommonUtils.emptyStringDealNull(entryHead.getAssBillNo()));
			yltBusDeclarebill.setTradeCountry(CommonUtils.emptyStringDealNull(entryHead.getTradeCountry()));
			yltBusDeclarebill.setTradeMode(CommonUtils.emptyStringDealNull(entryHead.getTradeMode()));
			yltBusDeclarebill.setCutMode(CommonUtils.emptyStringDealNull(entryHead.getCutMode()));
			yltBusDeclarebill.setTransMode(CommonUtils.emptyStringDealNull(entryHead.getTransMode()));
			yltBusDeclarebill.setFeeMark(CommonUtils.emptyStringDealNull(entryHead.getFeeMark()));
			yltBusDeclarebill.setFeeCurr(CommonUtils.emptyStringDealNull(entryHead.getFeeCurr()));
			yltBusDeclarebill.setFeeRate(CommonUtils.stringToBigDecimal(entryHead.getFeeRate()));
			yltBusDeclarebill.setInsurMark(CommonUtils.emptyStringDealNull(entryHead.getInsurMark()));
			yltBusDeclarebill.setInsurCurr(CommonUtils.emptyStringDealNull(entryHead.getInsurCurr()));
			yltBusDeclarebill.setInsurRate(CommonUtils.stringToBigDecimal(entryHead.getInsurRate()));
			yltBusDeclarebill.setOtherMark(CommonUtils.emptyStringDealNull(entryHead.getOtherMark()));
			yltBusDeclarebill.setOtherCurr(CommonUtils.emptyStringDealNull(entryHead.getOtherCurr()));
			yltBusDeclarebill.setOtherRate(CommonUtils.stringToBigDecimal(entryHead.getOtherRate()));
			yltBusDeclarebill.setPackNo(CommonUtils.stringToInteger(entryHead.getPackNo()));
			yltBusDeclarebill.setGrossWt(CommonUtils.stringToBigDecimal(entryHead.getGrossWt()));
			yltBusDeclarebill.setNetWt(CommonUtils.stringToBigDecimal(entryHead.getNetWt()));
			yltBusDeclarebill.setWrapType(CommonUtils.emptyStringDealNull(entryHead.getWrapType()));
			yltBusDeclarebill.setNoteS(CommonUtils.emptyStringDealNull(entryHead.getNoteS()));
			yltBusDeclarebill.setDeclPort(CommonUtils.emptyStringDealNull(entryHead.getDeclPort()));
			yltBusDeclarebill.setCoOwner(CommonUtils.emptyStringDealNull(entryHead.getCoOwner()));
			//监管 手续 费率              MnlJgfFlag   长度是 1 
			yltBusDeclarebill.setMnljgfflag(CommonUtils.emptyStringDealNull(entryHead.getMnlJgfFlag()));
			//监管手续费率    exp:ServiceRate  长度 20   
			yltBusDeclarebill.setServicerate(CommonUtils.emptyStringDealNull(entryHead.getServiceRate()));
			//监管手续费 exp:ServiceRate     长度 20 
			yltBusDeclarebill.setServicefee(CommonUtils.emptyStringDealNull(entryHead.getServiceFee()));
			//
			yltBusDeclarebill.setRelativeId(CommonUtils.emptyStringDealNull(entryHead.getRelativeId()));
			//制单人    20   TypistNo  
			yltBusDeclarebill.setTypistno(CommonUtils.emptyStringDealNull(entryHead.getTypistNo()));
			yltBusDeclarebill.setInputNo(CommonUtils.emptyStringDealNull(entryHead.getInputNo()));
			yltBusDeclarebill.setInputCompanyCo(CommonUtils.emptyStringDealNull(entryHead.getInputCompanyCo()));
			yltBusDeclarebill.setInputCompanyName(CommonUtils.emptyStringDealNull(entryHead.getInputCompanyName()));
			//报关单打印日期    exp:PDate     17 位  
			yltBusDeclarebill.setPdate(CommonUtils.emptyStringDealNull(entryHead.getPDate()));
//			entryHead.getPDate();
			yltBusDeclarebill.setDeclareNo(CommonUtils.emptyStringDealNull(entryHead.getDeclareNo()));
			yltBusDeclarebill.setCustomsField(CommonUtils.emptyStringDealNull(entryHead.getCustomsField()));
			
			//报关单涉案 标志   exp:SpecialFlag  长度 1 
			yltBusDeclarebill.setSpecialflag(CommonUtils.emptyStringDealNull(entryHead.getSpecialFlag()));
			yltBusDeclarebill.setKjNo(CommonUtils.emptyStringDealNull(entryHead.getKjId()));
			yltBusDeclarebill.setSendName(CommonUtils.emptyStringDealNull(entryHead.getSendName()));
			yltBusDeclarebill.setReceiveName(CommonUtils.emptyStringDealNull(entryHead.getReceiveName()));
			yltBusDeclarebill.setSendCountry(CommonUtils.emptyStringDealNull(entryHead.getSendCountry()));
			yltBusDeclarebill.setSendCity(CommonUtils.emptyStringDealNull(entryHead.getSendCity()));
			yltBusDeclarebill.setSendId(CommonUtils.emptyStringDealNull(entryHead.getSendId()));
			yltBusDeclarebill.setTotalValue(CommonUtils.stringToBigDecimal(entryHead.getTotalValue()));
			yltBusDeclarebill.setCurrCode(CommonUtils.emptyStringDealNull(entryHead.getCurrCode()));
			
			//审结  日期  exp:ReceiveDate  (YYYYMMDDHHMMSS)  
			yltBusDeclarebill.setReceivedate(CommonUtils.formatStringtToDateyMdHms(entryHead.getReceiveDate()));
			//审结人    exp:ChannelEr 8  
			yltBusDeclarebill.setChanneler(CommonUtils.emptyStringDealNull(entryHead.getChannelEr()));
			yltBusDeclarebill.setMaingname(CommonUtils.emptyStringDealNull(entryHead.getMainGName()));
			yltBusDeclarebill.setEntryType(CommonUtils.emptyStringDealNull(entryHead.getEntryType()));
			yltBusDeclarebill.setSendIdType(CommonUtils.emptyStringDealNull(entryHead.getSendIdType()));
			yltBusDeclarebill.setTradeScc(CommonUtils.emptyStringDealNull(entryHead.getTradeScc()));
			yltBusDeclarebill.setOwnerScc(CommonUtils.emptyStringDealNull(entryHead.getOwnerScc()));
			yltBusDeclarebill.setAgentScc(CommonUtils.emptyStringDealNull(entryHead.getAgentScc()));
			yltBusDeclarebill.setSendAddress(CommonUtils.emptyStringDealNull(entryHead.getSendAddress()));
			yltBusDeclarebill.setSendTelNo(CommonUtils.emptyStringDealNull(entryHead.getSendTelNo()));
			yltBusDeclarebill.setReceiveAddress(CommonUtils.emptyStringDealNull(entryHead.getReceiveAddress()));
			yltBusDeclarebill.setReceiveTelNo(CommonUtils.emptyStringDealNull(entryHead.getReceiveTelNo()));
			yltBusDeclarebill.setReceiveCountry(CommonUtils.emptyStringDealNull(entryHead.getReceiveCountry()));
			yltBusDeclarebill.setReceiveCity(CommonUtils.emptyStringDealNull(entryHead.getReceiveCity()));
			yltBusDeclarebill.setStopCityEn(CommonUtils.emptyStringDealNull(entryHead.getStopCityEn()));
			yltBusDeclarebill.setSendNameEn(CommonUtils.emptyStringDealNull(entryHead.getSendNameEn()));
			yltBusDeclarebill.setSendAddressEn(CommonUtils.emptyStringDealNull(entryHead.getSendAddressEn()));
			yltBusDeclarebill.setSendCityEn(CommonUtils.emptyStringDealNull(entryHead.getSendCityEn()));
			yltBusDeclarebill.setReceiveNameEn(CommonUtils.emptyStringDealNull(entryHead.getReceiveNameEn()));
			yltBusDeclarebill.setReceiveAddressEn(entryHead.getReceiveAddressEn());
			yltBusDeclarebill.setWoodWrap(CommonUtils.emptyStringDealNull(entryHead.getWoodWrap()));
			yltBusDeclarebill.setMainGnameEn(CommonUtils.emptyStringDealNull(entryHead.getMainGNameEn()));
			yltBusDeclarebill.setGoodsUsed(CommonUtils.emptyStringDealNull(entryHead.getGoodsUsed()));
			yltBusDeclarebill.setLowTempTrans(CommonUtils.emptyStringDealNull(entryHead.getLowTempTrans()));
			return yltBusDeclarebill;
		}
		
		return null;
	}

	/**
	 * 
	 * @param entryList
	 * @return
	 */
	public static List<YltBusDeclaregoods> exp304EntryList2YltBusDeclaregoodList(List<com.tradeo.exp.common.message.EXP304.EXP304.EntryList> entryList) {
		
		List<YltBusDeclaregoods> yltBusDeclaregoodList = Lists.newArrayList();
		
		if(!CommonUtils.isEmptyCollection(entryList)){
			
			for (com.tradeo.exp.common.message.EXP304.EXP304.EntryList entry : entryList) {
				YltBusDeclaregoods yltBusDeclaregoods = new YltBusDeclaregoods();
				yltBusDeclaregoods.setgNo(CommonUtils.stringToInteger(entry.getGNo()));
				yltBusDeclaregoods.setCodeTs(CommonUtils.emptyStringDealNull(entry.getCodeTS()));
				yltBusDeclaregoods.setgName(CommonUtils.emptyStringDealNull(entry.getGName()));
				yltBusDeclaregoods.setgModel(CommonUtils.emptyStringDealNull(entry.getGModel()));
				yltBusDeclaregoods.setOriginCountry(CommonUtils.emptyStringDealNull(entry.getOriginCountry()));
				yltBusDeclaregoods.setTradecurr(CommonUtils.emptyStringDealNull(entry.getTradeCurr()));
				yltBusDeclaregoods.setDecprice(CommonUtils.stringToBigDecimal(entry.getDeclPrice()));
				yltBusDeclaregoods.setDeclTotal(CommonUtils.stringToBigDecimal(entry.getDeclTotal()));
				yltBusDeclaregoods.setUseTo(CommonUtils.emptyStringDealNull(entry.getUseTo()));
				yltBusDeclaregoods.setDutyMode(CommonUtils.emptyStringDealNull(entry.getDutyMode()));
				yltBusDeclaregoods.setgQty(CommonUtils.stringToBigDecimal(entry.getGQty()));
				yltBusDeclaregoods.setgUnit(CommonUtils.emptyStringDealNull(entry.getGUnit()));
				yltBusDeclaregoods.setQty1(CommonUtils.stringToBigDecimal(entry.getQty1()));
				yltBusDeclaregoods.setQty2(CommonUtils.stringToBigDecimal(entry.getQty2()));
				yltBusDeclaregoods.setUnit1(CommonUtils.emptyStringDealNull(entry.getUnit1()));
				yltBusDeclaregoods.setUnit2(CommonUtils.emptyStringDealNull(entry.getUnit2()));
				yltBusDeclaregoods.setTradeTotal(CommonUtils.stringToBigDecimal(entry.getTradeTotal()));
				//归类标志    exp:ClassMark   长度  1  自动归类  0  人工归类  1
				yltBusDeclaregoods.setClassmark(CommonUtils.emptyStringDealNull(entry.getClassMark()));
				yltBusDeclaregoods.setGcrosswt(CommonUtils.stringToBigDecimal(entry.getGGrossWt()));
				yltBusDeclaregoods.setmName(CommonUtils.emptyStringDealNull(entry.getMName()));
				yltBusDeclaregoods.setOriginCity(CommonUtils.emptyStringDealNull(entry.getOriginCity()));
				yltBusDeclaregoods.setgNameEn(CommonUtils.emptyStringDealNull(entry.getGNameEn()));
				yltBusDeclaregoods.setBackup1(CommonUtils.emptyStringDealNull(entry.getBackup1()));
				yltBusDeclaregoods.setBackup2(CommonUtils.emptyStringDealNull(entry.getBackup2()));
				yltBusDeclaregoods.setBackup3(CommonUtils.emptyStringDealNull(entry.getBackup3()));
				yltBusDeclaregoods.setBackup4(CommonUtils.emptyStringDealNull(entry.getBackup4())); 
				yltBusDeclaregoods.setBackup5(CommonUtils.emptyStringDealNull(entry.getBackup5()));
				
				yltBusDeclaregoodList.add(yltBusDeclaregoods);
			}
			
		}
		
		
		return yltBusDeclaregoodList;
	}

	/**
	 * 
	 * @param entryDocuLIst
	 * @return
	 */
	public static List<YltBusVoucher> exp304EntryDocuList2YltBusDeclaredocList(List<com.tradeo.exp.common.message.EXP304.EXP304.EntryDocu> entryDocuLIst) {
		
		List<YltBusVoucher> yltBusDeclaredocList = Lists.newArrayList();
		if(!CommonUtils.isEmptyCollection(entryDocuLIst)){
			for (com.tradeo.exp.common.message.EXP304.EXP304.EntryDocu entryDocu : entryDocuLIst) {
				YltBusVoucher yltBusVoucher = new YltBusVoucher();
				yltBusVoucher.setOrderNo(CommonUtils.stringToInteger(entryDocu.getOrderNo()));
				yltBusVoucher.setVoutype(CommonUtils.emptyStringDealNull(entryDocu.getDocuCode()));
				yltBusVoucher.setVouno(CommonUtils.emptyStringDealNull(entryDocu.getCertCode()));
				
				yltBusDeclaredocList.add(yltBusVoucher);
			}
		}
		
		return yltBusDeclaredocList;
	}

	/**
	 * 报关委托协议申报报文  数据库实体 转化为 报文实体
	 * @param yltBusAgreement
	 * @return
	 */
	public static EXP307 yltBusAgreement2Exp307(YltBusAgreement yltBusAgreement) {
		EXP307 exp307 = new EXP307();
		exp307.setAgentCode(yltBusAgreement.getAgentcod());
		exp307.setTradeCode(yltBusAgreement.getTradecode());
		exp307.setBeginDate(yltBusAgreement.getBegindate());
		exp307.setEndDate(yltBusAgreement.getEnddate());
		exp307.setCustomsCode(yltBusAgreement.getCustomscode());
		exp307.setInputNo(yltBusAgreement.getInputno());	
		exp307.setAgentScc(yltBusAgreement.getAgentscc());
		exp307.setTradeScc(yltBusAgreement.getTradescc());
		return exp307;
	}

	/**
	 * 汇总纳税清单数据， 报文对象转换为数据库实体对象
	 * @param dutyFormHead
	 * @return
	 */
	public static YltBusDuty exp306DutyForm2YltBusDuty(DutyFormHead dutyFormHead) {
		YltBusDuty yltBusDuty = new YltBusDuty();
		
		yltBusDuty.setOptype(CommonUtils.stringToInteger(dutyFormHead.getOpType()));
		yltBusDuty.setTaxentryid(dutyFormHead.getTaxEntryId());
		yltBusDuty.setDutyformflag(dutyFormHead.getDutyFormFlag());
		yltBusDuty.setIeport(dutyFormHead.getIEPort());
		yltBusDuty.setDeclport(dutyFormHead.getDeclPort());
		yltBusDuty.setPayercode(dutyFormHead.getPayerCode());
		yltBusDuty.setPayername(dutyFormHead.getPayerName());
		yltBusDuty.setOwnercode(dutyFormHead.getOwnerCode());
		yltBusDuty.setOwnername(dutyFormHead.getOwnerName());
		yltBusDuty.setTradecode(dutyFormHead.getTradeCode());
		yltBusDuty.setTradename(dutyFormHead.getTradeName());
		yltBusDuty.setAgentcode(dutyFormHead.getAgentCode());
		yltBusDuty.setAgentname(dutyFormHead.getAgentName());
		yltBusDuty.setDdate(dutyFormHead.getDDate());
		yltBusDuty.setPayerscc(dutyFormHead.getPayerScc());
		
		return yltBusDuty;
	}

	public static List<YltBusDutyHead> exp306DutyFormHeadList2YltBusDutyHeadList(List<DutyFormList> dutyFormLHeadist) {
		
		if(!CommonUtils.isEmptyCollection(dutyFormLHeadist)){
			
			List<YltBusDutyHead> yltBusDutyHeadList =  Lists.newArrayList();
			for (DutyFormList dutyFormHead : dutyFormLHeadist) {
				YltBusDutyHead yltBusDutyHead = new YltBusDutyHead();
				yltBusDutyHead.setTaxid(dutyFormHead.getTaxID());
				yltBusDutyHead.setDelaymark(dutyFormHead.getDelayMark());
				yltBusDutyHead.setDutyflag(dutyFormHead.getDutyFlag());
				yltBusDutyHead.setDutyflagnote(dutyFormHead.getDutyFlagNote());
				yltBusDutyHead.setTaxtype(dutyFormHead.getTaxType());
				yltBusDutyHead.setRealtax(dutyFormHead.getRealTax());
				yltBusDutyHead.setPlimit(dutyFormHead.getPLimit());
				yltBusDutyHead.setGendate(dutyFormHead.getGenDate());
				
				yltBusDutyHeadList.add(yltBusDutyHead);
			}
			
			return yltBusDutyHeadList;
		}
		
		return null;
	}

	/**
	 * 汇总纳税清单同步报文 -- 表体 转化为 数据表 实体
	 * @param dutyEntryList
	 * @return
	 */
	public static List<YltBusDutyEntry> exp306DutyEntryList2yltBusDutyEntryList(List<EntryList> dutyEntryList) {
		if(!CommonUtils.isEmptyCollection(dutyEntryList)){
			List<YltBusDutyEntry> yltBusDutyEntryList = Lists.newArrayList();
			for (EntryList entry : dutyEntryList) {
				YltBusDutyEntry yltBusDutyEntry = new YltBusDutyEntry();
				yltBusDutyEntry.setEntryid(entry.getEntryId());
				yltBusDutyEntry.setGno(entry.getGNo());
				yltBusDutyEntry.setCodets(entry.getCodeTS());
				yltBusDutyEntry.setGname(entry.getGName());
				yltBusDutyEntry.setRealduty(entry.getRealDuty());
				yltBusDutyEntry.setRealtax(entry.getRealTax());
				yltBusDutyEntry.setRealreg(entry.getRealReg());
				yltBusDutyEntry.setRealanti(entry.getRealAnti());
				yltBusDutyEntry.setRealrsv1(entry.getRealRsv1());
				yltBusDutyEntry.setRealrsv2(entry.getRealRsv2());
				yltBusDutyEntry.setRealncad(entry.getRealNcad());
				
				yltBusDutyEntryList.add(yltBusDutyEntry);
				return yltBusDutyEntryList;
			}
		}
		return null;
	}

	/**
	 * 税单 报文实体转换为 数据库实体
	 * @param entryDuty
	 * @return
	 */
	public static YltBusTax exp310EntryDuty2YltBusTax(com.tradeo.exp.common.message.EXP310.EXP310.EntryDuty entryDuty) {
		
		if(!CommonUtils.isEmptyObj(entryDuty)){
			YltBusTax yltBusTax = new YltBusTax();
			yltBusTax.setBillno(entryDuty.getBillNo());
			yltBusTax.setSubbillno(entryDuty.getAssBillNo());
			yltBusTax.setIeflag(entryDuty.getIEFlag());
			yltBusTax.setEntryid(entryDuty.getEntryId());
			yltBusTax.setOptime(entryDuty.getOpTime());
			yltBusTax.setRealduty(entryDuty.getRealDuty());
			yltBusTax.setRealtax(entryDuty.getRealTax());
			yltBusTax.setRealreg(entryDuty.getRealReg());
			yltBusTax.setRealanti(entryDuty.getRealAnti());
			yltBusTax.setRealrsv1(entryDuty.getRealRsv1());
			yltBusTax.setRealrsv2(entryDuty.getRealRsv2());
			yltBusTax.setRealncad(entryDuty.getRealNcad());
			
			return yltBusTax;
		}
		
		return null;
	}
	
	
	

}
