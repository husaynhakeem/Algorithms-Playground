package cracking_the_coding_interview.java;

import static Utilities.java.ArrayUtils.printArrayOfInts;

public class QuickSort {

    public static void main(String[] args) {
        int[] first = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        quickSort(first);
        printArrayOfInts(first);

        int[] second = new int[]{5, 4, 6, 9, 1, 3, 2, 7, 0, 10, 8};
        quickSort(second);
        printArrayOfInts(second);
    }

    private static void quickSort(int[] array) {
        if (array == null)
            return;

        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        int index = partition(array, low, high);

        if (low < index - 1)
            quickSort(array, low, index - 1);

        if (index < high)
            quickSort(array, index, high);
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[(low + high) / 2];

        while (low <= high) {
            while (array[low] < pivot)
                low++;

            while (array[high] > pivot)
                high--;

            if (low <= high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;

                low++;
                high--;
            }
        }

        return low;
    }
}
