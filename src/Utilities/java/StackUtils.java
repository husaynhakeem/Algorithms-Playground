package Utilities.java;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class StackUtils {

    public static Stack<Integer> createStackFrom(int... values) {
        Stack<Integer> stack = new Stack<>();
        for (Integer value : values) {
            stack.push(value);
        }
        return stack;
    }

    public static boolean areStacksEqual(@NotNull final Stack<Integer> stack1, @NotNull final Stack<Integer> stack2) {
        if (stack1.size() != stack2.size()) {
            return false;
        }

        while (!stack1.isEmpty()) {
            if (stack1.pop() != (int) stack2.pop()) {
                return false;
            }
        }

        return true;
    }
}
