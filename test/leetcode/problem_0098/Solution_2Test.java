package leetcode.problem_0098;

import Utilities.java.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void isValidBST_1() throws Exception {
        final TreeUtils.Node root = new TreeUtils.Node(2);
        root.left = new TreeUtils.Node(1);
        root.right = new TreeUtils.Node(3);

        final boolean result = solution.isValidBST(root);

        assertTrue(result);
    }

    @Test
    public void isValidBST_2() throws Exception {
        final TreeUtils.Node root = new TreeUtils.Node(1);
        root.left = new TreeUtils.Node(1);

        final boolean result = solution.isValidBST(root);

        assertFalse(result);
    }

    @Test
    public void isValidBST_3() throws Exception {
        final TreeUtils.Node root = new TreeUtils.Node(5);
        root.left = new TreeUtils.Node(1);
        root.right = new TreeUtils.Node(4);
        root.right.left = new TreeUtils.Node(3);
        root.right.right = new TreeUtils.Node(6);

        final boolean result = solution.isValidBST(root);

        assertFalse(result);
    }

    @Test
    public void isValidBST_4() throws Exception {
        final TreeUtils.Node root = new TreeUtils.Node(Integer.MAX_VALUE);

        final boolean result = solution.isValidBST(root);

        assertTrue(result);
    }
}