package com.ris.Rough;

import java.util.ArrayList;

public class R1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
        ansList.add(new ArrayList<>());
        System.out.println("SIZE BEFORE: " + ansList.size());
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        powerset(arrayList, ansList);
        System.out.println("SIZE After: " + ansList.size());

    }

    public static void powerset(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ansList) {
        for (int ele : arr) {
            int sz = ansList.size();
            for (int i = 0; i < sz; i++) {
                ArrayList<Integer> newSubset = ansList.get(i);
                newSubset.add(ele);
                ansList.add(newSubset);
            }
        }
    }
}
