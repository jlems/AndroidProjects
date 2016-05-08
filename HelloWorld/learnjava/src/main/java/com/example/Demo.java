package com.example;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        // Player tim = new Player();
        Player tim = new Player("Tim", 5);


        Weapon myAxe = new Weapon("Sweet Axe", 15, 50);
        InventoryItem redPotion = new InventoryItem(ItemType.POTION, "Red Potion");
        tim.addInventoryItem(redPotion);

        tim.addInventoryItem(new InventoryItem(ItemType.ARMOR, "+3 Chest Armor")); // when you don't need to remember the object
        tim.addInventoryItem(new InventoryItem(ItemType.RING, "+2 Ring of Protection"));
        tim.addInventoryItem(new InventoryItem(ItemType.POTION, "Invisibility Potion"));

        ArrayList<InventoryItem> allItems = tim.getInventoryItems();

        InventoryItem bluePotion = new InventoryItem(ItemType.POTION, "Blue Potion");

        boolean wasDeleted = tim.dropInventoryItem(redPotion);

        System.out.println(wasDeleted);

        for(InventoryItem item : allItems){
            System.out.println(item.getName());
        }



    }



}
