package big_o_la.week_01.problem_03;

import big_o_la.week_01.problem_03.Solution.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void leastCommonAncestor_1() throws Exception {
        final Node root = new Solution.Node(1);
        final Node node1 = new Node(4);
        final Node node2 = new Node(7);
        root.left = new Node(2);
        root.left.left = node1;
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = node2;

        final Node result = solution.leastCommonAncestor(root, node1, node2);

        assertEquals(root, result);
    }

    @Test
    public void leastCommonAncestor_2() throws Exception {
        final Node root = new Solution.Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        final Node result = solution.leastCommonAncestor(root, root, root);

        assertEquals(root, result);
    }

    @Test
    public void leastCommonAncestor_3() throws Exception {
        final Node root = new Solution.Node(1);
        final Node node1 = new Node(4);
        final Node node2 = new Node(5);
        final Node leastCommonAncestor = new Node(2);
        root.left = leastCommonAncestor;
        root.left.left = node1;
        root.left.right = node2;
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        final Node result = solution.leastCommonAncestor(root, node1, node2);

        assertEquals(leastCommonAncestor, result);
    }

    @Test
    public void leastCommonAncestor_4() throws Exception {
        final Node root = new Solution.Node(1);
        final Node node2 = new Node(7);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = node2;

        final Node result = solution.leastCommonAncestor(root, node2, node2);

        assertEquals(node2, result);
    }
}