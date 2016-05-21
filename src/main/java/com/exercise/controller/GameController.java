package com.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.exercise.exception.GameException;
import com.exercise.form.ShipForm;
import com.exercise.form.ShotForm;
import com.exercise.model.BattleShipGame;
import com.exercise.model.ShotResponse;

/**
 * Game Controller
 * 
 * @author Miguel
 *
 */
@Controller
public class GameController {

    @Autowired
    private BattleShipGame game;

    /**
     * Initialize Game
     * 
     * @param player1Name
     * @param player2Name
     */
    @RequestMapping(value = "/games/init", method = RequestMethod.GET)
    public void initialize(@RequestParam("player1Name") String player1Name, @RequestParam("player2Name") String player2Name) {
	this.game.initialize(player1Name, player2Name);
    }

    /**
     * Add a ship to the board
     * 
     * @param playerId
     * @param shipForm
     * @return
     * @throws GameException
     */
    @RequestMapping(value = "/games/{playerId}/addShip", method = RequestMethod.POST)
    public boolean addShipToBoard(@PathVariable("playerId") int playerId,
	    ShipForm shipForm) throws GameException {
	if (playerId == 1) {
	    return game.getPlayer1().addShipToBoard(shipForm);
	} else {
	    if (playerId == 2) {
		return game.getPlayer2().addShipToBoard(shipForm);
	    }
	}
	throw new GameException("Player does not exist");
    }

    /**
     * Fill a shot done by the player 
     *  
     * @param playerId
     * @param form
     * @return
     * @throws GameException
     */
    @RequestMapping(value = "/games/{playerId}/ownShot", method = RequestMethod.POST)
    public boolean ownShot(@PathVariable("playerId") int playerId, ShotForm form)
	    throws GameException {
	if (playerId == 1) {
	    return game.getPlayer1().addOwnShot(form);
	} else {
	    if (playerId == 2) {
		return game.getPlayer2().addOwnShot(form);
	    }
	}
	throw new GameException("Player does not exist");
    }

    /**
     * Fill a foreign shot
     * 
     * @param playerId
     * @param form
     * @return
     * @throws GameException
     */
    @RequestMapping(value = "/games/{playerId}/foreignfShot", method = RequestMethod.POST)
    public ShotResponse foreignShot(@PathVariable("playerId") int playerId,
	    ShotForm form) throws GameException {
	if (playerId == 1) {
	    return game.getPlayer1().addForeignShot(form);
	} else {
	    if (playerId == 2) {
		return game.getPlayer2().addForeignShot(form);
	    }
	}
	throw new GameException("Player does not exist");
    }

}
