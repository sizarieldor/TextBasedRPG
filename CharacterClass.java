package com.company;

public enum CharacterClass {
    WARRIOR(3.0, 1 ),
    ROGUE(2.0, 1.2),
    SORCERER(1.0, 0.8);


    private double hpMultiplier;
    private double attackSpeed;


    CharacterClass(double hpMultiplier, double attackSpeed) {
        this.hpMultiplier = hpMultiplier;
        this.attackSpeed = attackSpeed;
    }

    public double getHpMultiplier(){
        return this.hpMultiplier;
    }


    public double getAttackSpeed() {
        return attackSpeed;
    }
}
