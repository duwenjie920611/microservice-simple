package com.tradeo.exp.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.org.apache.bcel.internal.classfile.Field;
import com.tradeo.exp.common.eum.Constant;

/**
 * 报文 文件 读写 类 工具
 * @author duwenjie
 *
 */
public class FileUtils {
	
	private static Logger logger = LoggerFactory.getLogger(FileUtils.class);
	
	public static String  FILE_SEPARATOR = System.getProperty( "file.separator" );
	
	public static File[] getFilePathList(String filePath,final int index,final int total){
		
		
		File file = new File(filePath);
		if(!file.isDirectory()){
			return null;
		}
		
		File [] fileList = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				String name = pathname.getName();
				if(name.contains("ERROR")){
					return false;
				}
				int result = name.hashCode() % total;
				return result == index;
			}
		});
		
		return fileList;
	}
	
	/**
	 * 读取 文件生成字符串
	 * @param file
	 * @return
	 */
	public static String read2String(File file){
		ByteArrayOutputStream baos = null;
		FileInputStream fis = null;
		String result = null;
		try {
			fis = new FileInputStream(file);
			baos = new ByteArrayOutputStream();

			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = fis.read(bys)) != -1) {
				baos.write(bys, 0, len);
			}
			result = baos.toString();

			baos.close();
			fis.close();
			bys = null;
		} catch (Exception e) {
			logger.info("文件读取出现异常【"+ e.getMessage() +"】", e);
		}finally {
			if(!CommonUtils.isEmptyObj(fis)){
				try {
					fis.close();
				} catch (IOException e) {
					logger.info("文件流关闭出现异常【"+ e.getMessage() +"】", e);
				}
			}
			if(!CommonUtils.isEmptyObj(baos)){
				try {
					baos.close();
				} catch (IOException e) {
					logger.info("文件流关闭出现异常【"+ e.getMessage() +"】", e);
				}
			}
		}
	
		return result;
	}
	
	/**
	 * 读取文件 生成二进制流
	 * @param file
	 * @return
	 */
	public static byte[] read2Byte(File file) {
		ByteArrayOutputStream baos = null;
		FileInputStream fis = null;
		byte[] result = null;
		try {
			fis = new FileInputStream(file);
			baos = new ByteArrayOutputStream();

			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = fis.read(bys)) != -1) {
				baos.write(bys, 0, len);
			}
			result = baos.toByteArray();

			baos.close();
			fis.close();
			bys = null;
		} catch (Exception e) {
			logger.info("文件读取出现异常【" + e.getMessage() + "】", e);
		} finally {
			if (!CommonUtils.isEmptyObj(fis)) {
				try {
					fis.close();
				} catch (IOException e) {
					logger.info("文件流关闭出现异常【" + e.getMessage() + "】", e);
				}
			}
			if (!CommonUtils.isEmptyObj(baos)) {
				try {
					baos.close();
				} catch (IOException e) {
					logger.info("文件流关闭出现异常【" + e.getMessage() + "】", e);
				}
			}
		}

		return result;
	}
	
	/**
	 * 写 文件操作
	 * @param filePath 
	 * @param input
	 * @param busiType
	 */
	public static String write2File(String filePath,String input, String busiType){
		String fileName = "S_" +CommonUtils.formatDateToStringyMdHmsS(new Date()) + "_" + busiType + "." +  "xml";
		String fileAbsPath = filePath + FILE_SEPARATOR + fileName;
		FileOutputStream fis = null;
		try {
			File file = new File(fileAbsPath);
			if (!file.exists()) {
				file.createNewFile();
			}
			fis = new FileOutputStream(file);
			fis.write(input.getBytes(Constant.ENCODE));
			fis.flush();
			fis.close();
		} catch (Exception e) {
			logger.info("文件读取出现异常【" + e.getMessage() + "】", e);
		}finally{
			if(!CommonUtils.isEmptyObj(fis)){
				try {
					fis.close();
				} catch (IOException e) {
					logger.info("文件流关闭出现异常【" + e.getMessage() + "】", e);
				}
			}
		}
		
		return fileAbsPath;
	}
	
	public static boolean rename(File oldFile){
		String osSeparator = FILE_SEPARATOR;
		String oldFileAbsPath = oldFile.getAbsolutePath();
		logger.info(CommonUtils.getOutputLine("文件移动，原始文件路径【"+ oldFileAbsPath +"】"));
		int lastOsSeparatorIndex = oldFileAbsPath.lastIndexOf(osSeparator);

		String prefix = oldFileAbsPath.substring(0, lastOsSeparatorIndex);
		String suffix = oldFileAbsPath.substring(lastOsSeparatorIndex+osSeparator.length(), oldFileAbsPath.length());
		String newFilePath = prefix + "old";
		//创建 新目录文件
		File newFileDirectory = new File(newFilePath);
		if(!newFileDirectory.exists()){
			newFileDirectory.mkdir();
			logger.info("文件移动，历史文件夹不存在，创建文件夹【"+ newFilePath +"】");
		}
		
		Date current = new Date();
		String ymdFile = CommonUtils.formatDateToStringYMD(current);
		newFilePath += (osSeparator+ ymdFile);
		newFileDirectory = new File(newFilePath);
		if(!newFileDirectory.exists()){
			newFileDirectory.mkdir();
			logger.info("文件移动，历史文件夹不存在，创建文件夹【"+ newFilePath +"】");
		}
		
		
		String newFileAbsPath = newFilePath +osSeparator + "R_" + CommonUtils.formatDateToStringyMdHmsS(current) + "_" + suffix;
		logger.info("文件移动，历史文件完整路径【"+ newFileAbsPath+"】");
		
		File newFile = new File(newFileAbsPath);
		if(CommonUtils.isEmptyObj(oldFile)){
			oldFile = new File(oldFileAbsPath);
			logger.info("文件移动，oldFile is null. 重新打开 ");
		}
		
		try {
			org.apache.commons.io.FileUtils.moveFile(oldFile, newFile);
			logger.info("历史文件移动，执行结果【"+ true +"】");
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("历史文件移动，出现异常，详情信息【" + e.getMessage() +"】", e);
			return false;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
//		File [] files = getFilePathList("E:\\单一窗口\\tto\\5.海关快件通关系统(新)数据交换报文接口v1.0\\导入示例报文", 0, 2);
//		for (File file : files) {
//			System.out.println(file.getAbsolutePath());
////			System.out.println(read2String(file));
//		}
//		
//		//write2File("E:\\单一窗口\\tto\\5.海关快件通关系统(新)数据交换报文接口v1.0\\导入示例报文", "1爱山科大健康会搭建爱神的箭卡号", Constant.BUSI_TYPE_MFT);
//		
//		
//		String osType = System.getProperties().getProperty( "os.name" );
//		System.out.println(osType);
//		
//		System.out.println(System.getProperty( "file.separator" ).equals("\\"));
		
//		rename(null,"E:\\单一窗口\\tto\\5.海关快件通关系统(新)数据交换报文接口v1.0\\导入示例报文\\20190306222936001.MFT");
		
		
//		File file = new File("E:\\tto\\exp\\receipt\\exp308-04 - 副本.xml");
		
//		rename(file);
		
		
		write2File("E:\\tto\\exp\\receipt\\", "爱啥啥快件的哈即可和", "");
		
		String receiptFilePath ="E:\\tto\\exp\\receipt";
		
		int index = 0;
		int total = 1;
		
		File [] files = FileUtils.getFilePathList(receiptFilePath, index, total);
		
		if(!CommonUtils.isEmptyObj(files) && files.length>0 ){
			for (File file : files) {
				rename(file);
			}
		}
		
		System.out.println(System.getProperty( "file.separator" )+"-----------------");
		
	}
	

}


