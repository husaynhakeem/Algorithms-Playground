package leetcode.interview_uber_2.problem_2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private final int[][] DIRECTIONS = {
            {-1, 0}, // top
            {0, 1}, // right
            {1, 0}, // bottom
            {0, -1} // left
    };

    int[][] updateMatrix(final int[][] grid) {
        final int rows = grid.length;
        final int cols = grid[0].length;

        final Queue<int[]> queue = new LinkedList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 0) {
                    queue.add(new int[]{row, col});
                } else {
                    grid[row][col] = Integer.MAX_VALUE;
                }
            }
        }

        while (!queue.isEmpty()) {
            final int[] item = queue.poll();
            for (final int[] direction : DIRECTIONS) {
                final int row = item[0] + direction[0];
                final int col = item[1] + direction[1];
                if (coordinatesAreValid(row, rows, col, cols) && grid[row][col] > grid[item[0]][item[1]] + 1) {
                    grid[row][col] = grid[item[0]][item[1]] + 1;
                    queue.offer(new int[]{row, col});
                }
            }
        }

        return grid;
    }

    private boolean coordinatesAreValid(final int row, final int rows, final int col, final int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
