package leetcode.problem_0771;

import java.util.HashSet;

class Solution {

    int numJewelsInStones(String J, String S) {
        final HashSet<Character> jewels = new HashSet<>();
        for (Character c : J.toCharArray()) {
            jewels.add(c);
        }

        int count = 0;
        for (Character c : S.toCharArray()) {
            if (jewels.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
