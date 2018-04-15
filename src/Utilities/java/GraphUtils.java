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

    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "" + data;
        }
    }

    public static void printTree(TreeNode node) {
        if (node != null) {
            printTree(node.left);
            System.out.println(node.data);
            printTree(node.right);
        }
    }
}
