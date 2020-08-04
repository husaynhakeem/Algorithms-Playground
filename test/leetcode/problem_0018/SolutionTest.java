package leetcode.problem_0018;

import junit.framework.TestCase;

import java.util.List;

import static Utilities.java.ListUtils.createList;

public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    public void test_1() {
        final int[] nums = {1, 0, -1, 0, -2, 2};
        final int target = 0;

        final List<List<Integer>> result = solution.fourSum(nums, target);
        final List<List<Integer>> expected = createList(
                createList(-2, -1, 1, 2),
                createList(-2, 0, 0, 2),
                createList(-1, 0, 0, 1)
        );
        assertEquals(expected, result);
    }
}