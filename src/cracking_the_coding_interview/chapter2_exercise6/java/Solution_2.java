package cracking_the_coding_interview.chapter2_exercise6.java;

import Utilities.java.LinkedListUtils.Node;

import static Utilities.java.LinkedListUtils.createLinkedListFrom;

public class Solution_2 {

    public static void main(String[] args) {
        Node first = createLinkedListFrom(1, 2, 3, 4, 3, 2, 1);
        System.out.println(isPalindrome(first));

        Node second = createLinkedListFrom(3, 4, 5, 6);
        System.out.println(isPalindrome(second));
    }

    // Reverse linked list and compare
    private static boolean isPalindrome(Node node) {
        Node reversedNode = reverseLinkedList(node);
        return compareLinkedLists(node, reversedNode);
    }

    private static Node reverseLinkedList(Node node) {
        Node reversedNode = null;

        while(node != null) {
            Node temp = new Node(node.data);
            temp.next = reversedNode;
            reversedNode = temp;
            node = node.next;
        }

        return reversedNode;
    }

    private static boolean compareLinkedLists(Node first, Node second) {
        while (first != null && second != null) {
            if (first.data != second.data)
                return false;
            first = first.next;
            second = second.next;
        }
        return first == null && second == null;
    }
}
