package leetcode.problem_0200;

class Solution {

    int numIslands(char[][] grid) {
        final int lines = grid.length;
        if (lines == 0) {
            return 0;
        }
        final int columns = grid[0].length;
        int result = 0;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    dfs(i, j, lines, columns, grid);
                }
            }
        }

        return result;
    }

    private void dfs(final int i, final int j, final int lines, final int columns, final char[][] grid) {
        if (i < 0 || i >= lines || j < 0 || j >= columns || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(i - 1, j, lines, columns, grid); // top
        dfs(i + 1, j, lines, columns, grid); // bottom
        dfs(i, j + 1, lines, columns, grid); // right
        dfs(i, j - 1, lines, columns, grid); // left
    }
}
