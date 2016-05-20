package com.example;

public class Demo {
    public static void main(String[] args) {

        Enemy enemy = new Enemy(10, 3);
        System.out.println(enemy.getHitPoints());

        Soldier soldier = new Soldier(25, 1);
        System.out.println(soldier.getHitPoints());

        soldier.takeDamage(12);

        SuperSoldier superSoldier = new SuperSoldier(25, 1);
        System.out.println("Hitpoint: " + superSoldier.getHitPoints() + " lives: "
                + superSoldier.getLives() );
        superSoldier.takeDamage(8);
    }



}
