package com.ris.learnings.dsa.AlgoExp.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmbiguousMeasurement {
    public static boolean ambiguousMeasurement(List<int[]> measuringCups, int low, int high) {
        Map<String, Boolean> memoTable = new HashMap<>();
        return canMeasureInRange(measuringCups, low, high, memoTable);
    }

    private static boolean canMeasureInRange(
            List<int[]> measuringCups, int low, int high, Map<String, Boolean> memoTable) {
        if (low < 0 && high < 0) {
            return false;
        }

        String memoKey = createKey(low, high);
        if (memoTable.containsKey(memoKey)) {
            return memoTable.get(memoKey);
        }

        boolean canMeasure = false;
        for (int[] cup : measuringCups) {
            int cupLow = cup[0];
            int cupHigh = cup[1];
            // Check if the cup's range is within the specified range
            if (cupLow >= low && cupHigh <= high) {
                canMeasure = true;
                break;
            }

            canMeasure = canMeasureInRange(measuringCups, low - cupLow, high - cupHigh, memoTable);
            if (canMeasure) {
                break;
            }
        }

        memoTable.put(memoKey, canMeasure);
        return canMeasure;
    }

    private static String createKey(int low, int high) {
        return low + ":" + high;
    }

    public static void run() {
        List<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase(List.of(new int[] { 800, 850 }), 2100, 2300)); // Should be False
        testCases.add(new TestCase(
                List.of(new int[] { 200, 210 }, new int[] { 450, 465 }, new int[] { 800, 850 }), 2100, 2300)); // Should
                                                                                                               // be
                                                                                                               // True
        testCases.add(new TestCase(List.of(new int[] { 200, 210 }, new int[] { 250, 260 }, new int[] { 300, 310 }),
                2100, 2300)); // Should be False
        testCases.add(new TestCase(
                List.of(new int[] { 700, 800 }, new int[] { 900, 1000 }, new int[] { 400, 450 }), 2100, 2300)); // Should
                                                                                                                // be
                                                                                                                // True

        for (int i = 0; i < testCases.size(); i++) {
            TestCase test = testCases.get(i);
            boolean result = ambiguousMeasurement(test.measuringCups, test.low, test.high);
            String expected = i == 0 || i == 2 ? "No" : "Yes";
            System.out.printf(
                    "Test Case %d: Can we measure %d-%d? %s (Expected: %s)%n",
                    i + 1, test.low, test.high, result ? "Yes" : "No", expected);
        }
    }

    public static void main(String[] args) {
        run(); // Run the test cases
    }
}

class TestCase {
    List<int[]> measuringCups;
    int low;
    int high;

    public TestCase(List<int[]> measuringCups, int low, int high) {
        this.measuringCups = measuringCups;
        this.low = low;
        this.high = high;
    }
}
