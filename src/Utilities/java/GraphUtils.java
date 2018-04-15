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

    public static class BaseTreeNode {
        public int data;

        public BaseTreeNode() {
        }

        public BaseTreeNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "" + data;
        }
    }

    public static class TreeNode extends BaseTreeNode {
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            super(data);
        }
    }

    public static class TreeNodeWithLinkToParent extends BaseTreeNode {
        public TreeNodeWithLinkToParent left;
        public TreeNodeWithLinkToParent right;
        public TreeNodeWithLinkToParent parent;

        public TreeNodeWithLinkToParent(int data) {
            super(data);
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
