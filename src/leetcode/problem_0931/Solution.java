package leetcode.problem_0931;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final int MAX = 101;

    int minFallingPathSum(final int[][] matrix) {
        final int side = matrix.length - 1;
        final Map<String, Integer> memo = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int column = 0; column <= side; column++) {
            min = Math.min(min, minFallingPathSumHelper(matrix, 0, column, side, memo));
        }

        return min;
    }

    private int minFallingPathSumHelper(final int[][] matrix, final int row, final int column, final int side, Map<String, Integer> memo) {
        if (memo.containsKey(row + "," + column)) {
            return memo.get(row + "," + column);
        }

        if (row < 0 || row > side || column < 0 || column > side) {
            return MAX;
        }

        final int downLeft = minFallingPathSumHelper(matrix, row + 1, column - 1, side, memo);
        final int down = minFallingPathSumHelper(matrix, row + 1, column, side, memo);
        final int downRight = minFallingPathSumHelper(matrix, row + 1, column + 1, side, memo);
        final int sum = matrix[row][column] + min(downLeft, down, downRight);

        memo.put(row + "," + column, sum);

        return sum;
    }

    private int min(final int a, final int b, final int c) {
        if (a == MAX && b == MAX && c == MAX) {
            return 0;
        }
        final int min = Math.min(a, b);
        return Math.min(min, c);
    }
}
