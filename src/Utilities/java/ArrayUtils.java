package Utilities.java;

public class ArrayUtils {

    public static void printArray(int[] array) {
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
}
