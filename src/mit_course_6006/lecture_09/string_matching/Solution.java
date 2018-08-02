package mit_course_6006.lecture_09.string_matching;

import mit_course_6006.lecture_09.RollingHash;

class Solution {

    int numberOfOccurrences(String s, String t) {
        final int sLength = s.length();
        final int tLength = t.length();
        int count = 0;

        final RollingHash sRollingHash = new RollingHash(s);
        sRollingHash.append(s);
        final int sHash = sRollingHash.getHash();

        final RollingHash tRollingHash = new RollingHash(s);
        tRollingHash.append(t.substring(0, sLength));

        if (sHash == tRollingHash.getHash()) {
            if (s.equals(tRollingHash.getString())) {
                count++;
            }
        }

        for (int i = sLength; i < tLength; i++) {
            tRollingHash.skip(t.charAt(i - sLength));
            tRollingHash.append(t.charAt(i));

            if (sHash == tRollingHash.getHash()) {
                if (s.equals(tRollingHash.getString())) {
                    count++;
                }
            }
        }

        return count;
    }
}
