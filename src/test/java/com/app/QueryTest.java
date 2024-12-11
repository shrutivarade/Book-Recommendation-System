//package com.app;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
///**
// * Unit tests for the Query class.
// */
//public class QueryTest {
//
//    @Test
//    public void testQueryCreation() {
//        // Test creating a Query object
//        Query query = new Query("Fantasy", "J.K. Rowling");
//        assertNotNull(query);
//        assertEquals("Fantasy", query.getGenre());
//        assertEquals("J.K. Rowling", query.getAuthor());
//    }
//
//    @Test
//    public void testGetGenre() {
//        // Test getting the genre from a Query object
//        Query query = new Query("Science Fiction", "Isaac Asimov");
//        assertEquals("Science Fiction", query.getGenre());
//    }
//
//    @Test
//    public void testGetAuthor() {
//        // Test getting the author from a Query object
//        Query query = new Query("Mystery", "Agatha Christie");
//        assertEquals("Agatha Christie", query.getAuthor());
//    }
//
//    @Test
//    public void testToString() {
//        // Test the toString method
//        Query query = new Query("Non-Fiction", "Yuval Noah Harari");
//        String expected = "Query{genre='Non-Fiction', author='Yuval Noah Harari'}";
//        assertEquals(expected, query.toString());
//    }
//}