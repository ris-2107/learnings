package com.ris.Rough;

import java.util.Arrays;
import java.util.Map;

public class Runner {
  static int[][] t = new int[1002][1002];

  public static void main(String[] args) {
    int[] wt = {1, 3, 4, 5};
    int[] val = {1, 4, 5, 7};
    int capacity = 7;
    int n = wt.length;

    for (int[] i : t) {
      Arrays.fill(i, -1);
    }

    int maxProfit = knapsack(wt, val, capacity, n);
    System.out.println("Maximum Profit: " + maxProfit);
  }

  private static int knapsack(int[] wt, int[] val, int leftCapacity, int n) {
    if (n == 0 || leftCapacity == 0) {
      return 0;
    }
    if (t[n][leftCapacity] != -1) {
      return t[n][leftCapacity];
    }

    if (wt[n - 1] <= leftCapacity) {
      int includeCase = val[n - 1] + knapsack(wt, val, leftCapacity - wt[n - 1], n - 1);
      int excludeCase = knapsack(wt, val, leftCapacity, n - 1);
      return t[n][leftCapacity] = Math.max(includeCase, excludeCase);
    } else {
      return knapsack(wt, val, leftCapacity, n - 1);
    }
  }
}
