package leetcode.problem_0994;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private static final int NO_RESULT = -1;
    private static final int FRESH = 1;
    private static final int ROTTEN = 2;
    private static final int[][] ADJ = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    static class OrangeWithTime {
        int x, y, minutes;

        OrangeWithTime(int x, int y, int minutes) {
            this.x = x;
            this.y = y;
            this.minutes = minutes;
        }
    }

    public int orangesRotting(int[][] matrix) {
        final Queue<OrangeWithTime> rottenOranges = new LinkedList<>();
        int freshOranges = 0;
        int minMinutes = 0;

        final int rows = matrix.length;
        final int cols = matrix[0].length; // Assumes at least one row

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == FRESH) {
                    freshOranges++;
                } else if (matrix[i][j] == ROTTEN) {
                    rottenOranges.offer(new OrangeWithTime(i, j, 0));
                }
            }
        }

        while (!rottenOranges.isEmpty()) {
            final OrangeWithTime orange = rottenOranges.poll();
            for (int[] direction : ADJ) {
                final int x = orange.x + direction[0];
                final int y = orange.y + direction[1];
                if (x < 0 || x >= rows || y < 0 || y >= cols) {
                    continue;
                }
                if (matrix[x][y] == FRESH) {
                    matrix[x][y] = ROTTEN;
                    minMinutes = Math.max(minMinutes, orange.minutes + 1);
                    freshOranges--;
                    rottenOranges.offer(new OrangeWithTime(x, y, orange.minutes + 1));
                }
            }
        }

        return freshOranges > 0 ? NO_RESULT : minMinutes;
    }
}
