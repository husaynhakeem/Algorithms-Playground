package cracking_the_coding_interview.chapter_08.exercise_07;

import Utilities.java.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {

    public static void main(String[] args) {
        ListUtils.printList(computePerms("abc"));
        ListUtils.printList(computePerms("abcd"));
    }

    private static List<String> computePerms(String word) {

        List<String> allPerms = new ArrayList<>();

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

    private static List<String> getPermsFor(char c, String word) {
        List<String> perms = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            perms.add(word.substring(0, i) + c + word.substring(i, word.length()));
        }

        perms.add(word + c);
        return perms;
    }
}
