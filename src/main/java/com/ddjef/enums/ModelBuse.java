package com.ddjef.enums;

public enum ModelBuse {
    S(1,"Standard"),
    M(2,"Medio"),
    C(3,"Classico"),
	A(4,"Articulado");

    private int key;
	private String value;
    private ModelBuse(int key, String value) {
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
