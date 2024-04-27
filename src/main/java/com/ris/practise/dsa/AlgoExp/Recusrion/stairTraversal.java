
package com.ris.practise.dsa.AlgoExp.Recusrion;

public class stairTraversal {

    public static void main(String[] args) {
        runTests(); // Call the runner function to execute the test cases
    }

    public int stairTraversalHelper(int height, int maxSteps) {
        int dp[] = new int[height + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int currHeight = 2; currHeight <= height; currHeight++) {
            for (int stepCounter = 1; stepCounter <= Math.min(currHeight, maxSteps); stepCounter++) {
                dp[currHeight] += dp[currHeight - stepCounter];
            }
        }
        return dp[height];
    }

    // Runner function to execute test cases
    public static void runTests() {
        stairTraversal stairTraversalObj = new stairTraversal(); // Create an instance to call instance methods

        int[][] testCases = {
                { 5, 2 }, // Height 5, max steps 2
                { 7, 3 }, // Height 7, max steps 3
                { 10, 4 }, // Height 10, max steps 4
                { 12, 4 }, // Height 12, max steps 4
                { 15, 5 } // Height 15, max steps 5
        };

        for (int[] testCase : testCases) {
            int height = testCase[0];
            int maxSteps = testCase[1];
            int result = stairTraversalObj.stairTraversalHelper(height, maxSteps); // Get the result from the existing
                                                                                   // function

            System.out.printf("Number of ways to traverse a staircase with height %d and max steps %d: %d%n",
                    height, maxSteps, result);
        }
    }
}
