package leetcode.problem_0070;

class Solution {

    int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }

        final int[] memo = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                memo[i] = 1;
            } else if (i == 1) {
                memo[i] = 2;
            } else {
                memo[i] = memo[i - 1] + memo[i - 2];
            }
        }

        return memo[n - 1];
    }
}
