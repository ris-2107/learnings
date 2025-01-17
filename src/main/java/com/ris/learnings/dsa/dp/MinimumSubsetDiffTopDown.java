package com.ris.learnings.dsa.dp;

import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MinimumSubsetDiffTopDown {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int ans = msd(arr);
    int n= arr.length;
    int SUM = 3;
    int[][] DP = new int[n + 1][SUM + 1];

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= SUM; j++) {
        if (i == 0) DP[i][j] = 0;
        else if (j == 0) {
          DP[i][j] = 1;
        }
      }
    }
    DP[0][0] = 1;
    int ans2 = noOfSubsetsWithGivenSum(arr, SUM,DP, n);
//    log.info("ANS. : {}", ans);
    log.info("ANS. : {}", ans2);
  }

  private static int msd(int[] arr) {
    int n = arr.length;
    final int TOTAL_SUM = java.util.Arrays.stream(arr).sum();
    boolean[][] DP = new boolean[n + 1][TOTAL_SUM + 1];

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= TOTAL_SUM; j++) {
        if (i == 0) DP[i][j] = false;
        else if (j == 0) {
          DP[i][j] = true;
        }
      }
    }
    DP[0][0] = true;

    subsetSum(arr, TOTAL_SUM, DP, n);

    // now extract the last row of the DP[][] array:
    ArrayList<Integer> validSubsetSums = new ArrayList<>();
    for (int i = 0; i <= TOTAL_SUM / 2; i++) {
      if (DP[n][i]) {
        validSubsetSums.add(i);
      }
    }
    int MIN = Integer.MAX_VALUE;
    for (int i = 0; i < validSubsetSums.size(); i++) {
      MIN = Math.min(MIN, TOTAL_SUM - 2 * validSubsetSums.get(i));
    }
    return MIN;
  }

  private static void subsetSum(int[] arr, int SUM, boolean[][] DP, int n) {
    // the DP Array contains the base condition:
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= SUM; j++) {
        int currEle = arr[i - 1];
        if (currEle <= j) {
          boolean isSubSetSumPresent = DP[i - 1][j - currEle] || DP[i - 1][j];
          DP[i][j] = isSubSetSumPresent;
        } else {
          DP[i][j] = DP[i - 1][j];
        }
      }
    }
  }

  private static int noOfSubsetsWithGivenSum(int[] arr, int SUM, int[][] DP, int n) {
    // the DP Array contains the base condition:
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= SUM; j++) {
        int currEle = arr[i - 1];
        if (currEle <= j) {
          DP[i][j] = DP[i - 1][j - currEle] + DP[i - 1][j];
        } else {
          DP[i][j] = DP[i - 1][j];
        }
      }
    }
    return DP[n][SUM];
  }
}
