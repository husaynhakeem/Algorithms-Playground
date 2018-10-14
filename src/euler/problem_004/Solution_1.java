package euler.problem_004;

class Solution_1 {

    int largestPalindromeProduct(int n) {
        int max = 0;

        for (int i = 100; i < n; i++) {
            for (int j = 100; j < n; j++) {
                int product = i * j;
                if (product > max && isPalindrome(product)) {
                    max = product;
                }
            }
        }

        return max;
    }

    private boolean isPalindrome(int n) {
        return n == Integer.valueOf(new StringBuilder().append(n).reverse().toString());
    }
}
