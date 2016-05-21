package com.exercise.form;

import com.exercise.model.Direction;
import com.exercise.model.ShipType;

/**
 * Form used to create a Ship
 * 
 * @author Miguel
 *
 */
public class ShipForm {

    private ShipType shipType;
    
    private int x;
    
    private int y;
    
    private Direction direction;

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

}
