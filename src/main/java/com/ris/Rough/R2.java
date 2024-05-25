package com.ris.Rough;

public class R2 {
    private static boolean isValidAtPosition(int[][] board, int row, int col, int value) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == value)
                return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == value)
                return false;
        }

        // check in 3X3 subgrid:
        int subgridRowStart = (row / 3) * 3;
        int subgridColStart = (col / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[subgridRowStart + i][subgridColStart + j] == 5) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean tryDigitsAtPosition(int[][] board, int row, int col) {
        for (int i = 1; i <= 9; i++) {
            if (isValidAtPosition(board, row, col, i)) {
                board[row][col] = i;

                // progresses further:
//                if ((board, row, col, i + 1)) {
//                    return true;
//                } else {
//                    // Backtrack
//                    board[row][col] = 0;
//                }
            }
        }
        return false;
    }
}
