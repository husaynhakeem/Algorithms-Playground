package chapter10_searching.java;

public class BinarySearch_Iterative {

    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3, 4, 7, 9, 10, 20, 168};
        System.out.println(binarySearch(first, 20));

        int[] second = new int[]{1, 2, 3, 4, 7, 9, 10, 20, 168};
        System.out.println(binarySearch(second, 5));
    }

    private static int binarySearch(int[] array, int x) {
        if (array == null)
            return -1;

        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] < x)
                low = mid + 1;
            else if (array[mid] > x)
                high = mid - 1;
        }

        return -1;
    }
}
