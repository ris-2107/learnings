# Complete mapping of digits to corresponding letter sequences
DIGIT_LETTERS = {
    "0": ["0"],
    "1": ["1"],
    "2": ["a", "b", "c"],
    "3": ["d", "e", "f"],
    "4": ["g", "h", "i"],
    "5": ["j", "k", "l"],
    "6": ["m", "n", "o"],
    "7": ["p", "q", "r", "s"],
    "8": ["t", "u", "v"],
    "9": ["w", "x", "y", "z"]
}

# Function to generate all possible mnemonics from a given phone number
def phone_number_mnemonic(phoneNumber):
    # Start with an array of the same length as the phone number, filled with '0's
    currentMnemonic = ['0'] * len(phoneNumber)
    mnemonicFound = []
    # Helper function to recursively generate all combinations
    phone_number_mnemonic_helper(0, phoneNumber, currentMnemonic, mnemonicFound)
    return mnemonicFound

# Recursive helper function to build mnemonics
def phone_number_mnemonic_helper(idx, phoneNumber, currentMnemonic, mnemonicFound):
    if idx == len(phoneNumber):
        # If the index reaches the length of the phone number, join the current mnemonic and add it to the list
        mnemonic = ''.join(currentMnemonic)
        mnemonicFound.append(mnemonic)
    else:
        # Get the digit at the current index
        digit = phoneNumber[idx]
        # Get the corresponding letters for this digit
        letters = DIGIT_LETTERS[digit]
        # Recursively try each letter
        for letter in letters:
            currentMnemonic[idx] = letter
            phone_number_mnemonic_helper(idx + 1, phoneNumber, currentMnemonic, mnemonicFound)

# Example usage
phone_number = "1905"  # Example input phone number
possible_combinations = phone_number_mnemonic(phone_number)

# Display the possible combinations for the given phone number
print("Possible combinations for phone number", phone_number, "are:")
print(possible_combinations)  # This should print all possible mnemonics for the phone number
