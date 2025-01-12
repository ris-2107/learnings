package com.ris.learnings.dsa.recursion;

import java.util.ArrayList;

public class NBitBinaryNumbersGreater1s {

  public static void main(String[] args) {
    ArrayList<String> strings = generateNBitBinaryNumbers(5);
    strings.forEach(System.out::println);
  }

  private static void getNBitBinaryNumbers(
      int ones, int zeros, int n, String op, ArrayList<String> ans) {

    // base condition:
    if (n == 0) {
      ans.add(op);
      return;
    }
    String op1 = op;
    op1 = op1 + "1";
    getNBitBinaryNumbers(ones + 1, zeros, n - 1, op1, ans);

    // is it possible to add zeros ??
    if (ones > zeros) {
      String op2 = op;
      op2 = op2 + "0";
      getNBitBinaryNumbers(ones, zeros + 1, n - 1, op2, ans);
    }
  }

  public static ArrayList<String> generateNBitBinaryNumbers(int n) {
    ArrayList<String> ans = new ArrayList<>();
    getNBitBinaryNumbers(0, 0, n, "", ans);
    return ans;
  }
}
