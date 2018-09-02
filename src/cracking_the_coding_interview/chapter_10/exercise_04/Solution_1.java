package cracking_the_coding_interview.chapter_10.exercise_04;

import java.util.ArrayList;

public class Solution_1 {

    public static void main(String[] args) {
        Listy first = new Listy();
        first.add(1);
        first.add(2);
        first.add(5);
        first.add(7);
        first.add(19);
        first.add(109);
        first.add(245);
        System.out.println(search(first, 16));

        Listy second = new Listy();
        second.add(1);
        second.add(2);
        second.add(5);
        second.add(7);
        second.add(19);
        second.add(109);
        second.add(245);
        System.out.println(search(second, 109));
    }

    private static int search(Listy a, int x) {
        int size = getApproximateListySize(a, x);
        return search(a, 0, size, x);
    }

    private static int getApproximateListySize(Listy a, int x) {
        int index = 1;

        while (a.elementAt(index) != -1 && a.elementAt(index) < x) {
            index *= 2;
        }

        return index;
    }

    private static int search(Listy a, int low, int high, int x) {
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a.elementAt(mid) == x)
                return mid;

            if (a.elementAt(mid) < x)
                low = mid + 1;
            else if (a.elementAt(mid) > x || a.elementAt(mid) == -1)
                high = mid - 1;
        }

        return -1;
    }

    private static class Listy extends ArrayList<Integer> {

        public int elementAt(int i) {
            if (size() <= i)
                return -1;
            return get(i);
        }
    }
}
