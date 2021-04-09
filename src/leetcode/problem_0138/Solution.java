package leetcode.problem_0138;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Node copyRandomList(Node head) {
        final Node resultHead = new Node(0);
        Node resultRunner = resultHead;

        final Map<Node, Node> originalToCopy = new HashMap<>();

        while (head != null) {
            // Get copy of current node from map if it's already been added before (random), else create a new copy
            final Node currentCopy = originalToCopy.getOrDefault(head, new Node(head.val));
            originalToCopy.putIfAbsent(head, currentCopy);

            // Set the copy's random value
            if (head.random != null) {
                if (originalToCopy.get(head.random) == null) {
                    originalToCopy.put(head.random, new Node(head.random.val));
                }
                currentCopy.random = originalToCopy.get(head.random);
            }

            resultRunner.next = currentCopy;
            resultRunner = resultRunner.next;

            head = head.next;
        }

        return resultHead.next;
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
