package com.ris.learnings.dsa.recursion;

public class Print1ToN {
    public static void main(String[] args) {
        rec(7);
    }

    public static void rec(int n) {
        if (n == 1) {
            System.out.print(n+", ");
            return;
        }
        rec(n - 1);
        System.out.print(n + ", ");

    }
}
