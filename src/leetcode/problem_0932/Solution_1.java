package leetcode.problem_0932;

import Utilities.java.ListUtils;

import java.util.ArrayList;
import java.util.List;

class Solution_1 {

    int[] beautifulArray(final int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        for (int k = 2; k <= n; k++) {
            final List<Integer> temp = new ArrayList<>();
            for (int i : result) {
                if (2 * i - 1 <= n) {
                    temp.add(2 * i - 1);
                }
            }
            for (int i : result) {
                if (2 * i <= n) {
                    temp.add(2 * i);
                }
            }
            result = temp;
        }

        return ListUtils.integerListToIntArray(result);
    }
}
