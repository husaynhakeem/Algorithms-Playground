package leetcode.problem_0701;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void insertIntoBST() throws Exception {
        final Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        final int val = 5;

        final Node result = solution.insertIntoBST(root, val);

        assertEquals(4, result.val);
        assertEquals(2, result.left.val);
        assertEquals(7, result.right.val);
        assertEquals(1, result.left.left.val);
        assertEquals(3, result.left.right.val);
        assertEquals(5, result.right.left.val);
    }
}