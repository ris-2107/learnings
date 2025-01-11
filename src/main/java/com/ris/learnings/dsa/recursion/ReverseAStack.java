package com.ris.learnings.dsa.recursion;

import java.util.Stack;

public class ReverseAStack {

  public static void main(String[] args) {
    // create a stack:
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);

    // reverse:
    reverseStack(stack);

    // print:
    stack.forEach(System.out::println);
  }

  private static void reverseStack(Stack<Integer> stack) {
    if (stack.size() == 1) {
      return;
    }
    int value = stack.pop();
    reverseStack(stack);
    // insert the 'value' at last:
    insertIntoStack(stack, value);
  }

  private static void insertIntoStack(Stack<Integer> stack, int value) {
    if (stack.isEmpty()) {
      stack.push(value);
      return;
    }
    int pop = stack.pop();
    insertIntoStack(stack, value);
    stack.push(pop);
  }
}
