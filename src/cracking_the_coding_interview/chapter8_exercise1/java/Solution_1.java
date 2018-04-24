package cracking_the_coding_interview.chapter8_exercise1.java;

public class Solution_1 {

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
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }
}
