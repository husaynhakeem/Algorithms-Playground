package leetcode.problem_0057;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void insert_1() {
        final int[][] intervals = {{1, 3}, {6, 9}};
        final int[] newInterval = {2, 5};

        final int[][] result = solution.insert(intervals, newInterval);

        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, result);
    }

    @Test
    public void insert_2() {
        final int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        final int[] newInterval = {4, 8};

        final int[][] result = solution.insert(intervals, newInterval);

        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, result);
    }

    @Test
    public void insert_3() {
        final int[][] intervals = {{3, 5}, {6, 7}, {8, 10}, {12, 16}};
        final int[] newInterval = {0, 2};

        final int[][] result = solution.insert(intervals, newInterval);

        assertArrayEquals(new int[][]{{0, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, result);
    }

    @Test
    public void insert_4() {
        final int[][] intervals = {{3, 5}, {6, 7}, {8, 10}, {12, 16}};
        final int[] newInterval = {20, 29};

        final int[][] result = solution.insert(intervals, newInterval);

        assertArrayEquals(new int[][]{{3, 5}, {6, 7}, {8, 10}, {12, 16}, {20, 29}}, result);
    }

    @Test
    public void insert_5() {
        final int[][] intervals = {{3, 5}, {8, 10}, {12, 16}};
        final int[] newInterval = {6, 7};

        final int[][] result = solution.insert(intervals, newInterval);

        assertArrayEquals(new int[][]{{3, 5}, {6, 7}, {8, 10}, {12, 16}}, result);
    }

    @Test
    public void insert_6() {
        final int[][] intervals = {{3, 5}, {8, 10}, {12, 16}};
        final int[] newInterval = {6, 8};

        final int[][] result = solution.insert(intervals, newInterval);

        assertArrayEquals(new int[][]{{3, 5}, {6, 10}, {12, 16}}, result);
    }

    @Test
    public void insert_7() {
        final int[][] intervals = {{3, 5}, {8, 10}, {12, 16}};
        final int[] newInterval = {6, 20};

        final int[][] result = solution.insert(intervals, newInterval);

        assertArrayEquals(new int[][]{{3, 5}, {6, 20}}, result);
    }

    @Test
    public void insert_8() {
        final int[][] intervals = {{3, 5}, {8, 10}, {12, 16}};
        final int[] newInterval = {0, 20};

        final int[][] result = solution.insert(intervals, newInterval);

        assertArrayEquals(new int[][]{{0, 20}}, result);
    }

    @Test
    public void insert_9() {
        final int[][] intervals = {};
        final int[] newInterval = {0, 20};

        final int[][] result = solution.insert(intervals, newInterval);

        assertArrayEquals(new int[][]{{0, 20}}, result);
    }
}