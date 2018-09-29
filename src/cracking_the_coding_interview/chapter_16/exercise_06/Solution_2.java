package cracking_the_coding_interview.chapter_16.exercise_06;

import org.jetbrains.annotations.NotNull;

class Solution_2 {

    int smallestDifference(@NotNull final int[] a, @NotNull final int[] b) {
        int min = Integer.MAX_VALUE;
        for (int elementA : a) {
            for (int elementB : b) {
                final int diff = elementA - elementB;
                if (0 <= diff && diff < min) {
                    min = diff;
                }
            }
        }
        return min;
    }
}
