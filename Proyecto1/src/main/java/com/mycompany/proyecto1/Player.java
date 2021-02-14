/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

/**
 *
 * @author Daniel
 */
public class Player {
 
    private Box positon;
    private int counter;
    public Player() {
     
        this.positon=new Box();
        this.counter=0;
    }
    
     public Box getPositon() {
        return positon;
    }

    public void setPositon(Box positon) {
        this.positon = positon;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if (this.counter<29) {
           this.counter+= counter;
            if (this.counter>=29) {
                this.counter=29;
            }
        }
    }
    
    
    
}
