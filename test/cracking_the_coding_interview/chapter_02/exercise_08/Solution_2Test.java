package cracking_the_coding_interview.chapter_02.exercise_08;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void detectLoop_1() throws Exception {
        final Solution_2.Node repeatedNode = new Solution_2.Node(3);
        final Solution_2.Node head = new Solution_2.Node(1);
        head.next = new Solution_2.Node(2);
        head.next.next = repeatedNode;
        head.next.next.next = new Solution_2.Node(4);
        head.next.next.next.next = new Solution_2.Node(5);
        head.next.next.next.next.next = repeatedNode;

        final Solution_2.Node result = solution.detectLoop(head);

        assertEquals(repeatedNode, result);
    }

    @Test
    public void detectLoop_2() throws Exception {
        final Solution_2.Node repeatedNode = new Solution_2.Node(3);
        final Solution_2.Node head = new Solution_2.Node(1);
        head.next = repeatedNode;
        head.next.next = new Solution_2.Node(1);
        head.next.next.next = new Solution_2.Node(4);
        head.next.next.next.next = new Solution_2.Node(5);
        head.next.next.next.next.next = repeatedNode;

        final Solution_2.Node result = solution.detectLoop(head);

        assertEquals(repeatedNode, result);
    }
}