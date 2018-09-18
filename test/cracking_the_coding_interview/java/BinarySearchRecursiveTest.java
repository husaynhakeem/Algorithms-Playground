package cracking_the_coding_interview.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchRecursiveTest {

    private BinarySearchRecursive binarySearch = new BinarySearchRecursive();

    @Test
    public void search_1() throws Exception {
        final int[] array = {1, 2, 3, 4, 7, 9, 10, 20, 168};

        final int result = binarySearch.search(array, 20);

        assertEquals(7, result);
    }

    @Test
    public void search_2() throws Exception {
        final int[] array = {1, 2, 3, 4, 7, 9, 10, 20, 168};

        final int result = binarySearch.search(array, 5);

        assertEquals(-1, result);
    }

    @Test
    public void search_3() throws Exception {
        final int[] array = new int[100_000_000];
        for (int i = 0; i < 100_000_000; i++) {
            array[i] = i;
        }

        final int result = binarySearch.search(array, 800_000);

        assertEquals(800_000, result);
    }
}