package cracking_the_coding_interview.chapter_04.exercise_06;

import cracking_the_coding_interview.chapter_04.exercise_06.Solution_1.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void findSuccessor_1() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        one.parent = two;
        three.parent = two;
        two.left = one;
        two.right = three;

        final Node result = solution.findSuccessor(one);

        assertEquals(two, result);
    }

    @Test
    public void findSuccessor_2() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        one.parent = two;
        three.parent = two;
        two.left = one;
        two.right = three;

        final Node result = solution.findSuccessor(two);

        assertEquals(three, result);
    }

    @Test
    public void findSuccessor_3() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        one.parent = two;
        three.parent = two;
        two.left = one;
        two.right = three;

        final Node result = solution.findSuccessor(three);

        assertNull(result);
    }

    @Test
    public void findSuccessor_4() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        one.parent = three;
        two.parent = three;
        three.parent = four;
        six.parent = five;
        five.parent = four;

        four.left = three;
        four.right = five;
        three.left = one;
        three.right = two;
        five.left = six;

        final Node result = solution.findSuccessor(two);

        assertEquals(four, result);
    }

    @Test
    public void findSuccessor_5() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        one.parent = three;
        two.parent = three;
        three.parent = four;
        six.parent = five;
        five.parent = four;

        four.left = three;
        four.right = five;
        three.left = one;
        three.right = two;
        five.left = six;

        final Node result = solution.findSuccessor(six);

        assertEquals(five, result);
    }

    @Test
    public void findSuccessor_6() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        one.parent = three;
        two.parent = three;
        three.parent = four;
        six.parent = five;
        five.parent = four;

        four.left = three;
        four.right = five;
        three.left = one;
        three.right = two;
        five.left = six;

        final Node result = solution.findSuccessor(five);

        assertNull(result);
    }

    @Test
    public void findSuccessor_7() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        one.parent = three;
        two.parent = three;
        three.parent = four;
        six.parent = five;
        five.parent = four;

        four.left = three;
        four.right = five;
        three.left = one;
        three.right = two;
        five.left = six;

        final Node result = solution.findSuccessor(four);

        assertEquals(six, result);
    }
}