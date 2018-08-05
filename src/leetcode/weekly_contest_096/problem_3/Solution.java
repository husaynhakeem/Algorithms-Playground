package leetcode.weekly_contest_096.problem_3;

class Solution {

    String decodeAtIndex(String S, int K) {
        final StringBuilder sb = new StringBuilder();

        for (Character c : S.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(c);
                if (K < sb.length()) {
                    return String.valueOf(sb.charAt(K - 1));
                }
            } else {
                final int n = Integer.parseInt(String.valueOf(c));
                final String currentString = sb.toString();
                for (int i = 1; i < n; i++) {
                    sb.append(currentString);
                    if (K < sb.length()) {
                        return String.valueOf(sb.charAt(K - 1));
                    }
                }
            }
        }

        return String.valueOf(sb.charAt(K - 1));
    }
}
