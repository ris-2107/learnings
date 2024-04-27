package com.ris.learnings.dsa.AlgoExp.recursion.StairClimbing;

import java.util.logging.Logger;

public class StairCaseTraversal2 {

    private static final Logger LOGGER = Logger.getLogger(StairCaseTraversal2.class.getName());

    /**
     * Compute the number of ways to reach the top of a staircase given the height
     * and maximum step size.
     * 
     * @param height   the height of the staircase
     * @param maxSteps the maximum number of steps that can be taken at a time
     * @return the total number of ways to reach the top of the staircase
     */
    public static int stairCaseTraversal(int height, int maxSteps) {
        // Validate inputs
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        if (maxSteps <= 0) {
            throw new IllegalArgumentException("Max steps must be greater than zero.");
        }

        // Create an array to store the number of ways to reach each step
        int[] waysToTop = new int[height + 1];
        waysToTop[0] = 1; // Base case: one way to stay at ground level

        if (height > 0) {
            waysToTop[1] = 1; // One way to climb one step
        }

        // Compute the number of ways to reach the top for each height
        for (int currentHeight = 2; currentHeight <= height; currentHeight++) {
            for (int step = 1; step <= Math.min(currentHeight, maxSteps); step++) {
                waysToTop[currentHeight] += waysToTop[currentHeight - step];
            }
        }

        return waysToTop[height];
    }

    /**
     * Run function to execute test cases, including edge cases.
     */
    public static void run() {
        int[][] testCases = {
                { 0, 2 }, // Zero height
                { -1, 2 }, // Negative height
                { 5, 0 }, // Zero max steps
                { 7, 10 }, // Max steps greater than height
                { 5, 5 }, // Max steps equals height
                { 10, 3 }, // General case
        };

        for (int[] testCase : testCases) {
            int height = testCase[0];
            int maxSteps = testCase[1];

            try {
                int result = stairCaseTraversal(height, maxSteps);
                LOGGER.info(String.format("Ways to traverse a staircase with height %d and max steps %d: %d \n", height,
                        maxSteps, result));
            } catch (IllegalArgumentException e) {
                LOGGER.warning(
                        String.format("Error with height %d and max steps %d: %s \n", height, maxSteps,
                                e.getMessage()));
            }
        }
    }

    public static void main(String[] args) {
        run(); // Run the test cases
    }
}
