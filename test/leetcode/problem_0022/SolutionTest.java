package leetcode.problem_0022;

import Utilities.java.ListUtils;
import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    final Solution solution = new Solution();

    public void test_1() {
        int n = 0;

        final List<String> parentheses = solution.generateParenthesis(n);

        final List<String> expected = ListUtils.createList("");
        assertEquals(expected, parentheses);
    }

    public void test_2() {
        int n = 1;

        final List<String> parentheses = solution.generateParenthesis(n);

        final List<String> expected = ListUtils.createList("()");
        assertEquals(expected, parentheses);
    }

    public void test_3() {
        int n = 2;

        final List<String> parentheses = solution.generateParenthesis(n);

        final List<String> expected = ListUtils.createList("(())", "()()");
        assertEquals(expected, parentheses);
    }

    public void test_4() {
        int n = 3;

        final List<String> parentheses = solution.generateParenthesis(n);

        final List<String> expected = ListUtils.createList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(expected, parentheses);
    }

    public void test_5() {
        int n = 4;

        final List<String> parentheses = solution.generateParenthesis(n);

        final List<String> expected = ListUtils.createList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()");
        assertEquals(expected, parentheses);
    }
}