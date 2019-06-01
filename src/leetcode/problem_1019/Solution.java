package leetcode.problem_1019;

import Utilities.java.LinkedListUtils.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    int[] nextLargerNodes(Node head) {
        if (head == null) {
            return new int[0];
        }

        final List<Integer> result = toList(head);
        for (int i = 0; i < result.size(); i++) {
            result.set(i, nextMax(result, i));
        }
        return toIntArray(result);
    }

    private List<Integer> toList(final Node head) {
        final List<Integer> list = new ArrayList<>();
        Node node = head;

        while (node != null) {
            list.add(node.data);
            node = node.next;
        }

        return list;
    }

    private int nextMax(final List<Integer> list, final int from) {
        for (int i = from + 1; i < list.size(); i++) {
            if (list.get(i) > list.get(from)) {
                return list.get(i);
            }
        }
        return 0;
    }

    private int[] toIntArray(final List<Integer> list) {
        final int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
