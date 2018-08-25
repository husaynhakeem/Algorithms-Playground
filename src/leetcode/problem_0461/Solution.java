package leetcode.problem_0461;

class Solution {

    int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
