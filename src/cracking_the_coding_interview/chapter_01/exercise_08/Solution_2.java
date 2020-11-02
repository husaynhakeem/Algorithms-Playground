package cracking_the_coding_interview.chapter_01.exercise_08;

class Solution_2 {

    @SuppressWarnings("ForLoopReplaceableByForEach")
    void zeroMatrix(final int[][] matrix) {
        final int rows = matrix.length;
        final int columns = matrix[0].length;

        // Check if first row has a 0
        boolean firstRowHasZero = false;
        for (int i = 0; i < columns; i++) {
            if (matrix[0][i] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Check if first column has a 0
        boolean firstColumnHasZero = false;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColumnHasZero = true;
                break;
            }
        }

        // Find zeros in grid
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Set zeros in rows
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                zerofyRow(matrix, i, columns);
            }
        }

        // Set zeros in columns
        for (int i = 0; i < columns; i++) {
            if (matrix[0][i] == 0) {
                zerofyColumn(matrix, i, rows);
            }
        }

        // Set zeros in first row
        if (firstRowHasZero) {
            zerofyRow(matrix, 0, columns);
        }

        // Set zeros in first column
        if (firstColumnHasZero) {
            zerofyColumn(matrix, 0, rows);
        }
    }

    private void zerofyRow(final int[][] matrix, final int index, final int columns) {
        for (int i = 0; i < columns; i++) {
            matrix[index][i] = 0;
        }
    }

    private void zerofyColumn(final int[][] matrix, final int index, final int rows) {
        for (int i = 0; i < rows; i++) {
            matrix[i][index] = 0;
        }
    }
}
