package leetcode.problem_0007;

class Solution {

    int reverse(int x) {
        int result = 0;
        int pop = 0;
        while (x != 0) {
            pop = x % 10;
            x /= 10;
            result = result * 10 + pop;
        }
        return result % 10 == pop ? result : 0;
    }
}
