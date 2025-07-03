package com.ris.practise.dsa.bitmanipulation;

import java.util.ArrayList;

public class BitManipulationQuestions {

    public static class Swap2Nos {
        public static void main(String[] args) {
            int a = 6;
            int b = 7;
            a = a ^ b;
            b = a ^ b; // =(a^b) ^ b = a^0 = a
            a = a ^ b; // =(a^b) ^ a = 0^b = b
            System.out.println("\nSwapped 2 Nos below :\t");
            System.out.println(a);
            System.out.println(b);
        }
    }

    public static class CheckIfIthBitIsSet {
        // ith bit from right to left:
        public static void main(String[] args) {
            int i = (int) (Math.random() * 10);
            int n = (int) (Math.random() * 10) + (i * 15);
            System.out.println("ith bit checked: " + i + " for number n: " + n);

            // using left shift operator
            if ((n & (1 << i)) != 0) {
                System.out.println("It is set to true");
            } else {
                System.out.println("It is set to false");
            }

            // using right shift operator
            if ((1 & (n >> i)) != 0) {
                System.out.println("It is set to true");
            } else {
                System.out.println("It is set to false");
            }
        }
    }

    public static class setIthBit {
        public static void main(String[] args) {
            int n = Math.abs((int) (Math.random() * 100));
            int i = Math.abs((int) (Math.random() * 10));
            System.out.println(" 'I' is " + i);
            int x = (1 << i);
            System.out.println("Initial Number: " + Integer.toBinaryString(n));
            System.out.println("After Setting ith bit: " + Integer.toBinaryString(n | x));
        }

    }

    public static class clearIthBit {
        public static void main(String[] args) {
            int n = Math.abs((int) (Math.random() * 19840));
            int i = Math.abs((int) (Math.random() * 10));
            System.out.println(" 'I' is " + i);
            int agent = ~(1 << i);
            int ans = (agent & n);
            System.out.println("Initial Number: " + Integer.toBinaryString(n));
            System.out.println("After Clearing ith bit: " + Integer.toBinaryString(ans));
        }
    }

    public static class toggleIthBit {
        public static void main(String[] args) {
            int n = Math.abs((int) (Math.random() * 1973));
            int i = Math.abs((int) (Math.random() * 10));
            int agent = (1 << i);
            int ans = n ^ agent;
            System.out.println("Operation completed at : " + System.currentTimeMillis());
            System.out.println("'I' is " + i);
            System.out.println("Initial Number: " + Integer.toBinaryString(n));
            System.out.println("After Toggling ith bit: " + Integer.toBinaryString(ans));

        }
    }



    // Application Questions

    public static class minFlipsRequiredToConvertANo {
        public static void main(String[] args) {
            int start = 10;
            int goal = 7;
            int xor = start ^ goal; // xor variable 's 1 bits are the bits that need to be flipped
            int c = 0;
            for (int i = 0; i <= 31; i++) {
                if ((xor & (1 << i)) != 0) {
                    c++;
                }
            }
            System.out.println("Min flips required from start " + start + " to goal " + goal + " is: " + c);
        }
    }

    public static class printSubSets {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
            int maxPossibleSubsetsCount = (1 << nums.length);
            for (int i = 0; i < maxPossibleSubsetsCount; i++) {
                ArrayList<Integer> subset = new ArrayList<>();
                for (int j = 0; j < nums.length; j++) {
                    if ((i & (1 << j)) != 0) { // if jth bit is set in i, means we need to take that element:
                        subset.add(nums[j]);
                    }
                }
                subsets.add(subset);
            }
            System.out.println(subsets);
        }


    }

    public static class singleNumber1 {
        static final int[] nums = {1, 1, 2, 4, 4, 5, 5, 6, 6};

        public static void main(String[] args) {
            int ans = 0;
            for (int ele : nums) {
                ans = ans ^ ele;
            }
            System.out.println("The single number is: " + ans);
        }
    }

    public static class singleNumber2 {
        static int[] nums = {1, 1, 1, 2, 4, 5, 6, 4, 4, 5, 5, 6, 6};

        public static void main(String[] args) {
            int ans = 0;
            for (int i = 0; i < 32; i++) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if ((nums[j] & (1 << i)) != 0) {
                        count++;
                    }
                }
                if (count % 3 == 1) {
                    // set the ith bit in ans:
                    ans = ans | (1 << i);
                }
            }
            System.out.println("The single number is: " + ans);
        }
    }


}
