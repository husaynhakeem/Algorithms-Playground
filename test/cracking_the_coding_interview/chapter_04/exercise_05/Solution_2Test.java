package cracking_the_coding_interview.chapter_04.exercise_05;

import Utilities.java.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void isValidBST_1() throws Exception {
        TreeUtils.Node one = new TreeUtils.Node(1);
        TreeUtils.Node two = new TreeUtils.Node(2);
        TreeUtils.Node three = new TreeUtils.Node(3);
        TreeUtils.Node four = new TreeUtils.Node(4);
        TreeUtils.Node five = new TreeUtils.Node(5);
        TreeUtils.Node six = new TreeUtils.Node(6);
        TreeUtils.Node seven = new TreeUtils.Node(7);
        TreeUtils.Node eight = new TreeUtils.Node(8);
        TreeUtils.Node nine = new TreeUtils.Node(9);

        three.right = four;
        eight.right = nine;
        two.left = one;
        two.right = three;
        seven.left = six;
        seven.right = eight;
        five.left = two;
        five.right = seven;

        final boolean result = solution.isValidBST(five, 9);

        assertTrue(result);
    }

    @Test
    public void isValidBST_2() throws Exception {
        TreeUtils.Node one = new TreeUtils.Node(1);
        TreeUtils.Node two = new TreeUtils.Node(2);
        TreeUtils.Node three = new TreeUtils.Node(3);
        TreeUtils.Node four = new TreeUtils.Node(4);
        TreeUtils.Node five = new TreeUtils.Node(5);
        TreeUtils.Node six = new TreeUtils.Node(6);
        TreeUtils.Node seven = new TreeUtils.Node(7);
        TreeUtils.Node eight = new TreeUtils.Node(8);
        TreeUtils.Node nine = new TreeUtils.Node(9);

        three.right = four;

        eight.left = nine;

        two.left = one;
        two.right = three;

        seven.left = six;
        seven.right = eight;

        five.left = two;
        five.right = seven;

        final boolean result = solution.isValidBST(five, 9);

        assertFalse(result);
    }
}