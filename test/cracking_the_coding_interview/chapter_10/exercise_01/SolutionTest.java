package cracking_the_coding_interview.chapter_10.exercise_01;

import Utilities.java.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void sortedMerge_1() throws Exception {
        final int[] a = {1, 5, 8, 10, 0, 0, 0, 0, 0, 0};
        final int[] b = {2, 3, 4};

        solution.sortedMerge(a, b);

        final int[] expectedResult = {1, 2, 3, 4, 5, 8, 10, 0, 0, 0};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, a));
    }

    @Test
    public void sortedMerge_2() throws Exception {
        final int[] a = {26, 28, 78, 200, 245, 0, 0, 0, 0, 0, 0};
        final int[] b = {2, 3, 4, 27, 29, 31};

        solution.sortedMerge(a, b);

        final int[] expectedResult = {2, 3, 4, 26, 27, 28, 29, 31, 78, 200, 245};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, a));
    }
}