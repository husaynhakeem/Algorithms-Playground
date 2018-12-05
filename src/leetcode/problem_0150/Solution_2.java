package leetcode.problem_0150;

import java.util.Stack;

class Solution_2 {

    int evalRPN(String[] tokens) {
        if (tokens.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            switch (str) {
                case "+": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a + b);
                    break;
                }
                case "-": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                }
                case "/": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a / b);
                    break;
                }
                case "*": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a * b);
                    break;
                }
                default:
                    stack.push(Integer.parseInt(str));
                    break;
            }
        }
        return stack.peek();
    }
}
