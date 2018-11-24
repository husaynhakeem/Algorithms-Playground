package leetcode.problem_0211;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void wordDictionary() throws Exception {
        solution.addWord("bad");
        solution.addWord("dad");
        solution.addWord("mad");
        assertFalse(solution.search("pad"));
        assertTrue(solution.search("bad"));
        assertTrue(solution.search(".ad"));
        assertTrue(solution.search("b.."));
        assertFalse(solution.search("b..."));
        assertFalse(solution.search("b."));
    }
}