package com.ris.practise.dsa.rough;

public class Runner {

    public static class yapper {
        // many nos appear thrice, only 1 appears once
        private static final int[] nums = {1, 1, 1, 12, 12, 12, 9, 9, 9, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5};

        public static void main(String[] args) {
            int ans = 0;
            // iterate over all possible bytes:
            for (int i = 0; i < 32; i++) {
                int count = 0;
                // iterate over all nos from the array and see if the ith bit is set:
                for (int num : nums) {
                    if ((num & (1 << i)) != 0) {
                        count++;
                    }
                }
                if (count % 3 != 0) {
                    // set the bit in the ans:
                    ans = ans | (1 << i);
                }
            }
            System.out.println("Single no is: " + ans);
        }
    }

    public static class rizz {

    }
}
