package leetcode.problem_0127;

import java.util.*;

public class Solution_2 {

    int ladderLength(String begin, String end, List<String> words) {
        if (!words.contains(end)) {
            return 0;
        }

        final int wordLength = begin.length();
        final Map<String, List<String>> map = getIntermediateWords(words, wordLength);

        final Queue<Node> beginNodes = new LinkedList<>();
        beginNodes.offer(new Node(begin, 1));

        final Queue<Node> endNodes = new LinkedList<>();
        endNodes.offer(new Node(end, 1));

        final Map<String, Integer> beginVisited = new HashMap<>();
        beginVisited.put(begin, 1);

        final Map<String, Integer> endVisited = new HashMap<>();
        endVisited.put(end, 1);

        while (!beginNodes.isEmpty() && !endNodes.isEmpty()) {
            final Node beginNode = beginNodes.poll();
            for (int i = 0; i < wordLength; i++) {
                final String intermediateWord = beginNode.word.substring(0, i) + "*" + beginNode.word.substring(i + 1);
                final List<String> originalWords = map.getOrDefault(intermediateWord, new ArrayList<>());
                for (final String word : originalWords) {
                    if (endVisited.containsKey(word)) {
                        return beginNode.level + endVisited.get(word);
                    }

                    if (!beginVisited.containsKey(word)) {
                        beginVisited.put(word, beginNode.level + 1);
                        beginNodes.offer(new Node(word, beginNode.level + 1));
                    }
                }
            }

            final Node endNode = endNodes.poll();
            for (int i = 0; i < wordLength; i++) {
                final String intermediateWord = endNode.word.substring(0, i) + "*" + endNode.word.substring(i + 1);
                final List<String> originalWords = map.getOrDefault(intermediateWord, new ArrayList<>());
                for (final String word : originalWords) {
                    if (beginVisited.containsKey(word)) {
                        return endNode.level + beginVisited.get(word);
                    }

                    if (!endVisited.containsKey(word)) {
                        endVisited.put(word, endNode.level + 1);
                        endNodes.offer(new Node(word, endNode.level + 1));
                    }
                }
            }
        }

        return 0;
    }

    private Map<String, List<String>> getIntermediateWords(final List<String> words, final int wordLength) {
        final Map<String, List<String>> map = new HashMap<>();
        for (final String word : words) {
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

        @Override
        public int hashCode() {
            return word.hashCode() + 31 * level;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Node) {
                final Node node = (Node) obj;
                return word.equals(node.word) && level == node.level;
            }
            return false;
        }
    }
}
