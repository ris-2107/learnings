package com.ris.learnings.dsa.dp;

public class KnapsackTopDown {

  public static void main(String[] args) {
    int[] wts = {1, 3, 4, 5};
    int[] vals = {1, 4, 5, 7};
    int capacity = 7;
    int n = wts.length;

    int maxVal = knapsackTopDown(wts, vals, capacity, n);
    System.out.println("Maximum value = " + maxVal);
  }

  private static int knapsackTopDown(int[] wts, int[] vals, int capacity, int n) {
    int[][] dp = new int[n + 1][capacity + 1];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= capacity; j++) {
        int currWt=wts[0];
      }
    }
    return 0;
  }
}
