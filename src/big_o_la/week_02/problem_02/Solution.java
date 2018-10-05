package big_o_la.week_02.problem_02;

import org.jetbrains.annotations.NotNull;

class Solution {

    int editDistance(@NotNull final String a, @NotNull final String b) {
        final int[][] memo = new int[a.length() + 1][b.length() + 1];

        for (int i = 0; i < a.length() + 1; i++) {
            for (int j = 0; j < b.length() + 1; j++) {
                if (i == 0 || j == 0) {
                    memo[i][j] = Math.max(i, j);
                } else {
                    final int insertion = memo[i - 1][j] + 1;
                    final int deletion = memo[i][j - 1] + 1;
                    final int substitution = memo[i - 1][j - 1] + (a.charAt(i - 1) == b.charAt(j - 1) ? 0 : 1);
                    memo[i][j] = min(insertion, deletion, substitution);
                }
            }
        }

        return memo[a.length()][b.length()];
    }

    private int min(final int a, final int b, final int c) {
        if (a < b && a < c) {
            return a;
        }

        if (b < a && b < c) {
            return b;
        }

        return c;
    }
}
