package com.ris.practise.dsa.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubsetSumTopDown {

  public static void main(String[] args) {

    int[] inpArr = {2, 3, 7, 8, 10};
    int n = inpArr.length;
    int SUM = 11;
    boolean[][] DP = new boolean[n + 1][SUM + 1];

    // initialise as per req:
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= SUM; j++) {
        if (i == 0) DP[i][j] = false;
        else if (j == 0) {
          DP[i][j] = true;
        }
      }
    }
    DP[0][0] = true;
    log.info("RESULT : {}", subsetSumTopDown(inpArr, n, SUM, DP));
  }

  private static boolean subsetSumTopDown(int[] arr, int n, int SUM, boolean[][] DP) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= SUM; j++) {
            int currElement = arr[i-1];
            if(currElement<=j){
                  boolean isSumPresent = DP[i-1][j-currElement] || DP[i-1][j] ;
                  DP[i][j] = isSumPresent;
            }else {
                  DP[i][j]=DP[i-1][j];
            }
      }
    }
    return DP[n][SUM];
  }
}
