package cracking_the_coding_interview.chapter_16.exercise_11;

import java.util.HashSet;
import java.util.Set;

class Solution_1 {

    Set<Integer> divingBoard(final int k, final int shortLength, final int longLength) {
        final Set<Integer> lengths = new HashSet<>();
        divingBoardHelper(k, shortLength, longLength, lengths);
        return lengths;
    }

    private void divingBoardHelper(final int k, final int shortLength, final int longLength, final Set<Integer> lengths) {
        if (k == 0) {
            return;
        }

        if (k == 1) {
            lengths.add(shortLength);
            lengths.add(longLength);
            return;
        }

        divingBoardHelper(k - 1, shortLength, longLength, lengths);

        final Set<Integer> lengthsK = new HashSet<>();
        for (Integer n : lengths) {
            lengthsK.add(shortLength + n);
            lengthsK.add(longLength + n);
        }

        lengths.clear();
        lengths.addAll(lengthsK);
    }
}
