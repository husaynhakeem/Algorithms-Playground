package mit_course_6006.lecture_01.peakfinder_onedimension;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findPeak_1() throws Exception {
        final int[] array = {6, 7, 4, 3, 2, 1, 4, 5};

        final int peakPosition = solution.findPeak(array);

        final List<Integer> peaks = new ArrayList<>();
        peaks.add(7);
        peaks.add(5);
        assertTrue(peaks.contains(array[peakPosition]));
    }

    @Test
    public void findPeak_2() throws Exception {
        final int[] array = {6, 4, 5, 2, 3, 4, 5};

        final int peakPosition = solution.findPeak(array);

        final List<Integer> peaks = new ArrayList<>();
        peaks.add(6);
        peaks.add(5);
        assertTrue(peaks.contains(array[peakPosition]));
    }

    @Test
    public void findPeak_3() throws Exception {
        final int[] array = {6, 5, 4, 3, 2, 1};

        final int peakPosition = solution.findPeak(array);

        final List<Integer> peaks = new ArrayList<>();
        peaks.add(6);
        assertTrue(peaks.contains(array[peakPosition]));
    }

    @Test
    public void findPeak_4() throws Exception {
        final int[] array = {1, 2, 3, 4, 5, 6};

        final int peakPosition = solution.findPeak(array);

        final List<Integer> peaks = new ArrayList<>();
        peaks.add(6);
        assertTrue(peaks.contains(array[peakPosition]));
    }

    @Test
    public void findPeak_5() throws Exception {
        final int[] array = {1};

        final int peakPosition = solution.findPeak(array);

        assertEquals(0, peakPosition);
    }

    @Test
    public void findPeak_6() throws Exception {
        final int[] array = {};

        final int peakPosition = solution.findPeak(array);

        assertEquals(-1, peakPosition);
    }

    @Test
    public void findPeak_7() throws Exception {
        final int[] array = {2, 3, 6, -2, -1, -7, 9};

        final int peakPosition = solution.findPeak(array);

        final List<Integer> peaks = new ArrayList<>();
        peaks.add(6);
        peaks.add(-1);
        peaks.add(9);
        assertTrue(peaks.contains(array[peakPosition]));
    }
}