package leetcode.problem_0720;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    String longestWord(String[] words) {
        if (words == null) {
            return "";
        }

        Arrays.sort(words);

        final Set<String> results = new HashSet<>();
        String result = "";

        for (String word : words) {
            if (word.length() == 1 || (word.length() > 1 && results.contains(word.substring(0, word.length() - 1)))) {
                results.add(word);
                result = word.length() > result.length() ? word : result;
            }
        }

        return result;
    }
}
