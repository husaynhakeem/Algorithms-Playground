package leetcode.problem_0394;

import java.util.Stack;

public class Solution {

    String decodeString(String s) {
        final Stack<String> stack = new Stack<>();

        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == ']') {
                index++;

                final StringBuilder sb = new StringBuilder();
                while (!stack.peek().equals("[")) {
                    sb.insert(0, stack.pop());
                }
                final String word = sb.toString();

                stack.pop();

                int repeat = 0;
                int power = 0;
                while (!stack.isEmpty() && isDigit(stack.peek())) {
                    repeat += Math.pow(10, power++) * getNumericValue(stack.pop());
                }

                if (repeat == 0) {
                    stack.push(word);
                } else {
                    final StringBuilder wordRepeated = new StringBuilder();
                    for (int i = 0; i < repeat; i++) {
                        wordRepeated.append(word);
                    }
                    stack.push(wordRepeated.toString());
                }

            } else {
                stack.push(String.valueOf(s.charAt(index++)));
            }
        }

        final StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

    private boolean isDigit(final String s) {
        return s.length() == 1 && Character.isDigit(s.charAt(0));
    }

    private int getNumericValue(final String s) {
        return Character.getNumericValue(s.charAt(0));
    }
}
