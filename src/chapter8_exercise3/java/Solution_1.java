package chapter8_exercise3.java;

public class Solution_1 {

    public static void main(String[] args) {
        int[] a = new int[]{-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};
        System.out.println(findMagicIndex(a));
    }

    private static int findMagicIndex(int[] a) {
        if (a == null)
            return -1;

        return findMagicIndex(a, 0, a.length - 1);
    }

    private static int findMagicIndex(int[] a, int low, int high) {
        if (high < low)
            return -1;

        int mid = (low + high) / 2;

        if (a[mid] == mid)
            return mid;

        if (a[mid] > mid)
            return findMagicIndex(a, low, mid - 1);

        return findMagicIndex(a, mid + 1, high);
    }
}
