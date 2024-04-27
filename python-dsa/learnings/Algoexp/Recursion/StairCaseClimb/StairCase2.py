def stairCaseTraversal(height, maxSteps):
    # Create a list to store the number of ways to reach each step
    waysToTop = [0 for _ in range(height + 1)]
    waysToTop[0] = 1
    waysToTop[1] = 1

    # Compute the number of ways to reach the top for each height
    for currentHeight in range(2, height + 1):
        step = 1
        while step <= currentHeight and step <= maxSteps:
            waysToTop[currentHeight] += waysToTop[currentHeight - step]
            step += 1

    return waysToTop[height]


# Run function to execute test cases
def run():
    # Define some test cases with different heights and max steps
    test_cases = [
        (5, 2),  # Height 5, max steps 2
        (7, 3),  # Height 7, max steps 3
        (10, 4), # Height 10, max steps 4
        (12, 4),  # Height 999, max steps 570
    ]

    for height, maxSteps in test_cases:
        result = stairCaseTraversal(height, maxSteps)  # Calculate the result
        print(f"Number of ways to traverse a staircase with height {height} and max steps {maxSteps}: {result}")


# Execute the run function to test the staircase traversal logic
run()
