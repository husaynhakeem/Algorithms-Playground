package mit_course_6006.lecture_19.fibonacci_iterative;

class Solution {

    int fib(final int n) {
        final int[] memo = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int f;
            if (i <= 2) {
                f = 1;
            } else {
                f = memo[i - 1] + memo[i - 2];
            }
            memo[i] = f;
        }
        return memo[n];
    }
}
