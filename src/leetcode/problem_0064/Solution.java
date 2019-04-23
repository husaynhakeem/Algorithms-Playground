package leetcode.problem_0064;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    @SuppressWarnings("ConstantConditions")
    int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        final Map<String, Integer> memo = new HashMap<>();
        return minPathSumHelper(0, 0, grid, memo);
    }

    private Integer minPathSumHelper(final int row, final int col, final int[][] grid, final Map<String, Integer> memo) {
        if ((row > grid.length - 1) || (col > grid[0].length - 1)) {
            return null;
        }

        final String key = key(row, col);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        final int val = grid[row][col];
        if ((row == grid.length - 1) && (col == grid[0].length - 1)) {
            return val;
        }

        final Integer down = minPathSumHelper(row + 1, col, grid, memo);
        memo.put(key(row + 1, col), down);

        final Integer right = minPathSumHelper(row, col + 1, grid, memo);
        memo.put(key(row, col + 1), right);

        int sum = 0;
        if (down != null && right != null) {
            sum = val + Math.min(down, right);
        } else if (down == null && right == null) {
            sum = val;
        } else if (down == null) {
            sum = val + right;
        } else {
            sum = val + down;
        }

        memo.put(key, sum);
        return sum;
    }

    private String key(final int row, final int col) {
        return row + "," + col;
    }
}
