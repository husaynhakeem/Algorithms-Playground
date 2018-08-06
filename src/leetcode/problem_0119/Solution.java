package leetcode.problem_0119;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<Integer> getRow(int rowIndex) {
        final List<Integer> initialList = new ArrayList<>();
        initialList.add(1);
        if (rowIndex == 0) {
            return initialList;
        }
        return getRow(initialList, rowIndex);
    }

    private List<Integer> getRow(List<Integer> previousRow, int rowIndex) {
        final List<Integer> result = new ArrayList<>();
        result.add(1);

        for (int i = 1; i < previousRow.size(); i++) {
            result.add(previousRow.get(i - 1) + previousRow.get(i));
        }

        result.add(1);

        if (rowIndex + 1 == result.size()) {
            return result;
        } else {
            return getRow(result, rowIndex);
        }
    }
}
