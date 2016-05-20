package com.example;

/**
 * Created by jlems on 5/8/16.
 */
public class SuperSoldier extends Enemy{

    public SuperSoldier(int hitPoints, int lives){
        super(hitPoints, lives);
    }


    public void takeDamage(int damage){
        super.takeDamage(damage / 2);

    }
}
