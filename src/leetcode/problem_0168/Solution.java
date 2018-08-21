package leetcode.problem_0168;

class Solution {

    String convertToTitle(int n) {
        final StringBuilder sb = new StringBuilder();
        while (n != 0) {
            n--;
            sb.append((char) ('A' + n % 26));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
