package com.dr4kk0nnys.Flappy_Bird.Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

    private FileUtils() {

    }

    public static String loadAsString(String file) {
        StringBuilder result = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String buffer = "";
            while((buffer = reader.readLine()) != null) {
                result.append(buffer);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

}
