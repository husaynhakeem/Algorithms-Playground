package leetcode.problem_0215;

import java.util.HashSet;
import java.util.Set;

class Solution_1 {

    int findKthLargest(int[] array, int k) {
        final Set<Integer> indicesToIgnore = new HashSet<>();
        int max = 0;

        for (int i = 0; i < k; i++) {
            max = getMaxHelper(array, indicesToIgnore);
        }

        return max;
    }

    private int getMaxHelper(final int[] array, final Set<Integer> indicesToIgnore) {
        int max = Integer.MIN_VALUE;
        int indexMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (!indicesToIgnore.contains(i) && array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }

        indicesToIgnore.add(indexMax);
        return max;
    }
}
