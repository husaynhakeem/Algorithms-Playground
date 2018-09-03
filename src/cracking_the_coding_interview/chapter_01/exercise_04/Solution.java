package cracking_the_coding_interview.chapter_01.exercise_04;

import org.jetbrains.annotations.NotNull;

class Solution {

    private static final int NUMBER_OF_CHARS = 128;

    boolean isPermutationOfPalindrome(@NotNull String input) {
        final int[] charsFrequencies = new int[NUMBER_OF_CHARS];
        final char a = 'a';
        final char z = 'z';
        for (Character c : input.toLowerCase().toCharArray()) {
            if (a <= c && c <= z) {
                charsFrequencies[c]++;
            }
        }

        boolean foundOddOccurrence = false;
        for (Integer n : charsFrequencies) {
            if (n % 2 == 1) {
                if (foundOddOccurrence)
                    return false;
                foundOddOccurrence = true;
            }
        }

        return true;
    }
}
