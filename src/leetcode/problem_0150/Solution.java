package leetcode.problem_0150;

import java.util.Stack;

class Solution {

    int evalRPN(String[] tokens) {
        final Stack<String> stack = new Stack<>();
        final int length = tokens.length;
        int index = 0;

        while (index < length) {
            while (index < length && !isOperand(tokens[index])) {
                stack.push(tokens[index]);
                index++;
            }

            while (index < length && isOperand(tokens[index])) {
                final int b = Integer.parseInt(stack.pop());
                final int a = Integer.parseInt(stack.pop());
                final int result = operation(a, b, tokens[index]);
                stack.push(String.valueOf(result));
                index++;
            }
        }

        return Integer.parseInt(stack.pop());
    }

    private boolean isOperand(final String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private int operation(final int a, final int b, final String operand) {
        switch (operand) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Passed in invalid operand");
        }
    }
}
