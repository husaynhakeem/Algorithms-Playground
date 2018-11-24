package leetcode.problem_0211;

class Solution {

    private Trie trie = new Trie();

    void addWord(String word) {
        trie.add(word);
    }

    boolean search(String word) {
        return trie.search(word);
    }

    private class TrieNode {
        char value;
        boolean isLeaf;
        TrieNode[] nodes = new TrieNode[26];

        TrieNode(final char value) {
            this.value = value;
        }
    }

    private class Trie {
        private TrieNode root = new TrieNode(' ');

        void add(final String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.nodes[c - 'a'] == null) {
                    node.nodes[c - 'a'] = new TrieNode(c);
                }
                node = node.nodes[c - 'a'];
            }
            node.isLeaf = true;
        }

        boolean search(final String word) {
            return search(word, root);
        }

        private boolean search(final String word, final TrieNode root) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                final char c = word.charAt(i);
                if (c != '.') {
                    if (node.nodes[c - 'a'] == null) {
                        return false;
                    }
                    node = node.nodes[c - 'a'];
                } else {
                    for (char anyChar = 'a'; anyChar <= 'z'; anyChar = (char) (anyChar + 1)) {
                        final TrieNode anyCharNode = node.nodes[anyChar - 'a'];
                        if (anyCharNode != null) {
                            final boolean foundWord = search(word.substring(i + 1), anyCharNode);
                            if (foundWord) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
            return node.isLeaf;
        }
    }
}
