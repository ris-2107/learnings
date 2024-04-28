def solve_sudoku(board):
    return solve_sudoku_partial(board, 0, 0)

def solve_sudoku_partial(board, row, col):
    # If col reaches 9, move to the next row and reset col to 0
    if col == 9:
        row += 1
        col = 0
        # If row reaches 9, the entire board has been processed
        if row == 9:
            return True

    # If the current cell is empty, attempt to solve it
    if board[row][col] == 0:
        return try_digits_at_position(board, row, col)

    # Otherwise, move to the next cell in the row
    return solve_sudoku_partial(board, row, col + 1)

def try_digits_at_position(board, row, col):
    for digit in range(1, 10):  # Digits 1 through 9
        if is_valid_at_position(board, row, col, digit):
            board[row][col] = digit
            # If the recursive step is successful, the puzzle is solved
            if solve_sudoku_partial(board, row, col + 1):
                return True
            # If not, backtrack by resetting the current cell
            board[row][col] = 0
    return False

def is_valid_at_position(board, row, col, value):
    if value in board[row]:
        return False
    
    if value in [board[i][col] for i in range(9)]:
        return False
    
    # Check if the value is in the corresponding 3x3 subgrid
    subgrid_row_start = (row // 3) * 3
    subgrid_col_start = (col // 3) * 3
    
    for i in range(3):
        for j in range(3):
            if board[subgrid_row_start + i][subgrid_col_start + j] == value:
                return False

    return True

sudoku_board = [
    [5, 3, 0, 0, 7, 0, 0, 0, 0],
    [6, 0, 0, 1, 9, 5, 0, 0, 0],
    [0, 9, 8, 0, 0, 0, 0, 6, 0],
    [8, 0, 0, 0, 6, 0, 0, 0, 3],
    [4, 0, 0, 8, 0, 3, 0, 0, 1],
    [7, 0, 0, 0, 2, 0, 0, 0, 6],
    [0, 6, 0, 0, 0, 0, 2, 8, 0],
    [0, 0, 0, 4, 1, 9, 0, 0, 5],
    [0, 0, 0, 0, 8, 0, 0, 7, 9],
]

# Solve the Sudoku
solve_sudoku(sudoku_board)

# Display the solved Sudoku board
for row in sudoku_board:
    print(row)
