package leetcode.problem_0295;

import java.util.PriorityQueue;

public class Solution {

    static class MedianFinder {

        final PriorityQueue<Integer> smaller;
        final PriorityQueue<Integer> larger;

        MedianFinder() {
            smaller = new PriorityQueue<>((n1, n2) -> n2 - n1);
            larger = new PriorityQueue<>();
        }

        void addNum(final int num) {
            smaller.offer(num);
            larger.offer(smaller.poll());
            if (smaller.size() < larger.size()) {
                smaller.offer(larger.poll());
            }
        }

        double findMedian() {
            return smaller.size() == larger.size() ? (smaller.peek() + larger.peek()) * 0.5 : smaller.peek();
        }
    }
}
