# Function to generate all permutations
def permutations(array):
    ans = []  # List to store all permutations
    permutationsHelper(0, array, ans)  # Generate permutations
    return ans

# Recursive helper function to generate permutations
def permutationsHelper(i, array, ans):
    if i == len(array) - 1:
        ans.append(array[:])  # Append a copy of the current permutation
    else:
        for j in range(i, len(array)):
            swap(array, i, j)  # Swap elements
            permutationsHelper(i + 1, array, ans)  # Recur with the next index
            swap(array, i, j)  # Swap back to restore original order

# Function to swap elements in an array
def swap(array, i, j):
    array[i], array[j] = array[j], array[i]

# Test cases with some sample input arrays
def run():
    test_cases = [
        [1, 2, 3],  # Example array for permutations
        [1, 2],     # Smaller array
        [1],        # Single-element array
    ]

    for array in test_cases:
        permutations_result = permutations(array)  # Get permutations
        print(f"Permutations for {array}: {permutations_result}")

# Main block to execute the test cases
if __name__ == "__main__":
    run()  # Run the test cases
