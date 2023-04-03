package com.ddjef.enums;

public enum Status {

	A('1',"active"),
	I('0',"inative");
	
	
	
	private char key;
	private String value;
	
	 Status(char key, String value) {
		this.key=key;
		this.value=value;
	}

	public char getKey() {
		return key;
	}


	public String getValue() {
		return value;
	}

	
	 
}
