package leetcode.problem_0283;

import Utilities.java.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void moveZeroes_1() throws Exception {
        final int[] nums = {0, 1, 0, 3, 12};

        solution.moveZeroes(nums);

        assertTrue(ArrayUtils.areArraysEqual(new int[]{1, 3, 12, 0, 0}, nums));
    }

    @Test
    public void moveZeroes_2() throws Exception {
        final int[] nums = {};

        solution.moveZeroes(nums);

        assertTrue(ArrayUtils.areArraysEqual(new int[]{}, nums));
    }

    @Test
    public void moveZeroes_3() throws Exception {
        final int[] nums = {0, 0, 0, 0};

        solution.moveZeroes(nums);

        assertTrue(ArrayUtils.areArraysEqual(new int[]{0, 0, 0, 0}, nums));
    }

    @Test
    public void moveZeroes_4() throws Exception {
        final int[] nums = {0, 0, 0, 0, 7, 9, 0};

        solution.moveZeroes(nums);

        assertTrue(ArrayUtils.areArraysEqual(new int[]{7, 9, 0, 0, 0, 0, 0}, nums));
    }
}