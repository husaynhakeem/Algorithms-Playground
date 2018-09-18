package cracking_the_coding_interview.java;

import Utilities.java.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SelectionSortTest {

    private final SelectionSort selectionSort = new SelectionSort();

    @Test
    public void bubbleSort_1() throws Exception {
        final int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        selectionSort.sort(array);

        final int[] expectedResult = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, array));
    }

    @Test
    public void bubbleSort_2() throws Exception {
        final int[] array = {5, 4, 6, 9, 1, 3, 2, 7, 0, 10, 8};

        selectionSort.sort(array);

        final int[] expectedResult = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, array));
    }

    @Test
    public void bubbleSort_3() throws Exception {
        final int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        selectionSort.sort(array);

        final int[] expectedResult = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, array));
    }

    @Test
    public void bubbleSort_4() throws Exception {
        final int[] array = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            array[i] = 1_000_000 - i;
        }

        selectionSort.sort(array);

        final int[] expectedResult = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            expectedResult[i] = i + 1;
        }
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, array));
    }
}