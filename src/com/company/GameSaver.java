package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class GameSaver {
    public void writeSavedGame(String heroName) { //might need to pass a bunch of game data
        //initialize gamesave name
        LocalDateTime now = LocalDateTime.now();
        String currentDateAndTime = now.toString();
        String gameSaveName = currentDateAndTime + heroName + ".txt";

        //obtain data for the game save
        //to avoid calling non-static methods from static context


        //create save file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(gameSaveName));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
