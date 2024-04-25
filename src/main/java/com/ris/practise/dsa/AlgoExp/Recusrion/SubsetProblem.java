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

    static ArrayList<ArrayList<Integer>> subset(ArrayList<Integer> arrayList) {
        ArrayList<ArrayList<Integer>> subSet = new ArrayList<>();
        subSet.add(new ArrayList<>());
        for (int ele : arrayList) {
            int currSize = subSet.size();
            for (int i = 0; i < currSize; i++) {
                ArrayList<Integer> newSubSet = new ArrayList<>(subSet.get(i));
                newSubSet.add(ele);
                subSet.add(newSubSet);
            }
        }
        return subSet;
    }

}
