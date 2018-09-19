package cracking_the_coding_interview.java;

import org.jetbrains.annotations.NotNull;

class QuickSort {

    void sort(@NotNull final int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, final int low, final int high) {
        if (low >= high) {
            return;
        }
        final int index = partition(array, low, high);
        sort(array, low, index - 1);
        sort(array, index, high);
    }

    private int partition(int[] array, int low, int high) {
        final int pivot = array[low + (high - low) / 2];
        while (low <= high) {
            while (array[low] < pivot) {
                low++;
            }

            while (array[high] > pivot) {
                high--;
            }

            if (low <= high) {
                final int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }
}
