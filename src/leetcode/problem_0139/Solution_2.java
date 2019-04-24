package leetcode.problem_0139;

import java.util.*;

public class Solution_2 {

    boolean wordBreak(String s, List<String> wordDict) {
        final Queue<Integer> indices = new LinkedList<>();
        indices.add(0);

        final Set<Integer> visited = new HashSet<>();
        final Set<String> dictionary = new HashSet<>(wordDict);

        while (!indices.isEmpty()) {
            final int index = indices.remove();
            if (index == s.length()) {
                return true;
            }

            if (!visited.contains(index)) {
                for (int i = index + 1; i <= s.length(); i++) {
                    if (dictionary.contains(s.substring(index, i))) {
                        indices.add(i);
                    }
                }
            }
            visited.add(index);
        }

        return false;
    }
}
