package leetcode.problem_0543;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        final int result = solution.diameterOfBinaryTree(root);

        assertEquals(3, result);
    }

    @Test
    public void test_2() {
        Node root = new Node(1);
        root.left = new Node(2);

        final int result = solution.diameterOfBinaryTree(root);

        assertEquals(1, result);
    }

    @Test
    public void test_3() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(6);
        root.left.left.left.left = new Node(8);
        root.left.right = new Node(5);
        root.left.right.right = new Node(7);
        root.left.right.right.right = new Node(9);

        final int result = solution.diameterOfBinaryTree(root);

        assertEquals(6, result);
    }
}