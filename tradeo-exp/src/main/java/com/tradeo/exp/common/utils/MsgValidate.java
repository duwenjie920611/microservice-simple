package com.tradeo.exp.common.utils;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.SAXValidator;
import org.dom4j.util.XMLErrorHandler;

public class MsgValidate  {


    // xsd目录
    private static final String xsdDirectory = "xsd/";
   
    /**
     * 
     * @param message 报文信息
     * @param xsdPath
     *            xsd项目路径
     * @return
     * @throws Exception
     */

    public String validate(byte[] message, String xsdPath) throws Exception {
        String xsdFullPath = xsdDirectory + xsdPath;
        String schema = getSchema(xsdFullPath);
        return executeValidate(message, schema,xsdFullPath);
    }
    /**
     * 取得xsd的schema信息
     * 
     * @param path
     *            xsd项目路径
     * @return
     * @throws DocumentException
     * @throws FileNotFoundException 
     */
    private String getSchema(String xsdFullPath) throws DocumentException, FileNotFoundException {
        SAXReader reader = new SAXReader();
        InputStream  backupIS = Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFullPath);

        Document document = reader.read(backupIS);
        return document.getRootElement().getNamespaceURI();
    }

    /**
     * xsd校验业务方法
     * 
     * @param message
     *            校验文件
     * @param schema
     *            schema语言
     * @param xsdFullPath
     *            xsd项目路径
     * @param isPck
     *            是否为框架xsd校验
     * @return 成功返回 success 失败返回错误信息
     * @throws Exception
     */
    private String executeValidate(byte[] message, String schema, String xsdFullPath) throws Exception {
        XMLErrorHandler errorHandler = new XMLErrorHandler();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setValidating(true);
        factory.setNamespaceAware(true);
        SAXParser parser = factory.newSAXParser();
        SAXReader xmlReader = new SAXReader();
        Document xmlDocument = xmlReader.read(new ByteArrayInputStream(message));
        parser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaLanguage", schema);   
        parser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaSource", "file:"+getXsdpath(xsdFullPath));
        SAXValidator validator = new SAXValidator(parser.getXMLReader());
        validator.setErrorHandler(errorHandler);
        validator.validate(xmlDocument);
        if (errorHandler.getErrors().hasContent()) {
            return convertErrorMessage(errorHandler.getErrors());
        } else {
            return null;
        }
    }

    /**
     * 错误信息格式转换
     * 
     * @param errors
     *            错误信息集合
     * @return 转换后的错误信息
     */
    @SuppressWarnings("unchecked")
    private String convertErrorMessage(Element errors) {
        String message = "{";
        List<Element> errorList = errors.elements();
        String errorType;
        String errorText;
        // 报文行数
        String line;
        // 报文猎术
        String column;
        for (Element error : errorList) {
            line = error.attributeValue("line");
            column = error.attributeValue("column");
            errorText = error.getText();
            errorType = errorText.substring(0, errorText.indexOf(":"));
            if (errorType.indexOf("valid") > 0) {
                continue;
            }
            errorText = errorText.replace(errorType + ":", "");
            message += "\"" + "[行：" + line + " "+ "列："+ column + "]" + errorText + "\"" + ",";
        }
        if (message.endsWith(",")) {
            message = message.substring(0, message.length() - 1);
        }
        message += "}";
        return message;
    }
    /*****
     *  获取xsd 的绝对路径
     * @param xpath xsd相对项目路径
     * @return xsd绝对路径
     */
    private String getXsdpath(String xpath){
    	URL path= this.getClass().getClassLoader().getResource(xpath);
    	return path.getPath();
    }

    
}
