package Utilities.java;

public class GridUtils {

    public static boolean areIntegerGridsEqual(int[][] A, int[][] B) {
        if (A == null || B == null) {
            return true;
        }

        final int linesA = A.length;
        final int linesB = B.length;

        if (linesA == 0 || linesB == 0) {
            return linesA == linesB;
        }

        final int columnsA = A[0].length;
        final int columnsB = B[0].length;

        if (linesA != linesB || columnsA != columnsB) {
            return false;
        }

        for (int i = 0; i < linesA; i++) {
            for (int j = 0; j < columnsA; j++) {
                if (A[i][j] != B[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean areBooleanGridsEqual(final boolean[][] A, final boolean[][] B) {
        if (A == null || B == null) {
            return true;
        }

        final int linesA = A.length;
        final int linesB = B.length;

        if (linesA == 0 || linesB == 0) {
            return linesA == linesB;
        }

        final int columnsA = A[0].length;
        final int columnsB = B[0].length;

        if (linesA != linesB || columnsA != columnsB) {
            return false;
        }

        for (int i = 0; i < linesA; i++) {
            for (int j = 0; j < columnsA; j++) {
                if (A[i][j] != B[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
