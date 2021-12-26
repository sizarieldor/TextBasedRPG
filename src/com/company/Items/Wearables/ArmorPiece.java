package com.company.Items.Wearables;

import com.company.Items.Item;

public class ArmorPiece extends Item {
    private String name;
    private int defense;

    public ArmorPiece(String name, int defense, int goldCost) {
        super(goldCost);
        this.name = name;
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) { //TODO is this needed?
        this.defense = defense;
    }
}
