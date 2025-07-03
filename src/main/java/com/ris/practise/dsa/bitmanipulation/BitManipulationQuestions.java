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


}
