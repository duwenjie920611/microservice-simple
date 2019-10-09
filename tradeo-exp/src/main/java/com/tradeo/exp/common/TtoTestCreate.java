package com.tradeo.exp.common;

import java.util.Date;
import java.util.List;

import com.google.common.collect.Lists;
import com.tradeo.exp.common.eum.Constant;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.xml.exp.send.Data;
import com.tradeo.exp.common.xml.exp.send.EXP307;
import com.tradeo.exp.common.xml.exp.send.EnvelopInfo;
import com.tradeo.exp.common.xml.exp.send.ExpBaseEntity;
import com.tradeo.exp.common.xml.exp.send.exp301.Entry;
import com.tradeo.exp.common.xml.exp.send.exp301.EntryDocu;
import com.tradeo.exp.common.xml.exp.send.exp301.EntryHead;
import com.tradeo.exp.common.xml.exp.send.exp301.Exp301;

public class TtoTestCreate {
	

	public static ExpBaseEntity<Data> createExp301TestEntity(){

		ExpBaseEntity<Data>  baseEntity= new ExpBaseEntity<>();
		Date date = new Date();
		EnvelopInfo envelopInfo = new EnvelopInfo();
		envelopInfo.setVersion("1.0");
		envelopInfo.setSenderId("123456789123456789");
		envelopInfo.setReceiverId(Constant.EXPORT_CODE);
		envelopInfo.setMessageType(Constant.MESSAGE_TYPE_EXP301);
		//sendid + receiveId + yyyymmddhhmmss + 11(序列号)
		envelopInfo.setMessageId(envelopInfo.getSenderId() + envelopInfo.getReceiverId() + CommonUtils.formatDateToStringyMdHmsS(date)+ "12345678912");
		// message_id + ".EXP"
		envelopInfo.setFileName(envelopInfo.getMessageId() + ".EXP");
		envelopInfo.setSendTime(date);
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
		
		return baseEntity;
	}
	
	public static ExpBaseEntity<Data> createExp307TestEntity(){
		
		ExpBaseEntity<Data> baseEntity = new ExpBaseEntity<>();
		Date date = new Date();
		
		EnvelopInfo envelopInfo = new EnvelopInfo();
		envelopInfo.setVersion("1.0");
		envelopInfo.setSenderId("123456789123456789");
		envelopInfo.setReceiverId(Constant.EXPORT_CODE);
		envelopInfo.setMessageType(Constant.MESSAGE_TYPE_EXP307);
		//sendid + receiveId + yyyymmddhhmmss + 11(序列号)
		envelopInfo.setMessageId(envelopInfo.getSenderId() + envelopInfo.getReceiverId() + CommonUtils.formatDateToStringyMdHmsS(date)+ "12345678912");
		// message_id + ".EXP"
		envelopInfo.setFileName(envelopInfo.getMessageId() + ".EXP");
		envelopInfo.setSendTime(date);
		baseEntity.setEnvelopInfo(envelopInfo);
		
		EXP307 exp307 = new EXP307();
		//10位长度
		exp307.setAgentCode("12345678901");
		exp307.setTradeCode("12345678901");
		exp307.setBeginDate(date);
		exp307.setEndDate(date);
		exp307.setCustomsCode("1234");
		exp307.setInputNo("12345678901234567890123456789012");
		exp307.setAgentScc("123456789012345678");
		exp307.setTradeScc("123456789012345678");
		baseEntity.setData(exp307);
		
		return baseEntity;
	}
	
	

}
