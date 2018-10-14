package euler.problem_006;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void sumSquareDifference_1() throws Exception {
        final int n = 10;

        final int result = solution.sumSquareDifference(n);

        assertEquals(2640, result);
    }

    @Test
    public void sumSquareDifference_2() throws Exception {
        final int n = 100;

        final int result = solution.sumSquareDifference(n);

        assertEquals(25_164_150, result);
    }
}