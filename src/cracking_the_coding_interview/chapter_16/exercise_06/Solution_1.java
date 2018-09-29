package cracking_the_coding_interview.chapter_16.exercise_06;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;

class Solution_1 {

    int smallestDifference(@NotNull final int[] a, @NotNull final int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        final int[] c = merge(a, b);

        HashSet<Integer> aSet = toHashSet(a);
        HashSet<Integer> bSet = toHashSet(b);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < c.length - 1; i++) {
            final int diff = c[i + 1] - c[i];
            if (0 <= diff && diff < min && areInDifferentArrays(aSet, bSet, c[i], c[i + 1])) {
                min = diff;
            }
        }

        return min;
    }

    @NotNull
    private int[] merge(@NotNull final int[] a, @NotNull final int[] b) {
        final int[] c = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;

        while (aIndex < a.length || bIndex < b.length) {
            if (aIndex >= a.length) {
                c[cIndex++] = b[bIndex++];
            } else if (bIndex >= b.length) {
                c[cIndex++] = a[aIndex++];
            } else {
                c[cIndex++] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            }
        }

        return c;
    }

    private boolean areInDifferentArrays(@NotNull final HashSet<Integer> aSet, @NotNull final HashSet<Integer> bSet, final int n, final int m) {
        return (aSet.contains(n) && bSet.contains(m)) || (aSet.contains(m) && bSet.contains(n));
    }

    @NotNull
    private HashSet<Integer> toHashSet(@NotNull final int[] array) {
        final HashSet<Integer> list = new HashSet<>();
        for (Integer n : array) {
            list.add(n);
        }
        return list;
    }
}
