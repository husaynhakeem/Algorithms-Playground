package cracking_the_coding_interview.chapter_16.exercise_11;

import java.util.HashSet;
import java.util.Set;

class Solution_2 {

    Set<Integer> divingBoard(final int k, final int shortLength, final int longLength) {
        final Set<Integer> lengths = new HashSet<>();
        divingBoardHelper(k, 0, shortLength, longLength, lengths);
        return lengths;
    }

    private void divingBoardHelper(final int k, final int total, final int shortLength, final int longLength, final Set<Integer> lengths) {
        if (k == 0) {
            lengths.add(total);
            return;
        }

        divingBoardHelper(k - 1, total + shortLength, shortLength, longLength, lengths);
        divingBoardHelper(k - 1, total + longLength, shortLength, longLength, lengths);
    }
}
