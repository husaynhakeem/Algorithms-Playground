package leetcode.problem_0763;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void partitionLabels() throws Exception {
        final String s = "ababcbacadefegdehijhklij";

        final List<Integer> result = solution.partitionLabels(s);

        assertTrue(ListUtils.areEqual(ListUtils.createList(9, 7, 8), result));
    }
}