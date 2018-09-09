package cracking_the_coding_interview.chapter_04.exercise_02;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static Utilities.java.TreeUtils.areTreesEqual;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void minimalTree() throws Exception {
        final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        final Node result = solution.minimalTree(array);

        final Node expectedResult = new Node(5);
        expectedResult.left = new Node(2);
        expectedResult.left.left = new Node(1);
        expectedResult.left.right = new Node(3);
        expectedResult.left.right.right = new Node(4);
        expectedResult.right = new Node(7);
        expectedResult.right.left = new Node(6);
        expectedResult.right.right = new Node(8);
        expectedResult.right.right.right = new Node(9);
        assertTrue(areTreesEqual(expectedResult, result));
    }
}