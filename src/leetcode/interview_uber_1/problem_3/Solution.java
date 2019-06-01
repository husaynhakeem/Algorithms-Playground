package leetcode.interview_uber_1.problem_3;

public class Solution {

    boolean isInterleave(String s1, String s2, String s3) {
        if ((s1.length() + s2.length()) != s3.length()) {
            return false;
        }

        return isInterleave(s1.toCharArray(), 0, s2.toCharArray(), 0, s3.toCharArray(), 0);
    }

    private boolean isInterleave(final char[] chars1, final int index1,
                                 final char[] chars2, final int index2,
                                 final char[] chars3, final int index3) {
        if (index3 >= chars3.length) {
            return true;
        }

        if ((index1 < chars1.length && chars3[index3] == chars1[index1]) &&
                (index2 < chars2.length && chars3[index3] == chars2[index2])) {
            return isInterleave(chars1, index1 + 1, chars2, index2, chars3, index3 + 1) ||
                    isInterleave(chars1, index1, chars2, index2 + 1, chars3, index3 + 1);
        }

        if (index1 < chars1.length && chars3[index3] == chars1[index1]) {
            return isInterleave(chars1, index1 + 1, chars2, index2, chars3, index3 + 1);
        }

        if (index2 < chars2.length && chars3[index3] == chars2[index2]) {
            return isInterleave(chars1, index1, chars2, index2 + 1, chars3, index3 + 1);
        }

        return false;
    }
}
