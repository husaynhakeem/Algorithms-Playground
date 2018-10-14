package euler.problem_009;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_3Test {

    private final Solution_3 solution = new Solution_3();

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