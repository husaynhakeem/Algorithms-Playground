package leetcode.problem_0348;

public class Solution {

    static class TicTacToe {

        private final char[][] board;
        private final char[] player = {',', 'x', 'o'};

        public TicTacToe(int n) {
            board = new char[n][n];
        }

        public int move(int row, int col, int player) {
            board[row][col] = this.player[player];
            if (isRowFilled(row) || isColumnFilled(col) || (row == col && isDiagonalFilled()) || (row + col == board.length - 1 && isReverseDiagonalFilled())) {
                return player;
            }
            return 0;
        }

        private boolean isRowFilled(final int row) {
            final char first = board[row][0];
            for (int i = 1; i < board.length; i++) {
                if (board[row][i] != first) {
                    return false;
                }
            }
            return true;
        }

        private boolean isColumnFilled(final int col) {
            final char first = board[0][col];
            for (int i = 1; i < board.length; i++) {
                if (board[i][col] != first) {
                    return false;
                }
            }
            return true;
        }

        private boolean isDiagonalFilled() {
            final char first = board[0][0];
            for (int i = 1; i < board.length; i++) {
                if (board[i][i] != first) {
                    return false;
                }
            }
            return true;
        }

        private boolean isReverseDiagonalFilled() {
            final int length = board.length;
            final char first = board[0][length - 1];
            for (int i = 1; i < board.length; i++) {
                if (board[i][length - i - 1] != first) {
                    return false;
                }
            }
            return true;
        }
    }
}
