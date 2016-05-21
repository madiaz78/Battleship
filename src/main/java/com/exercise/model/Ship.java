
package com.exercise.model;

/**
 * Class that represent a Ship
 * 
 * @author Miguel
 *
 */
public class Ship {
    
    private ShipType shipType;
    
    private int x;
    
    private int y;
    
    private Direction direction;
    
    private int damaged;

    /**
     * Public Constructor
     * 
     * @param shipType
     * @param x
     * @param y
     * @param direction
     */
    public Ship(ShipType shipType, int x, int y, Direction direction) {
	super();
	this.shipType = shipType;
	this.x = x;
	this.y = y;
	this.direction = direction;
    }
 
    public Ship() {
	super();
    }

    public ShipType getShipType() {
        return shipType;
    } 

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getDamaged() {
        return damaged;
    }

    public void setDamaged(int damaged) {
        this.damaged = damaged;
    }
  
}
