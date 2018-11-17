package leetcode.problem_0208;

import leetcode.problem_0208.Solution_2.Trie;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    @Test
    public void testTrie() throws Exception {
        final Trie trie = new Trie();

        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));

        trie.insert("app");
        assertTrue(trie.search("app"));
    }
}