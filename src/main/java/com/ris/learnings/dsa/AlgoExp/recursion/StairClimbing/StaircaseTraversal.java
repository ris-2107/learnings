package com.ris.learnings.dsa.AlgoExp.recursion.StairClimbing;

import java.math.BigInteger;
import java.util.HashMap;

public class StaircaseTraversal {
    public static void main(String[] args) {
        int height = 998; // Example height
        int maxSteps = 570; // Example maximum steps

        // Start the timer
        long startTime = System.nanoTime(); // Record the start time

        BigInteger result = stairCaseTraversal(height, maxSteps);

        // End the timer
        long endTime = System.nanoTime(); // Record the end time

        // Calculate the time taken in nanoseconds and convert to milliseconds
        long durationNano = endTime - startTime;
        double durationMillis = durationNano; // Convert to milliseconds

        System.out.println("Number of ways to traverse a staircase with height " + height + " and max steps " + maxSteps
                + " : " + result);
        System.out.println("Execution time: " + durationMillis + " ns"); // Print the execution time in milliseconds
    }

    // Function to compute the number of ways to traverse a staircase with
    // memoization
    public static BigInteger stairCaseTraversal(int height, int maxSteps) {
        HashMap<Integer, BigInteger> memo = new HashMap<>(); // Memoization dictionary
        return helper(height, maxSteps, memo);
    }

    // Recursive helper function with memoization
    private static BigInteger helper(int height, int maxSteps, HashMap<Integer, BigInteger> memo) {
        // Base case
        if (height <= 1) {
            return BigInteger.ONE; // Only one way to traverse a single or zero-step staircase
        }

        // Return the memoized result if already computed
        if (memo.containsKey(height)) {
            return memo.get(height);
        }

        BigInteger noOfWays = BigInteger.ZERO; // Initialize the count of ways

        // Loop to compute the possible ways to traverse the staircase
        for (int i = 1; i <= Math.min(height, maxSteps); i++) {
            noOfWays = noOfWays.add(helper(height - i, maxSteps, memo));
        }

        // Store the result in the memoization dictionary
        memo.put(height, noOfWays);

        return noOfWays; // Return the computed result
    }
}
