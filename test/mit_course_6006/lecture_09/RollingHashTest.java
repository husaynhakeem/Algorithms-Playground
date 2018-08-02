package mit_course_6006.lecture_09;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollingHashTest {

    @Test
    public void construct() throws Exception {
        final RollingHash rollingHash = new RollingHash("ab");

        assertTrue(rollingHash.getString().isEmpty());
        assertEquals(0, rollingHash.getHash());
        assertEquals(3, rollingHash.getBase());
    }

    @Test
    public void append_1() throws Exception {
        final RollingHash rollingHash = new RollingHash("ab");

        rollingHash.append("ab");

        assertEquals("ab", rollingHash.getString());
        assertEquals(2, rollingHash.getHash());
        assertEquals(3, rollingHash.getBase());
    }

    @Test
    public void appendAndSkip_1() throws Exception {
        final RollingHash rollingHash = new RollingHash("ab");

        rollingHash.append("ab");
        rollingHash.skip('a');

        assertEquals("b", rollingHash.getString());
        assertEquals(2, rollingHash.getHash());
        assertEquals(3, rollingHash.getBase());
    }

    @Test
    public void appendAndSkip_2() throws Exception {
        final RollingHash rollingHash = new RollingHash("ab");

        rollingHash.append("ab");
        rollingHash.skip('a');
        rollingHash.append('a');

        assertEquals("ba", rollingHash.getString());
        assertEquals(1, rollingHash.getHash());
        assertEquals(3, rollingHash.getBase());
    }
}