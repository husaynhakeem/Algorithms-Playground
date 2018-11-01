package leetcode.problem_0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionWithLists {

    List<List<Integer>> threeSum(final int[] array, final int k) {
        final List<List<Integer>> results = new ArrayList<>();
        final int length = array.length;

        if (length <= 2) {
            return results;
        }

        Arrays.sort(array);

        for (int i = 0; i < length - 2; i++) {
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }
            twoSum(array, array[i], i + 1, k, results);
        }

        return results;
    }

    private void twoSum(final int[] array, final int currentVal, final int startIndex, final int target, final List<List<Integer>> results) {
        int i = startIndex;
        int j = array.length - 1;
        int sum;

        while (i < j) {
            sum = currentVal + array[i] + array[j];
            if (sum == target) {
                results.add(listFrom(currentVal, array[i], array[j]));

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

    private List<Integer> listFrom(int... values) {
        final List<Integer> list = new ArrayList<>();
        for (int n : values) {
            list.add(n);
        }
        return list;
    }
}
