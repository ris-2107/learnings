package com.ris.learnings.dsa.dp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MatrixChainMultiplication {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 30};
    log.info("Ans. :{}", mcm(arr, 1, arr.length - 1));
  }

  private static int mcm(int[] arr, int i, int j) {
    int min = Integer.MAX_VALUE;
    // base case:
    if (i >= j) {
      return 0;
    }
    for (int k = i; k <= j - 1; k++) {
      int leftPartCost = mcm(arr, i, k);
      int rightPartCost = mcm(arr, k + 1, j);
      int leftXRightMultiplied = leftPartCost + rightPartCost;
      int multiplicationCost = arr[i-1] * arr[k] * arr[j];
      int totalCost = leftXRightMultiplied + multiplicationCost;
      min = Math.min(min, totalCost);
    }
    return min;
  }
}
