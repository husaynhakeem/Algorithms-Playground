package leetcode.problem_0074;

public class Solution {

    public boolean searchMatrix(final int[][] matrix, final int target) {
        final int rows = matrix.length;
        final int cols = matrix[0].length;

        int start = 0, end = (rows * cols) - 1;
        while (start <= end) {
            final int middle = start + (end - start) / 2;
            final int middleRow = middle / cols;
            final int middleCol = middle % cols;
            final int middleElement = matrix[middleRow][middleCol];

            if (middleElement == target) {
                return true;
            }

            if (middleElement < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return false;
    }
}
