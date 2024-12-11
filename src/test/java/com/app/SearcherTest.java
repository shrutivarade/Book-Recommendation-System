//package com.app;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.concurrent.CompletableFuture;
//
//import static org.junit.Assert.*;
//
///**
// * Unit tests for the Searcher class.
// */
//public class SearcherTest {
//
//    private Searcher searcher;
//
//    @Before
//    public void setUp() {
//        searcher = new Searcher();
//    }
//
//    @Test
//    public void testSynchronousSearchValidQuery() {
//        // Test synchronous search with a valid query
//        Query query = new Query("Fantasy", "J.K. Rowling");
//        Result result = searcher.search(query);
//        assertNotNull(result);
//        assertTrue(result.getResultData().contains("Harry Potter and the Sorcerer's Stone"));
//    }
//
//    @Test
//    public void testSynchronousSearchInvalidQuery() {
//        // Test synchronous search with an invalid query
//        Query query = new Query("Unknown Genre", "Unknown Author");
//        Result result = searcher.search(query);
//        assertNotNull(result);
//        assertEquals("Search results:\nNo results found for the given genre and author.", result.getResultData());
//    }
//
//    @Test
//    public void testAsynchronousSearchValidQuery() throws Exception {
//        // Test asynchronous search with a valid query
//        Query query = new Query("Science Fiction", "Isaac Asimov");
//        CompletableFuture<Result> future = searcher.searchAsync(query);
//        Result result = future.get(); // Wait for the future to complete
//        assertNotNull(result);
//        assertTrue(result.getResultData().contains("Foundation"));
//    }
//
//    @Test
//    public void testAsynchronousSearchInvalidQuery() throws Exception {
//        // Test asynchronous search with an invalid query
//        Query query = new Query("Unknown Genre", "Unknown Author");
//        CompletableFuture<Result> future = searcher.searchAsync(query);
//        Result result = future.get(); // Wait for the future to complete
//        assertNotNull(result);
//        assertEquals("Search results:\nNo results found for the given genre and author.", result.getResultData());
//    }
//}