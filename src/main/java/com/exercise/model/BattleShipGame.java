package com.exercise.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.exercise.repository.GameRepository;



/**
 * 
 * Main Game
 * 
 * @author Miguel
 *
 */
public class BattleShipGame {

    private Board player1;
   
    private Board player2;
    
    @Autowired
    private GameRepository gameRepository;

    public void initialize(String p1, String p2) {
	player1.initialize(p1);
	player2.initialize(p2);
    }
    
    public BattleShipGame(Board player1, Board player2) {
	super();
	this.player1 = player1;
	this.player2 = player2;
    }

    public Board getPlayer1() {
        return player1;
    }

    public Board getPlayer2() {
        return player2;
    }
    
    
}
