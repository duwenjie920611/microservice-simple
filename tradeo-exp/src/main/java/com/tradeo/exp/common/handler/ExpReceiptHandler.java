package com.tradeo.exp.common.handler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import com.tradeo.exp.common.eum.Constant;
import com.tradeo.exp.common.jaxb.JaxbConvertor;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.xml.exp.receipt.ExpReceipt;
import com.tradeo.exp.common.xml.exp.send.EnvelopInfo;

/**
 * 快件回执 实体转换 处理类
 * @author duwenjie
 *
 */
@Component
public class ExpReceiptHandler {
	
	private  Logger logger = LoggerFactory.getLogger(ExpReceiptHandler.class);
	
	@Autowired
	private JaxbConvertor jaxbExp302Convertor;
	
	@Autowired
	private JaxbConvertor jaxbExp304Convertor;
	
	@Autowired
	private JaxbConvertor jaxbExp306Convertor;
	
	@Autowired
	private JaxbConvertor jaxbExp308Convertor;
	
	@Autowired
	private JaxbConvertor jaxbExp310Convertor;
	
	@Autowired
	private JaxbConvertor jaxbExp312Convertor;
	
	
	/**
	 * 获取新快件回执数据
	 * @param input
	 * @return
	 */
	public ExpReceipt getExpReceipt(byte [] input){
		Document document = CommonUtils.convertBytes2W3CDocument(input);
		if(CommonUtils.isEmptyObj(document)){
			logger.info(CommonUtils.getOutputLine("document 解析出现问题，报文有误..."));
			return null;
		}
		
		String messageType = CommonUtils.getItemContext(document, "message_type");
		if(CommonUtils.isEmpty(messageType)){
			logger.info(CommonUtils.getOutputLine("报文类型为空，报文有误"));
			return null;
		}
		
		ExpReceipt result = new ExpReceipt();
		EnvelopInfo envelopInfo = new EnvelopInfo();
		result.setEnvelopInfo(envelopInfo);
		
		switch (messageType) {
		case Constant.MESSAGE_TYPE_EXP302:
			com.tradeo.exp.common.message.EXP302.Package packageExp302 = 
					(com.tradeo.exp.common.message.EXP302.Package)jaxbExp302Convertor.convert2Object(input, Constant.ENCODE);
			BeanUtils.copyProperties(packageExp302.getEnvelopInfo(), envelopInfo);
			result.setExp302(packageExp302.getDataInfo().getSignedData().getData().getEXP302());
			break;
			
		case Constant.MESSAGE_TYPE_EXP304:
			com.tradeo.exp.common.message.EXP304.Package packageExp304 = 
					(com.tradeo.exp.common.message.EXP304.Package)jaxbExp304Convertor.convert2Object(input, Constant.ENCODE);
			BeanUtils.copyProperties(packageExp304.getEnvelopInfo(), envelopInfo);
			result.setExp304(packageExp304.getDataInfo().getSignedData().getData().getEXP304());
			break;
			
		case Constant.MESSAGE_TYPE_EXP306:
			com.tradeo.exp.common.message.EXP306.Package packageExp306 = 
			(com.tradeo.exp.common.message.EXP306.Package)jaxbExp306Convertor.convert2Object(input, Constant.ENCODE);
			BeanUtils.copyProperties(packageExp306.getEnvelopInfo(), envelopInfo);
			result.setExp306(packageExp306.getDataInfo().getSignedData().getData().getEXP306());
			break;
			
		case Constant.MESSAGE_TYPE_EXP308:
			com.tradeo.exp.common.message.EXP308.Package packageExp308 = 
			(com.tradeo.exp.common.message.EXP308.Package)jaxbExp308Convertor.convert2Object(input, Constant.ENCODE);
			BeanUtils.copyProperties(packageExp308.getEnvelopInfo(), envelopInfo);
			result.setExp308(packageExp308.getDataInfo().getSignedData().getData().getEXP308());
			break;	
			
		case Constant.MESSAGE_TYPE_EXP310:
			com.tradeo.exp.common.message.EXP310.Package packageExp310 = 
			(com.tradeo.exp.common.message.EXP310.Package)jaxbExp310Convertor.convert2Object(input, Constant.ENCODE);
			BeanUtils.copyProperties(packageExp310.getEnvelopInfo(), envelopInfo);
			result.setExp310(packageExp310.getDataInfo().getSignedData().getData().getEXP310());
			break;
			
		case Constant.MESSAGE_TYPE_EXP312:
			com.tradeo.exp.common.message.EXP312.Package packageExp312 = 
			(com.tradeo.exp.common.message.EXP312.Package)jaxbExp312Convertor.convert2Object(input, Constant.ENCODE);
			BeanUtils.copyProperties(packageExp312.getEnvelopInfo(), envelopInfo);
			result.setExp312(packageExp312.getDataInfo().getSignedData().getData().getEXP312());
			break;
			

		default:
			logger.info(CommonUtils.getOutputLine("不支持的回执类型【"+ messageType +"】"));
			result = null;
			break;
		}
		
		
		
		return result ;
	}
}
