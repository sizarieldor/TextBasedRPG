package com.company.Items.Wearables;

import com.company.Items.Item;

public class Weapon extends Item {
    private String name;
    private int damage;

    public Weapon(int goldCost, String name, int damage) {
        super(goldCost);
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
