package com.ris.practise.dsa.AlgoExp.Recusrion;

import java.util.ArrayList;

public class SubsetProblem {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(subset(arrayList));
    }

    public static ArrayList<ArrayList<Integer>> subset(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> subSets = new ArrayList<>();
        subSets.add(new ArrayList<>());

        for (int element : arr) {
            int currentSize = subSets.size();
            for (int i = 0; i < currentSize; i++) {
                ArrayList<Integer> newSubset = new ArrayList<>(subSets.get(i));
                newSubset.add(element);
                subSets.add(newSubset);
            }
        }
        return subSets;
    }
}
