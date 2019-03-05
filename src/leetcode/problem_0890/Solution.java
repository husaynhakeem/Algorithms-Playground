package leetcode.problem_0890;

import java.util.*;

public class Solution {

    List<String> findAndReplacePattern(final String[] words, final String pattern) {
        final List<String> wordsMatchingPattern = new ArrayList<>();
        for (String word : words) {
            if (matchesPattern(word, pattern)) {
                wordsMatchingPattern.add(word);
            }
        }
        return wordsMatchingPattern;
    }

    private boolean matchesPattern(final String word, final String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }

        final Map<Character, Character> permutations = new HashMap<>();
        final Set<Character> takenCharacters = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            final char c = pattern.charAt(i);
            final char permC = word.charAt(i);

            if (permutations.get(c) == null) {
                if (takenCharacters.contains(permC)) {
                    return false;
                } else {
                    permutations.put(c, permC);
                    takenCharacters.add(permC);
                }
            } else if (permutations.get(c) != permC) {
                return false;
            }
        }

        return true;
    }
}
