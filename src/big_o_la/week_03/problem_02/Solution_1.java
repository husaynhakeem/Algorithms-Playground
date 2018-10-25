package big_o_la.week_03.problem_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution_1 {

    static class Interval {
        int lowerBound;
        int upperBound;

        Interval(int lowerBound, int upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        boolean overlapsWith(final Interval interval) {
            return this.lowerBound <= interval.lowerBound && interval.lowerBound <= this.upperBound;
        }

        Interval mergeWith(final Interval interval) {
            return new Interval(
                    Math.min(lowerBound, interval.lowerBound),
                    Math.max(upperBound, interval.upperBound));
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Interval)) {
                return false;
            }
            final Interval interval = (Interval) obj;
            return lowerBound == interval.lowerBound && upperBound == interval.upperBound;
        }
    }

    List<Interval> mergeIntervals(final List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(interval -> interval.lowerBound));
        final List<Interval> result = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {
            if (i + 1 < intervals.size() && intervals.get(i).overlapsWith(intervals.get(i + 1))) {
                result.add(intervals.get(i).mergeWith(intervals.get(i + 1)));
                i++;
            } else {
                result.add(intervals.get(i));
            }
        }
        return result;
    }
}
