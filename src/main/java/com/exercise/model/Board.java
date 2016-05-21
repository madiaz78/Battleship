package com.exercise.model;

import java.util.ArrayList;
import java.util.List;

import com.exercise.form.ShipForm;
import com.exercise.form.ShotForm;

/**
 * Board for a player
 * 
 * @author Miguel
 *
 */
public class Board {

    private String playerName;

    private int[][] shipsBoard = new int[10][10];

    private int[][] shotsBoard = new int[10][10];
    
    private List<Ship> ships = new ArrayList<Ship>();
    
    private int shipCount = 15; 
    
    public void initialize(String playerName) {
	this.playerName = playerName;
    }

    /**
     * This method is used to add a ship at the begin of the play
     * 
     * @param ship
     * @return
     */
    public boolean addShipToBoard(ShipForm shipForm) {
	Ship ship = new Ship(shipForm.getShipType(), shipForm.getX(),
		shipForm.getY(), shipForm.getDirection());
	ships.add(ship);
	for (int i = 0; i < ship.getShipType().getSize(); i++) {
	    if (ship.getDirection() == Direction.DIRECTION_RIGHT) {
		shipsBoard[ship.getX() + i][ship.getY()] = ship.getShipType()
			.getShipCode();
	    }
	}
	return true;
    }

    /**
     * Used to add a shot done by this player on the other board
     * 
     * @param shot
     * @param x
     * @param y
     * @return
     */
    public boolean addOwnShot(ShotForm form) {
	this.shotsBoard[form.getX()][form.getY()] = form.getShot().getCode();
	return true;
    }
    
    /**
     * Used to verify if a foreing shot was hit or not.
     * 
     * @param form
     * @return
     */
    public ShotResponse addForeignShot(ShotForm form){
	 ShotResponse response = new ShotResponse();
	if (this.thereIsAShip(form.getX(), form.getY())){
	    this.shipsBoard[form.getX()][form.getY()] = Shot.HIT.getCode();
	    this.shipCount = shipCount - 1;
	   
	    response.setShipCount(this.shipCount);
	    Ship ship = this.getShip(form.getX(), form.getY());
	    response.setShipMessage(ship.getShipType().getMessage());
	    response.setShotResult(Shot.HIT);
	} else {
	    response.setShipCount(this.shipCount);
	    response.setShotResult(Shot.MISS);
	}
	return response;
    }

    public int getShipCount() {
        return shipCount;
    }

    public void setShipCount(int shipCount) {
        this.shipCount = shipCount;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Return true if there is a ship on this position
     * 
     * @param x
     * @param y
     * @return
     */
    private boolean thereIsAShip(int x, int y) {
	if (this.shipsBoard[x][y] != 0) {
	    return true;
	}
	return false;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return
     */
    private Ship getShip(int x, int y){
	
	//Not implemente. Return a ship that is on this position from the list
	Ship ship = new Ship();
	return ship;
    }
    
}
