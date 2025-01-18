package com.ris.learnings.dsa.dp;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MatrixChainMultiplicationMemoized {
  public static void main(String[] args) {
    int[] arr = {40, 20, 30, 10, 30};
    int n = arr.length;

    int[][] DP = new int[n + 1][n + 1];
    for (int i = 0; i < DP.length; i++) {
      Arrays.fill(DP[i], -1);
    }
    int ans = mcm(arr, 1, n - 1, DP);
    log.info("ANS : {}", ans);
  }

  private static int mcm(int[] arr, int i, int j, int[][] DP) {
    if (i >= j) {
      return 0;
    }
    int MIN = Integer.MAX_VALUE;
    if (DP[i][j] != -1) return DP[i][j];
    for (int k = i; k <= j - 1; k++) {
      int leftSubArray = mcm(arr, i, k, DP);
      int rightSubArray = mcm(arr, k + 1, j, DP);
      int leftXRightMultiplicationCost = arr[i - 1] * arr[k] * arr[j];
      int totalCost = leftXRightMultiplicationCost + leftSubArray + rightSubArray;
      MIN = Math.min(MIN, totalCost);
    }
    return MIN;
  }
}
