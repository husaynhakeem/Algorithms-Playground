package leetcode.problem_0048;

class Solution_1 {

    void rotate(int[][] grid) {
        for (int i = 0; i < grid.length / 2; i++) {
            rotateHelper(grid, i);
        }
    }

    private void rotateHelper(final int[][] grid, final int layer) {
        final int lastIndex = grid.length - layer - 1;

        // Copy first line into variable
        final int[] firstLine = new int[grid.length - 2 * layer];
        for (int j = layer; j <= lastIndex; j++) {
            firstLine[j - layer] = grid[layer][j];
        }

        // Copy first column into first line
        for (int j = layer; j <= lastIndex; j++) {
            grid[layer][lastIndex - j + layer] = grid[j][layer];
        }

        // Copy last line into first column
        for (int j = layer; j <= lastIndex; j++) {
            grid[j][layer] = grid[lastIndex][j];
        }

        // Copy last column into last line
        for (int j = layer; j <= lastIndex; j++) {
            grid[lastIndex][j] = grid[lastIndex - j + layer][lastIndex];
        }

        // Copy first line into last column
        for (int j = layer; j <= lastIndex; j++) {
            grid[j][grid.length - 1 - layer] = firstLine[j - layer];
        }
    }
}
