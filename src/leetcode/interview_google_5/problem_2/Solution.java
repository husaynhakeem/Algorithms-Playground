package leetcode.interview_google_5.problem_2;

public class Solution {

    int numIslands(char[][] grid) {
        final int rows = grid.length;
        if (rows == 0) {
            return 0;
        }
        final int cols = grid[0].length;
        int result = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == '1') {
                    result++;
                    dfs(row, col, rows, cols, grid);
                }
            }
        }

        return result;
    }

    private void dfs(final int row, final int col, final int rows, final int cols, final char[][] grid) {
        if (row >= rows || col >= cols || row < 0 || col < 0 || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';
        dfs(row, col + 1, rows, cols, grid); // right
        dfs(row, col - 1, rows, cols, grid); // left
        dfs(row - 1, col, rows, cols, grid); // up
        dfs(row + 1, col, rows, cols, grid); // down
    }
}
