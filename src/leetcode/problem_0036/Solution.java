package leetcode.problem_0036;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("UnnecessaryLocalVariable")
public class Solution {

    private static final int SIZE = 9;
    private static final int SUB_BOX_SIZE = 3;

    public boolean isValidSudoku(char[][] board) {
        final Set<Integer> seen = new HashSet<>(SIZE);

        // Validate rows
        for (int row = 0; row < SIZE; row++) {
            if (!isValidRow(board, row, seen)) {
                return false;
            }
            seen.clear();
        }

        // Validate columns
        for (int col = 0; col < SIZE; col++) {
            if (!isValidCol(board, col, seen)) {
                return false;
            }
            seen.clear();
        }

        // Validate sub boxes
        for (int row = 0; row < SIZE; row += SUB_BOX_SIZE) {
            for (int col = 0; col < SIZE; col += SUB_BOX_SIZE) {
                if (!isValidSubBox(board, row, col, seen)) {
                    return false;
                }
                seen.clear();
            }
        }

        return true;
    }

    private boolean isValidRow(char[][] board, int row, final Set<Integer> seen) {
        for (int i = 0; i < SIZE; i++) {
            final char c = board[row][i];
            if (isValidDigit(c)) {
                final int digit = c;
                if (seen.contains(digit)) {
                    return false;
                }
                seen.add(digit);
            }
        }
        return true;
    }

    private boolean isValidCol(char[][] board, int col, final Set<Integer> seen) {
        for (int i = 0; i < SIZE; i++) {
            final char c = board[i][col];
            if (isValidDigit(c)) {
                final int digit = c;
                if (seen.contains(digit)) {
                    return false;
                }
                seen.add(digit);
            }
        }
        return true;
    }

    private boolean isValidSubBox(char[][] board, int row, int col, final Set<Integer> seen) {
        for (int i = row; i < row + SUB_BOX_SIZE; i++) {
            for (int j = col; j < col + SUB_BOX_SIZE; j++) {
                final char c = board[i][j];
                if (isValidDigit(c)) {
                    final int digit = c;
                    if (seen.contains(digit)) {
                        return false;
                    }
                    seen.add(digit);
                }
            }
        }
        return true;
    }

    private boolean isValidDigit(char c) {
        return c >= '1' && c <= '9';
    }
}
