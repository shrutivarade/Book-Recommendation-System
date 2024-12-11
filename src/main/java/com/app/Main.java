package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The Main class serves as the entry point for the Book Recommendation System.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Book Recommendation System\n");

        // Initialize the searcher and load mappings
        Searcher searcher = new Searcher();

        // Define some sample queries
        Query query1 = new Query("Fantasy", "J.K. Rowling");
        Query query2 = new Query("Science Fiction", "Isaac Asimov");
        Query query3 = new Query("Mystery", "Agatha Christie");

        // Synchronous search example
        System.out.println("Performing synchronous searches:\n");
        Result result1 = searcher.search(query1);
        Result result2 = searcher.search(query2);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);

        // Asynchronous search example
        System.out.println("\nPerforming asynchronous searches:\n");
        List<Query> queries = Arrays.asList(query1, query2, query3);

        // Execute searches asynchronously
        List<CompletableFuture<Result>> futures = queries.stream()
                .map(searcher::searchAsync)
                .toList();

        // Wait for all asynchronous searches to complete
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    futures.forEach(future -> {
                        try {
                            System.out.println(future.get());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
                })
                .join();

        System.out.println("\nAll searches completed. Goodbye!");
    }
}
