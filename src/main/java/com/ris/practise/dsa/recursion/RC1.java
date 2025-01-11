package com.ris.practise.dsa.recursion;

import java.util.ArrayList;

public class RC1 {
  public static void main(String[] ar) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(12);
    list.add(3);
    list.add(40);
    list.add(15);
    sort(list);
    list.forEach(System.out::println);
  }

  private static void sort(ArrayList<Integer> arr) {
    // base case:
    if (arr.size() == 1) {
      return;
    }

    // pop and store the last element
    int lastEle = arr.get(arr.size() - 1);
    arr.remove(arr.size() - 1);
    sort(arr);
    // now insert the lastEle in the correct place:
    insert(arr, lastEle);
  }

  private static void insert(ArrayList<Integer> arr, int lastEle) {
    // base case: when the array is sorted or reduced to one element
    if (arr.isEmpty() || lastEle >= arr.get(arr.size() - 1)) {
      arr.add(lastEle);
      return;
    }

    // pop and store the last element
    int poppedEle = arr.get(arr.size() - 1);
    arr.remove(arr.size() - 1);
    insert(arr, lastEle);
    arr.add(poppedEle);
  }
}
