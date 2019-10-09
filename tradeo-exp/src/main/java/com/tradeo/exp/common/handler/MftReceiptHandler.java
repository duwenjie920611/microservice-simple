package com.tradeo.exp.common.handler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.xml.mft.receipt.MftHAWBResult;
import com.tradeo.exp.common.xml.mft.receipt.MftMAWBResult;
import com.tradeo.exp.common.xml.mft.receipt.MftReceipt;

/**
 * 舱单回执实体类
 * @author duwenjie
 *
 */
public class MftReceiptHandler {
	
	private static Logger logger = LoggerFactory.getLogger(MftReceiptHandler.class);
	
	public static MftReceipt getMtfReceiptEntity(String input){
		if(CommonUtils.isEmpty(input)){
			return null;
		}
		
		int inputLen = input.length();
		if(inputLen < 91 || (inputLen >= 91 && ((inputLen - 91) % 108 != 0) )) {
			logger.info(CommonUtils.getOutputLine("舱单回执报文处理,回执报文不合法，报文详情【"+ input +"】"));
			return null;
		}
		
		MftReceipt mftReceipt = new MftReceipt();
		
		//表头回执
		MftMAWBResult mftMAWBResult = new MftMAWBResult();
		mftMAWBResult.setShipId(input.substring(0, 15).trim());
		mftMAWBResult.setVoyageNo(input.substring(15, 47).trim());
		mftMAWBResult.setEntryDate(CommonUtils.formatStringtToDateyMdHms(input.substring(47,59).trim()));
		mftMAWBResult.setRtnFalg(input.substring(59, 61).trim());
		mftMAWBResult.setNotes(input.substring(61,91).trim());
		mftReceipt.setMftMAWBResult(mftMAWBResult);
		
		if(inputLen > 91){
			List<MftHAWBResult> mftHAWBResultList = Lists.newArrayList(); 
			for (int i =0 ; (91 + (108*i)) < inputLen ; i++) {
				MftHAWBResult mftHAWBResult = new MftHAWBResult();
				int begin = 91+(i*108);
				mftHAWBResult.setVoyageNo(input.substring(begin, begin + 32).trim());
				mftHAWBResult.setBillNo(input.substring(begin+32,begin+64).trim());
				mftHAWBResult.setEntryDate(CommonUtils.formatStringtToDateyMdHms(input.substring(begin+64, begin+76).trim()));
				mftHAWBResult.setRtnFalg(input.substring(begin+76, begin+78).trim());
				mftHAWBResult.setNotes(input.substring(begin+78, begin+108).trim());
				mftHAWBResultList.add(mftHAWBResult);
			}
			mftReceipt.setMftHAWBResultList(mftHAWBResultList);
		}
		
		return mftReceipt;
	}
	
	public static void main(String[] args) {
		String str = " ";
		
		for (int i = 1; i < 91; i++) {
			str += " ";
		}
		System.out.println(str.length());
		
		System.out.println(JSONObject.toJSONString(getMtfReceiptEntity(str)));
		
		for (int i = 0; i < 108; i++) {
			str += " ";
		}
		
		System.out.println(str.length());
		
		System.out.println(JSONObject.toJSONString(getMtfReceiptEntity(str)));
		
		for (int i = 0; i < 108; i++) {
			str += " ";
		}
		
		System.out.println(str.length());
		
		System.out.println(JSONObject.toJSONString(getMtfReceiptEntity(str)));
	}

}
