package leetcode.problem_0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    static class Triplet {
        int first;
        int second;
        int third;

        Triplet(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof Triplet)) {
                return false;
            }
            final Triplet otherTriplet = (Triplet) other;
            return first == otherTriplet.first && second == otherTriplet.second && third == otherTriplet.third;
        }
    }

    List<Triplet> threeSum(final int[] array, final int k) {
        final List<Triplet> results = new ArrayList<>();
        final int length = array.length;

        if (length <= 2) {
            return results;
        }

        Arrays.sort(array);

        for (int i = 0; i < length - 2; i++) {
            twoSum(array, array[i], i++, k, results);
        }

        return results;
    }

    private void twoSum(final int[] array, final int currentVal, final int startIndex, final int target, final List<Triplet> results) {
        int i = startIndex;
        int j = array.length - 1;
        int sum;

        while (i < j) {
            sum = currentVal + array[i] + array[j];
            if (sum == target) {
                results.add(new Triplet(currentVal, array[i], array[j]));

                // Move i forward to the next index that has a different value than array[i]
                final int firstVal = array[i];
                i++;
                while (i < j && array[i] == firstVal) {
                    i++;
                }

                // Move j backwards to the next index that has a different value than array[i]
                final int lastVal = array[j];
                j--;
                while (i < j && array[j] == lastVal) {
                    j--;
                }
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}
