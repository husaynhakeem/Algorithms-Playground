package leetcode.interview_amazon_1.problem_2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    int[][] kClosest(int[][] points, int K) {
        final PriorityQueue<Point> queue = new PriorityQueue<>(Comparator.comparingInt(Point::distance));
        for (final int[] point : points) {
            queue.add(new Point(point[0], point[1]));
        }

        final int[][] results = new int[K][];
        for (int i = 0; i < K; i++) {
            final Point point = queue.poll();
            final int[] result = new int[2];
            result[0] = point.x;
            result[1] = point.y;
            results[i] = result;
        }

        return results;
    }

    class Point {
        final int x;
        final int y;

        Point(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        int distance() {
            return x * x + y * y;
        }
    }
}
