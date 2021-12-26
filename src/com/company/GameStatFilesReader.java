package com.company;

import java.io.*;

public class GameStatFilesReader {
    private static final String COMMA_DELIMITER = ",";

    public static String[] findMonsterData(String enemyType, String filePath) {
        String[] data = null;
        File monsterDataFile = new File(filePath);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while (true) {
                String[] line = reader.readLine().split(COMMA_DELIMITER);
                if (line[1].equals(enemyType)) {
                    data = line;
                    break;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException f) {
            f.printStackTrace();
        }

        /*try (Scanner scan = new Scanner(monsterDataFile)) {
            while (scan.hasNextLine()) {
                String[] line = scan.nextLine().split(COMMA_DELIMITER);
                if (line[0].equals(enemyType)) {
                    data = line;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/
        return data;
    }
}
