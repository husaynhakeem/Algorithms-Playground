package chapter10_sorting.java;

import static Utilities.java.ArrayUtils.printArrayOfInts;

public class BubbleSort {

    public static void main(String[] args) {
        int[] first = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        bubbleSort(first);
        printArrayOfInts(first);

        int[] second = new int[]{5, 4, 6, 9, 1, 3, 2, 7, 0, 10, 8};
        bubbleSort(second);
        printArrayOfInts(second);
    }

    private static void bubbleSort(int[] array) {
        if (array == null)
            return;

        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

        } while (swapped);
    }
}
