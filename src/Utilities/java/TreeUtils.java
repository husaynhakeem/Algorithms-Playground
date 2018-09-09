package Utilities.java;

public class TreeUtils {

    public static class Node {
        public int val;
        public Node right;
        public Node left;

        public Node(int val) {
            this.val = val;
        }
    }

    public static boolean areTreesEqual(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        if (node1.val != node2.val) {
            return false;
        }

        return areTreesEqual(node1.left, node2.left) && areTreesEqual(node1.right, node2.right);
    }
}
