package leetcode.problem_0056;

import Utilities.java.ListUtils;
import leetcode.problem_0056.Solution.Interval;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void merge_1() throws Exception {
        final List<Interval> intervals = ListUtils.createList(
                new Interval(1, 3),
                new Interval(2, 6),
                new Interval(8, 10),
                new Interval(15, 18));

        final List<Interval> result = solution.merge(intervals);

        final List<Interval> expectedResult = ListUtils.createList(
                new Interval(1, 6),
                new Interval(8, 10),
                new Interval(15, 18));
        assertEquals(expectedResult, result);
    }

    @Test
    public void merge_2() throws Exception {
        final List<Interval> intervals = ListUtils.createList(
                new Interval(1, 4),
                new Interval(2, 3));

        final List<Interval> result = solution.merge(intervals);

        final List<Interval> expectedResult = ListUtils.createList(new Interval(1, 4));
        assertEquals(expectedResult, result);
    }
}