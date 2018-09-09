package cracking_the_coding_interview.chapter_04.exercise_01;

import Utilities.java.ListUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void routeBetweenNodes_1() throws Exception {
        final Solution.Node node1 = new Solution.Node();

        final boolean result = solution.routeBetweenNodes(node1, node1);

        assertTrue(result);
    }

    @Test
    public void routeBetweenNodes_2() throws Exception {
        final Solution.Node node1 = new Solution.Node();
        final Solution.Node node3 = new Solution.Node();
        final Solution.Node node5 = new Solution.Node();
        final Solution.Node node7 = new Solution.Node();

        node1.adjacent = ListUtils.createList(node3);
        node3.adjacent = ListUtils.createList(node5);
        node5.adjacent = ListUtils.createList(node7);

        final boolean result = solution.routeBetweenNodes(node1, node7);

        assertTrue(result);
    }

    @Test
    public void routeBetweenNodes_3() throws Exception {
        final Solution.Node node1 = new Solution.Node();
        final Solution.Node node3 = new Solution.Node();
        final Solution.Node node5 = new Solution.Node();
        final Solution.Node node6 = new Solution.Node();
        final Solution.Node node7 = new Solution.Node();

        node1.adjacent = ListUtils.createList(node3);
        node3.adjacent = ListUtils.createList(node5);
        node5.adjacent = ListUtils.createList(node7);

        final boolean result = solution.routeBetweenNodes(node1, node6);

        assertFalse(result);
    }
}