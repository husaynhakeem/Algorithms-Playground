package leetcode.problem_83;

class Solution {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode result = slow;

        while (fast != null) {
            int val = fast.val;
            fast = fast.next;
            while (fast != null && fast.val == val) {
                fast = fast.next;
            }
            slow.next = fast;
            slow = slow.next;
        }

        return result;
    }
}
