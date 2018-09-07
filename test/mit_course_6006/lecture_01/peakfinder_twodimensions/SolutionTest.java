package mit_course_6006.lecture_01.peakfinder_twodimensions;

import kotlin.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findPeak_1() throws Exception {
        final int[][] matrix = {
                {1, 2, 3},
                {2, 3, 2},
                {1, 1, 2}
        };

        final Pair<Integer, Integer> peakCoords = solution.findPeak(matrix);

        final List<Integer> peaks = new ArrayList<>();
        peaks.add(3);
        peaks.add(2);
        assertTrue(peaks.contains(matrix[peakCoords.getFirst()][peakCoords.getSecond()]));
    }

    @Test
    public void findPeak_2() throws Exception {
        final int[][] matrix = {
                {1, 2},
                {2, 3}
        };

        final Pair<Integer, Integer> peakCoords = solution.findPeak(matrix);

        assertEquals(1, (int) peakCoords.getFirst());
        assertEquals(1, (int) peakCoords.getSecond());
    }

    @Test
    public void findPeak_3() throws Exception {
        final int[][] matrix = {};

        final Pair<Integer, Integer> peakCoords = solution.findPeak(matrix);

        assertEquals(-1, (int) peakCoords.getFirst());
        assertEquals(-1, (int) peakCoords.getSecond());
    }
}