package big_o_la.week_03.problem_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution_2 {

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

        void mergeWith(final Interval interval) {
            this.lowerBound = Math.min(lowerBound, interval.lowerBound);
            this.upperBound = Math.max(upperBound, interval.upperBound);
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
        result.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            final Interval lastAddedInterval = result.get(result.size() - 1);
            if (lastAddedInterval.overlapsWith(intervals.get(i))) {
                lastAddedInterval.mergeWith(intervals.get(i));
            } else {
                result.add(intervals.get(i));
            }
        }
        return result;
    }
}
