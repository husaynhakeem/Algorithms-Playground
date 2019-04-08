package leetcode.problem_0318;

public class Solution {

    int maxProduct(String[] words) {
        int max = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                boolean wordsHaveCommonLetters = false;
                for (final char c : words[i].toCharArray()) {
                    if (words[j].indexOf(c) >= 0) {
                        wordsHaveCommonLetters = true;
                        break;
                    }
                }

                if (!wordsHaveCommonLetters) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }

        return max;
    }
}
