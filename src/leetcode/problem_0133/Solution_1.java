package leetcode.problem_0133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution_1 {

    static class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;

        UndirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<>();
        }
    }

    UndirectedGraphNode cloneGraph(final UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        return cloneGraphHelper(node, new HashMap<>());
    }

    private UndirectedGraphNode cloneGraphHelper(final UndirectedGraphNode node, final Map<UndirectedGraphNode, UndirectedGraphNode> seen) {
        if (seen.containsKey(node)) {
            return seen.get(node);
        }

        final UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
        seen.put(node, copy);

        for (UndirectedGraphNode n : node.neighbors) {
            copy.neighbors.add(cloneGraphHelper(n, seen));
        }
        return copy;
    }
}
