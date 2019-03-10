package leetcode.problem_0889;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void constructFromPrePost() throws Exception {
        final int[] pre = {1, 2, 4, 5, 3, 6, 7};
        final int[] post = {4, 5, 2, 6, 7, 3, 1};

        final Node result = solution.constructFromPrePost(pre, post);

        assertEquals(1, result.val);
        assertEquals(2, result.left.val);
        assertEquals(3, result.right.val);
        assertEquals(4, result.left.left.val);
        assertEquals(5, result.left.right.val);
        assertEquals(6, result.right.left.val);
        assertEquals(7, result.right.right.val);
    }
}