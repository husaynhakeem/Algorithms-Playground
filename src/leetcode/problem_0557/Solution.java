package leetcode.problem_0557;

class Solution {

    String reverseWords(String s) {
        final String[] words = s.trim().split("\\s+");
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            reverseWord(words[i], sb);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private void reverseWord(final String word, final StringBuilder sb) {
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
    }
}
