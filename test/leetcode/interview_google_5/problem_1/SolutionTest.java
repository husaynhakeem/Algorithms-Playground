package leetcode.interview_google_5.problem_1;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void groupStrings_1() throws Exception {
        final String[] strings = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};

        final List<List<String>> result = solution.groupStrings(strings);

        assertEquals(4, result.size());
        assertTrue(result.contains(ListUtils.createList("abc", "bcd", "xyz")));
        assertTrue(result.contains(ListUtils.createList("acef")));
        assertTrue(result.contains(ListUtils.createList("az", "ba")));
        assertTrue(result.contains(ListUtils.createList("a", "z")));
    }
}