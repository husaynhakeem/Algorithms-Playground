package leetcode.problem_0686;

public class Solution {

    int repeatedStringMatch(String A, String B) {
        final float times = ((float) B.length()) / A.length();
        final int n = (((int) times) == times) ? (int) times : ((int) times) + 1;

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(A);
        }

        if (sb.toString().contains(B)) {
            return n;
        }

        sb.append(A);
        if (sb.toString().contains(B)) {
            return n + 1;
        }

        return -1;
    }
}
