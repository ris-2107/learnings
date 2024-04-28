# Function to check ambiguous measurement with a given range and measuring cups
def ambiguousMeasurement(measuringCups, low, high):
    memoTable = {}
    return canMeasureInRange(measuringCups, low, high, memoTable)

def canMeasureInRange(measuringCups, low, high, memoTable):
    if low < 0 or high < 0:
        return False  # Invalid range
    memoKey = createKey(low, high)
    if memoKey in memoTable:
        return memoTable[memoKey]

    canMeasure = False
    for cup in measuringCups:
        cupLow, cupHigh = cup
        if cupLow >=low and cupHigh <=high: # My Cup's Range Should be in between the range
            canMeasure = True
            break 
        canMeasure = canMeasureInRange(measuringCups, low - cupLow, high - cupHigh, memoTable)
        if canMeasure:
            break

    memoTable[memoKey] = canMeasure
    return canMeasure

def createKey(low, high):
    return f"{low}:{high}"

def run():
    test_cases = [
        # Test case 1: single cup, should be False
        ([(800, 850)], 2100, 2300),
        
        # Test case 2: three cups, should be True
        ([(200, 210), (450, 465), (800, 850)], 2100, 2300),
        
        # Test case 3: edge case with large gaps, should be False
        ([(200, 210), (250, 260), (300, 310)], 2100, 2300),
        
        # Test case 4: overlapping ranges, should be True
        ([(700, 800), (900, 1000), (400, 450)], 2100, 2300),
    ]

    for i, test in enumerate(test_cases):
        measuringCups, low, high = test
        result = ambiguousMeasurement(measuringCups, low, high) 
        expected = "Yes" if i not in [0, 2, 3, 5] else "No"
        print(f"Test Case {i + 1}: Can we measure {low}-{high}? {'Yes' if result else 'No'} (Expected: {expected})")

# Main block to run the test cases
if __name__ == "__main__":
    run()  # Run the test cases
