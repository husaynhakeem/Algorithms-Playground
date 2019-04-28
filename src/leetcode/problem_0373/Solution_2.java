package leetcode.problem_0373;

import java.util.*;

public class Solution_2 {

    List<int[]> kSmallestPairs(final int[] nums1, final int[] nums2, int k) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new ArrayList<>();
        }

        final Queue<int[]> indices = new PriorityQueue<>(Comparator.comparingInt(a -> (a[0] + a[1])));
        for (final int n : nums1) {
            indices.offer(new int[]{n, nums2[0], 0});
        }

        final List<int[]> results = new ArrayList<>();
        while (k-- > 0 && !indices.isEmpty()) {
            final int[] head = indices.poll();
            results.add(new int[]{head[0], head[1]});

            if (head[2] + 1 < nums2.length) {
                indices.offer(new int[]{head[0], nums2[head[2] + 1], head[2] + 1});
            }
        }

        return results;
    }
}
