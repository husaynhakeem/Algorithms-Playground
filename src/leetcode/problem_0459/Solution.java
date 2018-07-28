package leetcode.problem_0459;

import java.util.ArrayList;
import java.util.List;

class Solution {

    boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() <= 1) {
            return false;
        }

        final int length = s.length();
        final int[] dividers = allDividers(length);

        for (Integer d : dividers) {
            if (isPattern(s, d)) {
                return true;
            }
        }

        return false;
    }

    private int[] allDividers(int n) {
        final List<Integer> dividers = new ArrayList<>();
        dividers.add(1);

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                dividers.add(i);
            }
        }

        final int[] dividersArray = new int[dividers.size()];
        for (int i = 0; i < dividers.size(); i++) {
            dividersArray[i] = dividers.get(i);
        }

        return dividersArray;
    }

    private boolean isPattern(String s, int length) {
        final String sub = s.substring(0, length);
        final int factor = s.length() / length;

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < factor; i++) {
            sb.append(sub);
        }

        return sb.toString().equals(s);
    }
}
