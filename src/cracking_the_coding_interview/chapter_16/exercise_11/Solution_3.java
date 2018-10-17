package cracking_the_coding_interview.chapter_16.exercise_11;

import java.util.HashSet;
import java.util.Set;

class Solution_3 {

    Set<Integer> divingBoard(final int k, final int shortLength, final int longLength) {
        final Set<Integer> lengths = new HashSet<>();
        final Set<String> memo = new HashSet<>();
        divingBoardHelper(k, 0, shortLength, longLength, lengths, memo);
        return lengths;
    }

    private void divingBoardHelper(final int k, final int total, final int shortLength, final int longLength, final Set<Integer> lengths, final Set<String> memo) {
        if (k == 0) {
            lengths.add(total);
            return;
        }

        final String key = k + " " + total;
        if (memo.contains(key)) {
            return;
        }

        divingBoardHelper(k - 1, total + shortLength, shortLength, longLength, lengths, memo);
        divingBoardHelper(k - 1, total + longLength, shortLength, longLength, lengths, memo);
        memo.add(key);
    }
}
