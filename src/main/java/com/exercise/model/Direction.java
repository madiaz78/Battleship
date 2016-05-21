package com.exercise.model;

/**
 * Enum that represent a direction of the Ship
 * 
 * @author Miguel
 *
 */
public enum Direction {

    DIRECTION_RIGHT(0), 
    DIRECTION_DOWN(1);
    
    private int value;
    
    private Direction(int value){
	this.value = value;
    }

    public int getValue() {
        return value;
    }

}
