package com.company.Actors.Enemies;

import com.company.Actors.Actor;

public class Living extends Actor implements Enemy {
    public Living(String name, int hitPoints, int atkRating, int defRating, int baseDmg) {
        super(name, hitPoints, atkRating, defRating, baseDmg);
    }
}
