package cracking_the_coding_interview.chapter_04.exercise_04;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void checkBalanced_1() throws Exception {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);

        six.left = one;
        six.right = two;

        seven.left = three;

        eight.left = four;

        nine.left = five;
        nine.right = six;

        ten.left = seven;
        ten.right = eight;

        eleven.left = nine;
        eleven.right = ten;

        final boolean result = solution.checkBalanced(eleven);

        assertFalse(result);
    }

    @Test
    public void checkBalanced_2() throws Exception {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);

        six.left = one;
        six.right = two;

        seven.left = three;

        eight.left = four;

        nine.left = five;

        ten.left = six;
        ten.right = seven;

        eleven.left = eight;
        eleven.right = nine;

        twelve.left = ten;
        twelve.right = eleven;

        final boolean result = solution.checkBalanced(twelve);

        assertTrue(result);
    }
}