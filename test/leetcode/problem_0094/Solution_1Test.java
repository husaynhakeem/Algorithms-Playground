package leetcode.problem_0094;

import Utilities.java.ListUtils;
import leetcode.problem_0094.Solution_1.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void inorderTraversal() {
        final Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        final List<Integer> result = solution.inorderTraversal(root);

        assertEquals(ListUtils.createList(1, 3, 2), result);
    }
}