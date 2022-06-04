package com.company.Actors.Neutrals;

import com.company.Actors.Actor;
import com.company.Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Container extends Actor {
    private List<Item> containerContents;
    public Container(String name, int hitPoints) {
        super(name, hitPoints, 0, 0, 0);
        containerContents = new ArrayList<>();
    }

    public List<Item> getContainedItems(){
        return this.containerContents;
    }

    public void addItem(Item newItem){
        this.containerContents.add(newItem);
    }

}
