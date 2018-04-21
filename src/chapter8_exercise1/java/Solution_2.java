package chapter8_exercise1.java;

public class Solution_2 {

    public static void main(String[] args) {
        System.out.println(countWays(1));
        System.out.println(countWays(5));
        System.out.println(countWays(10));
        System.out.println(countWays(20));
        System.out.println(countWays(30));
        System.out.println(countWays(35));
    }

    private static int countWays(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;

        int a = 0;
        int b = 0;
        int c = 1;

        for (int i = 1; i < n; i++) {
            int sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }

        return a + b + c;
    }
}
