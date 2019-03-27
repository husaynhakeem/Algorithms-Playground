package leetcode.interview_google_5.problem_3;

public class Solution {

    int wordsTyping(final String[] words, final int rows, final int cols) {
        final String sentence = String.join(" ", words) + " ";
        final int length = sentence.length();
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            sum += cols;
            if (sentence.charAt(sum % length) == ' ') {
                sum++;
            } else {
                while (sum > 0 && sentence.charAt((sum - 1) % length) != ' ') {
                    sum--;
                }
            }
        }

        return sum / length;
    }
}
