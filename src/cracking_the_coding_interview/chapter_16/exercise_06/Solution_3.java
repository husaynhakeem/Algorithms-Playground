package cracking_the_coding_interview.chapter_16.exercise_06;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

class Solution_3 {

    int smallestDifference(@NotNull final int[] a, @NotNull final int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int min = Integer.MAX_VALUE;
        int aIndex = 0;
        int bIndex = 0;

        while (aIndex < a.length && bIndex < b.length) {
            final int diff = Math.abs(a[aIndex] - b[bIndex]);
            if (diff < min) {
                min = diff;
            }

            if (a[aIndex] == b[bIndex]) {
                return min;
            }

            if (a[aIndex] < b[bIndex]) {
                aIndex++;
            } else {
                bIndex++;
            }
        }

        return min;
    }
}
