package leetcode.interview_amazon_4.problem_2;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void lowestCommonAncestor_1() throws Exception {
        final Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        final Node p = root.left;
        final Node q = root.right;

        final Node result = solution.lowestCommonAncestor(root, p, q);

        assertEquals(root, result);
    }

    @Test
    public void lowestCommonAncestor_2() throws Exception {
        final Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        final Node p = root.left;
        final Node q = root.left.right.right;

        final Node result = solution.lowestCommonAncestor(root, p, q);

        assertEquals(root.left, result);
    }
}