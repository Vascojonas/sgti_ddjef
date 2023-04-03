package com.ddjef.enums;

public enum TypeBuse {
    
    N(1,"Normal"),
    C1(2,"1 Classe"),
    C2(3,"2 Classe"),
	C3(4,"3 Classe");


    private int key;
	private String value;
    private TypeBuse(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public int getKey() {
        return key;
    }
   
    public String getValue() {
        return value;
    }
    
}
