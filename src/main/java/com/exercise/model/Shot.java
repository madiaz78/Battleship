package com.exercise.model;

public enum Shot {

    HIT(1, "red"), 
    MISS(0, "white");
    
    private int code;
    private String color;
    
    private Shot(int code, String color) {
	this.code = code;
	this.color = color;
    }  
    
    public int getCode() {
        return code;
    }

    public String getColor() {
        return color;
    }  
    
}
