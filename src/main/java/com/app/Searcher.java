package com.app;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * The Searcher class performs searches based on the provided query parameters.
 */
public class Searcher {

    private SearchCache cache = new SearchCache();
    private BookMappingService bookMappingService = new BookMappingService();

    /**
     * Constructs a Searcher and loads book mappings from a JSON file.
     */
    public Searcher() {
        bookMappingService.loadMappings("src/main/resources/data/genre-mapping.json");
    }

    /**
     * Performs a synchronous search based on the provided query.
     * @param query The query containing search parameters.
     * @return The search result.
     */
    public Result search(Query query) {
        String genre = query.getGenre();
        String author = query.getAuthor();

//        // Debug log for query
//        System.out.println("Searching for genre: " + genre + ", author: " + author);
//
//        String[] books = bookMappingService.getBooksByGenre(genre);
//        if (books == null || books.length == 0) {
//            System.out.println("No books found for genre: " + genre);
//            return new Result("Search results:\nNo results found for the given genre and author.");
//        }
//
//        // Debug log for books in the genre
//        System.out.println("Books found for genre " + genre + ": " + Arrays.toString(books));


        String[] books = bookMappingService.getBooksByGenre(genre);
        StringBuilder resultData = new StringBuilder("Search results:\n");

        for (String book : books) {
            if (book.toLowerCase().contains(author.toLowerCase())) {
                resultData.append(book).append("\n");
            }
        }

        if (resultData.toString().equals("Search results:\n")) {
            resultData.append("No results found for the given genre and author.");
        }

        return new Result(resultData.toString());
    }

    /**
     * Performs an asynchronous search based on the provided query.
     * @param query The query containing search parameters.
     * @return A CompletableFuture containing the search result.
     */
    public CompletableFuture<Result> searchAsync(Query query) {
        String cacheKey = query.getGenre() + "_" + query.getAuthor();

        // Check the cache for existing results
        if (cache.isCached(cacheKey)) {
            return CompletableFuture.completedFuture(cache.getFromCache(cacheKey));
        }

        // Perform the search asynchronously if not cached
        return CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate a delay for asynchronous execution
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Result result = search(query);

            // Cache the result for future queries
            cache.putInCache(cacheKey, result);

            return result;
        });
    }
}
