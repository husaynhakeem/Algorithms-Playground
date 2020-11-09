package cracking_the_coding_interview.chapter_02.exercise_05;

import cracking_the_coding_interview.chapter_02.exercise_05.Solution_4.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_4Test {

    private final Solution_4 solution = new Solution_4();

    @Test
    public void sumLists_1() {
        final Node l1 = new Node(1);
        l1.next = new Node(2);

        final Node l2 = new Node(3);
        l2.next = new Node(4);
        l2.next.next = new Node(5);
        l2.next.next.next = new Node(6);

        final Node result = solution.sumLists(l1, l2);

        assertEquals(4, result.val);
        assertEquals(6, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(6, result.next.next.next.val);
    }

    @Test
    public void sumLists_2() {
        final Node l1 = new Node(7);
        l1.next = new Node(1);
        l1.next.next = new Node(6);

        final Node l2 = new Node(5);
        l2.next = new Node(9);
        l2.next.next = new Node(3);

        final Node result = solution.sumLists(l1, l2);

        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(0, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
    }
}