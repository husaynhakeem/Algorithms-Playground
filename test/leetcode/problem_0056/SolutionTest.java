package leetcode.problem_0056;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        final int[][] result = solution.merge(intervals);

        final int[][] expectedResult = {
                {1, 6},
                {8, 10},
                {15, 18}
        };
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test_2() {
        final int[][] intervals = {
                {1, 4},
                {4, 5},
        };

        final int[][] result = solution.merge(intervals);

        final int[][] expectedResult = {
                {1, 5},
        };
        assertArrayEquals(expectedResult, result);
    }
}