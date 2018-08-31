package leetcode.problem_0852;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void peakIndexInMountainArray_1() throws Exception {
        final int[] A = {0};

        final int result = solution.peakIndexInMountainArray(A);

        assertEquals(0, result);
    }

    @Test
    public void peakIndexInMountainArray_2() throws Exception {
        final int[] A = {0, 1, 0};

        final int result = solution.peakIndexInMountainArray(A);

        assertEquals(1, result);
    }

    @Test
    public void peakIndexInMountainArray_3() throws Exception {
        final int[] A = {0, 2, 1, 0};

        final int result = solution.peakIndexInMountainArray(A);

        assertEquals(1, result);
    }

    @Test
    public void peakIndexInMountainArray_4() throws Exception {
        final int[] A = {1, 2, 3, 4, 5};

        final int result = solution.peakIndexInMountainArray(A);

        assertEquals(4, result);
    }
}