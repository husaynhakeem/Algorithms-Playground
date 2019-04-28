package leetcode.problem_0373;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new ArrayList<>();
        }

        final boolean invertResultsOrder = nums1.length > nums2.length;
        final int[] shorterArray = nums1.length <= nums2.length ? nums1 : nums2;
        final int[] longerArray = nums1.length <= nums2.length ? nums2 : nums1;
        final List<int[]> indices = new ArrayList<>();
        for (int i = 0; i < shorterArray.length; i++) {
            indices.add(new int[]{i, 0});
        }

        final List<int[]> results = new ArrayList<>();
        final int maxCount = shorterArray.length * longerArray.length;
        int count = 0;
        while (count < maxCount && results.size() < k) {
            final int minIndex = findMinSumIndex(indices, shorterArray, longerArray);
            final int[] pair = indices.get(minIndex);

            if (invertResultsOrder) {
                results.add(new int[]{longerArray[pair[1]], shorterArray[pair[0]]});
            } else {
                results.add(new int[]{shorterArray[pair[0]], longerArray[pair[1]]});
            }

            if (pair[1] + 1 >= longerArray.length) {
                indices.remove(minIndex);
            } else {
                indices.set(minIndex, new int[]{pair[0], pair[1] + 1});
            }

            count++;
        }

        return results;
    }

    private int findMinSumIndex(final List<int[]> indices, final int[] first, final int[] second) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < indices.size(); i++) {
            if (first[indices.get(i)[0]] + second[indices.get(i)[1]] < min) {
                min = first[indices.get(i)[0]] + second[indices.get(i)[1]];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
