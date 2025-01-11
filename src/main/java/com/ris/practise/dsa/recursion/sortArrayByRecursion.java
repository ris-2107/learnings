package com.ris.practise.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class sortArrayByRecursion {
  public static void main(String[] ar) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,13,12,45,78,39,6));
    list.add(1);
    list.add(40);
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
