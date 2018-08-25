package Utilities.java;

import org.jetbrains.annotations.NotNull;

public class ArrayUtils {

    public static void printArrayOfInts(int[] array) {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }

        sb.append("]");

        System.out.println(sb.toString());
    }

    public static void printArray(Object[] objects) {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(objects[i].toString());
        }

        sb.append("]");

        System.out.println(sb.toString());
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (Integer n : array) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static boolean areArraysEqual(@NotNull int[] array1, @NotNull int[] array2) {
        final int length1 = array1.length;
        final int length2 = array2.length;

        if (length1 != length2) {
            return false;
        }

        for (int i = 0; i < length1; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
