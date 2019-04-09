package leetcode.problem_0510;

import leetcode.problem_0510.Solution.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void inorderSuccessor_1() throws Exception {
        final Node root = new Node(2, null);
        final Node target = new Node(1, root);
        root.left = target;
        root.right = new Node(3, root);

        final Node result = solution.inorderSuccessor(target);

        assertEquals(root, result);
    }

    @Test
    public void inorderSuccessor_2() throws Exception {
        final Node root = new Node(5, null);
        final Node target = new Node(6, root);
        root.left = new Node(3, root);
        root.right = target;
        root.left.left = new Node(2, root.left);
        root.left.right = new Node(4, root.left);
        root.left.left.left = new Node(1, root.left.left);

        final Node result = solution.inorderSuccessor(target);

        assertNull(result);
    }
}