package leetcode.problem_0133;

import leetcode.problem_0133.Solution_1.UndirectedGraphNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void cloneGraph_1() throws Exception {
        final UndirectedGraphNode node = null;

        final UndirectedGraphNode result = solution.cloneGraph(node);

        assertNull(result);
    }

    @Test
    public void cloneGraph_2() throws Exception {
        final UndirectedGraphNode node = new UndirectedGraphNode(1);
        final UndirectedGraphNode node2 = new UndirectedGraphNode(2);
        final UndirectedGraphNode node3 = new UndirectedGraphNode(3);
        final UndirectedGraphNode node4 = new UndirectedGraphNode(4);
        final UndirectedGraphNode node5 = new UndirectedGraphNode(5);

        node.neighbors.add(node2);
        node.neighbors.add(node3);
        node.neighbors.add(node5);

        node2.neighbors.add(node4);

        node4.neighbors.add(node);

        node5.neighbors.add(node2);

        final UndirectedGraphNode nodeClone = solution.cloneGraph(node);
        final UndirectedGraphNode node2Clone = nodeClone.neighbors.get(0);
        final UndirectedGraphNode node3Clone = nodeClone.neighbors.get(1);
        final UndirectedGraphNode node4Clone = node2Clone.neighbors.get(0);
        final UndirectedGraphNode node5Clone = nodeClone.neighbors.get(2);
        assertNotEquals(nodeClone, node);
        assertNotEquals(node2Clone, node2);
        assertNotEquals(node3Clone, node3);
        assertNotEquals(node4Clone, node4);
        assertNotEquals(node5Clone, node5);
    }

    @Test
    public void cloneGraph_3() throws Exception {
        final UndirectedGraphNode node = new UndirectedGraphNode(1);
        node.neighbors.add(node);
        node.neighbors.add(node);

        final UndirectedGraphNode result = solution.cloneGraph(node);
        final UndirectedGraphNode nodeClone1 = result.neighbors.get(0);
        final UndirectedGraphNode nodeClone2 = result.neighbors.get(1);
        assertNotEquals(result, node);
        assertEquals(result, nodeClone1);
        assertEquals(result, nodeClone2);
    }
}