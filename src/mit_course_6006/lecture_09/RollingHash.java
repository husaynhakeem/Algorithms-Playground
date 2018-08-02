package mit_course_6006.lecture_09;

import static Utilities.java.IntegerUtils.firstPrimeBiggerThan;

public class RollingHash {

    private StringBuilder sb;
    private int hash;
    private int base;

    public RollingHash(String s) {
        sb = new StringBuilder();
        hash = 0;
        base = firstPrimeBiggerThan(s.length());
    }

    public void append(char c) {
        hash = ((hash % base) * base + (int) c) % base;
        sb.append(c);
    }

    public void append(String s) {
        for (Character c : s.toCharArray()) {
            append(c);
        }
    }

    public void skip(char c) {
        hash = ((hash % base) - ((int) c) * (int) (Math.pow(base, sb.length() - 1) % base)) % base;
        sb.deleteCharAt(0);
    }

    public int getHash() {
        return hash;
    }

    public String getString() {
        return sb.toString();
    }

    int getBase() {
        return base;
    }
}
