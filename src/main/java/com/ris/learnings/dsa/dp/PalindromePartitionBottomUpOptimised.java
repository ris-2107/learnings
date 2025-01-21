package com.ris.learnings.dsa.dp;

public class PalindromePartitionBottomUpOptimised {
  public static void main(String[] args) {}

  private static int palindromePartition(String s, int i, int j, int[][] DP) {
    if (i >= j) return 0;
    if (isPalindrome(s, i, j)) {
      return 0;
    }
    if (DP[i][j] != -1) return DP[i][j];
    int MIN = Integer.MAX_VALUE;
    for (int k = 0; k < j; k++) {
      int left;
      int right;
      if (DP[i][k] != -1) {
        left = DP[i][k];
      } else {
        left = palindromePartition(s, i, k, DP);
        DP[i][k] = left;
      }
      if (DP[k + 1][j] != -1) {
        right = DP[k + 1][j];
      } else {
        right = palindromePartition(s, k + 1, j, DP);
        DP[k + 1][j] = right;
      }
      int selfCost = 1;
      int totalCost = left + right + selfCost;
      MIN = Math.min(MIN, totalCost);
    }
    return MIN;
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
