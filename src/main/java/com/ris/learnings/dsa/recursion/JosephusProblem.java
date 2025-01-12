package com.ris.learnings.dsa.recursion;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;

@Slf4j
public class JosephusProblem {
  public static void main(String[] args) {
    int n = 5, k = 2;
    ArrayList<Integer> l = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      l.add(i);
    }
    int josephus = josephus(l, k - 1, 0);
    log.info("Ans: {}", josephus);
  }

  private static int josephus(ArrayList<Integer> personsList, int k, int swordPosition) {
    // base case:
    if (personsList.size() == 1) {
      return personsList.get(0);
    }

    swordPosition = (swordPosition + k) % (personsList.size());
    personsList.remove(swordPosition);
    return josephus(personsList, k, swordPosition);
  }
}
