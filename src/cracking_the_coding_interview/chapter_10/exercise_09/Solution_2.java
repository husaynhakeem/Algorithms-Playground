package cracking_the_coding_interview.chapter_10.exercise_09;

import org.jetbrains.annotations.NotNull;

class Solution_2 {

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

        int line = lines - 1;
        int column = 0;

        while (line >= 0 && column < columns) {
            if (matrix[line][column] == x) {
                return new MatrixIndex(line, column);
            }

            if (matrix[line][column] > x) {
                line--;
            } else {
                column++;
            }
        }

        return MatrixIndex.NIL;
    }
}
