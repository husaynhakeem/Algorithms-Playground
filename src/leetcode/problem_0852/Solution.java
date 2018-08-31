package leetcode.problem_0852;

class Solution {

    int peakIndexInMountainArray(int[] A) {
        return peakIndexInMountainArray(A, 0, A.length);
    }

    private int peakIndexInMountainArray(final int[] A, final int low, final int high) {
        if (low > high) {
            return -1;
        }

        final int mid = low + (high - low) / 2;

        if ((mid == 0 || A[mid - 1] < A[mid]) && (mid == A.length - 1 || A[mid + 1] < A[mid])) {
            return mid;
        }

        if (mid != 0 && A[mid - 1] > A[mid]) {
            return peakIndexInMountainArray(A, low, mid - 1);
        }

        return peakIndexInMountainArray(A, mid + 1, high);
    }
}
