package com.ris.learnings.dsa.AlgoExp.recursion.Permutations;

import java.util.ArrayList;
import java.util.List;

public class PermutationGenerator {

    // Function to generate all permutations of a given list
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>(); // List to store all permutations
        permutationsHelper(array, new ArrayList<>(), permutations);
        return permutations; // Return the list of permutations
    }

    // Recursive helper function to generate permutations
    private static void permutationsHelper(List<Integer> array, List<Integer> currentPerm,
            List<List<Integer>> permutations) {
        // If the array is empty and current permutation has elements, add it to
        // permutations
        if (array.isEmpty() && !currentPerm.isEmpty()) {
            permutations.add(new ArrayList<>(currentPerm));
        } else {
            // Generate permutations by iterating over elements and recursively processing
            // the rest
            for (int i = 0; i < array.size(); i++) { 
                List<Integer> newArray = new ArrayList<>(array); // Copy the array
                Integer currentElement = newArray.remove(i); // Remove the current element
                List<Integer> newPerm = new ArrayList<>(currentPerm); // Copy the current permutation
                newPerm.add(currentElement); // Add the current element to permutation
                permutationsHelper(newArray, newPerm, permutations); // Recursive call
            }
        }
    }

    // Function to execute test cases and output permutations
    public static void run() {
        // Test cases with different array inputs
        List<List<Integer>> testCases = List.of(
                List.of(1, 2, 3), // Example array for permutations
                List.of(1, 2, 3, 4, 5), // Bigger array
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
