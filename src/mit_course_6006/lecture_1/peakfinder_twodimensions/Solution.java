package mit_course_6006.lecture_1.peakfinder_twodimensions;

import javafx.util.Pair;

class Solution {

    private final mit_course_6006.lecture_1.peakfinder_onedimension.Solution oneDimensionalPeakFinder = new mit_course_6006.lecture_1.peakfinder_onedimension.Solution();

    Pair<Integer, Integer> findPeak(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new Pair<>(-1, -1);
        }

        return findPeak(matrix, 0, matrix[0].length);
    }

    private Pair<Integer, Integer> findPeak(int[][] matrix, int low, int high) {
        if (high < low) {
            return new Pair<>(-1, -1);
        }

        final int middleColumn = low + (high - low) / 2;
        final int peakPosition = oneDimensionalPeakFinder.findPeak(getColumn(matrix, middleColumn));

        if (peakPosition == -1) {
            return new Pair<>(-1, -1);
        }

        if ((peakPosition == 0 || matrix[peakPosition - 1][middleColumn] <= matrix[peakPosition][middleColumn]) &&
                (peakPosition == matrix[0].length - 1 || matrix[peakPosition + 1][middleColumn] <= matrix[peakPosition][middleColumn])) {
            return new Pair<>(peakPosition, middleColumn);
        }

        if (matrix[peakPosition][middleColumn] < matrix[peakPosition + 1][middleColumn]) {
            return findPeak(matrix, peakPosition + 1, high);
        }

        return findPeak(matrix, low, peakPosition - 1);
    }

    private int[] getColumn(int[][] matrix, int columnIndex) {
        int[] column = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][columnIndex];
        }

        return column;
    }
}
