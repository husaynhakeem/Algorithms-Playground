package leetcode.problem_0023;

import Utilities.java.LinkedListUtils.Node;

import java.util.PriorityQueue;

class Solution {

    Node mergeKLists(Node[] lists) {
        if (lists == null) {
            return null;
        }

        final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (Node list : lists) {
            Node runner = list;
            while (runner != null) {
                priorityQueue.add(runner.data);
                runner = runner.next;
            }
        }

        final Node resultHead = new Node(0);
        Node runner = resultHead;
        while (!priorityQueue.isEmpty()) {
            runner.next = new Node(priorityQueue.poll());
            runner = runner.next;
        }

        return resultHead.next;
    }
}
