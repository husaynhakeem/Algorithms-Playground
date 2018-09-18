package cracking_the_coding_interview.java;

import org.jetbrains.annotations.NotNull;

class BinarySearchIterative {

    int search(@NotNull final int[] array, final int x) {
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == x) {
                return mid;
            }

            if (array[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
