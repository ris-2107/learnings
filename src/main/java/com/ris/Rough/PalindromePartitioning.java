/*

    Copyright (c) 2022 PySphere Technologies LLP.

    All rights reserved. Patents pending.

    Responsible: Rishabh Sinha

*/
package com.ris.Rough;

public class PalindromePartitioning
{

    static boolean[][] isPalin;

    public static void isPalindrome (String str)
    {
        int n = str.length();
        isPalin = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            isPalin[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            isPalin[i][i + 1] = str.charAt(i) == str.charAt(i + 1);
        }

        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                isPalin[i][j] =
                    ((str.charAt(i) == str.charAt(j)) && (isPalin[i + 1][j
                        - 1]));
            }
        }
    }

    public static boolean isPalindrome (String str, int i, int j)
    {
        return isPalin[i][j];
    }

    public static int solve (String str, int i, int j, int[][] cache)
    {
        if (i >= j)
            return 0;
        if (cache[i][j] != -1)
            return cache[i][j];
        if (isPalindrome(str, i, j))
            return 0;

        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int leftPart =
                (cache[i][k] == -1) ? solve(str, i, k, cache) : cache[i][k];
            int rightPart = (cache[k + 1][j] == -1) ?
                solve(str, k + 1, j, cache) :
                cache[k + 1][j];
            int temp = 1 + leftPart + rightPart;
            min = Math.min(min, temp);
        }

        cache[i][j] = min;
        return cache[i][j];
    }

    public static void main (String[] args)
    {
        String str = "nitin";
        str = str.toLowerCase();
        int n = str.length();

        isPalindrome(str);

        int[][] cache = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cache[i][j] = -1;
            }
        }

        int result = solve(str, 0, n - 1, cache);
        System.out.println("Minimum cuts required: " + result);
    }
}
