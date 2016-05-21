package com.exercise.model;

/**
 * Class that represent a shot response
 * I'll use this class from the UI side to verify the status of the game.
 * If shipCount is equal to 0 all the ships were sank 
 * 
 * @author Miguel
 *
 */
public class ShotResponse {

    private int shipCount;
    
    private Shot shotResult;
    
    private String shipMessage;

    public int getShipCount() {
        return shipCount;
    }

    public void setShipCount(int shipCount) {
        this.shipCount = shipCount;
    }

    public Shot getShotResult() {
        return shotResult;
    }

    public void setShotResult(Shot shotResult) {
        this.shotResult = shotResult;
    }

    public String getShipMessage() {
        return shipMessage;
    }

    public void setShipMessage(String shipMessage) {
        this.shipMessage = shipMessage;
    }
    
}
