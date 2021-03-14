package leetcode.problem_0004;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // a is the shortest of both arrays, b is the longest
        int[] a = nums1.length <= nums2.length ? nums1 : nums2;
        int[] b = nums1.length > nums2.length ? nums1 : nums2;

        // Length of the left half of (a U b)
        int leftHalfLength = (a.length + b.length + 1) / 2;

        // The minimum and maximum number of elements a can contribute
        int aMinCount = 0;
        int aMaxCount = a.length;

        while (aMinCount <= aMaxCount) {

            // The number of elements contributed by a and b in the left half
            int aCount = aMinCount + ((aMaxCount - aMinCount) / 2);
            int bCount = leftHalfLength - aCount;

            // x may be null if a is not contributing any elements
            Integer x = aCount > 0 ? a[aCount - 1] : null;

            // xP may be null if a is contributing all its elements
            Integer xP = aCount < a.length ? a[aCount] : null;

            // y may be null if b is not contributing any elements
            Integer y = bCount > 0 ? b[bCount - 1] : null;

            // yP may be null if b is contributing all its elements
            Integer yP = bCount < b.length ? b[bCount] : null;

            if (x != null && yP != null && x > yP) {

                // Decrease a's contributions
                aMaxCount = aCount - 1;

            } else if (y != null && xP != null && y > xP) {

                // Decrease b's contributions => Increase a's contributions
                aMinCount = aCount + 1;

            } else {

                // x and y are both part of the left half
                int leftHalfLastElement;
                if (x != null && y != null) {
                    leftHalfLastElement = Math.max(x, y);
                } else {
                    leftHalfLastElement = x != null ? x : y;
                }

                // If (a U b) has an odd length, the median is the leftHalfLastElement
                boolean isOdd = (a.length + b.length) % 2 == 1;
                if (isOdd) {
                    return leftHalfLastElement;
                }

                // If (a U b) has an even length, the median is half leftHalfLastElement and the right half's first element.
                int rightHalfFirstElement;
                if (xP != null && yP != null) {
                    rightHalfFirstElement = Math.min(xP, yP);
                } else {
                    rightHalfFirstElement = xP != null ? xP : yP;
                }
                return (leftHalfLastElement + rightHalfFirstElement) / (double) 2;
            }
        }

        throw new RuntimeException("Reached unreachable code path.");
    }
}
