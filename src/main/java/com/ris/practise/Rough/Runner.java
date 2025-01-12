package com.ris.practise.Rough;

import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    ArrayList<Integer> ar = new ArrayList<>();
    ar.add(1);
    ar.add(2);
    ar.add(3);
    ar.add(4);
    ar.add(5);
    reverseArray(ar);
    ar.forEach(System.out::println);
  }

  private static void reverseArray(ArrayList<Integer> arr) {
    // base case:
    if (arr.size() == 1) {
      return;
    }

    int poppedEle = arr.get(arr.size() - 1);
    arr.remove(arr.size() - 1);
    reverseArray(arr);
    insertEle(arr, poppedEle);
  }

  private static void insertEle(ArrayList<Integer> arr, int element) {
    // base case:
    if (arr.isEmpty()) {
      arr.add(element);
      return;
    }
    int poppedElement = arr.get(arr.size() - 1);
    arr.remove(arr.size() - 1);
    insertEle(arr, element);
    arr.add(poppedElement);
  }
}
