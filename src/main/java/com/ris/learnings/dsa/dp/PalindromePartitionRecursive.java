package com.ris.learnings.dsa.dp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PalindromePartitionRecursive {
  public static void main(String[] args) {
    String s ="NITIK";
    log.info("ANS : {}", palindromePart(s,0,s.length()-1));
  }

  private static int palindromePart(String s, int i, int j) {
    int MIN = Integer.MAX_VALUE;
    // base cases:
    if (i >= j) return 0;
    if (isPalindrome(s, i, j)) {
      return 0;
    }
    for(int k = i; k <= j-1; k++) {
      int leftString = palindromePart(s,i,k);
      int rightString = palindromePart(s,k+1,j);
      int selfPartitionCost = 1;
      int totalCost = leftString +rightString +selfPartitionCost;
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
