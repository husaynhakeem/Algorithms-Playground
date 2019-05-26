package leetcode.problem_0236;

import Utilities.java.TreeUtils;
import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void lowestCommonAncestor_1() throws Exception {
        final TreeUtils.Node root = new TreeUtils.Node(3);
        root.left = new TreeUtils.Node(5);
        root.right = new TreeUtils.Node(1);
        root.left.left = new TreeUtils.Node(6);
        root.left.right = new TreeUtils.Node(2);
        root.right.left = new TreeUtils.Node(0);
        root.right.right = new TreeUtils.Node(8);
        root.left.right.left = new TreeUtils.Node(7);
        root.left.right.right = new TreeUtils.Node(4);
        final TreeUtils.Node p = root.left;
        final TreeUtils.Node q = root.right;

        final Node result = solution.lowestCommonAncestor(root, p, q);

        assertEquals(root, result);
    }

    @Test
    public void lowestCommonAncestor_2() throws Exception {
        final TreeUtils.Node root = new TreeUtils.Node(3);
        root.left = new TreeUtils.Node(5);
        root.right = new TreeUtils.Node(1);
        root.left.left = new TreeUtils.Node(6);
        root.left.right = new TreeUtils.Node(2);
        root.right.left = new TreeUtils.Node(0);
        root.right.right = new TreeUtils.Node(8);
        root.left.right.left = new TreeUtils.Node(7);
        root.left.right.right = new TreeUtils.Node(4);
        final TreeUtils.Node p = root.left;
        final TreeUtils.Node q = root.left.right.right;

        final Node result = solution.lowestCommonAncestor(root, p, q);

        assertEquals(root.left, result);
    }
}