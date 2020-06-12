package leetcode.problem_0012;

public class Solution {

    private static final int[] INT = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMAN = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        final StringBuilder sb = new StringBuilder();
        while (num != 0) {
            for (int i = 0; i < ROMAN.length; i++) {
                final int div = num / INT[i];
                if (div != 0) {
                    sb.append(ROMAN[i]);
                    num -= INT[i];
                    break;
                }
            }
        }
        return sb.toString();
    }
}
