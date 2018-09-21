package cracking_the_coding_interview.chapter_10.exercise_09;


import org.jetbrains.annotations.NotNull;

class Solution_1 {

    static class MatrixIndex {
        int line;
        int column;

        static MatrixIndex NIL = new MatrixIndex(-1, -1);

        MatrixIndex(int line, int column) {
            this.line = line;
            this.column = column;
        }
    }

    MatrixIndex sortedMatrixSearch(@NotNull final int[][] matrix, final int x) {
        final int lines = matrix.length;
        if (lines == 0) {
            return MatrixIndex.NIL;
        }
        final int columns = matrix[0].length;

        for (int i = 0; i < lines; i++) {
            final int index = search(matrix, x, i, columns);
            if (index != -1) {
                return new MatrixIndex(i, index);
            }
        }

        return MatrixIndex.NIL;
    }

    private int search(@NotNull final int[][] matrix, final int x, final int line, final int columns) {
        return search(matrix, x, line, 0, columns - 1);
    }

    private int search(@NotNull final int[][] matrix, final int x, final int line, final int low, final int high) {
        if (low > high) {
            return -1;
        }

        final int mid = low + (high - low) / 2;
        final int midValue = matrix[line][mid];

        if (midValue == x) {
            return mid;
        }

        if (midValue < x) {
            return search(matrix, x, line, mid + 1, high);
        }

        return search(matrix, x, line, low, mid - 1);
    }
}
