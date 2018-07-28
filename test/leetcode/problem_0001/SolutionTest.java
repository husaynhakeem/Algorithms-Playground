package leetcode.problem_0001;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void twoSum_1() throws Exception {
        final int[] array = {2, 7, 11, 15};
        final int target = 9;

        final int[] result = solution.twoSum(array, target);

        assertEquals(2, result.length);
        assertTrue(result[0] == 0);
        assertTrue(result[1] == 1);
    }

    @Test
    public void twoSum_2() throws Exception {
        final int[] array = {2, 7, 11, 15};
        final int target = 26;

        final int[] result = solution.twoSum(array, target);

        assertEquals(2, result.length);
        assertTrue(result[0] == 2);
        assertTrue(result[1] == 3);
    }
}