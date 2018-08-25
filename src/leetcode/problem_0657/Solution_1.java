package leetcode.problem_0657;

import java.util.Hashtable;

class Solution_1 {

    boolean judgeCircle(String moves) {
        final Hashtable<Character, Integer> movesAndFrequencies = new Hashtable<>();
        for (Character c : moves.toCharArray()) {
            Integer frequency = movesAndFrequencies.get(c);
            movesAndFrequencies.put(c, frequency == null ? 1 : frequency + 1);
        }
        return areEqual(movesAndFrequencies.get('U'), movesAndFrequencies.get('D')) &&
                areEqual(movesAndFrequencies.get('L'), movesAndFrequencies.get('R'));
    }

    private boolean areEqual(Integer n, Integer m) {
        return (n == null && m == null) || (n != null && m != null && n == (int) m);
    }
}
