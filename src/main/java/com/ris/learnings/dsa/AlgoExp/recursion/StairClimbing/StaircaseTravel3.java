package com.ris.learnings.dsa.AlgoExp.recursion.StairClimbing;

public class StaircaseTravel3 {

    public static int stairCaseToTravel(int height, int maxSteps) {
        int currentNoOfWays = 0;
        int[] waysToTop = new int[height + 1];
        waysToTop[0] = 1;

        // Loop through the height of the staircase
        for (int currentHeight = 1; currentHeight <= height; currentHeight++) {
            int startOfWindow = currentHeight - maxSteps;
            int endOfWindow = currentHeight - 1;

            if (startOfWindow >= 0) {
                currentNoOfWays -= waysToTop[startOfWindow];
            }

            currentNoOfWays += waysToTop[endOfWindow];
            waysToTop[currentHeight] = currentNoOfWays;
        }

        return waysToTop[height]; // Return the number of ways to reach the top
    }

    public static void run() {
        // Test cases to validate the implementation
        int[][] testCases = {
                { 5, 2 }, // Height 5, max steps 2
                { 7, 10 }, // Height 7, max steps 3
                { 10, 4 }, // Height 10, max steps 4
                { 15, 5 }, // Height 15, max steps 5
                { 12, 3 } // Height 12, max steps 3
        };

        for (int[] testCase : testCases) {
            int height = testCase[0];
            int maxSteps = testCase[1];
            int result = stairCaseToTravel(height, maxSteps); // Get the result from the function

            System.out.printf("Number of ways to traverse a staircase with height %d and max steps %d: %d%n", height,
                    maxSteps, result);
        }
    }

    public static void main(String[] args) {
        run(); // Execute the runner function to test cases
    }
}
