package Utilities.java;

import java.util.Stack;

public class StackUtils {

    public static Stack<Integer> createStackFrom(int... values) {
        Stack<Integer> stack = new Stack<>();
        for (Integer value : values) {
            stack.push(value);
        }
        return stack;
    }
}
