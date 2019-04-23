package leetcode.problem_0057;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            final int[][] newIntervals = new int[1][2];
            newIntervals[0] = newInterval;
            return newIntervals;
        }

        if (newInterval[1] < intervals[0][0]) {
            final int[][] newIntervals = new int[intervals.length + 1][2];
            newIntervals[0] = newInterval;
            int index = 1;
            for (final int[] interval : intervals) {
                newIntervals[index++] = interval;
            }
            return newIntervals;
        }

        if (newInterval[0] > intervals[intervals.length - 1][1]) {
            final int[][] newIntervals = new int[intervals.length + 1][2];
            int index = 0;
            for (final int[] interval : intervals) {
                newIntervals[index++] = interval;
            }
            newIntervals[index] = newInterval;
            return newIntervals;
        }

        final List<int[]> newIntervals = new ArrayList<>();
        int index = 0;

        while (index < intervals.length && intervals[index][1] < newInterval[0]) {
            newIntervals.add(intervals[index++]);
        }

        int start;
        if (!contains(intervals[index], newInterval[0])) {
            start = newInterval[0];
        } else {
            start = intervals[index][0];
        }

        while (index < intervals.length && intervals[index][0] <= newInterval[1]) {
            index++;
        }
        int end = Math.max(intervals[index - 1][1], newInterval[1]);
        newIntervals.add(new int[]{start, end});

        while (index < intervals.length) {
            newIntervals.add(intervals[index++]);
        }

        return toMatrix(newIntervals);
    }

    private boolean contains(final int[] interval, final int n) {
        return interval[0] <= n && n <= interval[1];
    }

    private int[][] toMatrix(final List<int[]> arrays) {
        final int[][] matrix = new int[arrays.size()][2];
        for (int i = 0; i < arrays.size(); i++) {
            matrix[i] = arrays.get(i);
        }
        return matrix;
    }
}
