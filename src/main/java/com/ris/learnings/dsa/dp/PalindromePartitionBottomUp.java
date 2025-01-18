package com.ris.learnings.dsa.dp;

import java.util.Arrays;

public class PalindromePartitionBottomUp {
  public static void main(String[] args) {
    String s = "NITIK";
    int n = s.length();
    int[][] DP = new int[n + 1][n + 1];
    for (int i = 0; i < DP.length; i++) {
      Arrays.fill(DP[i], -1);
    }
    pp(s, 0, n - 1, DP);
  }

  private static int pp(String s, int i, int j, int[][] DP) {
    int MIN = Integer.MAX_VALUE;
    if (i >= j) {
      return 0;
    }
    if (isPalindrome(s, i, j)) return 0;
    if (DP[i][j] != -1) return DP[i][j];
    for (int k = 0; k <= j - 1; k++) {
      int leftSubstring = pp(s, i, k, DP);
      int rightSubstring = pp(s, k + 1, j, DP);
      int selfPartitionCost = 1;
      int totalCost = leftSubstring + rightSubstring + selfPartitionCost;
      MIN = Math.min(totalCost, MIN);
    }
    return DP[i][j] = MIN;
  }

  private static boolean isPalindrome(String s, int i, int j) {
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) return false;
      i++;
      j--;
    }
    return true;
  }
}
