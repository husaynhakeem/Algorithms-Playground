package leetcode.problem_0048;

class Solution_2 {

    void rotate(int[][] grid) {
        final int length = grid.length;
        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - i - 1; j++) {
                final int temp = grid[i][j];
                grid[i][j] = grid[length - 1 - j][i];
                grid[length - 1 - j][i] = grid[length - 1 - i][length - 1 - j];
                grid[length - 1 - i][length - 1 - j] = grid[j][length - 1 - i];
                grid[j][length - 1 - i] = temp;
            }
        }
    }
}
