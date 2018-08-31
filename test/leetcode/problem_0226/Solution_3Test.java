package leetcode.problem_0226;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_3Test {

    private final Solution_3 solution = new Solution_3();

    @Test
    public void invertTree() throws Exception {
        final Solution_3.TreeNode root = new Solution_3.TreeNode(4);
        root.left = new Solution_3.TreeNode(2);
        root.right = new Solution_3.TreeNode(7);
        root.left.left = new Solution_3.TreeNode(1);
        root.left.right = new Solution_3.TreeNode(3);
        root.right.left = new Solution_3.TreeNode(6);
        root.right.right = new Solution_3.TreeNode(9);

        final Solution_3.TreeNode result = solution.invertTree(root);

        assertEquals(4, result.val);
        assertEquals(7, result.left.val);
        assertEquals(2, result.right.val);
        assertEquals(9, result.left.left.val);
        assertEquals(6, result.left.right.val);
        assertEquals(3, result.right.left.val);
        assertEquals(1, result.right.right.val);
    }

}