package leetcode.interview_amazon_1.problem_2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void kClosest_1() throws Exception {
        final int[][] points = {{1, 3}, {-2, 2}};
        final int k = 1;

        final int[][] result = solution.kClosest(points, k);

        assertEquals(1, result.length);
        assertArrayEquals(new int[]{-2, 2}, result[0]);
    }

    @Test
    public void kClosest_2() throws Exception {
        final int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        final int k = 2;

        final int[][] result = solution.kClosest(points, k);

        assertEquals(2, result.length);
        assertArrayEquals(new int[]{3, 3}, result[0]);
        assertArrayEquals(new int[]{-2, 4}, result[1]);
    }
}