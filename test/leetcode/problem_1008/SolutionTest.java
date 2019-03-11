package leetcode.problem_1008;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void bstFromPreorder() throws Exception {
        final int[] preorder = {8, 5, 1, 7, 10, 12};

        final Node result = solution.bstFromPreorder(preorder);

        assertEquals(8, result.val);
        assertEquals(5, result.left.val);
        assertEquals(10, result.right.val);
        assertEquals(1, result.left.left.val);
        assertEquals(7, result.left.right.val);
        assertEquals(12, result.right.right.val);
    }
}