package com.app;

/**
 * The Result class encapsulates the results of a search operation.
 */
public class Result {

    private String resultData;

    /**
     * Constructs a Result object with the specified result data.
     * @param resultData The result data as a string.
     */
    public Result(String resultData) {
        this.resultData = resultData;
    }

    /**
     * Retrieves the result data.
     * @return The result data as a string.
     */
    public String getResultData() {
        return resultData;
    }

    /**
     * Sets the result data.
     * @param resultData The result data to set.
     */
    public void setResultData(String resultData) {
        this.resultData = resultData;
    }

    /**
     * Returns a string representation of the result.
     * @return A string containing the result data.
     */
    @Override
    public String toString() {
        return resultData;
    }
}
