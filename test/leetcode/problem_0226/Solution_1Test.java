package leetcode.problem_0226;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void invertTree() throws Exception {
        final Solution_1.TreeNode root = new Solution_1.TreeNode(4);
        root.left = new Solution_1.TreeNode(2);
        root.right = new Solution_1.TreeNode(7);
        root.left.left = new Solution_1.TreeNode(1);
        root.left.right = new Solution_1.TreeNode(3);
        root.right.left = new Solution_1.TreeNode(6);
        root.right.right = new Solution_1.TreeNode(9);

        final Solution_1.TreeNode result = solution.invertTree(root);

        assertEquals(4, result.val);
        assertEquals(7, result.left.val);
        assertEquals(2, result.right.val);
        assertEquals(9, result.left.left.val);
        assertEquals(6, result.left.right.val);
        assertEquals(3, result.right.left.val);
        assertEquals(1, result.right.right.val);
    }
}