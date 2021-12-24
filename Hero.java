package com.company;

import com.company.Items.*;
import com.company.Items.Wearables.*;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private int level;
    private int hitPoints;
    private int baseDamage;
    private int baseDefense;
    private Helm helm;
    private BodyArmor bodyArmor;
    private Gloves gloves;
    private Boots boots;
    private Amulet amulet;
    private Ring ring;
    private Weapon weapon;
    private Shield shield;
    private List<Item> inventory;
    private int totalDamage;
    private int totalDefense;


    public Hero(int level, int hitPoints, int baseDamage, int baseDefense) {
        this.level = level;
        this.hitPoints = hitPoints;
        this.baseDamage = baseDamage;
        this.helm = null;
        this.bodyArmor = null;
        this.gloves = null;
        this.boots = null;
        this.amulet = null;
        this.ring = null;
        this.shield = null;
        this.weapon = null;
        this.inventory = new ArrayList<>();
    }

    //=============================
    //===all getters and setters===
    //=============================
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        if (this.getHelm() != null) {
            this.inventory.add(this.getBodyArmor());
        }
        this.helm = helm;
    }

    public BodyArmor getBodyArmor() {
        return bodyArmor;
    }

    public void setBodyArmor(BodyArmor bodyArmor) {
        if (this.getBodyArmor() != null) {
            this.inventory.add(this.getBodyArmor());
        }
        this.bodyArmor = bodyArmor;
    }

    public Gloves getGloves() {
        return gloves;
    }

    public void setGloves(Gloves gloves) {
        if (this.getGloves() != null) {
            this.inventory.add(this.getGloves());
        }
        this.gloves = gloves;
    }

    public Boots getBoots() {
        return boots;
    }

    public void setBoots(Boots boots) {
        if (this.getBoots() != null) {
            this.inventory.add(this.getBoots());
        }
        this.boots = boots;
    }

    public Amulet getAmulet() {
        return amulet;
    }

    public void setAmulet(Amulet amulet) {
        if (this.getAmulet() != null) {
            this.inventory.add(this.getAmulet());
        }
        this.amulet = amulet;
    }

    public Ring getRing() {
        return ring;
    }

    public void setRing(Ring ring) {
        if (this.getRing() != null) {
            this.inventory.add(this.getRing());
        }
        this.ring = ring;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        if (this.getWeapon() != null) {
            this.inventory.add(this.getWeapon());
        }
        this.weapon = weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        if (this.getShield() != null) {
            this.inventory.add(this.getShield());
        }
        this.shield = shield;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    //=============================
//    //===all getters and setters===
    //=============================

    public int getTotalDefense() {
        int totalDefense = 0;
        totalDefense += (
                this.getBaseDefense() +
                        this.getShield().getDefense() +
                        this.getHelm().getDefense() +
                        this.getBodyArmor().getDefense() +
                        this.getGloves().getDefense() +
                        this.getBoots().getDefense());
        return totalDefense;
    }

    public int getTotalDamage() {
        int totalDamage = 0;
        totalDamage += (
                this.getBaseDamage() +
                        this.getWeapon().getDamage());
        return totalDamage;
    }

}
