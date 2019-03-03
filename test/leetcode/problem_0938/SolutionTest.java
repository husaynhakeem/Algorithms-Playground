package leetcode.problem_0938;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void rangeSumBST_1() throws Exception {
        final Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);
        final int min = 7;
        final int max = 15;

        final int result = solution.rangeSumBST(root, min, max);

        assertEquals(32, result);
    }

    @Test
    public void rangeSumBST_2() throws Exception {
        final Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(13);
        root.right.right = new Node(18);
        root.left.left.left = new Node(1);
        root.left.right.left = new Node(6);
        final int min = 6;
        final int max = 10;

        final int result = solution.rangeSumBST(root, min, max);

        assertEquals(23, result);
    }
}