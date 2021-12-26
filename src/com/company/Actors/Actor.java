package com.company.Actors;

public abstract class Actor {
    private String name;
    private int hitPoints;
    private int atkRating;
    private int defRating;
    private int baseDmg;

    public Actor(String name, int hitPoints, int atkRating, int defRating, int baseDmg) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.atkRating = atkRating;
        this.defRating = defRating;
        this.baseDmg = baseDmg;
    }

    public String getName() {
        return name;
    }
}
