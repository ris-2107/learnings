package com.ris.learnings.dsa.AlgoExp.backtracking;

public class SudokuSolver {

    public static boolean solveSudoku(int[][] board) {
        return solveSudokuPartial(board, 0, 0);
    }

    private static boolean solveSudokuPartial(int[][] board, int row, int col) {
        if (col == 9) { // If col reaches 9, move to the next row and reset col
            row++;
            col = 0;
            if (row == 9) { // If row reaches 9, the entire board is processed
                return true;
            }
        }

        if (board[row][col] == 0) { // If the current cell is empty, attempt to solve it
            return tryDigitsAtPosition(board, row, col);
        }

        // Otherwise, move to the next cell in the row
        return solveSudokuPartial(board, row, col + 1);
    }

    private static boolean tryDigitsAtPosition(int[][] board, int row, int col) {
        for (int digit = 1; digit <= 9; digit++) {
            if (isValidAtPosition(board, row, col, digit)) {
                board[row][col] = digit;
                if (solveSudokuPartial(board, row, col + 1)) { // Recursive step
                    return true;
                }
                board[row][col] = 0; // Backtrack if invalid
            }
        }
        return false; // No valid solution found
    }

    private static boolean isValidAtPosition(int[][] board, int row, int col, int value) {
        // Check if the value is in the current row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == value) {
                return false;
            }
        }

        // Check if the value is in the current column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == value) {
                return false;
            }
        }

        // Check if the value is in the corresponding 3x3 subgrid
        int subgridRowStart = (row / 3) * 3;
        int subgridColStart = (col / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[subgridRowStart + i][subgridColStart + j] == value) {
                    return false;
                }
            }
        }

        return true; // If all checks pass, the position is valid
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        // Five Sudoku cases to solve
        int[][][] sudokuCases = {
                {
                        { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                        { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                        { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                        { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                        { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                        { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                        { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                        { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                        { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
                },
                {
                        { 0, 0, 0, 0, 5, 0, 0, 3, 0 },
                        { 1, 0, 7, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 6, 4, 7, 0, 0, 0, 2 },
                        { 0, 9, 1, 0, 0, 0, 0, 0, 6 },
                        { 0, 0, 0, 0, 0, 7, 9, 0, 0 },
                        { 0, 0, 0, 6, 0, 0, 0, 0, 3 },
                        { 0, 0, 0, 9, 1, 0, 0, 8, 7 },
                        { 0, 0, 0, 0, 6, 0, 0, 9, 0 },
                        { 0, 0, 0, 0, 0, 0, 1, 2, 0 }
                },
                {
                        { 0, 0, 0, 6, 0, 4, 0, 0, 0 },
                        { 3, 0, 5, 0, 0, 0, 1, 0, 0 },
                        { 0, 6, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 1, 0, 0, 0, 0, 7 },
                        { 0, 0, 0, 0, 0, 8, 9, 0, 6 },
                        { 0, 1, 0, 7, 3, 0, 0, 0, 0 },
                        { 0, 3, 0, 0, 0, 0, 7, 0, 0 },
                        { 4, 0, 0, 0, 2, 0, 0, 5, 0 },
                        { 5, 0, 1, 0, 0, 0, 0, 0, 0 }
                },
                {
                        { 0, 2, 0, 0, 3, 0, 0, 6, 0 },
                        { 1, 0, 0, 0, 0, 5, 0, 0, 0 },
                        { 0, 0, 3, 0, 0, 0, 0, 0, 2 },
                        { 4, 0, 0, 0, 0, 0, 1, 0, 0 },
                        { 0, 0, 2, 3, 7, 0, 0, 5, 0 },
                        { 0, 0, 7, 0, 0, 0, 0, 0, 3 },
                        { 3, 0, 0, 0, 6, 0, 0, 2, 0 },
                        { 0, 7, 0, 2, 5, 0, 3, 0, 0 },
                        { 0, 1, 0, 0, 0, 8, 0, 0, 0 }
                },
                {
                        { 0, 0, 0, 0, 7, 2, 1, 0, 0 },
                        { 0, 0, 0, 8, 1, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 6, 0, 0, 5, 0 },
                        { 3, 0, 0, 0, 2, 0, 0, 7, 0 },
                        { 0, 0, 1, 0, 0, 0, 0, 0, 2 },
                        { 0, 0, 2, 0, 0, 4, 0, 0, 3 },
                        { 1, 0, 0, 0, 0, 3, 0, 0, 0 },
                        { 0, 5, 0, 0, 0, 0, 0, 1, 0 },
                        { 0, 0, 0, 0, 5, 1, 2, 0, 0 }
                }
        };

        long[] timesTaken = new long[sudokuCases.length]; // Array to store times taken

        // Loop through each Sudoku case
        for (int i = 0; i < sudokuCases.length; i++) {
            int[][] board = sudokuCases[i];

            long startTime = System.currentTimeMillis(); // Record start time
            boolean solved = solveSudoku(board);
            long endTime = System.currentTimeMillis(); // Record end time

            timesTaken[i] = endTime - startTime; // Store elapsed time

            if (solved) {
                System.out.println("Sudoku case " + (i + 1) + " solved in " + timesTaken[i] + " ms.\n");
                printBoard(board); // Display the solved Sudoku
                System.out.println();
            } else {
                System.out.println("Sudoku case " + (i + 1) + " not solved. Time taken: " + timesTaken[i] + " ms.\n");
            }
        }

        System.out.println("Times taken for all cases: " + java.util.Arrays.toString(timesTaken));
    }
}
