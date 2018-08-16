package leetcode.problem_0027;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void removeElement_1() throws Exception {
        final int[] array = null;
        final int val = 1;

        final int result = solution.removeElement(array, val);

        assertEquals(0, result);
        assertNull(array);
    }

    @Test
    public void removeElement_2() throws Exception {
        final int[] array = {};
        final int val = 1;

        final int result = solution.removeElement(array, val);

        assertEquals(0, result);
        assertEquals(0, array.length);
    }

    @Test
    public void removeElement_3() throws Exception {
        final int[] array = {3, 2, 2, 3};
        final int val = 3;

        final int result = solution.removeElement(array, val);

        assertEquals(2, result);
        assertNotEquals(3, array[0]);
        assertNotEquals(3, array[1]);
    }

    @Test
    public void removeElement_4() throws Exception {
        final int[] array = {0, 1, 2, 2, 3, 0, 4, 2};
        final int val = 2;

        final int result = solution.removeElement(array, val);

        assertEquals(5, result);
        assertNotEquals(2, array[0]);
        assertNotEquals(2, array[1]);
        assertNotEquals(2, array[2]);
        assertNotEquals(2, array[3]);
        assertNotEquals(2, array[4]);
    }

    @Test
    public void removeElement_5() throws Exception {
        final int[] array = {2, 2, 2, 2, 2};
        final int val = 2;

        final int result = solution.removeElement(array, val);

        assertEquals(0, result);
    }
}