package leetcode.problem_0054;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] grid) {
        final List<Integer> vals = new ArrayList<>();

        int rows = grid.length;
        if (rows == 0) {
            return vals;
        }
        int cols = grid[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        while (top <= bottom && left <= right) {
            // Top
            for (int i = left; i <= right; i++) {
                vals.add(grid[top][i]);
            }
            top++;

            // Right
            for (int i = top; i <= bottom; i++) {
                vals.add(grid[i][right]);
            }
            right--;

            // Bottom
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    vals.add(grid[bottom][i]);
                }
            }
            bottom--;

            // Left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    vals.add(grid[i][left]);
                }
            }
            left++;
        }

        return vals;
    }
}
