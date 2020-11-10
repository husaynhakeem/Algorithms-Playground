package cracking_the_coding_interview.chapter_02.exercise_07;

import cracking_the_coding_interview.chapter_02.exercise_07.Solution_2.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void intersection_1() {
        final Node commonNode = new Node(2);
        commonNode.next = new Node(4);
        commonNode.next.next = new Node(5);

        final Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(3);
        l1.next.next.next = new Node(4);
        l1.next.next.next.next = commonNode;

        final Node l2 = new Node(1);
        l2.next = new Node(2);
        l2.next.next = commonNode;

        final Node result = solution.intersection(l1, l2);

        assertEquals(commonNode, result);
    }

    @Test
    public void intersection_2() {
        final Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(3);
        l1.next.next.next = new Node(4);
        l1.next.next.next.next = new Node(5);

        final Node l2 = new Node(1);
        l2.next = new Node(2);
        l2.next.next = new Node(4);
        l2.next.next.next = new Node(5);

        final Node result = solution.intersection(l1, l2);

        assertNull(result);
    }
}