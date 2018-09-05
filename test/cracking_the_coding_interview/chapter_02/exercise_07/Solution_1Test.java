package cracking_the_coding_interview.chapter_02.exercise_07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void intersection_1() throws Exception {
        final Solution_1.Node commonNode = new Solution_1.Node(2);

        final Solution_1.Node l1 = new Solution_1.Node(1);
        l1.next = new Solution_1.Node(2);
        l1.next.next = new Solution_1.Node(3);
        l1.next.next.next = new Solution_1.Node(4);
        l1.next.next.next.next = commonNode;
        l1.next.next.next.next.next = new Solution_1.Node(5);

        final Solution_1.Node l2 = new Solution_1.Node(1);
        l2.next = new Solution_1.Node(2);
        l2.next.next = commonNode;
        l2.next.next.next = new Solution_1.Node(4);
        l2.next.next.next.next = new Solution_1.Node(5);

        final Solution_1.Node result = solution.intersection(l1, l2);

        assertEquals(commonNode, result);
    }

    @Test
    public void intersection_2() throws Exception {
        final Solution_1.Node l1 = new Solution_1.Node(1);
        l1.next = new Solution_1.Node(2);
        l1.next.next = new Solution_1.Node(3);
        l1.next.next.next = new Solution_1.Node(4);
        l1.next.next.next.next = new Solution_1.Node(5);

        final Solution_1.Node l2 = new Solution_1.Node(1);
        l2.next = new Solution_1.Node(2);
        l2.next.next = new Solution_1.Node(4);
        l2.next.next.next = new Solution_1.Node(5);

        final Solution_1.Node result = solution.intersection(l1, l2);

        assertNull(result);
    }
}