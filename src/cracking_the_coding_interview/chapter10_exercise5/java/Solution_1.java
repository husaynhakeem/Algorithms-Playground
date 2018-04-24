package cracking_the_coding_interview.chapter10_exercise5.java;

import java.util.BitSet;

public class Solution_1 {

    public static void main(String[] args) {
        String[] first = new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        System.out.println(search(first, "ball"));
        System.out.println(search(first, "pokemon"));
        System.out.println(search(first, ""));
    }

    private static int search(String[] strings, String x) {
        return search(strings, 0, strings.length - 1, x);
    }

    private static int search(String[] strings, int low, int high, String x) {
        if (high < low)
            return -1;

        int mid = (low + high) / 2;

        if (strings[mid].isEmpty())
            mid = findClosestNonEmptyStringIndex(strings, low, mid, high);

        if (mid == -1)
            return -1;

        if (strings[mid].equals(x))
            return mid;

        if (strings[mid].compareTo(x) < 0)
            return search(strings, mid + 1, high, x);

        return search(strings, low, mid - 1, x);
    }

    private static int findClosestNonEmptyStringIndex(String[] strings, int low, int mid, int high) {
        int left = mid - 1;
        int right = mid + 1;

        while (true) {
            if (left < low && right > high)
                break;

            if (left >= low && !strings[left].isEmpty())
                return left;

            if (right <= high && !strings[right].isEmpty())
                return right;

            left--;
            right++;
        }

        return -1;
    }
}
