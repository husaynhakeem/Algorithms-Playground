package cracking_the_coding_interview.chapter_02.exercise_08;

import cracking_the_coding_interview.chapter_02.exercise_08.Solution_1.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void detectLoop_1() {
        final Node repeatedNode = new Node(3);
        final Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = repeatedNode;
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = repeatedNode;

        final Node result = solution.detectLoop(head);

        assertEquals(repeatedNode, result);
    }

    @Test
    public void detectLoop_2() {
        final Node repeatedNode = new Node(3);
        final Node head = new Node(1);
        head.next = repeatedNode;
        head.next.next = new Node(1);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = repeatedNode;

        final Node result = solution.detectLoop(head);

        assertEquals(repeatedNode, result);
    }
}