package cracking_the_coding_interview.chapter10_exercise1.java;

import static Utilities.java.ArrayUtils.printArrayOfInts;

public class Solution_1 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 8, 10, -1, -1, -1, -1};
        int[] b = new int[]{2, 3, 4};

        sortedMerge(a, b, 3);
        printArrayOfInts(a);

        int[] c = new int[]{26, 28, 78, 200, 245, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int[] d = new int[]{2, 3, 4, 27, 29, 31};

        sortedMerge(c, d, 4);
        printArrayOfInts(c);
    }

    private static void sortedMerge(int[] a, int[] b, int indexA) {
        int indexB = b.length - 1;
        int indexMerged = indexA + indexB + 1;

        while (indexB >= 0) {
            if (indexA >= 0 && a[indexA] > b[indexB])
                a[indexMerged--] = a[indexA--];
            else
                a[indexMerged--] = b[indexB--];
        }
    }
}
