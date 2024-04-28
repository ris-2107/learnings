package com.ris.learnings.dsa.AlgoExp.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PhoneNumberMnemonic {
    static final List<List<String>> DIGIT_LETTERS = Arrays.asList(List.of("0"), List.of("1"),
            Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"), Arrays.asList("g", "h", "i"),
            Arrays.asList("j", "k", "l"), Arrays.asList("m", "n", "o"), Arrays.asList("p", "q", "r", "s"),
            Arrays.asList("t", "u", "v"), Arrays.asList("w", "x", "y", "z"));

    static List<String> phoneNumberMnemonic(String phoneNumber) {
        List<String> currentMnemonic = new ArrayList<>(Arrays.asList(new String[phoneNumber.length()]));
        for (int i = 0; i < phoneNumber.length(); i++) {
            currentMnemonic.set(i, "0");
        }

        List<String> mnemonicFound = new ArrayList<>();
        phoneNumberMnemonicHelper(0, phoneNumber, currentMnemonic, mnemonicFound);
        return mnemonicFound;
    }

    static void phoneNumberMnemonicHelper(int idx, String phoneNumber, List<String> currentMnemonic,
            List<String> mnemonicFound) {
        if (idx == phoneNumber.length()) {
            String mnemonic = String.join("", currentMnemonic);
            mnemonicFound.add(mnemonic);

        } else {
            char digit = phoneNumber.charAt(idx);
            List<String> letters = DIGIT_LETTERS.get(Character.getNumericValue(digit));
            for (String letter : letters) {
                currentMnemonic.set(idx, letter);
                phoneNumberMnemonicHelper(idx + 1, phoneNumber, currentMnemonic, mnemonicFound);
            }
            return;
        }
    }

    public static void main(String[] args) {
        String phoneNumber = "23";
        List<String> possibleCombinations = phoneNumberMnemonic(phoneNumber);
        System.out.println("Possible combinations for phone number " + phoneNumber + " are:");
        System.out.println(possibleCombinations);
    }
}
