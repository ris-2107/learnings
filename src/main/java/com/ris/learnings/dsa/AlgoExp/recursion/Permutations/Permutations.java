package com.ris.learnings.dsa.AlgoExp.recursion.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permutations(List<Integer> array) {
        List<List<Integer>> ans = new ArrayList<>();
        permutationsHelper(0, new ArrayList<>(array), ans); // Pass a mutable list
        return ans;
    }

    private static void permutationsHelper(int index, List<Integer> array, List<List<Integer>> ans) {
        if (index == array.size() - 1) {
            ans.add(new ArrayList<>(array)); // Append a copy of the current permutation
        } else {
            for (int j = index; j < array.size(); j++) {
                swap(array, index, j); // Swap elements in a mutable list
                permutationsHelper(index + 1, array, ans);
                swap(array, index, j); // Swap back
            }
        }
    }

    private static void swap(List<Integer> array, int i, int j) {
        int temp = array.get(i); // Temporary variable to hold the value
        array.set(i, array.get(j)); // Swap elements
        array.set(j, temp); // Restore the original order after swapping
    }

    public static void run() {
        List<List<Integer>> testCases = new ArrayList<>(); // Create a mutable list for test cases
        testCases.add(new ArrayList<>(List.of(1, 2, 3)));
        testCases.add(new ArrayList<>(List.of(1, 2)));
        testCases.add(new ArrayList<>(List.of(1)));

        for (List<Integer> array : testCases) {
            List<List<Integer>> permutationsResult = permutations(array); // Get permutations
            System.out.printf("Permutations for %s: %s%n", array.toString(), permutationsResult.toString());
        }
    }

    public static void main(String[] args) {
        run(); // Run the test cases
    }
}
