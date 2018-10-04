package big_o_la.week_01.problem_01;

import big_o_la.week_01.problem_01.Solution.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void isBST_1() throws Exception {
        final Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(12);
        root.right.left = new Node(11);

        final boolean result = solution.isBST(root);

        assertTrue(result);
    }

    @Test
    public void isBST_2() throws Exception {
        final Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(12);
        root.right.left = new Node(10);

        final boolean result = solution.isBST(root);

        assertFalse(result);
    }

    @Test
    public void isBST_3() throws Exception {
        final Node root = new Node(10);
        root.left = new Node(10);
        root.right = new Node(12);
        root.right.left = new Node(11);

        final boolean result = solution.isBST(root);

        assertTrue(result);
    }
}