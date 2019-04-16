package leetcode.problem_0056;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Interval> merge(final List<Interval> intervals) {
        intervals.sort((interval1, interval2) -> {
            if (interval1.start != interval2.start) {
                return interval1.start - interval2.start;
            }
            return interval1.end - interval2.end;
        });

        final List<Interval> results = new ArrayList<>();

        for (final Interval interval : intervals) {
            if (results.isEmpty()) {
                results.add(interval);
                continue;
            }

            final Interval previous = results.get(results.size() - 1);
            if (canMerge(previous, interval) || canMerge(interval, previous)) {
                previous.start = Math.min(previous.start, interval.start);
                previous.end = Math.max(previous.end, interval.end);
            } else {
                results.add(interval);
            }
        }

        return results;
    }

    private boolean canMerge(final Interval interval1, final Interval interval2) {
        return interval2.start <= interval1.end && interval1.end <= interval2.end;
    }

    public static class Interval {
        int start;
        int end;

        public Interval() {
            start = 0;
            end = 0;
        }

        public Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Interval) {
                final Interval otherInterval = (Interval) other;
                return otherInterval.start == start && otherInterval.end == end;
            }
            return false;
        }
    }
}
