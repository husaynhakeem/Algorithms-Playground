package leetcode.problem_0728;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<Integer> selfDividingNumbers(int left, int right) {
        final List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividingNumber(int n) {
        int m = n;
        while (m > 0) {
            int i = m % 10;
            if (i == 0 || n % i != 0) {
                return false;
            }
            m /= 10;
        }
        return true;
    }
}
