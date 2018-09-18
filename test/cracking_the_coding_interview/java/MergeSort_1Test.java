package cracking_the_coding_interview.java;

import Utilities.java.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MergeSort_1Test {

    private final MergeSort_1 mergeSort = new MergeSort_1();

    @Test
    public void bubbleSort_1() throws Exception {
        final int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        final int[] result = mergeSort.sort(array);

        final int[] expectedResult = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, result));
    }

    @Test
    public void bubbleSort_2() throws Exception {
        final int[] array = {5, 4, 6, 9, 1, 3, 2, 7, 0, 10, 8};

        final int[] result = mergeSort.sort(array);

        final int[] expectedResult = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, result));
    }

    @Test
    public void bubbleSort_3() throws Exception {
        final int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        final int[] result = mergeSort.sort(array);

        final int[] expectedResult = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, result));
    }

    @Test
    public void bubbleSort_4() throws Exception {
        final int[] array = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            array[i] = 1_000_000 - i;
        }

        final int[] result = mergeSort.sort(array);

        final int[] expectedResult = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            expectedResult[i] = i + 1;
        }
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, result));
    }
}