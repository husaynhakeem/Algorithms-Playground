package leetcode.problem_0035;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[] nums = {1, 3, 5, 6};
        final int target = 5;

        final int index = solution.searchInsert(nums, target);

        assertEquals(index, 2);
    }

    @Test
    public void test_2() {
        final int[] nums = {1, 3, 5, 6};
        final int target = 2;

        final int index = solution.searchInsert(nums, target);

        assertEquals(index, 1);
    }

    @Test
    public void test_3() {
        final int[] nums = {1, 3, 5, 6};
        final int target = 7;

        final int index = solution.searchInsert(nums, target);

        assertEquals(index, 4);
    }

    @Test
    public void test_4() {
        final int[] nums = {1, 3, 5, 6};
        final int target = 0;

        final int index = solution.searchInsert(nums, target);

        assertEquals(index, 0);
    }

    @Test
    public void test_5() {
        final int[] nums = {1};
        final int target = 0;

        final int index = solution.searchInsert(nums, target);

        assertEquals(index, 0);
    }
}