package chapter10_sorting.java;

import static Utilities.java.ArrayUtils.printArrayOfInts;

public class MergeSort {

    public static void main(String[] args) {
        int[] first = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        printArrayOfInts(mergeSort(first));

        int[] second = new int[]{5, 4, 6, 9, 1, 3, 2, 7, 0, 10, 8};
        printArrayOfInts(mergeSort(second));
    }

    private static int[] mergeSort(int[] array) {
        if (array == null)
            return null;
        return mergeSort(array, 0, array.length - 1);
    }

    private static int[] mergeSort(int[] array, int low, int high) {
        if (high < low)
            return null;

        if (high == low)
            return new int[]{array[high]};

        int mid = (high + low) / 2;

        int[] left = mergeSort(array, low, mid);
        int[] right = mergeSort(array, mid + 1, high);

        return merge(right, left);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];

        int firstIndex = 0;
        int secondIndex = 0;
        int resultIndex = 0;

        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] < second[secondIndex])
                result[resultIndex++] = first[firstIndex++];
            else
                result[resultIndex++] = second[secondIndex++];
        }

        while (firstIndex < first.length) {
            result[resultIndex++] = first[firstIndex++];
        }

        while (secondIndex < second.length) {
            result[resultIndex++] = second[secondIndex++];
        }

        return result;
    }
}
