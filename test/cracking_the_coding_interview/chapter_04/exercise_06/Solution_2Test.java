package cracking_the_coding_interview.chapter_04.exercise_06;

import cracking_the_coding_interview.chapter_04.exercise_06.Solution_2.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void findSuccessor_1() throws Exception {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.parent = node2;
        node3.parent = node2;
        node2.left = node1;
        node2.right = node3;

        final Node result = solution.findSuccessor(node1);

        assertEquals(node2, result);
    }

    @Test
    public void findSuccessor_2() throws Exception {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.parent = node2;
        node3.parent = node2;
        node2.left = node1;
        node2.right = node3;

        final Node result = solution.findSuccessor(node2);

        assertEquals(node3, result);
    }

    @Test
    public void findSuccessor_3() throws Exception {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.parent = node2;
        node3.parent = node2;
        node2.left = node1;
        node2.right = node3;

        final Node result = solution.findSuccessor(node3);

        assertNull(result);
    }

    @Test
    public void findSuccessor_4() throws Exception {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.parent = node3;
        node2.parent = node3;
        node3.parent = node4;
        node6.parent = node5;
        node5.parent = node4;

        node4.left = node3;
        node4.right = node5;
        node3.left = node1;
        node3.right = node2;
        node5.left = node6;

        final Node result = solution.findSuccessor(node2);

        assertEquals(node4, result);
    }

    @Test
    public void findSuccessor_5() throws Exception {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.parent = node3;
        node2.parent = node3;
        node3.parent = node4;
        node6.parent = node5;
        node5.parent = node4;

        node4.left = node3;
        node4.right = node5;
        node3.left = node1;
        node3.right = node2;
        node5.left = node6;

        final Node result = solution.findSuccessor(node6);

        assertEquals(node5, result);
    }

    @Test
    public void findSuccessor_6() throws Exception {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.parent = node3;
        node2.parent = node3;
        node3.parent = node4;
        node6.parent = node5;
        node5.parent = node4;

        node4.left = node3;
        node4.right = node5;
        node3.left = node1;
        node3.right = node2;
        node5.left = node6;

        final Node result = solution.findSuccessor(node5);

        assertNull(result);
    }

    @Test
    public void findSuccessor_7() throws Exception {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.parent = node3;
        node2.parent = node3;
        node3.parent = node4;
        node6.parent = node5;
        node5.parent = node4;

        node4.left = node3;
        node4.right = node5;
        node3.left = node1;
        node3.right = node2;
        node5.left = node6;

        final Node result = solution.findSuccessor(node4);

        assertEquals(node6, result);
    }
}