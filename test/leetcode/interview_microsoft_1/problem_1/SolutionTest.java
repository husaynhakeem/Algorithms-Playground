package leetcode.interview_microsoft_1.problem_1;

import Utilities.java.TreeUtils;
import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void trimBST_1() throws Exception {
        final int L = 1;
        final int R = 2;
        final Node root = new Node(1);
        root.left = new Node(0);
        root.right = new Node(2);

        final Node result = solution.trimBST(root, L, R);

        final Node expectedResult = new Node(1);
        expectedResult.right = new Node(2);
        assertTrue(TreeUtils.areTreesEqual(expectedResult, result));
    }

    @Test
    public void trimBST_2() throws Exception {
        final int L = 1;
        final int R = 3;
        final Node root = new Node(3);
        root.left = new Node(0);
        root.right = new Node(4);
        root.left.right = new Node(2);
        root.left.right.left = new Node(1);

        final Node result = solution.trimBST(root, L, R);

        final Node expectedResult = new Node(3);
        expectedResult.left = new Node(2);
        expectedResult.left.left = new Node(1);
        assertTrue(TreeUtils.areTreesEqual(expectedResult, result));
    }
}