package com.company;

import com.company.Actors.Enemies.Demon;
import com.company.Actors.Enemies.Enemy;
import java.nio.file.Path;

public class Main {
    private static final Path MONSTER_DATA_PATH = Path.of("MonsterData.csv");

    public void main(String[] args) {

    }


    public static Enemy enemyBuilder(String enemyType) {
        Enemy newEnemy = null;
        String[] newMonsterData = GameStatFilesReader.findMonsterData(enemyType,MONSTER_DATA_PATH);
        switch (enemyType) {
            case "Demon":
                Enemy newDemon = new Demon();
                break;
            case "Living":
                break;
            case "Undead":
                break;
        }

        return newEnemy;
    }
}

