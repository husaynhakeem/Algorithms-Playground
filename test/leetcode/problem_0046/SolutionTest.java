package leetcode.problem_0046;

import Utilities.java.ListUtils;
import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    public void test_1() {
        final int[] nums = {1, 2, 3};

        final List<List<Integer>> result = solution.permute(nums);

        final List<List<Integer>> expected = ListUtils.createList(
                ListUtils.createList(1, 2, 3),
                ListUtils.createList(1, 3, 2),
                ListUtils.createList(2, 1, 3),
                ListUtils.createList(2, 3, 1),
                ListUtils.createList(3, 2, 1),
                ListUtils.createList(3, 1, 2)
        );
        assertEquals(expected, result);
    }
}