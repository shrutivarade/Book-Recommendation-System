package com.app.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The FileReaderUtil class provides utility methods for reading files.
 */
public class FileReaderUtil {

    /**
     * Reads the contents of a file and returns it as a single string.
     * @param filePath The path to the file.
     * @return The contents of the file as a string.
     */
    public static String readFileAsString(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString().trim();
    }

    /**
     * Reads the contents of a file line by line and prints each line to the console.
     * @param filePath The path to the file.
     */
    public static void printFileContents(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
