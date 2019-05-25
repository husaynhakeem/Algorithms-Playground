package leetcode.problem_0013;

public class Solution {

    int romanToInt(String s) {
        final int length = s.length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'I') {
                if (i < length - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    sum -= 1;
                } else {
                    sum += 1;
                }
            } else if (s.charAt(i) == 'X') {
                if (i < length - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    sum -= 10;
                } else {
                    sum += 10;
                }
            } else if (s.charAt(i) == 'C') {
                if (i < length - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    sum -= 100;
                } else {
                    sum += 100;
                }
            } else if (s.charAt(i) == 'V') {
                sum += 5;
            } else if (s.charAt(i) == 'L') {
                sum += 50;
            } else if (s.charAt(i) == 'D') {
                sum += 500;
            } else if (s.charAt(i) == 'M') {
                sum += 1000;
            }
        }

        return sum;
    }
}
