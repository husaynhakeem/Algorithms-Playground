package leetcode.problem_0127;

import java.util.*;

public class Solution {

    int ladderLength(String begin, String end, List<String> words) {
        if (!words.contains(end)) {
            return 0;
        }

        final int wordLength = begin.length();
        final Map<String, List<String>> map = getIntermediateWords(words, wordLength);

        final Queue<Node> nodes = new LinkedList<>();
        nodes.offer(new Node(begin, 1));

        final Set<String> visited = new HashSet<>();
        visited.add(begin);

        while(!nodes.isEmpty()) {
            final Node node = nodes.poll();

            for (int i = 0; i < wordLength; i++) {
                final String intermediateWord = node.word.substring(0, i) + "*" + node.word.substring(i + 1);
                final List<String> originalWords = map.getOrDefault(intermediateWord, new ArrayList<>());
                for (final String word: originalWords) {
                    if (word.equals(end)) {
                        return node.level + 1;
                    }

                    if (!visited.contains(word)) {
                        visited.add(word);
                        nodes.offer(new Node(word, node.level + 1));
                    }
                }
            }
        }

        return 0;
    }

    private Map<String, List<String>> getIntermediateWords(final List<String> words, final int wordLength) {
        final Map<String, List<String>> map = new HashMap<>();
        for (final String word: words) {
            for (int i = 0; i < wordLength; i++) {
                final String intermediateWord = word.substring(0, i) + "*" + word.substring(i + 1);
                final List<String> originalWords = map.getOrDefault(intermediateWord, new ArrayList<>());
                originalWords.add(word);
                map.put(intermediateWord, originalWords);
            }
        }
        return map;
    }

    private class Node {
        final String word;
        final int level;
        Node(final String word, final int level) {
            this.word = word;
            this.level = level;
        }
    }
}
