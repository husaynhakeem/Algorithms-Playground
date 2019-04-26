package leetcode.problem_0098;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void isValidBST_1() throws Exception {
        final Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);

        final boolean result = solution.isValidBST(root);

        assertTrue(result);
    }

    @Test
    public void isValidBST_2() throws Exception {
        final Node root = new Node(1);
        root.left = new Node(1);

        final boolean result = solution.isValidBST(root);

        assertFalse(result);
    }

    @Test
    public void isValidBST_3() throws Exception {
        final Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(6);

        final boolean result = solution.isValidBST(root);

        assertFalse(result);
    }

    @Test
    public void isValidBST_4() throws Exception {
        final Node root = new Node(Integer.MAX_VALUE);

        final boolean result = solution.isValidBST(root);

        assertTrue(result);
    }
}