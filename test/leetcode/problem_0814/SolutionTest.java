package leetcode.problem_0814;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void pruneTree_1() throws Exception {
        final Node root = new Node(1);
        root.right = new Node(0);
        root.right.left = new Node(0);
        root.right.right = new Node(1);

        final Node result = solution.pruneTree(root);

        assertEquals(1, result.val);
        assertNull(result.left);
        assertEquals(0, result.right.val);
        assertNull(result.right.left);
        assertEquals(1, result.right.right.val);
    }

    @Test
    public void pruneTree_2() throws Exception {
        final Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(0);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(0);
        root.right.right = new Node(1);
        root.left.left.left = new Node(0);

        final Node result = solution.pruneTree(root);

        assertEquals(1, result.val);
        assertEquals(1, result.left.val);
        assertEquals(0, result.right.val);
        assertEquals(1, result.left.left.val);
        assertEquals(1, result.left.right.val);
        assertEquals(1, result.right.right.val);
        assertNull(result.right.left);
    }
}