package leetcode.interview_google_2.problem_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void numUniqueEmails() throws Exception {
        final String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};

        final int result = solution.numUniqueEmails(emails);

        assertEquals(2, result);
    }
}