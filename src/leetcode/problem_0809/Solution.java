package leetcode.problem_0809;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    int expressiveWords(String S, String[] words) {
        final List<CharFrequency> sFrequencies = getCharFrequencies(S);
        int result = 0;

        for (final String word: words) {
            if (isStretchy(sFrequencies, getCharFrequencies(word))) {
                result++;
            }
        }

        return result;
    }

    private List<CharFrequency> getCharFrequencies(final String s) {
        final List<CharFrequency> list = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            final char c = s.charAt(i);

            int frequency = 0;
            while (i < s.length() && c == s.charAt(i)) {
                i++;
                frequency++;
            }

            list.add(new CharFrequency(c, frequency));
        }

        return list;
    }

    private boolean isStretchy(final List<CharFrequency> first, final List<CharFrequency> second) {
        if (first.size() != second.size()) {
            return false;
        }

        for (int i = 0; i < first.size(); i++) {
            final CharFrequency a = first.get(i);
            final CharFrequency b = second.get(i);

            if (a.c != b.c) {
                return false;
            }

            if (a.frequency < b.frequency || (a.frequency != b.frequency && a.frequency < 3)) {
                return false;
            }
        }

        return true;
    }

    class CharFrequency {
        char c;
        int frequency;

        public CharFrequency(final char c, final int frequency) {
            this.c = c;
            this.frequency = frequency;
        }
    }
}
