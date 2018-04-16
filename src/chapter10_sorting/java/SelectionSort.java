package chapter10_sorting.java;

import static Utilities.java.ArrayUtils.printArray;

public class SelectionSort {

    public static void main(String[] args) {
        int[] first = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        selectionSort(first);
        printArray(first);

        int[] second = new int[]{5, 4, 6, 9, 1, 3, 2, 7, 0, 10, 8};
        selectionSort(second);
        printArray(second);
    }

    private static void selectionSort(int[] array) {
        if (array == null)
            return;

        int minIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
