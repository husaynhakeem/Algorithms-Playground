package leetcode.problem_0043;

import java.math.BigInteger;

public class Solution {

    String multiply(String num1, String num2) {
        return (new BigInteger(num1).multiply(new BigInteger(num2))).toString();
    }
}
