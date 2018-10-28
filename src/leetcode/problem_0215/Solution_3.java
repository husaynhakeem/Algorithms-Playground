package leetcode.problem_0215;

import java.util.PriorityQueue;

class Solution_3 {

    int findKthLargest(int[] array, int k) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int n : array) {
            queue.offer(n);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.peek();
    }
}
