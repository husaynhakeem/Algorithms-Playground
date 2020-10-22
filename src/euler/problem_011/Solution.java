package euler.problem_011;

public class Solution {

    public long getGreatestProduct(final int[][] grid) {
        final int rows = grid.length; // Should be 20
        final int cols = grid[0].length; // Should be 20

        long max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 4 adjacent numbers up
                long up = Integer.MIN_VALUE;
                if (i - 3 >= 0) {
                    up = grid[i][j] * grid[i - 1][j] * grid[i - 2][j] * grid[i - 3][j];
                }

                // 4 adjacent numbers down
                long down = Integer.MIN_VALUE;
                if (i + 3 < rows) {
                    down = grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
                }

                // 4 adjacent numbers right
                long right = Integer.MIN_VALUE;
                if (j + 3 < cols) {
                    right = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
                }

                // 4 adjacent numbers left
                long left = Integer.MIN_VALUE;
                if (j - 3 >= 0) {
                    left = grid[i][j] * grid[i][j - 1] * grid[i][j - 2] * grid[i][j - 3];
                }

                // 4 adjacent numbers diagonally
                long diagonal = Integer.MIN_VALUE;
                if (i + 3 < rows && j + 3 < cols) {
                    diagonal = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
                }

                // 4 adjacent numbers reverse diagonally
                long reverseDiagonal = Integer.MIN_VALUE;
                if (i + 3 < rows && j - 3 >= 0) {
                    reverseDiagonal = grid[i][j] * grid[i + 1][j - 1] * grid[i + 2][j - 2] * grid[i + 3][j - 3];
                }

                max = max(max, up, down, right, left, diagonal, reverseDiagonal);
            }
        }

        return max;
    }

    private long max(long... numbers) {
        long max = Integer.MIN_VALUE;
        for (long number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
}
