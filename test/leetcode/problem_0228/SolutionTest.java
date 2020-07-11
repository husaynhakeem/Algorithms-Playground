package leetcode.problem_0228;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void summaryRanges_1() {
        final int[] nums = {0, 1, 2, 4, 5, 7};

        final List<String> result = solution.summaryRanges(nums);

        final List<String> expectedResult = ListUtils.createList("0->2", "4->5", "7");
        assertEquals(expectedResult, result);
    }

    @Test
    public void summaryRanges_2() {
        final int[] nums = {0, 2, 3, 4, 6, 8, 9};

        final List<String> result = solution.summaryRanges(nums);

        final List<String> expectedResult = ListUtils.createList("0", "2->4", "6", "8->9");
        assertEquals(expectedResult, result);
    }

    @Test
    public void summaryRanges_3() {
        final int[] nums = {0, 1, 2, 4, 5, 7, 2147483646, 2147483647};

        final List<String> result = solution.summaryRanges(nums);

        final List<String> expectedResult = ListUtils.createList("0->2", "4->5", "7", "2147483646->2147483647");
        assertEquals(expectedResult, result);
    }
}