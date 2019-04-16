package leetcode.problem_0165;

public class Solution {

    int compareVersion(String version1, String version2) {
        final String[] c1 = version1.split("\\.");
        final String[] c2 = version2.split("\\.");

        int index = 0;
        while (index < c1.length || index < c2.length) {
            final int r1 = index >= c1.length ? 0 : Integer.parseInt(c1[index]);
            final int r2 = index >= c2.length ? 0 : Integer.parseInt(c2[index]);

            if (r1 > r2) {
                return 1;
            }

            if (r1 < r2) {
                return -1;
            }

            index++;
        }

        return 0;
    }
}
