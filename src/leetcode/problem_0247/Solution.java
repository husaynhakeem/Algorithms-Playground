package leetcode.problem_0247;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    List<String> findStrobogrammatic(int n) {
        return helper(n, true);
    }

    private List<String> helper(final int n, final boolean isFirstLayer) {
        if (n == 0) {
            return Collections.singletonList("");
        }

        if (n == 1) {
            return Arrays.asList("0", "1", "8");
        }

        final List<String> subLayerResults = helper(n - 2, false);
        final List<String> results = new ArrayList<>();
        for (final String s : subLayerResults) {
            if (!isFirstLayer) {
                results.add("0" + s + "0");
            }
            results.add("1" + s + "1");
            results.add("6" + s + "9");
            results.add("8" + s + "8");
            results.add("9" + s + "6");
        }
        return results;
    }
}
