package cracking_the_coding_interview.chapter_04.exercise_05;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void isValidBST_1() throws Exception {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);

        three.right = four;
        eight.right = nine;
        two.left = one;
        two.right = three;
        seven.left = six;
        seven.right = eight;
        five.left = two;
        five.right = seven;

        final boolean result = solution.isValidBST(five);

        assertTrue(result);
    }

    @Test
    public void isValidBST_2() throws Exception {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);

        three.right = four;

        eight.left = nine;

        two.left = one;
        two.right = three;

        seven.left = six;
        seven.right = eight;

        five.left = two;
        five.right = seven;

        final boolean result = solution.isValidBST(five);

        assertFalse(result);
    }
}