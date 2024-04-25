package com.ris.learnings.dsa.AlgoExp.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Complete mapping of digits to corresponding letter sequences
class PhoneNumberMnemonic {

    // Mapping digits to corresponding letter sequences
    static final List<List<String>> DIGIT_LETTERS = Arrays.asList(List.of("0"), List.of("1"), Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"), Arrays.asList("g", "h", "i"), Arrays.asList("j", "k", "l"), Arrays.asList("m", "n", "o"), Arrays.asList("p", "q", "r", "s"), Arrays.asList("t", "u", "v"), Arrays.asList("w", "x", "y", "z"));

    // Function to generate all possible mnemonics from a given phone number
    static List<String> phoneNumberMnemonic(String phoneNumber) {
        // Start with an array of the same length as the phone number, filled with '0's
        List<String> currentMnemonic = new ArrayList<>(Arrays.asList(new String[phoneNumber.length()]));
        for (int i = 0; i < phoneNumber.length(); i++) {
            currentMnemonic.set(i, "0");
        }

        List<String> mnemonicFound = new ArrayList<>();
        // Helper function to recursively generate all combinations
        phoneNumberMnemonicHelper(0, phoneNumber, currentMnemonic, mnemonicFound);
        return mnemonicFound;
    }

    // Recursive helper function to build mnemonics
    static void phoneNumberMnemonicHelper(int idx, String phoneNumber, List<String> currentMnemonic, List<String> mnemonicFound) {
        if (idx == phoneNumber.length()) {

            // If the index reaches the length of the phone number, join the current mnemonic and add it to the list
            String mnemonic = String.join("", currentMnemonic);
            mnemonicFound.add(mnemonic);

        } else {

            // Get the digit at the current index
            char digit = phoneNumber.charAt(idx);

            // Get the corresponding letters for this digit
            List<String> letters = DIGIT_LETTERS.get(Character.getNumericValue(digit));

            // Recursively try each letter
            for (String letter : letters) {
                currentMnemonic.set(idx, letter);
                phoneNumberMnemonicHelper(idx + 1, phoneNumber, currentMnemonic, mnemonicFound);
            }
        }
    }

    public static void main(String[] args) {
        String phoneNumber = "1905"; // Example input phone number
        List<String> possibleCombinations = phoneNumberMnemonic(phoneNumber);

        // Display the possible combinations for the given phone number
        System.out.println("Possible combinations for phone number " + phoneNumber + " are:");
        System.out.println(possibleCombinations);
    }
}
