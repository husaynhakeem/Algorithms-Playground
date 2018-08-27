package leetcode.problem_0448;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findDisappearedNumbers_1() throws Exception {
        final int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        final List<Integer> result = solution.findDisappearedNumbers(nums);

        assertEquals(2, result.size());
        assertEquals(5, (int) result.get(0));
        assertEquals(6, (int) result.get(1));
    }

    @Test
    public void findDisappearedNumbers_2() throws Exception {
        final int[] nums = {1, 1, 1, 1};

        final List<Integer> result = solution.findDisappearedNumbers(nums);

        assertEquals(3, result.size());
        assertEquals(2, (int) result.get(0));
        assertEquals(3, (int) result.get(1));
        assertEquals(4, (int) result.get(2));
    }

    @Test
    public void findDisappearedNumbers_3() throws Exception {
        final int[] nums = {4, 3, 2, 7, 8, 6, 5, 1};

        final List<Integer> result = solution.findDisappearedNumbers(nums);

        assertEquals(0, result.size());
    }
}