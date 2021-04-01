package leetcode.problem_0049;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        final List<List<String>> groups = solution.groupAnagrams(strs);

        assertEquals(3, groups.size());
        assertTrue(groups.contains(ListUtils.createList("bat")));
        assertTrue(groups.contains(ListUtils.createList("tan", "nat")));
        assertTrue(groups.contains(ListUtils.createList("eat", "tea", "ate")));
    }

    @Test
    public void test_2() {
        final String[] strs = {""};

        final List<List<String>> groups = solution.groupAnagrams(strs);

        assertEquals(1, groups.size());
        assertTrue(groups.contains(ListUtils.createList("")));
    }

    @Test
    public void test_3() {
        final String[] strs = {"a"};

        final List<List<String>> groups = solution.groupAnagrams(strs);

        assertEquals(1, groups.size());
        assertTrue(groups.contains(ListUtils.createList("a")));
    }
}