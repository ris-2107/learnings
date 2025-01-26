package com.ris.learnings.dsa.dp;

public class BooleanParenthesesRecursive {
  // given a string :
  public static void main(String[] args) {
    String s = "kl";
  }

  private static boolean booleanP(String s, int i, int j, boolean flag) {
    if (i > j) return false;
    // single character:
    if (i == j) {
      if (flag) {
        if (s.charAt(i) == 'T') return true;
      } else if (s.charAt(i) == 'F') return true;
    }
    for (int k = i + 1; k < j; k = k + 2) {
      boolean leftTrue = booleanP(s, i, k - 1, true);
      boolean leftFalse = booleanP(s, i, k - 1, false);
      boolean rightTrue = booleanP(s, k + 1, j, true);
      boolean rightFalse = booleanP(s, k + 1, j, false);
    }
    return false; // remove this later...
  }
}
