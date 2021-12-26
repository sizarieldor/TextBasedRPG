package com.company;

import com.company.Actors.Enemies.*;

import java.nio.file.Path;

public class Main {
    private static final String MONSTER_DATA_PATH = "src\\MonsterData.csv";

    public static void main(String[] args) {
        //initialize hero and world cell


//        Enemy newEnemy = enemyBuilder("Skeleton Warrior");
        Enemy newSkeleton = enemyBuilder("Skeleton Mage", "Undead");

        System.out.println("");

    }


    public static Enemy enemyBuilder(String enemyType, String enemyClass) {
        Enemy newEnemy = null;
        String[] newMonsterData = GameStatFilesReader.findMonsterData(enemyClass, MONSTER_DATA_PATH);
        switch (enemyClass) {
            case EnemyTypeConstants.ENEMY_CLASS_DEMON:
                Enemy newDemon = new Demon(
                        enemyType,
                        Integer.parseInt(newMonsterData[2]),
                        Integer.parseInt(newMonsterData[3]),
                        Integer.parseInt(newMonsterData[4]),
                        Integer.parseInt(newMonsterData[5])
                );
                newEnemy = newDemon;
                break;
            case EnemyTypeConstants.ENEMY_CLASS_LIVING:
                Enemy newLiving = new Living(
                        enemyType,
                        Integer.parseInt(newMonsterData[2]),
                        Integer.parseInt(newMonsterData[3]),
                        Integer.parseInt(newMonsterData[4]),
                        Integer.parseInt(newMonsterData[5])
                );
                newEnemy = newLiving;
                break;
            case EnemyTypeConstants.ENEMY_CLASS_UNDEAD:
                Enemy newUndead = new Undead(
                        enemyType,
                        Integer.parseInt(newMonsterData[2]),
                        Integer.parseInt(newMonsterData[3]),
                        Integer.parseInt(newMonsterData[4]),
                        Integer.parseInt(newMonsterData[5])
                );
                newEnemy = newUndead;
                break;
        }
        return newEnemy;
    }
}

