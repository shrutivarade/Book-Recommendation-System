
<!-- README.md -->
# Book Recommendation System

## Overview
The **Book Recommendation System** is a Java-based project that demonstrates core programming concepts such as JSON parsing, caching, synchronous and asynchronous processing, and concurrency. It enables users to search for books by genre, author, or both.

## Features
- Map genres to book titles.
- Parse and process JSON files for book and genre data.
- Search for books based on genre and author.
- Cache results for frequently searched queries.
- Perform both synchronous and asynchronous searches.

## File Structure
```
BookRecommendationSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── app/
│   │   │   │   │   ├── Main.java                      # Entry point
│   │   │   │   │   ├── BookMappingService.java        # Maps genres to books
│   │   │   │   │   ├── Query.java                     # Search parameters
│   │   │   │   │   ├── Result.java                    # Encapsulates search results
│   │   │   │   │   ├── Searcher.java                  # Search logic
│   │   │   │   │   ├── SearchCache.java               # Caching logic
│   │   │   │   │   └── utils/
│   │   │   │   │       ├── JsonParserUtil.java        # JSON parsing utilities
│   │   │   │   │       └── FileReaderUtil.java        # File reading utilities
│   │   └── resources/
│   │       ├── data/
│   │       │   ├── genre-mapping.json                 # Genre-to-book mappings
│   │       │   ├── books.json                         # Book details
│   │       │   └── sample-queries.json                # Example queries
│   │       └── application.properties                 # Configuration file
│   └── test/
│       └── java/
│           ├── com/
│           │   ├── app/
│           │   │   ├── BookMappingServiceTest.java    # Unit tests for mapping
│           │   │   ├── SearcherTest.java              # Unit tests for searcher
│           │   │   ├── QueryTest.java                 # Unit tests for query class
│           │   │   └── ResultTest.java                # Unit tests for results
├── pom.xml                                           # Maven build configuration
└── README.md                                         # Project documentation
```

## Getting Started

### Prerequisites
- Java 11+
- Maven

### Setup
1. Clone the repository:
    ```bash
    git clone https://github.com/your-repo/BookRecommendationSystem.git
    cd BookRecommendationSystem
    ```
2. Build the project:
    ```bash
    mvn clean install
    ```
3. Run the application:
    ```bash
    mvn exec:java
    ```

## Dependencies
- **Gson**: For JSON parsing.
- **JUnit**: For unit testing.

## Testing
Run the tests using Maven:
```bash
mvn test
```

## License
This project is licensed under the MIT License.
