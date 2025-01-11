package com.ris.learnings.dsa.recursion;

import java.util.Stack;

public class DeleteMiddleElementFromStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(30);
    stack.push(4);
    stack.push(5);
    int mid = stack.size() / 2 == 0 ? (stack.size() / 2) : (stack.size() / 2 + 1);
    deleteMiddleElementFromStack(stack, mid);
    stack.forEach(System.out::println);
  }

  private static void deleteMiddleElementFromStack(final Stack<Integer> stack, int k) {
    // base condition:
    if (k == 1) {
      stack.pop();
      return;
    }
    int pop = stack.pop();
    deleteMiddleElementFromStack(stack, k - 1);
    stack.push(pop);
  }
}
