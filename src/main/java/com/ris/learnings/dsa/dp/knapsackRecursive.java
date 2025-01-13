package com.ris.learnings.dsa.dp;

public class knapsackRecursive {
  public static void main(String[] args) {
    int[] weights = {2, 3, 4, 5}; // Weights of items
    int[] values = {3, 4, 5, 6}; // Values of items
    int capacity = 5; // Maximum capacity of the knapsack
    int n = weights.length; // Number of items

    int maxValue = knapsack(weights, values, capacity, n);
    System.out.println("Maximum value achievable: " + maxValue);
  }

  private static int knapsack(int[] wt, int[] val, int cap, int n) {
    // base condition :
    if (0 == n || 0 == cap) {
      return 0;
    }
    if (wt[n - 1] <= cap) {
      int include = val[n - 1] + knapsack(wt, val, cap - wt[n - 1], n - 1);
      int exclude = knapsack(wt, val, cap, n - 1);
      return Math.max(include, exclude);
    } else {
      return knapsack(wt, val, cap, n - 1);
    }
  }
}
