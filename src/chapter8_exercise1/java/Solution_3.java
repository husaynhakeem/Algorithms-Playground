package chapter8_exercise1.java;

import java.util.Arrays;

public class Solution_3 {

    public static void main(String[] args) {
        System.out.println(countWays(1));
        System.out.println(countWays(5));
        System.out.println(countWays(10));
        System.out.println(countWays(20));
        System.out.println(countWays(30));
        System.out.println(countWays(35));
    }

    private static int countWays(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[0] = 1;
        return countWays(n, memo);
    }

    private static int countWays(int n, int[] memo) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;

        if (memo[n] == -1)
            memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);

        return memo[n];
    }
}
