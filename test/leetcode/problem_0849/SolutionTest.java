package leetcode.problem_0849;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void maxDistToClosest_1() throws Exception {
        final int[] seats = {1, 0, 0, 0, 1, 0, 1};

        final int result = solution.maxDistToClosest(seats);

        assertEquals(2, result);
    }

    @Test
    public void maxDistToClosest_2() throws Exception {
        final int[] seats = {1, 0, 0, 0};

        final int result = solution.maxDistToClosest(seats);

        assertEquals(3, result);
    }

    @Test
    public void maxDistToClosest_3() throws Exception {
        final int[] seats = {0, 0, 0, 0, 0, 1};

        final int result = solution.maxDistToClosest(seats);

        assertEquals(5, result);
    }

    @Test
    public void maxDistToClosest_4() throws Exception {
        final int[] seats = {1, 1, 1, 1, 0, 0, 1};

        final int result = solution.maxDistToClosest(seats);

        assertEquals(1, result);
    }
}