package leetcode.problem_0050;

public class Solution {

    public double myPow(double x, int n) {
        return myPowInternal(x, n);
    }

    private double myPowInternal(double x, long n) {
        if (x == 1 || n == 0) {
            return 1;
        }
        if (n < 0) {
            return myPowInternal(1/x, -n);
        }

        double pow = myPowInternal(x*x, n/2);
        if (n % 2 == 1) {
            pow *= x;
        }
        return pow;
    }
}
