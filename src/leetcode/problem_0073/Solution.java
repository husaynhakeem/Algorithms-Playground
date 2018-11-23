package leetcode.problem_0073;

import java.util.BitSet;

class Solution {

    void setZeroes(int[][] matrix) {
        if (matrix == null) {
            return;
        }

        final int numLines = matrix.length;
        if (numLines == 0) {
            return;
        }
        final int numColumns = matrix[0].length;

        final BitSet lines = new BitSet(numLines);
        final BitSet columns = new BitSet(numColumns);

        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (matrix[i][j] == 0) {
                    lines.set(i);
                    columns.set(j);
                }
            }
        }

        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (lines.get(i) || columns.get(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
