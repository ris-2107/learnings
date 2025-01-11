package com.ris.learnings.dsa.recursion;

import java.util.Stack;

public class SortAStackUsingRecursion {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(11);
    stack.push(2);
    stack.push(39);
    stack.push(14);
    stack.push(5);
    sortStack(stack);
    stack.forEach(System.out::println);
  }

  private static void sortStack(Stack<Integer> stack) {
    // base condition:
    if (stack.size() == 1) {
      return;
    }
    // pop and store the last element:
    int poppedElement = stack.pop();
    sortStack(stack); //  hoping this returns the sorted stack.
    // insert the poppedElement correctly:
    insertIntoStack(stack, poppedElement);
  }

  private static void insertIntoStack(Stack<Integer> stack, int ele) {
    // base case | <> If the stack is empty | <> If the ele is greater than the stack's
    // last element, then just add the element into the last of stack and return
    if (stack.isEmpty() || stack.get(stack.size() - 1) <= ele) {
      stack.push(ele);
      return;
    }

    // pick out the last element
    int poppedElement = stack.pop();
    insertIntoStack(stack, ele);
    stack.push(poppedElement);
  }
}
