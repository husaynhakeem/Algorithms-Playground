package leetcode.interview_amazon_3.problem_2;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void partitionLabels() {
        final String s = "ababcbacadefegdehijhklij";

        final List<Integer> result = solution.partitionLabels(s);

        assertEquals(ListUtils.createList(9, 7, 8), result);
    }
}