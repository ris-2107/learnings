package com.ris.learnings.dsa.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TowerOfHanoi {

  public static void main(String[] args) {
    int n = 3;
    int[] c = {1};
    towerOfHanoi(n, 1, 3, 2, c);
    log.info("Required No. of moves : {}", c[0]);
  }

  /**
   * Approach: First move the 'n-1' discs from the source to Helper, Now the src has just one disc :
   * 'n' th disc. So move the 'n' th disc from the source to the destination, So the 'n' th disc is
   * sorted now. But u still have to deal with the remaining 'n-1' discs. The n-1 discs will now
   * have to go through the process again in order to get placed.
   */
  private static void towerOfHanoi(int n, int source, int destination, int helper, int[] c) {
    // base case:
    if (n == 1) {
      log.info("move disc {} from {} to {}", n, source, destination);
      c[0]++;
      return;
    }
    towerOfHanoi(n - 1, source, helper, destination, c);
    // after the above step, the n-1 discs are sorted,
    log.info("move disc : {}, from {} to {}", n, source, destination);
    c[0]++;
    towerOfHanoi(n - 1, helper, destination, source, c);
  }
}
