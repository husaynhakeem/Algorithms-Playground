package leetcode.problem_0056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }

        // Sort intervals from smallest to biggest
        Arrays.sort(intervals, (i1, i2) -> {
            return i1[0] - i2[0];
        });

        // Merge intervals
        final List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            final int[] head = merged.get(merged.size() - 1);
            final int[] current = intervals[i];
            if (current[0] <= head[1]) {
                // Merge
                head[1] = Math.max(head[1], current[1]);
            } else {
                merged.add(current);
            }
        }

        // Convert List of merged intervals to int matrix
        final int[][] mergedMatrix = new int[merged.size()][2];
        int index = 0;
        for (int[] interval: merged) {
            mergedMatrix[index++] = interval;
        }
        return mergedMatrix;
    }
}
