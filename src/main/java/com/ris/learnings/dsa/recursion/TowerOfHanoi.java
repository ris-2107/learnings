package com.ris.learnings.dsa.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TowerOfHanoi {

  public static void main(String[] args) {
    int n = 4;
    towerOfHanoi(n, 1, 3, 2);
  }

  private static void towerOfHanoi(int n, int source, int destination, int helper) {
    // base case:
    if (n == 1) {
      log.info("Move disk '{}' from {} to {}", n, source, destination);
      return;
    }
    towerOfHanoi(n - 1, source, helper, destination);

  }
}
