package com.app;

/**
 * The Query class represents search parameters such as genre and author.
 */
public class Query {

    private String genre;
    private String author;

    /**
     * Constructs a Query object with the specified genre and author.
     * @param genre The genre to search for.
     * @param author The author to search for.
     */
    public Query(String genre, String author) {
        this.genre = genre;
        this.author = author;
    }

    /**
     * Retrieves the genre associated with this query.
     * @return The genre.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Retrieves the author associated with this query.
     * @return The author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns a string representation of the query.
     * @return A string containing the genre and author.
     */
    @Override
    public String toString() {
        return "Query{" +
                "genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}