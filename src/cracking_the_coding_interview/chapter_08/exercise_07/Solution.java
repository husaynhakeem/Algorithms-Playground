package cracking_the_coding_interview.chapter_08.exercise_07;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> permutationsWithoutDups(final String word) {

        final List<String> allPerms = new ArrayList<>();

        if (word.length() <= 1) {
            allPerms.add(word);
            return allPerms;
        }

        allPerms.add(String.valueOf(word.charAt(0)));

        for (int i = 1; i < word.length(); i++) {
            List<String> level = new ArrayList<>();

            for (String s : allPerms) {
                level.addAll(getPermsFor(word.charAt(i), s));
            }

            allPerms.clear();
            allPerms.addAll(level);
        }

        return allPerms;
    }

    private List<String> getPermsFor(final char c, final String word) {
        final List<String> perms = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            perms.add(word.substring(0, i) + c + word.substring(i, word.length()));
        }
        perms.add(word + c);
        return perms;
    }
}
