package cracking_the_coding_interview.chapter_01.exercise_01;

import java.util.BitSet;

public class Solution_2 {

    private static final int NUMBER_OF_CHARS = 128;

    boolean isUnique(final String s) {
        final BitSet dictionary = new BitSet(NUMBER_OF_CHARS);
        final char[] chars = s.toCharArray();
        for (char c : chars) {
            if (dictionary.get(c)) {
                return false;
            }
            dictionary.set(c);
        }
        return true;
    }
}
