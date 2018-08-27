package leetcode.problem_0804;

import java.util.HashSet;
import java.util.Set;

class Solution {

    private static String[] MORSE_CODES = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    int uniqueMorseRepresentations(String[] words) {
        final Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(transform(word));
        }
        return set.size();
    }

    private String transform(final String word) {
        final StringBuilder sb = new StringBuilder();
        for (Character c : word.toCharArray()) {
            sb.append(MORSE_CODES[c - 'a']);
        }
        return sb.toString();
    }
}
