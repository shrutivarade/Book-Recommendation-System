package com.app;

import java.util.HashMap;
import java.util.Map;

/**
 * The SearchCache class provides caching functionality for search results.
 */
public class SearchCache {

    private final Map<String, Result> cache = new HashMap<>();

    /**
     * Checks if a result for the given key is present in the cache.
     * @param key The cache key.
     * @return True if the result is cached, false otherwise.
     */
    public boolean isCached(String key) {
        return cache.containsKey(key);
    }

    /**
     * Retrieves a cached result for the given key.
     * @param key The cache key.
     * @return The cached result, or null if not found.
     */
    public Result getFromCache(String key) {
        return cache.get(key);
    }

    /**
     * Stores a result in the cache with the given key.
     * @param key The cache key.
     * @param result The result to cache.
     */
    public void putInCache(String key, Result result) {
        cache.put(key, result);
    }

    /**
     * Clears the cache of all stored results.
     */
    public void clearCache() {
        cache.clear();
    }
}
