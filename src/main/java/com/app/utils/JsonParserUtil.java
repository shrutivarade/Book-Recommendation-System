package com.app.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The JsonParserUtil class provides utility methods to parse JSON files and extract data.
 */
public class JsonParserUtil {

    /**
     * Parses a JSON file and retrieves a list of strings associated with the specified key.
     * @param filePath The file path of the JSON file.
     * @param key The key to extract data for.
     * @return A list of strings extracted from the JSON file.
     */
    public static List<String> parseJsonArray(String filePath, String key) {
        List<String> values = new ArrayList<>();

        try (FileReader reader = new FileReader(filePath)) {
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            JsonArray jsonArray = jsonObject.getAsJsonArray(key);

            for (int i = 0; i < jsonArray.size(); i++) {
                values.add(jsonArray.get(i).getAsString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return values;
    }

    /**
     * Parses a JSON file and retrieves a map of key-value pairs.
     * @param filePath The file path of the JSON file.
     * @return A map containing key-value pairs extracted from the JSON file.
     */
    public static Map<String, String> parseJsonObject(String filePath) {
        Map<String, String> map = new HashMap<>();

        try (FileReader reader = new FileReader(filePath)) {
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

            for (String key : jsonObject.keySet()) {
                map.put(key, jsonObject.get(key).getAsString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }
}