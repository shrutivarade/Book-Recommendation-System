//package com.app;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
///**
// * Unit tests for the Result class.
// */
//public class ResultTest {
//
//    @Test
//    public void testResultCreation() {
//        // Test creating a Result object
//        Result result = new Result("Search results: Harry Potter and the Sorcerer's Stone");
//        assertNotNull(result);
//        assertEquals("Search results: Harry Potter and the Sorcerer's Stone", result.getResultData());
//    }
//
//    @Test
//    public void testGetResultData() {
//        // Test retrieving result data
//        Result result = new Result("Search results: Dune");
//        assertEquals("Search results: Dune", result.getResultData());
//    }
//
//    @Test
//    public void testSetResultData() {
//        // Test updating result data
//        Result result = new Result("Initial result");
//        result.setResultData("Updated result");
//        assertEquals("Updated result", result.getResultData());
//    }
//
//    @Test
//    public void testToString() {
//        // Test the toString method
//        Result result = new Result("Search results: Foundation");
//        assertEquals("Search results: Foundation", result.toString());
//    }
//}
