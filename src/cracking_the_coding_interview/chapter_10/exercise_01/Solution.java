package cracking_the_coding_interview.chapter_10.exercise_01;

import org.jetbrains.annotations.NotNull;

class Solution {

    void sortedMerge(@NotNull final int[] a, @NotNull final int[] b) {
        int indexA = a.length - 1;
        while (a[indexA] == 0) {
            indexA--;
        }
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
