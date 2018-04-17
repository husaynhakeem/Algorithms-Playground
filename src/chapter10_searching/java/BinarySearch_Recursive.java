package chapter10_searching.java;

public class BinarySearch_Recursive {

    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3, 4, 7, 9, 10, 20, 168};
        System.out.println(binarySearch(first, 20));

        int[] second = new int[]{1, 2, 3, 4, 7, 9, 10, 20, 168};
        System.out.println(binarySearch(first, 5));
    }

    private static int binarySearch(int[] array, int x) {
        if (array == null)
            return -1;

        return binarySearch(array, x, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int x, int low, int high) {
        if (high < low)
            return -1;

        int mid = (low + high) / 2;

        if (array[mid] == x)
            return mid;

        if (array[mid] > x)
            return binarySearch(array, x, low, mid - 1);

        return binarySearch(array, x, mid + 1, high);
    }
}
