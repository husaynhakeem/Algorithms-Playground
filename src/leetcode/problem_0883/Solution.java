package leetcode.problem_0883;

class Solution {

    int projectionArea(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        final int lines = grid.length;
        final int columns = grid[0].length;

        int xy = 0;
        int xz = 0;
        int yz = 0;

        for (int i = 0; i < lines; i++) {
            int max = 0;
            for (int j = 0; j < columns; j++) {
                if (max < grid[i][j]) {
                    max = grid[i][j];
                }

                if (grid[i][j] != 0) {
                    xy++;
                }
            }
            xz += max;
        }

        for (int i = 0; i < columns; i++) {
            int max = 0;
            for (int j = 0; j < lines; j++) {
                if (max < grid[j][i]) {
                    max = grid[j][i];
                }
            }
            yz += max;
        }

        return xy + yz + xz;
    }
}
