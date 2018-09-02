package cracking_the_coding_interview.chapter_08.exercise_03;

public class Solution_followup_1 {

    public static void main(String[] args) {
        int[] a = new int[]{-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
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

        int midIndex = (low + high) / 2;
        int midValue = a[midIndex];

        if (midValue == midIndex)
            return midIndex;

        int leftIndex = Math.min(midIndex - 1, midValue);
        int magicIndex = findMagicIndex(a, low, leftIndex);
        if (magicIndex >= 0)
            return magicIndex;

        int rightIndex = Math.max(midIndex + 1, midValue);
        return findMagicIndex(a, rightIndex, high);
    }
}
