package leetcode.interview_microsoft_2.problem_3;

import java.math.BigInteger;

public class Solution {

    String multiply(String num1, String num2) {
        return (new BigInteger(num1).multiply(new BigInteger(num2))).toString();
    }
}
