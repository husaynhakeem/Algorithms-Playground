package leetcode.problem_0208;

class Solution_2 {

    static class Trie {
        private TrieNode[] root = new TrieNode[26];

        void insert(final String word) {
            TrieNode[] trieNodes = root;
            TrieNode node = root[word.charAt(0) - 'a'];

            for (char c : word.toCharArray()) {
                if (trieNodes[c - 'a'] == null) {
                    trieNodes[c - 'a'] = new TrieNode(c);
                }
                node = trieNodes[c - 'a'];
                trieNodes = node.trieNodes;
            }

            node.isLeaf = true;
        }

        boolean search(final String word) {
            TrieNode[] trieNodes = root;
            TrieNode node = root[word.charAt(0) - 'a'];

            for (char c : word.toCharArray()) {
                node = trieNodes[c - 'a'];
                if (node == null) {
                    return false;
                }
                trieNodes = node.trieNodes;
            }

            return node.isLeaf;
        }

        boolean startsWith(final String word) {
            TrieNode[] trieNodes = root;
            TrieNode node;

            for (char c : word.toCharArray()) {
                node = trieNodes[c - 'a'];
                if (node == null) {
                    return false;
                }
                trieNodes = node.trieNodes;
            }

            return true;
        }
    }

    private static class TrieNode {
        TrieNode[] trieNodes = new TrieNode[26];
        char c;
        boolean isLeaf;

        TrieNode(char c) {
            this.c = c;
        }
    }
}
