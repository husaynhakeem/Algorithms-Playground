package Utilities.java;

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
}
