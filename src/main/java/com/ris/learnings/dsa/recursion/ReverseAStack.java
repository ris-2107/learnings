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

            if(stack.size()==1){
                  return;
            }
            int temp = stack.pop();
            reverseStack(stack);
            insertIntoStack(stack, temp);

      }

      private static void insertIntoStack(Stack<Integer> stack, int val){
            if(stack.isEmpty()) {
                  stack.push(val);
                  return;
            }
            int temp =  stack.pop();
            insertIntoStack(stack,val);
            stack.push(temp);
      }


}
