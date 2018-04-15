package chapter4_exercise1.java;

import Utilities.java.GraphUtils.GraphNode;

import java.util.LinkedList;

public class Solution_1 {

    public static void main(String[] args) {
        GraphNode first = new GraphNode();
        GraphNode second = new GraphNode();
        GraphNode third = new GraphNode();

        first.adjacents = new GraphNode[]{second, third};

        System.out.println(routeBetweenTwoNodes(first, second));
        System.out.println(routeBetweenTwoNodes(first, third));
        System.out.println(routeBetweenTwoNodes(second, third));
    }

    private static boolean routeBetweenTwoNodes(GraphNode first, GraphNode second) {
        LinkedList<GraphNode> q = new LinkedList<>();

        first.visited = true;
        q.addLast(first);

        while (!q.isEmpty()) {
            GraphNode node = q.pollFirst();

            for (GraphNode adjacent : node.adjacents) {
                if (adjacent == second)
                    return true;

                if (!adjacent.visited) {
                    adjacent.visited = true;
                    q.addLast(adjacent);
                }
            }
        }

        return false;
    }
}
