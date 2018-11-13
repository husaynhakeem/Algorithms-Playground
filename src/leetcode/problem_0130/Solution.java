package leetcode.problem_0130;

class Solution {

    void solve(char[][] board) {
        final int rows = board.length;
        if (rows == 0) {
            return;
        }
        final int columns = board[0].length;
        if (rows <= 2 || columns <= 2) {
            return;
        }

        // top and bottom
        for (int i = 0; i < columns; i++) {
            checkFromBoundary(board, 0, i);
            checkFromBoundary(board, rows - 1, i);
        }

        // Right and left
        for (int i = 0; i < rows; i++) {
            checkFromBoundary(board, i, 0);
            checkFromBoundary(board, i, columns - 1);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void checkFromBoundary(final char[][] board, final int row, final int column) {
        if (row < 0 || column < 0 || row >= board.length || column >= board[0].length || board[row][column] != 'O') {
            return;
        }
        board[row][column] = '*';
        checkFromBoundary(board, row - 1, column);
        checkFromBoundary(board, row, column - 1);
        checkFromBoundary(board, row, column + 1);
        checkFromBoundary(board, row + 1, column);
    }
}
