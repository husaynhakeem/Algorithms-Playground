package leetcode.problem_0215;

import java.util.Arrays;

class Solution_2 {

    int findKthLargest(int[] array, int k) {
        Arrays.sort(array);
        return array[array.length - k];
    }
}
