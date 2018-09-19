package cracking_the_coding_interview.chapter_10.exercise_03;

class Solution {

    int search(int[] a, int x) {
        return search(a, 0, a.length - 1, x);
    }

    private int search(int[] a, int low, int high, int x) {
        if (high < low) {
            return -1;
        }

        final int mid = low + (high - low) / 2;

        if (a[mid] == x) {
            return mid;
        }

        if (a[low] < a[mid]) {
            if (a[low] <= x && x < a[mid]) {
                return search(a, low, mid - 1, x);
            } else {
                return search(a, mid + 1, high, x);
            }
        } else if (a[low] > a[mid]) {
            if (a[mid] < x && x <= a[high]) {
                return search(a, mid + 1, high, x);
            } else {
                return search(a, low, mid - 1, x);
            }
        } else if (a[low] == a[mid]) {
            if (a[mid] != a[high]) {
                return search(a, mid + 1, high, x);
            } else {
                int index = search(a, low, mid - 1, x);
                if (index == -1) {
                    return search(a, mid + 1, high, x);
                } else {
                    return index;
                }
            }
        }
        return -1;
    }
}