package com.tradeo.exp.common.eum;

public enum MftEmptyEnum {
	
	EMPTY_STRING_1(1," ","长度为1的空串"),
	
	EMPTY_STRING_3(3,"   ","长度为3的空串"),
	
	EMPTY_STRING_4(4,"    ","长度为4的空串"),
	
	EMPTY_STRING_6(6,"      ","长度为6的空串"),
	
	EMPTY_STRING_12(12,"            ","长度为12的空串"),
	
	EMPTY_STRING_14(14,"              ","长度为14的空串"),
	
	EMPTY_STRING_15(15,"               ","长度为15的空串"),
	
	EMPTY_STRING_18(18,"                  ","长度为18的空串"),
	
	EMPTY_STRING_19(19,"                   ","长度为19的空串"),
	
	EMPTY_STRING_32(32,"                                ","长度为32的空串"),
	
	EMPTY_STRING_50(50,"                                                  ","长度为50的空串");
	
	
	private int len;
	
	private String value;
	
	private String messg;
	
	MftEmptyEnum(int len ,String value ,String messg){
		this.len = len;
		this.value = value;
		this.messg = messg;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getMessg() {
		return messg;
	}

	public void setMessg(String messg) {
		this.messg = messg;
	}
	
	public static String getValue(int len){
		MftEmptyEnum emptyEnums[] = MftEmptyEnum.values();
		
		for (MftEmptyEnum mftEmptyEnum : emptyEnums) {
			System.out.println(mftEmptyEnum.getLen()+"--"+mftEmptyEnum.getValue().length()+"--" + mftEmptyEnum.getMessg());
			if(len == mftEmptyEnum.getLen()){
				return mftEmptyEnum.getValue();
			}
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		getValue(22);
	}
	
}
