package com.company.World;

import java.util.Random;

public class WorldMap {
    private int size;
    private char[][] worldMap2D;


    public WorldMap(int size) {
        this.size = size;
        this.worldMap2D = new char[size][size];
    }

    public char[][] getWorldMap2D() {
        return worldMap2D;
    }

    public void generateWorldMap() {

        int[]townLocationCoords = new int[2];
        townLocationCoords[0] = getRandomNumber(0, size-1);
        townLocationCoords[1] = getRandomNumber(0, size-1);



        int[] firstPointOfInterestCoords = new int[2];

    }


    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
