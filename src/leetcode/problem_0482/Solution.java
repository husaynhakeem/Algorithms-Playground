package leetcode.problem_0482;

class Solution {

    String licenseKeyFormatting(String S, int k) {
        S = S.replaceAll("-", "");

        final StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = S.length() - 1; i >= 0; i--) {
            final char c = S.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append((char) (c - 'a' + 'A'));
            } else {
                sb.append(c);
            }
            count++;
            if (count == k && i > 0) {
                sb.append("-");
                count = 0;
            }
        }

        return sb.reverse().toString();
    }
}
