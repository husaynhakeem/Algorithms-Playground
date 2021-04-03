package leetcode.problem_0451;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final String input = "tree";

        final String result = solution.frequencySort(input);

        assertEquals("eert", result);
    }

    @Test
    public void test_2() {
        final String input = "aaaccc";

        final String result = solution.frequencySort(input);

        assertEquals("aaaccc", result);
    }

    @Test
    public void test_3() {
        final String input = "Aabb";

        final String result = solution.frequencySort(input);

        assertEquals("bbAa", result);
    }
}