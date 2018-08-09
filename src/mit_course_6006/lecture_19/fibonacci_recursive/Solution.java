package mit_course_6006.lecture_19.fibonacci_recursive;

class Solution {

    int fib(final int n) {
        final int[] memo = new int[n + 1];
        return fib(n, memo);
    }

    private int fib(final int n, final int[] memo) {
        if (n <= 2) {
            memo[n] = 1;
        } else if (memo[n] == 0) {
            memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        }
        return memo[n];
    }
}
