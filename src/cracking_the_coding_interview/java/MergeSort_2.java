package cracking_the_coding_interview.java;

import org.jetbrains.annotations.NotNull;

class MergeSort_2 {

    void sort(@NotNull final int[] array) {
        sort(array, new int[array.length], 0, array.length - 1);
    }

    private void sort(@NotNull final int[] array, @NotNull final int[] helper, final int low, final int high) {
        if (low >= high) {
            return;
        }

        final int mid = low + (high - low) / 2;
        sort(array, helper, low, mid);
        sort(array, helper, mid + 1, high);
        merge(array, helper, low, mid, high);
    }

    private void merge(@NotNull final int[] array, @NotNull final int[] helper, final int low, final int mid, final int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = mid + 1;
        int current = low;
        while (helperLeft <= mid && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current++] = helper[helperLeft++];
            } else {
                array[current++] = helper[helperRight++];
            }
        }

        for (int i = helperLeft; i <= mid; i++) {
            array[current++] = helper[i];
        }
    }
}
