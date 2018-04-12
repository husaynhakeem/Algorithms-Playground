package Utilities.java;

/**
 * Created by husaynhakeem on 4/12/18.
 */
public class LinkedListUtils {

    public static class Node {
        public int data;
        public Node next;

        public Node() {}

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node createLinkedListFrom(int... values) {
        Node root = new Node(values[0]);
        Node result = root;

        for (int i = 1; i < values.length; i++) {
            Node node = new Node(values[i]);
            root.next = node;
            root = node;
        }

        return result;
    }

    public static void printLinkedList(Node root) {
        Node node = root;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static Node getNodeAtPosition(Node root, int position) {
        Node node = root;

        for (int i = 0; i < position; i++) {
            if (node == null)
                break;
            node = node.next;
        }

        return node;
    }
}
