package com.ris.practise.dsa.AlgoExp.Recusrion;

import java.util.ArrayList;
import java.util.List;

public class PermutationGenerator {
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>();
        permutationsHelper(array, new ArrayList<>(), permutations);
        return permutations;
    }

    // Recursive helper function to generate permutations
    private static void permutationsHelper(List<Integer> array, List<Integer> currentPerm,
            List<List<Integer>> permutations) {
        if (array.isEmpty() && !currentPerm.isEmpty()) {
            permutations.add(currentPerm);
        } else {
            for (var ele : array) {
                List<Integer> newArray = new ArrayList<Integer>(array);
                newArray.remove(ele);
                List<Integer> newPer = new ArrayList<>(currentPerm);
                newPer.add(ele);
                permutationsHelper(newArray, newPer, permutations);
            }
        }

    }

    // Function to execute test cases and output permutations
    public static void run() {
        // Test cases with different array inputs
        List<List<Integer>> testCases = List.of(
                List.of(1, 2, 3), // Example array for permutations
                List.of(1, 2, 3, 4), // Bigger array
                List.of(1) // Single-element array
        );

        for (List<Integer> array : testCases) {
            List<List<Integer>> permutations = getPermutations(array); // Get permutations
            System.out.printf("\n Permutations for %s: %s%n \n", array.toString(), permutations.toString());
        }
    }

    // Main method to run test cases
    public static void main(String[] args) {
        run(); // Execute the test cases
    }
}
