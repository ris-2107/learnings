package com.ris.practise.dsa.bitmanipulation;

public class Swap2Nos {

    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        a = a ^ b;
        b = a ^ b; // =(a^b) ^ b = a^0 = a
        a = a ^ b; // =(a^b) ^ a = 0^b = b
        System.out.println(a);
        System.out.println(b);
    }
}
