package leetcode.problem_0208;

class Solution_1 {

    static class Trie {

        private static final int SIZE = 27;
        private Trie[] tries = new Trie[SIZE];

        void insert(String word) {
            if (word.isEmpty()) {
                tries[SIZE - 1] = new Trie();
                return;
            }
            final int index = word.charAt(0) - 'a';
            if (tries[index] == null) {
                tries[index] = new Trie();
            }

            tries[index].insert(word.substring(1));
        }

        boolean search(String word) {
            if (word.isEmpty()) {
                return isLeaf();
            }
            final Trie trie = tries[word.charAt(0) - 'a'];
            return trie != null && trie.search(word.substring(1));
        }

        boolean startsWith(String prefix) {
            if (prefix.isEmpty()) {
                return true;
            }
            final Trie trie = tries[prefix.charAt(0) - 'a'];
            return trie != null && trie.startsWith(prefix.substring(1));
        }

        private boolean isLeaf() {
            return tries[SIZE - 1] != null;
        }
    }
}
