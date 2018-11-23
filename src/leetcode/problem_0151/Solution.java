package leetcode.problem_0151;

class Solution {

    String reverseWords(String s) {
        if (s == null) {
            return null;
        }

        final String[] words = s.trim().split("\\s+");
        final StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
