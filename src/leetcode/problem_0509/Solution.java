package leetcode.problem_0509;

public class Solution {

    int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
