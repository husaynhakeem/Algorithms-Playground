package leetcode.problem_0105;

import leetcode.problem_0105.Solution.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void constructBinaryTree_1() throws Exception {
        final int[] preArray = {3, 9, 20, 15, 7};
        final int[] inArray = {9, 3, 15, 20, 7};

        final Node result = solution.constructBinaryTree(preArray, inArray);

        assertEquals(3, result.val);
        assertEquals(9, result.left.val);
        assertNull(result.left.left);
        assertNull(result.left.right);
        assertEquals(20, result.right.val);
        assertEquals(15, result.right.left.val);
        assertNull(result.right.left.left);
        assertNull(result.right.left.right);
        assertEquals(7, result.right.right.val);
        assertNull(result.right.right.left);
        assertNull(result.right.right.right);
    }

    @Test
    public void constructBinaryTree_2() throws Exception {
        final int[] preArray = {12, 4, 7, 11, 2, 6};
        final int[] inArray = {7, 4, 11, 2, 12, 6};

        final Node result = solution.constructBinaryTree(preArray, inArray);

        assertEquals(12, result.val);
        assertEquals(4, result.left.val);
        assertEquals(7, result.left.left.val);
        assertNull(result.left.left.left);
        assertNull(result.left.left.right);
        assertEquals(11, result.left.right.val);
        assertNull(result.left.right.left);
        assertEquals(2, result.left.right.right.val);
        assertNull(result.left.right.right.left);
        assertNull(result.left.right.right.right);
        assertEquals(6, result.right.val);
        assertNull(result.right.left);
        assertNull(result.right.right);
    }
}