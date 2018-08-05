package leetcode.weekly_contest_096.problem_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void numRescueBoats_1() throws Exception {
        final int[] people = {1, 2};
        final int limit = 3;

        final int result = solution.numRescueBoats(people, limit);

        assertEquals(1, result);
    }

    @Test
    public void numRescueBoats_2() throws Exception {
        final int[] people = {3, 2, 2, 1};
        final int limit = 3;

        final int result = solution.numRescueBoats(people, limit);

        assertEquals(3, result);
    }

    @Test
    public void numRescueBoats_3() throws Exception {
        final int[] people = {3, 5, 3, 4};
        final int limit = 5;

        final int result = solution.numRescueBoats(people, limit);

        assertEquals(4, result);
    }

    @Test
    public void numRescueBoats_4() throws Exception {
        final int[] people = {44, 10, 29, 12, 49, 41, 23, 5, 17, 26};
        final int limit = 50;

        final int result = solution.numRescueBoats(people, limit);

        assertEquals(6, result);
    }
}