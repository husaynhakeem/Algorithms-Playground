package leetcode.problem_0459;

class Solution_2 {

    boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() <= 1) {
            return false;
        }

        final String ss = s.concat(s);
        return ss.substring(1, ss.length() - 1).contains(s);
    }
}
