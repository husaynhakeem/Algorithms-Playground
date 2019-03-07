package leetcode.problem_0921;

import java.util.Stack;

public class Solution_1 {

    int minAddToMakeValid(final String s) {
        final Stack<Character> parentheses = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                parentheses.push('(');
            } else {
                if (!parentheses.isEmpty() && parentheses.peek() == '(') {
                    parentheses.pop();
                } else {
                    parentheses.push(')');
                }
            }
        }
        return parentheses.size();
    }
}
