package leetcode.problem_0057;

import java.util.ArrayList;
import java.util.List;

public class Solution_2 {

    int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            final int[][] newIntervals = new int[1][2];
            newIntervals[0] = newInterval;
            return newIntervals;
        }

        final List<int[]> newIntervals = new ArrayList<>();
        for (final int[] interval : intervals) {
            if (newInterval == null || newInterval[0] > interval[1]) {
                newIntervals.add(interval);
            } else if (newInterval[1] < interval[0]) {
                newIntervals.add(newInterval);
                newIntervals.add(interval);
                newInterval = null;
            } else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        if (newInterval != null) {
            newIntervals.add(newInterval);
        }

        return newIntervals.toArray(new int[newIntervals.size()][]);
    }
}
