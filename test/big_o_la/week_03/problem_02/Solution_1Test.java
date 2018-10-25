package big_o_la.week_03.problem_02;

import Utilities.java.ListUtils;
import big_o_la.week_03.problem_02.Solution_1.Interval;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void mergeIntervals_1() throws Exception {
        final List<Interval> intervals = ListUtils.createList(
                new Interval(2, 4),
                new Interval(6, 8),
                new Interval(5, 7),
                new Interval(1, 3));

        final List<Interval> result = solution.mergeIntervals(intervals);

        assertEquals(2, result.size());
        assertTrue(result.contains(new Interval(1, 4)));
        assertTrue(result.contains(new Interval(5, 8)));
    }

    @Test
    public void mergeIntervals_2() throws Exception {
        final List<Interval> intervals = ListUtils.createList(
                new Interval(2, 4),
                new Interval(6, 8),
                new Interval(10, 11),
                new Interval(21, 33));

        final List<Interval> result = solution.mergeIntervals(intervals);

        assertEquals(4, result.size());
        assertTrue(result.containsAll(intervals));
    }
}