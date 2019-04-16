package leetcode.problem_0285;

import Utilities.java.GraphUtils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void inorderSuccessor_1() throws Exception {
        final TreeNode root = new TreeNode(2);
        final TreeNode target = new TreeNode(1);
        root.left = target;
        root.right = new TreeNode(3);

        final TreeNode result = solution.inorderSuccessor(root, target);

        assertEquals(root, result);
    }

    @Test
    public void inorderSuccessor_2() throws Exception {
        final TreeNode root = new TreeNode(5);
        final TreeNode target = new TreeNode(6);
        root.left = new TreeNode(3);
        root.right = target;
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        final TreeNode result = solution.inorderSuccessor(root, target);

        assertNull(result);
    }
}