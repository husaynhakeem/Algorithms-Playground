package cracking_the_coding_interview.chapter_08.exercise_03;

import org.jetbrains.annotations.NotNull;

class SolutionFollowup_1 {

    int magicIndex(@NotNull final int[] array) {
        return magicIndex(array, 0, array.length - 1);
    }

    private int magicIndex(final int[] array, final int low, final int high) {
        if (high < low) {
            return -1;
        }

        final int midIndex = (low + high) / 2;
        final int midValue = array[midIndex];

        if (midValue == midIndex) {
            return midIndex;
        }

        final int leftIndex = Math.min(midIndex - 1, midValue);
        final int magicIndex = magicIndex(array, low, leftIndex);
        if (magicIndex >= 0) {
            return magicIndex;
        }

        final int rightIndex = Math.max(midIndex + 1, midValue);
        return magicIndex(array, rightIndex, high);
    }
}
