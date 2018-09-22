package cracking_the_coding_interview.chapter_08.exercise_03;

import org.jetbrains.annotations.NotNull;

class SolutionFollowup_2 {

    int magicIndex(@NotNull final int[] array) {
        return magicIndex(array, 0, array.length - 1);
    }

    private int magicIndex(final int[] array, final int low, final int high) {
        if (high < low) {
            return -1;
        }

        final int mid = low + (high - low) / 2;
        final int midValue = array[mid];

        if (midValue == mid) {
            return mid;
        }
        if (midValue >= 0 && midValue < array.length && array[midValue] == midValue) {
            return midValue;
        }
        if (midValue > mid) {
            return magicIndex(array, low, mid - 1);
        }
        return magicIndex(array, mid + 1, high);
    }
}
