package leetcode.problem_0318;

public class Solution_2 {

    int maxProduct(String[] words) {
        final int[] encodings = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            final String word = words[i];
            int encoding = 0;
            for (final char c : word.toCharArray()) {
                encoding |= 1 << (c - 'a');
            }
            encodings[i] = encoding;
        }

        int max = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((encodings[i] & encodings[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }

        return max;
    }
}
