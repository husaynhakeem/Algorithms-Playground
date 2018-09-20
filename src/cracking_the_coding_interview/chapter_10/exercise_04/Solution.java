package cracking_the_coding_interview.chapter_10.exercise_04;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

class Solution {

    static class Listy extends ArrayList<Integer> {

        int elementAt(final int i) {
            if (size() <= i) {
                return -1;
            }
            return get(i);
        }
    }

    int search(@NotNull final Listy a, final int x) {
        return search(a, 0, getApproximateListySize(a, x), x);
    }

    private int search(@NotNull final Listy a, int low, int high, final int x) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.elementAt(mid) == x) {
                return mid;
            }
            if (a.elementAt(mid) < x) {
                low = mid + 1;
            } else if (a.elementAt(mid) > x || a.elementAt(mid) == -1) {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int getApproximateListySize(@NotNull final Listy a, final int x) {
        int index = 1;
        while (a.elementAt(index) != -1 && a.elementAt(index) < x) {
            index *= 2;
        }
        return index;
    }
}
