package leetcode.problem_0062;

import java.util.HashMap;
import java.util.Map;

class Solution {

    int uniquePaths(int m, int n) {
        final Map<String, Integer> memo = new HashMap<>();
        return uniquePathsHelper(n, m, 0, 0, memo);
    }

    private int uniquePathsHelper(final int lines, final int columns, final int i, final int j, final Map<String, Integer> memo) {
        if (i == lines - 1 && j == columns - 1) {
            return 1;
        }

        if (i >= lines || j >= columns) {
            return 0;
        }

        final String key = getKey(i, j);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        String keyFromRight = getKey(i + 1, j);
        memo.put(keyFromRight, uniquePathsHelper(lines, columns, i + 1, j, memo));

        String keyFromBottom = getKey(i, j + 1);
        memo.put(keyFromBottom, uniquePathsHelper(lines, columns, i, j + 1, memo));

        return memo.get(keyFromRight) + memo.get(keyFromBottom);
    }

    private String getKey(final int i, final int j) {
        return "line" + i + "-column" + j;
    }
}
