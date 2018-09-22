package cracking_the_coding_interview.chapter_08.exercise_05;

import java.util.Hashtable;

class Solution_4 {

    long recursiveMultiply(final int a, final int b) {
        final int min = Math.min(a, b);
        final int max = min == a ? b : a;
        return multiply(min, max, new Hashtable<>());
    }

    private long multiply(final int min, final int max, final Hashtable<Integer, Long> memo) {
        if (min == 0) {
            return 0;
        }
        if (min == 1) {
            return max;
        }

        final int half = min >> 1;

        if (!memo.containsKey(half)) {
            memo.put(half, multiply(half, max, memo));
        }
        final long side1 = memo.get(half);

        long side2 = side1;
        if (min % 2 == 1) {
            if (!memo.containsKey(min - half)) {
                memo.put(min - half, multiply(min - half, max, memo));
            }
            side2 = memo.get(min - half);
        }
        return side1 + side2;
    }
}
