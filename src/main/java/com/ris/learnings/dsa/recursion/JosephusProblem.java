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

  private static int josephus(ArrayList<Integer> n, int k, int idx) {
    if (n.size() == 1) {
      return n.get(0);
    }
    idx = (idx + k) % (n.size());
    n.remove(idx);
    return josephus(n, k, idx);
  }
}
