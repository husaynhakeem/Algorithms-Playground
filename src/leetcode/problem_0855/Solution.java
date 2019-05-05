package leetcode.problem_0855;

import java.util.PriorityQueue;

public class Solution {

    static class ExamRoom {

        private final PriorityQueue<Interval> intervals;
        private final int n;

        ExamRoom(final int n) {
            this.n = n;
            this.intervals = new PriorityQueue<>((a, b) -> {
                if (a.distance == b.distance) {
                    return a.left - b.left;
                }
                return b.distance - a.distance;
            });
            intervals.add(new Interval(-1, n));
        }

        int seat() {
            final Interval interval = intervals.poll();
            int seat;
            if (interval.left == -1) {
                seat = 0;
            } else if (interval.right == n) {
                seat = n - 1;
            } else {
                seat = (interval.right + interval.left) / 2;
            }
            intervals.offer(new Interval(interval.left, seat));
            intervals.offer(new Interval(seat, interval.right));
            return seat;
        }

        void leave(final int p) {
            Interval head = null;
            Interval tail = null;
            for (final Interval interval : intervals) {
                if (interval.right == p) {
                    head = interval;
                }
                if (interval.left == p) {
                    tail = interval;
                }
            }

            intervals.remove(head);
            intervals.remove(tail);
            intervals.offer(new Interval(head.left, tail.right));
        }

        private class Interval {
            final int left;
            final int right;
            final int distance;

            Interval(final int left, final int right) {
                this.left = left;
                this.right = right;
                this.distance = (left == -1) ? right : (right == n ? n - 1 - left : (right - left) / 2);
            }
        }
    }
}
