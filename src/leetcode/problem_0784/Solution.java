package leetcode.problem_0784;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> letterCasePermutation(String S) {
        if (S != null && S.length() > 0) {
            return computePerms(S, 0);
        }
        return new ArrayList<>();
    }

    private List<String> computePerms(final String s, final int index) {
        final List<String> perms = new ArrayList<>();
        final char c = s.charAt(index);

        if (index == s.length() - 1) {
            if (isDigit(c)) {
                perms.add(String.valueOf(c));
            } else {
                perms.add(String.valueOf(toLowerCase(c)));
                perms.add(String.valueOf(toUpperCase(c)));
            }
            return perms;
        }

        final List<String> tempPerms = computePerms(s, index + 1);

        for (final String perm : tempPerms) {
            if (isDigit(c)) {
                perms.add(c + perm);
            } else {
                perms.add(toLowerCase(c) + perm);
                perms.add(toUpperCase(c) + perm);
            }
        }
        return perms;
    }

    private boolean isDigit(final char c) {
        return '0' <= c && c <= '9';
    }

    private char toLowerCase(final char c) {
        if ('a' <= c && c <= 'z') {
            return c;
        }
        return (char) (c + 'a' - 'A');
    }

    private char toUpperCase(final char c) {
        if ('A' <= c && c <= 'Z') {
            return c;
        }
        return (char) (c - 'a' + 'A');
    }
}
