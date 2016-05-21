package com.exercise.form;

import com.exercise.model.Shot;

/**
 *  Form used to represent a shot
 *  
 * @author Miguel
 *
 */
public class ShotForm {

    private int x;
    
    private int y;
    
    private Shot shot;
   
    
    public ShotForm(int x, int y, Shot shot) {
	super();
	this.x = x;
	this.y = y;
	this.shot = shot;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Shot getShot() {
        return shot;
    }
    
}
