package cracking_the_coding_interview.chapter_08.exercise_09;

import java.util.HashSet;
import java.util.Set;

class Solution {

    Set<String> parens(final int n) {
        final Set<String> result = new HashSet<>();

        if (n == 0) {
            result.add("");
            return result;
        }

        for (String parens : parens(n - 1)) {
            result.add("()" + parens);
            for (int i = 0; i < parens.length() / 2; i++) {
                result.add(parens.substring(0, i + 1) + "()" + parens.substring(i + 1));
            }
        }

        return result;
    }
}
