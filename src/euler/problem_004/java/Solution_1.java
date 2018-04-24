package euler.problem_004.java;

public class Solution_1 {

    public static void main(String[] args) {
        System.out.println(largestPalindromeProduct(1000));
    }

    private static int largestPalindromeProduct(int n) {
        int max = 0;

        for (int i = 100; i < n; i++) {
            for (int j = 100; j < n; j++) {
                int product = i * j;
                if (product > max && isPalindrome(product))
                    max = product;
            }
        }

        return max;
    }

    private static boolean isPalindrome(int n) {
        return n == Integer.valueOf(new StringBuilder().append(n).reverse().toString());
    }
}
