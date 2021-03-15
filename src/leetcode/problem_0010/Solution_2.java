package leetcode.problem_0010;

public class Solution_2 {

    public boolean isMatch(String word, String pattern) {
        boolean[][] memo = new boolean[word.length() + 1][pattern.length() + 1];
        memo[word.length()][pattern.length()] = true;

        for (int i = word.length(); i >= 0; i--) {
            for (int j = pattern.length() - 1; j >= 0; j--) {
                boolean firstCharMatch = i < word.length() &&
                        (word.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.');
                if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                    memo[i][j] = memo[i][j + 2] || (firstCharMatch && memo[i + 1][j]);
                } else {
                    memo[i][j] = firstCharMatch && memo[i + 1][j + 1];
                }
            }
        }

        return memo[0][0];
    }
}
