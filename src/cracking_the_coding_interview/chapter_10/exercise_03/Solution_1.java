package cracking_the_coding_interview.chapter_10.exercise_03;

public class Solution_1 {

    public static void main(String[] args) {
        int[] first = new int[]{26, 27, 34, 1, 3, 5, 6, 7, 8, 23};
        System.out.println(search(first, 5));

        int[] second = new int[]{1, 3, 5, 6, 7, 8, 23, 26, 27, 34};
        System.out.println(search(second, 5));

        int[] third = new int[]{26, 27, 34, 1, 3, 5, 6, 7, 8, 23};
        System.out.println(search(third, 2));
    }

    private static int search(int[] a, int x) {
        return search(a, 0, a.length - 1, x);
    }

    private static int search(int[] a, int low, int high, int x) {
        if (high < low)
            return -1;

        int mid = (low + high) / 2;

        if (a[mid] == x)
            return mid;

        if (a[low] < a[mid]) {
            if (a[low] <= x && x < a[mid])
                return search(a, low, mid - 1, x);
            else
                return search(a, mid + 1, high, x);
        } else if (a[low] > a[mid]) {
            if (a[mid] < x && x <= a[high])
                return search(a, mid + 1, high, x);
            else
                return search(a, low, mid - 1, x);
        } else if (a[low] == a[mid]) {
            if (a[mid] != a[high])
                return search(a, mid + 1, high, x);
            else {
                int index = search(a, low, mid - 1, x);
                if (index == -1)
                    return search(a, mid + 1, high, x);
            }
        }

        return -1;
    }
}
