package com.ris.learnings.dsa.recursion;

// leetcode question
public class KthSymbolInGrammar {
  public static void main(String[] args) {}

  private static int grammar(int n, int k) {

    // base condition:
    if (n == 1 && k == 1) {
      return 0;
    }
    // parent position:
    int parent = (k + 1) / 2;

    int parentValue = grammar(n - 1, parent);

    if (k % 2 == 0) {
      return 1 - parentValue;
    } else {
      return parentValue;
    }
  }
}
