import time

# Memoized staircase traversal with height and maximum steps
def stairCaseTraversal(height, maxSteps):
    # Create a dictionary to store memoized results
    memo = {}
    return helper(height, maxSteps, memo)

def helper(height, maxSteps, memo):
    if height <= 1:
        return 1

    # If we've already computed the result for this height, return it
    if height in memo:
        return memo[height]

    # Initialize the number of ways
    noOfWays = 0

    # Calculate the minimum of height and maxSteps for the loop condition
    for i in range(1, min(height, maxSteps) + 1):
        # Add the result of the recursive call to the total number of ways
        noOfWays += helper(height - i, maxSteps, memo)

    # Store the result in the memoization dictionary
    memo[height] = noOfWays

    return noOfWays

# Example usage with time measurement
height = 998  # Number of steps
maxSteps = 570  # Maximum steps allowed in one move

# Record the start time in nanoseconds
start_time = time.perf_counter()

# Compute the result
result = stairCaseTraversal(height, maxSteps)

# Record the end time in nanoseconds
end_time = time.perf_counter()

# Calculate the duration in nanoseconds
duration_ns = (end_time - start_time) * 1_000_000_000  # Convert from seconds to nanoseconds

print("Number of ways to traverse a staircase with height", height, "and max steps", maxSteps, ":", result)
print("Execution time: {:.2f} ns".format(duration_ns))  # Print the execution time in nanoseconds
