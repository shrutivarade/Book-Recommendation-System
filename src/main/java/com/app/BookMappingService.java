package com.app;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * The BookMappingService class is responsible for managing the mapping of genres to book titles.
 */
public class BookMappingService {

    private Map<String, String[]> genreToBooksMap = new HashMap<>();

    /**
     * Loads genre-to-books mappings from a JSON file.
     * @param mappingFilePath The file path of the JSON mapping file.
     */
    public void loadMappings(String mappingFilePath) {
        try (FileReader reader = new FileReader(mappingFilePath)) {
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

            for (String genre : jsonObject.keySet()) {
                JsonArray jsonArray = jsonObject.getAsJsonArray(genre);
                String[] books = new String[jsonArray.size()];
                for (int i = 0; i < jsonArray.size(); i++) {
                    books[i] = jsonArray.get(i).getAsString();
                }
                genreToBooksMap.put(genre, books);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieves book titles for a given genre.
     * @param genre The genre for which to retrieve book titles.
     * @return An array of book titles associated with the genre, or an empty array if none found.
     */
    public String[] getBooksByGenre(String genre) {
        return genreToBooksMap.getOrDefault(genre, new String[0]);
    }

    /**
     * Checks if a specific book is mapped under a given genre.
     * @param genre The genre to check.
     * @param book The book title to verify.
     * @return True if the book is found under the genre, false otherwise.
     */
    public boolean isBookInGenre(String genre, String book) {
        String[] books = genreToBooksMap.get(genre);
        if (books != null) {
            for (String b : books) {
                if (b.equalsIgnoreCase(book)) {
                    return true;
                }
            }
        }
        return false;
    }
}
