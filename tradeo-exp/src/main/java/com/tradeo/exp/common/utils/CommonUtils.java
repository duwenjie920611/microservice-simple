package com.tradeo.exp.common.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.tradeo.exp.common.eum.MftEmptyEnum;


public class CommonUtils {
	
	private static Logger logger = LoggerFactory.getLogger(CommonUtils.class);
	
	private CommonUtils() throws Exception{
		throw new Exception("工具类，禁止实例化");
	}
	
	/**
	 * 参数是否为null
	 * @param input
	 * @return
	 */
	public static boolean isEmpty(String input){
		return (input == null || "".equals(input) || "null".equalsIgnoreCase(input));
	}
	
	/**
	 * 判断对象是否为 null
	 * @param input
	 * @return
	 */
	public static boolean isEmptyObj(Object input){
		return (input == null);
	}
	
	/**
	 * 判断 集合是否为空
	 * @param list
	 * @return
	 */
	public static boolean isEmptyCollection(Collection<? extends Object> list){
		return (isEmptyObj(list) || list.isEmpty());
	}
	
	/**
	 * 将所有的null 转化为 空字符串
	 * @param str
	 * @return
	 */
	public static String emptyStringDeal(String str){
		return isEmpty(str) ? "" : str;
	}
	
	
	public static String xmlSpceialCharDeal(String str){
		if(isEmpty(str)){
			return "";
		}
		
		return str.replaceAll("&", "&amp;")
				.replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;")
				.replaceAll("'", "&apos;")
				.replaceAll("\"", "&quot;");
	}
	
	/**
	 * 将 空串转化为 null
	 * @param str
	 * @return
	 */
	public static String emptyStringDealNull(String str){
		return isEmpty(str) ? null : str;
	}
	
	public static String emptyObjectDeal(Object input) {
		return isEmptyObj(input) ? "" : input.toString();
	}
	
	/**
	 * 字符串转化为 bigDecimal
	 * @param input
	 * @return
	 */
	public static BigDecimal stringToBigDecimal(String input){
		try {
			return isEmpty(input) ? null : new BigDecimal(input);
		} catch (Exception e) {
			logger.info(CommonUtils.getOutputLine("字符串转换成  BigDecimal 出现异常【"+ e.getMessage() +"】"));
			return null;
		}
		
	}
	
	/**
	 * 字符串 转换成 Integer
	 * @param input
	 * @return
	 */
	public static Integer stringToInteger(String input){
		try {
			return isEmpty(input) ? null : new Integer(input);
		} catch (Exception e) {
			logger.info(CommonUtils.getOutputLine("字符串转换成 Integer 出现异常【"+ e.getMessage() +"】"));
			return null;
		}
		
	}
	
	/**
	 * 字符串转换成  Long
	 * @param input
	 * @return
	 */
	public static Long stringToLong(String input){
		try {
			return isEmpty(input) ? null : new Long(input);
		} catch (Exception e) {
			logger.info(CommonUtils.getOutputLine("字符串转换成 Long 出现异常【"+ e.getMessage() +"】"));
			return null;
		}
		
	}

	
	/**********************************date 转成  String **********************************************/
	/**
	 * 将date 对象 转成 string核心处理函数
	 * @param date		待处理的date对象
	 * @param pattern	格式
	 * @return
	 */
	private static String formatDateToStringCore(Date date,String pattern){
		String dateString = "";
		if(date == null){
			return dateString;
		}
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			dateString = sdf.format(date);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
		
		return dateString;
		
	}
	
	/**
	 * 根据模型 "yyyy-MM-dd'T'HH:mm:ss"  格式化  java.util.Date对象
	 * @param date
	 * @return
	 */
	public static String formatDateToStringYMDTHMS(Date date){
		return formatDateToStringCore(date,"yyyy-MM-dd'T'HH:mm:ss");
	}
	
	/**
	 * 根据模型 "yyyymmddHHMMSS" 格式化 java.util.Date 对象
	 * @param date
	 * @return
	 */
	public static String formatDateToStringYMDHMS(Date date){
		return formatDateToStringCore(date,"yyyyMMddHHmmss");
	}
	
	/**
	 * 根据模型 "yyyyMMddHHmmssSSS" 格式化 java.util.Date 对象
	 * @param date
	 * @return
	 */
	public static String formatDateToStringyMdHmsS(Date date){
		return formatDateToStringCore(date,"yyyyMMddHHmmssSSS");
	}
	
	/**
	 *  根据模型 "yyyyMMdd" 格式化 java.util.Date 对象
	 * @param date
	 * @return
	 */
	public static String formatDateToStringYMD(Date date){
		return formatDateToStringCore(date,"yyyyMMdd");
	}
	
	//*************************String  转成  Date  ************************************
	/**
	 * string 转 Date 核心方法
	 * @param pattern
	 * @param dateString
	 * @return
	 */
	private static Date formatStringToDateCore(String pattern,String dateString,boolean isGTM8){
		if(isEmpty(dateString)|| isEmpty(pattern)){
			return null;
		}
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			if(isGTM8){
				sdf.setTimeZone(TimeZone.getTimeZone("GMT+08"));
			}
			date =sdf.parse(dateString);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
		
		return date;
	}
	
	/**
	 * 字符串 转 date 年月日 时分秒
	 * @param dateString
	 * @return
	 */
	public static Date formatStringtToDateYMDTHMS(String dateString){
		return formatStringToDateCore("yyyy-MM-dd'T'HH:mm:ss",dateString,false);
	}
	
	/**
	 * 字符串 转 date 年月日 时分秒
	 * @param dateString
	 * @return
	 */
	public static Date formatStringtToDateyMdHmsSSS(String dateString){
		return formatStringToDateCore("yyyyMMddHHmmssSSS",dateString,false);
	}
	
	/**
	 * 字符串 转 date 年月日 时分秒
	 * @param dateString
	 * @return
	 */
	public static Date formatStringtToDateyMdHms(String dateString){
		return formatStringToDateCore("yyyyMMddHHmmss",dateString,false);
	}
	
	
	/**
	 * 字符串 转 date 年月日 时分秒
	 * @param dateString
	 * @return
	 */
	public static Date formatStringtToDateyMd(String dateString){
		return formatStringToDateCore("yyyyMMdd",dateString,false);
	}
	
	/*************************采用dom 解析 回执报文都比较小  10kb以内 正常 1 -2 kb*****************************/
	
	public static Document convertBytes2W3CDocument(byte [] bys){
		ByteArrayInputStream bais = null;
		DocumentBuilderFactory ducFactory = null;
		DocumentBuilder docBuilder = null;
		Document doc = null;
		try {
			bais = new ByteArrayInputStream(bys);
			ducFactory = DocumentBuilderFactory.newInstance();
			ducFactory.setNamespaceAware(true);
			docBuilder = ducFactory.newDocumentBuilder();
			doc = docBuilder.parse(bais);
		} catch (Exception e) {
			logger.error("xml报文进行解析出现异常...",e);
		}finally{
			if(!isEmptyObj(bais)){
				try {
					bais.close();
				} catch (IOException e) {
					logger.error("xml报文进行解析,流关闭出现异常",e);
				}
			}
		}
		return doc;
	}

	/**
	 * 获取dom模型具体节点的数据
	 * @param document
	 * @param itemName
	 * @return
	 */
	public static String getItemContext(Document document,String itemName){
		Node node = document.getElementsByTagNameNS("*", itemName).item(0);
		return isEmptyObj(node) ? null : node.getTextContent(); 
	}
	
	/*****************************************************************/
	/**
	 * 处理舱单报文节点对象
	 * @param input
	 * @param len
	 * @return
	 */
	public static String getMftSpDealString(String input,MftEmptyEnum emptyEum){
		
		int inputLen = 0;
		if(!CommonUtils.isEmpty(input)){
			inputLen = input.length();
		}
		
		if(inputLen == emptyEum.getLen()){
			return input;
		}
		
		if(inputLen == 0){
			return emptyEum.getValue();
		}
		
		return (input + emptyEum.getValue().substring(0, emptyEum.getLen()-inputLen));
	}
	
	/**
	 * 输出样式
	 * @param input
	 * @return
	 */
	public static String getOutputLine(String input){
		return "=================="+ input +"==================";
	}
	
	/****************************获取随机字符串**********************************/
	public static String createRandomString(int len){
		char randChs [] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
						   'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
						   '0','1','2','3','4','5','6','7','8','9'};
		
		if(len <=0 || len >= randChs.length){
			return "";
		}
		
		StringBuilder resultSB = new StringBuilder();
		for (int i = 0; i < len; i++) {
			resultSB.append(randChs[new Random().nextInt(randChs.length)]);
		}
		return resultSB.toString();
	}
	
	/**
	 * 获取xml报文校验信息
	 * @param message
	 * @param xsdType
	 * @return
	 */
	public static String getXmlCheckMessage(byte[] message , String xsdType){
		String result = "xml字段校验：参数不合法，xsdType【"+xsdType+"】";
		if(CommonUtils.isEmptyObj(message) || StringUtils.isEmpty(xsdType)){
			return result;
		}
		
		try {
			xsdType += ".xsd";
			MsgValidate msgValidate = new MsgValidate();
			result = msgValidate.validate(message, xsdType);
		} catch (Exception e) {
			result = "xml字段校验：参数校验时出现异常，校验失败";
			e.printStackTrace();
			
		}
		return result ;
	}
	
	public static void main(String[] args) {
		System.out.println(xmlSpceialCharDeal("&&&<<>>&&'''\""));
	}

}
