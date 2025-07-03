package com.ris.practise.dsa.bitmanipulation;

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

        }
    }

}
