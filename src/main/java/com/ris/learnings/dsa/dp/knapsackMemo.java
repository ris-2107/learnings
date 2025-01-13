package com.ris.learnings.dsa.dp;

import java.util.Arrays;

public class knapsackMemo {
  static final int[][] t = new int[1002][1002];

  public static void main(String[] args) {

    for (int i = 0; i < t.length; i++) {
      Arrays.fill(t[i], -1);
    }

  }

  private static int knapsack(int[] wt, int[] val, int cap, int n) {
    if (n == 0 || cap == 0) {
      return 0;
    }
    if (wt[n - 1] <= cap) {
      if (t[n][cap] != -1) {
        return t[n][cap];
      }

      int include = knapsack(wt, val, cap - wt[n - 1], n - 1);
      int exclude = knapsack(wt, val, cap, n - 1);
      return t[n][cap] = Math.max(include, exclude);
    } else {
      return knapsack(wt, val, cap, n - 1);
    }
  }
}
