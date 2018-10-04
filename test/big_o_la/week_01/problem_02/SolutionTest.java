package big_o_la.week_01.problem_02;

import big_o_la.week_01.problem_02.Solution.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void mergeBSTs() throws Exception {
        final Node root1 = new Node(10);
        root1.left = new Node(9);
        root1.left.left = new Node(6);
        root1.left.right = new Node(10);
        root1.right = new Node(14);
        root1.right.left = new Node(14);
        root1.right.right = new Node(15);

        final Node root2 = new Node(5);
        root2.left = new Node(2);
        root2.left.left = new Node(1);
        root2.left.right = new Node(4);
        root2.right = new Node(11);
        root2.right.left = new Node(7);

        final Node result = solution.mergeBSTs(root1, 7, root2, 6);

        assertEquals(15, result.val);
        assertEquals(11, result.left.val);
        assertEquals(7, result.left.left.val);
        assertEquals(14, result.left.right.val);
        assertEquals(25, result.right.val);
        assertEquals(21, result.right.left.val);
        assertEquals(15, result.right.right.val);
    }
}