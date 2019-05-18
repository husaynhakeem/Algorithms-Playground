package leetcode.problem_0082;

import Utilities.java.LinkedListUtils.Node;

public class Solution {

    Node deleteDuplicates(Node head) {
        Node result = new Node(0);
        Node node = null;

        while (head != null) {
            int count = 0;
            Node previous = null;
            while (head != null && (previous == null || previous.data == head.data)) {
                previous = head;
                head = head.next;
                count++;
            }

            if (count == 1) {
                if (node == null) {
                    node = new Node(previous.data);
                    result.next = node;
                } else {
                    node.next = new Node(previous.data);
                    node = node.next;
                }
            }
        }

        return result.next;
    }
}
