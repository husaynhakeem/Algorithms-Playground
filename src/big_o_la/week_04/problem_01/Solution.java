package big_o_la.week_04.problem_01;

class Solution {

    int zombieClusters(final int[][] grid) {
        final int lines = grid.length;
        final int columns = lines > 0 ? grid[0].length : 0;

        if (lines == 0 || columns == 0) {
            return 0;
        }

        final boolean[][] isAlreadyInCluster = new boolean[lines][columns];
        int result = 0;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                result += zombieClustersHelper(grid, i, j, isAlreadyInCluster);
            }
        }

        return result;
    }

    private int zombieClustersHelper(final int[][] grid, final int line, final int column, final boolean[][] isAlreadyInCluster) {
        if (line >= grid.length || column >= grid[0].length) {
            return 0;
        }

        if (grid[line][column] == 0 || isAlreadyInCluster[line][column]) {
            return 0;
        }

        isAlreadyInCluster[line][column] = true;

        zombieClustersHelper(grid, line + 1, column, isAlreadyInCluster);
        zombieClustersHelper(grid, line, column + 1, isAlreadyInCluster);

        return 1;
    }
}
