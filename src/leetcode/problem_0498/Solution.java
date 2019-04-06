package leetcode.problem_0498;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    int[] findDiagonalOrder(int[][] matrix) {
        final int rows = matrix.length;
        if (rows == 0) {
            return new int[]{};
        }
        final int cols = matrix[0].length;
        final int[] result = new int[rows * cols];

        final Map<Integer, List<Integer>> diags = new HashMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                List<Integer> diag = diags.computeIfAbsent(i + j, k -> new ArrayList<>());
                diag.add(matrix[i][j]);
            }
        }

        int index = 0;
        for (int i = 0; i < diags.size(); i++) {
            final List<Integer> diag = diags.get(i);

            if (i % 2 == 1) {
                for (int j = 0; j < diag.size(); j++) {
                    result[index++] = diag.get(j);
                }
            } else {
                for (int j = diag.size() - 1; j >= 0; j--) {
                    result[index++] = diag.get(j);
                }
            }
        }

        return result;
    }
}
