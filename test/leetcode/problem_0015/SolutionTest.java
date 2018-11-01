package leetcode.problem_0015;

import leetcode.problem_0015.Solution.Triplet;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void threeSum_1() throws Exception {
        final int[] array = {};
        final int k = 2;

        final List<Triplet> result = solution.threeSum(array, k);

        assertTrue(result.isEmpty());
    }

    @Test
    public void threeSum_2() throws Exception {
        final int[] array = {1, 2};
        final int k = 3;

        final List<Triplet> result = solution.threeSum(array, k);

        assertTrue(result.isEmpty());
    }

    @Test
    public void threeSum_3() throws Exception {
        final int[] array = {1, 2, -1};
        final int k = 2;

        final List<Triplet> result = solution.threeSum(array, k);

        assertEquals(1, result.size());
        assertEquals(new Triplet(-1, 1, 2), result.get(0));
    }

    @Test
    public void threeSum_4() throws Exception {
        final int[] array = {-1, 0, 1, 2, -1, -4};
        final int k = 0;

        final List<Triplet> result = solution.threeSum(array, k);

        assertEquals(2, result.size());
        assertEquals(new Triplet(-1, -1, 2), result.get(0));
        assertEquals(new Triplet(-1, 0, 1), result.get(1));
    }
}