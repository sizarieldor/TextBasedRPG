package com.company.World;

import com.company.Actors.Actor;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private String name;
    private int areaLevel;
    private List<Actor> actors;

    public Area(String name){
        this.name = name;
        this.actors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(int areaLevel) {
        this.areaLevel = areaLevel;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
