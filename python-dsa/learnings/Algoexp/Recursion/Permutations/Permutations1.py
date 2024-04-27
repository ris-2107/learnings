# Function to generate all permutations of a given array
def getPermutations(array):
    permutations = []  # List to store all permutations
    permutationsHelper(array, [], permutations)
    return permutations

# Recursive helper function to generate permutations
def permutationsHelper(array, currentPerm, permutations):
    # If the array is empty and current permutation has elements, it's complete
    if not array and currentPerm:
        permutations.append(currentPerm)
    else:
        # Generate permutations by iterating over elements and recursively processing the rest
        for i in range(len(array)):
            newArray = array[:i] + array[i + 1:]  # Remaining elements
            newPerm = currentPerm + [array[i]]  # Add current element to permutation
            permutationsHelper(newArray, newPerm, permutations)

# Test case with specific inputs
def run():
    test_cases = [
        [1, 2, 3],  # Example array for permutations
        [1, 2,3,4], # Bigger array
        [1],        # Single-element array
    ]

    for array in test_cases:
        permutations = getPermutations(array)  # Get permutations
        print(f"Permutations for {array}: {permutations}")

# Main block to execute the test cases
if __name__ == "__main__":
    run()  # Run the test cases
