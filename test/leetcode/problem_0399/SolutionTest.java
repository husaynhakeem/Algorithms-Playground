package leetcode.problem_0399;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void calcEquation_1() throws Exception {
        final String[][] equations = {{"a", "b"}, {"b", "c"}};
        final double[] values = {2.0, 3.0};
        final String[][] queries = {{"a", "c"}, {"b", "c"}, {"a", "e"}, {"a", "a"}, {"x", "x"}};

        final double[] result = solution.calcEquation(equations, values, queries);

        assertArraysEqual(new double[]{6.0, 3.0, -1.0, 1.0, -1.0}, result);
    }

    @Test
    public void calcEquation_2() throws Exception {
        final String[][] equations = {{"a", "b"}, {"b", "c"}, {"c", "d"}};
        final double[] values = {2.0, 3.0, 6.0};
        final String[][] queries = {{"a", "c"}, {"b", "d"}, {"a", "d"}, {"a", "a"}, {"x", "x"}};

        final double[] result = solution.calcEquation(equations, values, queries);

        assertArraysEqual(new double[]{6.0, 18.0, 36.0, 1.0, -1.0}, result);
    }

    private void assertArraysEqual(final double[] array, final double[] other) {
        assertEquals(array.length, other.length);
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], other[i], 0);
        }
    }
}