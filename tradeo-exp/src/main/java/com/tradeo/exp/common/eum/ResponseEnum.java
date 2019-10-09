package com.tradeo.exp.common.eum;

public enum ResponseEnum {
	
	
	SUCCESS("200","操作成功"),
	
	
	//*****************参数类************************
	UN_SUPPORT_BUSI_TYPE("301","不支持的业务类型"),
	
	UN_SUPPORT_QUERY_TYPE("302","不支持的查询类型"),
	
	UN_LEGAL_PARAMS("303","不合法的参数"),
	
	
	UN_SUPPORT_BUSI_RELATION("304","不支持的关联关系"),
	
	
	
	//*****************异常类**************************
	
	VALID_FAILD("400","报文校验失败"),
	
	EMPTY_SEND_MESSAGE("401","下发报文为空"),

	;
	private String code;
	
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private ResponseEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
