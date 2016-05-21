package com.exercise.exception;

/**
 * 
 * @author Miguel
 *
 */
public class GameException extends Exception{

    /**
     * TODO Field  Objective
     */
    private static final long serialVersionUID = 1L;

    public GameException(String message) {
	super(message);
    }

    public GameException(String message, Throwable cause) {
	super(message, cause);
    }
}
