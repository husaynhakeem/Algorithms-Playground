package cracking_the_coding_interview.chapter_02.exercise_06;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Solution_4 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    boolean isPalindrome(@NotNull final Node node) {
        final List<Integer> values = new ArrayList<>();

        Node runner = node;
        while (runner != null) {
            values.add(runner.val);
            runner = runner.next;
        }

        int left = 0, right = values.size() - 1;
        while (left < right) {
            if (!values.get(left++).equals(values.get(right--))) {
                return false;
            }
        }

        return true;
    }

}
