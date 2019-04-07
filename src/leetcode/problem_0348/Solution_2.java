package leetcode.problem_0348;

public class Solution_2 {

    static class TicTacToe {

        private int[] rows;
        private int[] cols;
        private int diagonal;
        private int reverseDiagonal;

        public TicTacToe(int n) {
            rows = new int[n];
            cols = new int[n];
        }

        public int move(int row, int col, int player) {
            final int add = player == 1 ? 1 : -1;
            rows[row] += add;
            cols[col] += add;
            if (row == col) {
                diagonal += add;
            }
            if (row + col == rows.length - 1) {
                reverseDiagonal += add;
            }

            if (isRowFilled(row) || isColumnFilled(col) || isDiagonalFilled() || isReverseDiagonalFilled()) {
                return player;
            }

            return 0;
        }

        private boolean isRowFilled(final int row) {
            return Math.abs(rows[row]) == rows.length;
        }

        private boolean isColumnFilled(final int col) {
            return Math.abs(cols[col]) == cols.length;
        }

        private boolean isDiagonalFilled() {
            return Math.abs(diagonal) == rows.length;
        }

        private boolean isReverseDiagonalFilled() {
            return Math.abs(reverseDiagonal) == rows.length;
        }
    }
}
