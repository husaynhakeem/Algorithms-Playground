package misc;

class DeleteDuplicatesInLinkedList {

    static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    ListNode deleteDuplicates(ListNode a) {
        ListNode node = a;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return a;
    }
}
