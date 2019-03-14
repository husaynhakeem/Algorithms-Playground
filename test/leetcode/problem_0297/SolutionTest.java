package leetcode.problem_0297;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void codec_1() throws Exception {
        final Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        final Node result = solution.deserialize(solution.serialize(root));

        assertEquals(root.val, result.val);
        assertEquals(root.left.val, result.left.val);
        assertEquals(root.right.val, result.right.val);
        assertEquals(root.right.left.val, result.right.left.val);
        assertEquals(root.right.right.val, result.right.right.val);
        assertNull(result.left.left);
        assertNull(result.left.right);
    }
}