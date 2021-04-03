package leetcode.problem_0451;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    public String frequencySort(String input) {
        final Map<Character, Integer> charFrequencies = buildCharFrequencies(input);
        final PriorityQueue<CharFrequency> queue = convertToMaxHeap(charFrequencies);

        final StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            final CharFrequency charFrequency = queue.poll();
            for (int i = 0; i < charFrequency.frequency; i++) {
                sb.append(charFrequency.c);
            }
        }
        return sb.toString();
    }

    private Map<Character, Integer> buildCharFrequencies(final String input) {
        final Map<Character, Integer> map = new HashMap<>();
        final char[] inputChars = input.toCharArray();
        for (char c : inputChars) {
            final int frequency = map.getOrDefault(c, 0);
            map.put(c, frequency + 1);
        }
        return map;
    }

    private PriorityQueue<CharFrequency> convertToMaxHeap(final Map<Character, Integer> map) {
        final PriorityQueue<CharFrequency> queue = new PriorityQueue<CharFrequency>((charFrequency1, charFrequency2) -> charFrequency2.frequency - charFrequency1.frequency);
        for (final Map.Entry<Character, Integer> entry : map.entrySet()) {
            final CharFrequency charFrequency = new CharFrequency(entry.getKey(), entry.getValue());
            queue.add(charFrequency);
        }
        return queue;
    }

    static class CharFrequency {
        char c;
        int frequency;

        CharFrequency(char c, int frequency) {
            this.c = c;
            this.frequency = frequency;
        }
    }
}
