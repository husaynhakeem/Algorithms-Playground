package leetcode.interview_amazon_2.problem_3;

public class Solution {

    private static final char WATER = '0';
    private static final char LAND = '1';
    private static final char SEEN = '2';
    private static final int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
    };

    int numIslands(char[][] grid) {
        final int rows = grid.length;
        if (rows == 0) {
            return 0;
        }
        final int cols = grid[0].length;

        int islands = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isIsland(grid, i, j, rows, cols)) {
                    islands++;
                }
            }
        }

        return islands;
    }

    private boolean isIsland(final char[][] grid, final int row, final int col, final int rows, final int cols) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == WATER || grid[row][col] == SEEN) {
            return false;
        }

        grid[row][col] = SEEN;

        for (final int[] direction : directions) {
            isIsland(grid, row + direction[0], col + direction[1], rows, cols);
        }

        return true;
    }
}
