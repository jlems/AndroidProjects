package com.example;

/**
 * Created by jlems on 5/7/16.
 */
public class Soldier extends Enemy {

    public Soldier(int hitPoints, int lives){
        super(hitPoints, lives); // this is the constructor for the class that is being extended
                                // it automatically calls that constructor
    }

}
