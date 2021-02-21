/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

/**
 *
 * @author HP
 */
public class Snakes {
    
    private Box start;
    private Box end;
    private int position;
    
    public Snakes(){
        this.start = new Box();
        this.end = new Box();
        this.position = 0;
    }
    
    public Box getStart(){
        return this.start;
    }
    
    public void setStart(Box start){
        this.start = start;
    }
    
    public Box getEnd(){
        return this.end;
    }
    
    public void setEnd(Box end){
        this.end = end;
    }
    
    public int getPosition(){
        return this.position;
    }
    
    public void setPosition(int position){
        this.position = position;
    }
}
