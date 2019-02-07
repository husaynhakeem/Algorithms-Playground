package leetcode.problem_0914;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void hasGroupsSizeX_1() throws Exception {
        final int[] array = {1, 2, 3, 4, 4, 3, 2, 1};

        final boolean result = solution.hasGroupsSizeX(array);

        assertTrue(result);
    }

    @Test
    public void hasGroupsSizeX_2() throws Exception {
        final int[] array = {1, 1, 1, 2, 2, 2, 3, 3};

        final boolean result = solution.hasGroupsSizeX(array);

        assertFalse(result);
    }

    @Test
    public void hasGroupsSizeX_3() throws Exception {
        final int[] array = {1};

        final boolean result = solution.hasGroupsSizeX(array);

        assertFalse(result);
    }

    @Test
    public void hasGroupsSizeX_4() throws Exception {
        final int[] array = {1, 1};

        final boolean result = solution.hasGroupsSizeX(array);

        assertTrue(result);
    }

    @Test
    public void hasGroupsSizeX_5() throws Exception {
        final int[] array = {1, 1, 2, 2, 2, 2};

        final boolean result = solution.hasGroupsSizeX(array);

        assertTrue(result);
    }
}