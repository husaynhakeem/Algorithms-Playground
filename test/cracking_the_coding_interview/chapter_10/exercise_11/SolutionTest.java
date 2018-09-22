package cracking_the_coding_interview.chapter_10.exercise_11;

import Utilities.java.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void peaksAndValleys_1() throws Exception {
        final int[] array = {};

        solution.peaksAndValleys(array);

        assertEquals(0, array.length);
    }

    @Test
    public void peaksAndValleys_2() throws Exception {
        final int[] array = {1};

        solution.peaksAndValleys(array);

        assertEquals(1, array[0]);
    }

    @Test
    public void peaksAndValleys_3() throws Exception {
        final int[] array = {5, 3, 1, 2, 3};

        solution.peaksAndValleys(array);

        final int[] expectedResult = {5, 1, 3, 2, 3};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, array));
    }

    @Test
    public void peaksAndValleys_4() throws Exception {
        final int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        solution.peaksAndValleys(array);

        final int[] expectedResult = {10, 8, 9, 6, 7, 4, 5, 2, 3, 1};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, array));
    }

    @Test
    public void peaksAndValleys_5() throws Exception {
        final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        solution.peaksAndValleys(array);

        final int[] expectedResult = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, array));
    }

    @Test
    public void peaksAndValleys_6() throws Exception {
        final int[] array = {17, 6, 24, 25, 19, 20, 4, 4, 15, 16, 29};

        solution.peaksAndValleys(array);

        final int[] expectedResult = {17, 6, 25, 19, 24, 4, 20, 4, 16, 15, 29};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, array));
    }
}