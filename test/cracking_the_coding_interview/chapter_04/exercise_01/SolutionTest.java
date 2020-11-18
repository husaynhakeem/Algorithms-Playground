package cracking_the_coding_interview.chapter_04.exercise_01;

import Utilities.java.ListUtils;
import org.junit.Test;
import cracking_the_coding_interview.chapter_04.exercise_01.Solution.Node;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void routeBetweenNodes_1() {
        final Node node1 = new Node();

        final boolean result = solution.routeBetweenNodes(node1, node1);

        assertTrue(result);
    }

    @Test
    public void routeBetweenNodes_2() {
        final Node node1 = new Node();
        final Node node2 = new Node();
        final Node node3 = new Node();
        final Node node4 = new Node();

        node1.adjacent = ListUtils.createList(node2);
        node2.adjacent = ListUtils.createList(node3);
        node3.adjacent = ListUtils.createList(node4);

        final boolean result = solution.routeBetweenNodes(node1, node4);

        assertTrue(result);
    }

    @Test
    public void routeBetweenNodes_3() {
        final Node node1 = new Node();
        final Node node2 = new Node();
        final Node node3 = new Node();
        final Node node4 = new Node();
        final Node node5 = new Node();

        node1.adjacent = ListUtils.createList(node2);
        node2.adjacent = ListUtils.createList(node3);
        node3.adjacent = ListUtils.createList(node5);

        final boolean result = solution.routeBetweenNodes(node1, node4);

        assertFalse(result);
    }
}