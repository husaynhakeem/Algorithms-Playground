package chapter2_exercise5.java;

import Utilities.java.LinkedListUtils;
import Utilities.java.LinkedListUtils.Node;

public class Solution_1 {

    public static void main(String[] args) {
        Node first = LinkedListUtils.createLinkedListFrom(1, 2);
        Node second = LinkedListUtils.createLinkedListFrom(3, 4, 5, 6);

        Node sum = sumLists(first, second, true);

        LinkedListUtils.printLinkedList(sum);
    }

    private static Node sumLists(Node first, Node second, boolean reverse) {
        String strFirst = fromLinkedListToString(first);
        String strSecond = fromLinkedListToString(second);

        if (reverse) {
            strFirst = reverseString(strFirst);
            strSecond = reverseString(strSecond);
        }

        String strSum = (Integer.parseInt(strFirst) + Integer.parseInt(strSecond)) + "";

        if (reverse)
            strSum = reverseString(strSum);

        return fromStringToLinkedList(strSum);
    }

    private static String fromLinkedListToString(Node root) {
        StringBuilder sb = new StringBuilder();

        while (root != null) {
            sb.append(root.data);
            root = root.next;
        }

        return sb.toString();
    }

    private static Node fromStringToLinkedList(String input) {
        Node node = new Node();
        Node result = new Node();
        Node temp;
        boolean isRoot = true;

        for (Character c : input.toCharArray()) {
            if (!isDigit(c))
                throw new IllegalArgumentException("Input should only contain digits");

            temp = new Node(Integer.parseInt(c.toString()));

            if (isRoot) {
                node = temp;
                result = node;
                isRoot = false;
            } else {
                node.next = temp;
                node = node.next;
            }
        }

        return result;
    }

    private static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb = sb.reverse();
        return sb.toString();
    }

    private static boolean isDigit(Character c) {
        return '0' <= c && c <= '9';
    }
}
