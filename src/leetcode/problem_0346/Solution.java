package leetcode.problem_0346;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    static class MovingAverage {

        private final Queue<Integer> queue = new LinkedList<>();
        private final int size;
        private int sum = 0;

        public MovingAverage(int size) {
            this.size = size;
        }

        public double next(int val) {
            queue.add(val);
            sum += val;

            if (queue.size() > size) {
                sum -= queue.remove();
            }

            return ((double) sum) / queue.size();
        }
    }
}
