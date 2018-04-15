package Utilities.java;

public class GraphUtils {

    public static class Graph {
        public GraphNode[] children;
    }

    public static class GraphNode {
        public int data;
        public boolean visited = false;
        public GraphNode[] adjacents = new GraphNode[]{};
    }
}
