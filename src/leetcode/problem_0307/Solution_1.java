package leetcode.problem_0307;

class Solution_1 {

    private final int length;
    private final int[] array;
    private final int[] segmentTree;

    Solution_1(final int[] array) {
        this.length = array.length;
        this.array = array;
        this.segmentTree = new int[2 * array.length - 1];
        buildSegmentTree(array);
    }

    private void buildSegmentTree(final int[] array) {
        buildSegmentTreeHelper(segmentTree, array, 0, array.length - 1, 0);
    }

    private int buildSegmentTreeHelper(final int[] segmentTree, final int[] array, final int start, final int end, final int index) {
        if (start == end) {
            segmentTree[index] = array[start];
        } else {
            final int mid = start + (end - start) / 2;
            segmentTree[index] = buildSegmentTreeHelper(segmentTree, array, start, mid, 2 * index + 1) +
                    buildSegmentTreeHelper(segmentTree, array, mid + 1, end, 2 * index + 2);
        }
        return segmentTree[index];
    }

    void update(final int indexToUpdate, final int newValue) {
        final int difference = newValue - array[indexToUpdate];
        array[indexToUpdate] = newValue;
        updateHelper(indexToUpdate, difference, 0, 0, length - 1);
    }

    private void updateHelper(final int indexToUpdate, final int difference, final int index, final int start, final int end) {
        if (indexToUpdate < start || end < indexToUpdate) {
            return;
        }
        segmentTree[index] += difference;
        if (start != end) {
            final int mid = start + (end - start) / 2;
            updateHelper(indexToUpdate, difference, 2 * index + 1, start, mid);
            updateHelper(indexToUpdate, difference, 2 * index + 2, mid + 1, end);
        }
    }

    int sumRange(final int start, final int end) {
        if (start < 0 || length <= end) {
            return 0;
        }
        return sumRangeHelper(start, end, 0, length - 1, 0);
    }

    private int sumRangeHelper(final int queryStart, final int queryEnd, final int start, final int end, final int index) {
        if (queryStart <= start && end <= queryEnd) {
            return segmentTree[index];
        }
        if (end < queryStart || start > queryEnd) {
            return 0;
        }
        final int mid = start + (end - start) / 2;
        return sumRangeHelper(queryStart, queryEnd, start, mid, 2 * index + 1) +
                sumRangeHelper(queryStart, queryEnd, mid + 1, end, 2 * index + 2);
    }
}
