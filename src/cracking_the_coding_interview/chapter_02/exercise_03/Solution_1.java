package cracking_the_coding_interview.chapter_02.exercise_03;

import Utilities.java.LinkedListUtils;

public class Solution_1 {

    public static void main(String[] args) {
        LinkedListUtils.Node linkedList = LinkedListUtils.createLinkedListFrom(1, 2, 3, 4, 5, 6);
        deleteMiddleNode(LinkedListUtils.getNodeAtPosition(linkedList, 2));
        LinkedListUtils.printLinkedList(linkedList);
    }

    private static void deleteMiddleNode(LinkedListUtils.Node node) {
        LinkedListUtils.Node next = node.next;
        node.data = next.data;
        node.next = next.next;
    }
}
