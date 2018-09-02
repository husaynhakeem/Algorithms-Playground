package cracking_the_coding_interview.chapter_01.exercise_08;

class Solution {

    void zeroMatrix(final int[][] matrix) {
        final int lines = matrix.length;
        final int columns = matrix[0].length;
        final boolean[] linesZeros = new boolean[lines];
        final boolean[] columnsZeros = new boolean[columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    linesZeros[i] = true;
                    columnsZeros[j] = true;
                }
            }
        }

        for (int i = 0; i < linesZeros.length; i++) {
            if (linesZeros[i]) {
                zerofyLine(matrix, i, columns);
            }
        }

        for (int i = 0; i < columnsZeros.length; i++) {
            if (columnsZeros[i]) {
                zerofyColumn(matrix, i, lines);
            }
        }
    }

    private void zerofyLine(final int[][] matrix, final int index, final int columns) {
        for (int i = 0; i < columns; i++) {
            matrix[index][i] = 0;
        }
    }

    private void zerofyColumn(final int[][] matrix, final int index, final int lines) {
        for (int i = 0; i < lines; i++) {
            matrix[i][index] = 0;
        }
    }
}
