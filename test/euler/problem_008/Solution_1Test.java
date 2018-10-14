package euler.problem_008;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void specialPythagoreanTriplet_1() throws Exception {
        final int n = 12;

        final int result = solution.specialPythagoreanTriplet(n);

        assertEquals(60, result);
    }

    @Test
    public void specialPythagoreanTriplet_2() throws Exception {
        final int n = 1000;

        final int result = solution.specialPythagoreanTriplet(n);

        assertEquals(31_875_000, result);
    }
}