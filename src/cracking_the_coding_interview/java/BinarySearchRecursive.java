package cracking_the_coding_interview.java;

import org.jetbrains.annotations.NotNull;

class BinarySearchRecursive {

    int search(@NotNull final int[] array, final int x) {
        return search(array, x, 0, array.length - 1);
    }

    private int search(@NotNull final int[] array, final int x, final int low, final int high) {
        if (high < low) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (array[mid] == x) {
            return mid;
        }

        if (array[mid] > x) {
            return search(array, x, low, mid - 1);
        }

        return search(array, x, mid + 1, high);
    }
}
