package com.tradeo.exp.common.jaxb;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import com.tradeo.exp.common.utils.CommonUtils;


/**
 * xml 转化成  对象
 * @author duwenjie
 *
 */
public class JaxbConvertor {
	
	private static final Logger logger = LoggerFactory.getLogger(JaxbConvertor.class);
	
	private JAXBContext jc;
	
	private String packName;
	
	public void setPackName(String packName){
		logger.info("xml jaxbconvertor set packname");
		this.packName = packName;
		try {
			jc = (JAXBContext.newInstance(this.packName ));
		} catch (JAXBException e) {
			logger.error("xml jaxbcontext  实例化出现异常", e);
		}
	}
	
	public String getPackName(){
		return this.packName;
	}
	
	public Object convert2Object(byte[] message,String encoding){
		
		return this.convert2Object(jc, message, encoding);
	}
	
	/**
	 * xml 对象转换方法
	 * @param jc
	 * @param message
	 * @param encoding
	 * @param xmlFilterImpl
	 * @return
	 */
	public Object convert2Object(JAXBContext jc,byte [] message,String encoding){
		
		Unmarshaller unmarshaller = null;
		
		try {
			unmarshaller = jc.createUnmarshaller();
		} catch (Exception e) {
			logger.info("xml Unmarshaller 实例化失败",e);
			logger.error("xml Unmarshaller 实例化失败", e);
		}
		
		if(CommonUtils.isEmptyObj(unmarshaller)){
			return null;
		}
		
		ByteArrayInputStream bais = null;
		Object result = null;
		try {
			bais = new ByteArrayInputStream(message);
			
			//忽略命名空间
			SAXParserFactory sax = SAXParserFactory.newInstance();
			sax.setNamespaceAware(false);
			XMLReader reader =  sax.newSAXParser().getXMLReader();
			InputSource is  = new InputSource(bais);
			SAXSource source = new SAXSource(reader,is);
			result = unmarshaller.unmarshal(source);
		} catch (Exception e) {
			logger.info("unmarshal 转化出现异常",e);
		}finally{
			if(!CommonUtils.isEmptyObj(bais)){
				try {
					bais.close();
				} catch (IOException e) {
					logger.info("io 关闭出现异常",e);
				}
			}
		}
		return result;
	}

	public JAXBContext getJc() {
		return jc;
	}

	public void setJc(JAXBContext jc) {
		this.jc = jc;
	}

}
