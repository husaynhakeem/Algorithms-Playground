package leetcode.problem_0047;

import Utilities.java.ListUtils;
import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    public void test_1() {
        final int[] nums = {1, 1, 2};

        final List<List<Integer>> result = solution.permuteUnique(nums);

        final List<List<Integer>> expected = ListUtils.createList(
                ListUtils.createList(1, 1, 2),
                ListUtils.createList(1, 2, 1),
                ListUtils.createList(2, 1, 1)
        );
        assertEquals(expected, result);
    }
}