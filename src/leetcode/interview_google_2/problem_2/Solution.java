package leetcode.interview_google_2.problem_2;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    int totalFruit(int[] tree) {
        int max = 0;
        int start = 0;
        int end = 1;

        final Set<Integer> fruitTypes = new HashSet<>();
        fruitTypes.add(tree[start]);

        for (end = 1; end < tree.length; end++) {
            fruitTypes.add(tree[end]);
            if (fruitTypes.size() > 2) {

                if (end - start > max) {
                    max = end - start;
                }

                int index = end - 1;
                final int value = tree[index];
                while (index > 0 && value == tree[index - 1]) {
                    index--;
                }

                fruitTypes.remove(tree[index - 1]);

                start = index;
            }
        }

        if (end - start > max) {
            max = end - start;
        }

        return max;
    }
}
