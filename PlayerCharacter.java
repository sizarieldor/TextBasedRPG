package com.company;

import java.util.ArrayList;
import java.util.List;

public class PlayerCharacter {
    private int level;
    private int attrStrength;
    private int attrAgility;
    private int attrVitality;
    private int attrEnergy;
    private List<Equippable> equippedItems; //perform check at the moment of equipping
    private CharacterClass characterClass; //attributes work slightly differently depending on class

    private double maxHitPoints;
    private double hitPoints;
    private double maxManaPoints;
    private double manaPoints;
    private double attackSpeed;

    public PlayerCharacter(CharacterClass chosenClass, int argStr, int argAgi, int argVit, int argNrg) {
        this.level = 1;
        this.characterClass = chosenClass;
        this.attrStrength = argStr;
        this.attrAgility = argAgi;
        this.attrVitality = argVit;
        this.attrEnergy = argNrg;
        equippedItems = new ArrayList<>();
    }

    //=======================
    //boilerplate code below:
    public int getLevel() {        return level;    }

    public int getAttrStrength() {
        return attrStrength;
    }

    public void setAttrStrength(int attrStrength) {
        this.attrStrength = attrStrength;
    }

    public int getAttrAgility() {
        return attrAgility;
    }

    public void setAttrAgility(int attrAgility) {
        this.attrAgility = attrAgility;
    }

    public int getAttrVitality() {
        return attrVitality;
    }

    public void setAttrVitality(int attrVitality) {
        this.attrVitality = attrVitality;
    }

    public int getAttrEnergy() {
        return attrEnergy;
    }

    public void setAttrEnergy(int attrEnergy) {
        this.attrEnergy = attrEnergy;
    }

    //=======================
    //derive stuff from attributes:

    public void levelUp(){ //TODO test
        this.calculateMaxHitPoints();
        this.calculateMaxManaPoints();
        this.calculateAttackSpeed();
    }

    public void calculateMaxHitPoints() { //recalculates max HP
        this.maxHitPoints = attrVitality * characterClass.getHpMultiplier();
    }

    public void calculateMaxManaPoints() {
        this.maxManaPoints = attrEnergy * 2;
    }

    public void calculateAttackSpeed() {
        this.attackSpeed = 5 + Math.log(attrAgility) * 0.75; //the logarithm of the attribute gives us diminishing returns to more Agi points in the late game
    }


    //=======================
    //handle HP and MP during the course of the game:

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    public double getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(double manaPoints) {
        this.manaPoints = manaPoints;
    }
}
