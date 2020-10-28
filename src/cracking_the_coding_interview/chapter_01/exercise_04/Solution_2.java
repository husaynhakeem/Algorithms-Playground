package cracking_the_coding_interview.chapter_01.exercise_04;

import org.jetbrains.annotations.NotNull;

import java.util.BitSet;

class Solution_2 {

    private static final int NUMBER_OF_CHARS = 128;

    boolean isPermutationOfPalindrome(@NotNull String input) {
        final BitSet dict = new BitSet(NUMBER_OF_CHARS);
        final char[] chars = input.toLowerCase().toCharArray();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                dict.set(c, !dict.get(c));
            }
        }

        // There should only be at most 1 character that appears an even number of times in the input string for it to
        // be a palindrome.
        return dict.cardinality() <= 1;
    }
}
