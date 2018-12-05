package leetcode.problem_0072;

class Solution {

    int minDistance(final String word1, final String word2) {
        final int length1 = word1.length();
        final int length2 = word2.length();
        final int[][] memo = new int[length2 + 1][length1 + 1];

        for (int i = 0; i <= length1; i++) {
            memo[0][i] = i;
        }

        for (int i = 0; i <= length2; i++) {
            memo[i][0] = i;
        }

        for (int i = 1; i <= length2; i++) {
            for (int j = 1; j <= length1; j++) {
                if (word1.charAt(j - 1) == word2.charAt(i - 1)) {
                    memo[i][j] = memo[i - 1][j - 1];
                } else {
                    final int insert = memo[i - 1][j] + 1;
                    final int delete = memo[i][j - 1] + 1;
                    final int replace = memo[i - 1][j - 1] + 1;
                    memo[i][j] = min(insert, delete, replace);
                }
            }
        }

        return memo[length2][length1];
    }

    private int min(final int a, final int b, final int c) {
        final int minAB = Math.min(a, b);
        return Math.min(minAB, c);
    }
}
