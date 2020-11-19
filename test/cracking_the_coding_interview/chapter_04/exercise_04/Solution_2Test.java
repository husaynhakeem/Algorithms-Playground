package cracking_the_coding_interview.chapter_04.exercise_04;

import Utilities.java.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void checkBalanced_1() {
        TreeUtils.Node one = new TreeUtils.Node(1);
        TreeUtils.Node two = new TreeUtils.Node(2);
        TreeUtils.Node three = new TreeUtils.Node(3);
        TreeUtils.Node four = new TreeUtils.Node(4);
        TreeUtils.Node five = new TreeUtils.Node(5);
        TreeUtils.Node six = new TreeUtils.Node(6);
        TreeUtils.Node seven = new TreeUtils.Node(7);
        TreeUtils.Node eight = new TreeUtils.Node(8);
        TreeUtils.Node nine = new TreeUtils.Node(9);
        TreeUtils.Node ten = new TreeUtils.Node(10);
        TreeUtils.Node eleven = new TreeUtils.Node(11);

        eleven.left = nine;
        eleven.right = ten;
        ten.left = seven;
        ten.right = eight;
        nine.left = five;
        nine.right = six;
        eight.left = four;
        seven.left = three;
        six.left = one;
        six.right = two;

        final boolean result = solution.checkBalanced(eleven);
        assertTrue(result);
    }

    @Test
    public void checkBalanced_2() {
        TreeUtils.Node one = new TreeUtils.Node(1);
        TreeUtils.Node two = new TreeUtils.Node(2);
        TreeUtils.Node three = new TreeUtils.Node(3);
        TreeUtils.Node four = new TreeUtils.Node(4);
        TreeUtils.Node five = new TreeUtils.Node(5);
        TreeUtils.Node six = new TreeUtils.Node(6);
        TreeUtils.Node seven = new TreeUtils.Node(7);
        TreeUtils.Node eight = new TreeUtils.Node(8);
        TreeUtils.Node nine = new TreeUtils.Node(9);
        TreeUtils.Node ten = new TreeUtils.Node(10);
        TreeUtils.Node eleven = new TreeUtils.Node(11);
        TreeUtils.Node twelve = new TreeUtils.Node(12);

        twelve.left = ten;
        twelve.right = eleven;
        eleven.left = eight;
        eleven.right = nine;
        ten.left = six;
        ten.right = seven;
        nine.left = five;
        eight.left = four;
        seven.left = three;
        six.left = one;
        six.right = two;

        final boolean result = solution.checkBalanced(twelve);
        assertTrue(result);
    }

    @Test
    public void checkBalanced_3() {
        TreeUtils.Node one = new TreeUtils.Node(1);
        TreeUtils.Node two = new TreeUtils.Node(2);
        TreeUtils.Node three = new TreeUtils.Node(3);
        TreeUtils.Node four = new TreeUtils.Node(4);
        TreeUtils.Node five = new TreeUtils.Node(5);
        TreeUtils.Node six = new TreeUtils.Node(6);
        TreeUtils.Node seven = new TreeUtils.Node(7);
        TreeUtils.Node eight = new TreeUtils.Node(8);
        TreeUtils.Node nine = new TreeUtils.Node(9);
        TreeUtils.Node ten = new TreeUtils.Node(10);
        TreeUtils.Node eleven = new TreeUtils.Node(11);
        TreeUtils.Node twelve = new TreeUtils.Node(12);

        twelve.left = ten;
        twelve.right = eleven;
        ten.left = six;
        ten.right = seven;
        eleven.left = eight;
        eleven.right = nine;
        six.left = three;
        six.right = four;
        seven.left = five;
        three.left = one;
        four.left = two;

        final boolean result = solution.checkBalanced(twelve);
        assertFalse(result);
    }
}
