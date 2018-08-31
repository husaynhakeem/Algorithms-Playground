package leetcode.problem_0258;

class Solution {

    int addDigits(int num) {
        int sum = num;
        int n = 0;

        while (sum >= 10) {
            n = sum;
            sum = 0;

            while (n != 0) {
                int pop = n % 10;
                sum += pop;
                n /= 10;
            }
        }

        return sum;
    }
}
