package leetcode.interview_google_3.problem_4;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    int longestIncreasingPath(int[][] matrix) {
        final int rows = matrix.length;
        if (rows == 0) {
            return 0;
        }
        final int cols = matrix[0].length;
        final Map<String, Integer> memo = new HashMap<>();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                helper(matrix, rows, cols, row, col, memo);
            }
        }

        return max(memo);
    }

    private int helper(final int[][] matrix, final int rows, final int cols, final int row, final int col, final Map<String, Integer> memo) {
        final String key = key(row, col);

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (row >= rows || col >= cols) {
            return 0;
        }

        final int right = (col < cols - 1 && matrix[row][col] < matrix[row][col + 1]) ? helper(matrix, rows, cols, row, col + 1, memo) : 0;
        final int left = (col > 0 && matrix[row][col] < matrix[row][col - 1]) ? helper(matrix, rows, cols, row, col - 1, memo) : 0;
        final int top = (row > 0 && matrix[row][col] < matrix[row - 1][col]) ? helper(matrix, rows, cols, row - 1, col, memo) : 0;
        final int bottom = (row < rows - 1 && matrix[row][col] < matrix[row + 1][col]) ? helper(matrix, rows, cols, row + 1, col, memo) : 0;

        memo.put(key, 1 + max(right, left, top, bottom));
        return memo.get(key);
    }

    private int max(final int a, final int b, final int c, final int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    private int max(final Map<String, Integer> map) {
        int max = 0;
        for (int i : map.values()) {
            max = Math.max(max, i);
        }
        return max;
    }

    private String key(final int row, final int column) {
        return row + "," + column;
    }
}
