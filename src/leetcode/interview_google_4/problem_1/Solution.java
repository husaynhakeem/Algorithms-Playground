package leetcode.interview_google_4.problem_1;

public class Solution {

    String licenseKeyFormatting(String S, int K) {
        final StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (c == '-') {
                continue;
            }

            if (Character.isLetter(c)) {
                c = Character.toUpperCase(c);
            }

            sb.append(c);
            counter++;

            if (counter == K) {
                counter = 0;
                sb.append('-');
            }
        }

        final StringBuilder result = sb.reverse();

        int start = 0;
        while (start < result.length() && result.charAt(start) == '-') {
            start++;
        }

        int end = result.length() - 1;
        while (end >= 0 && result.charAt(end) == '-') {
            end--;
        }

        return result.substring(start, end + 1);
    }
}
