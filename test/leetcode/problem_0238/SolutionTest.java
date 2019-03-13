package leetcode.problem_0238;

import Utilities.java.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void productExceptSelf_1() throws Exception {
        final int[] array = {};

        final int[] result = solution.productExceptSelf(array);

        final int[] expectedResult = {};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, result));
    }

    @Test
    public void productExceptSelf_2() throws Exception {
        final int[] array = {1};

        final int[] result = solution.productExceptSelf(array);

        final int[] expectedResult = {1};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, result));
    }

    @Test
    public void productExceptSelf_3() throws Exception {
        final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        final int[] result = solution.productExceptSelf(array);

        final int[] expectedResult = {3628800, 1814400, 1209600, 907200, 725760, 604800, 518400, 453600, 403200, 362880};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, result));
    }
}