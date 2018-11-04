package leetcode.problem_0032;

import org.jetbrains.annotations.NotNull;

class Solution {

    int longestValidParentheses(@NotNull final String str) {
        final int[] memo = new int[str.length()];
        int max = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                if (str.charAt(i - 1) == '(') {
                    memo[i] = (i - 2 >= 0 ? memo[i - 2] : 0) + 2;
                } else {
                    if (i - memo[i - 1] - 1 >= 0 && str.charAt(i - memo[i - 1] - 1) == '(') {
                        memo[i] = memo[i - 1] + 2 + (i - memo[i - 1] - 2 >= 0 ? memo[i - memo[i - 1] - 2] : 0);
                    }
                }
            }
            max = Math.max(max, memo[i]);
        }

        return max;
    }
}
