//package com.app;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
///**
// * Unit tests for the BookMappingService class.
// */
//public class BookMappingServiceTest {
//
//    private BookMappingService bookMappingService;
//
//    @Before
//    public void setUp() {
//        bookMappingService = new BookMappingService();
//        bookMappingService.loadMappings("src/main/resources/data/genre-mapping.json");
//    }
//
//    @Test
//    public void testLoadMappings() {
//        // Test if mappings are loaded correctly
//        String[] fantasyBooks = bookMappingService.getBooksByGenre("Fantasy");
//        assertNotNull(fantasyBooks);
//        assertTrue(fantasyBooks.length > 0);
//        assertEquals("Harry Potter and the Sorcerer's Stone", fantasyBooks[0]);
//    }
//
//    @Test
//    public void testGetBooksByGenreValidGenre() {
//        // Test retrieving books for a valid genre
//        String[] scienceFictionBooks = bookMappingService.getBooksByGenre("Science Fiction");
//        assertNotNull(scienceFictionBooks);
//        assertEquals(3, scienceFictionBooks.length);
//        assertEquals("Dune", scienceFictionBooks[0]);
//    }
//
//    @Test
//    public void testGetBooksByGenreInvalidGenre() {
//        // Test retrieving books for an invalid genre
//        String[] invalidGenreBooks = bookMappingService.getBooksByGenre("Unknown Genre");
//        assertNotNull(invalidGenreBooks);
//        assertEquals(0, invalidGenreBooks.length);
//    }
//
//    @Test
//    public void testIsBookInGenre() {
//        // Test if a book is correctly identified under a genre
//        assertTrue(bookMappingService.isBookInGenre("Fantasy", "Harry Potter and the Sorcerer's Stone"));
//        assertFalse(bookMappingService.isBookInGenre("Fantasy", "Dune"));
//    }
//}
