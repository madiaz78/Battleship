package com.exercise.model;

/**
 * Enum that represent a type of Ship
 * 
 * @author Miguel
 *
 */
public enum ShipType {
    
    AIRCRAFTCARRIER(1, 5, "You sank my Aircraft!"),
    BATTLESHIP(1, 4, "You sank my battleship!"),
    CRUISER(1, 3, "You sank my Cruiser!"),
    DESTROYER(1, 2,"You sank my Destryer!"),	
    SUBMARINE(1, 1, "You sank my Submarine!");
    
    private int size;
    
    private int shipCode;
    
    private String message;
    
    private ShipType(int shipCode, int size, String message) {
	this.shipCode = shipCode;
    	this.size = size;
    	this.message = message;
    }

    public int getSize() {
        return size;
    }

    public int getShipCode() {
        return shipCode;
    }

    public String getMessage() {
        return message;
    }

}
