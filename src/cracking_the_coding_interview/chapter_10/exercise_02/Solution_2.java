package cracking_the_coding_interview.chapter_10.exercise_02;

import java.util.Arrays;
import java.util.Comparator;

class Solution_2 {

    void groupAnagrams(String[] array) {
        Arrays.sort(array, new AnagramComparator());
    }

    private class AnagramComparator implements Comparator<String> {

        private String sortChars(String s) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }

        @Override
        public int compare(String s1, String s2) {
            return sortChars(s1).compareTo(sortChars(s2));
        }
    }
}
