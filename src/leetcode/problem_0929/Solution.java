package leetcode.problem_0929;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    int numUniqueEmails(final String[] emails) {
        final Set<String> uniqueEmails = new HashSet<>();
        for (final String email : emails) {
            uniqueEmails.add(reduce(getLocalName(email)) + "@" + getDomainName(email));
        }
        return uniqueEmails.size();
    }

    private String getDomainName(final String email) {
        return email.substring(email.indexOf('@') + 1);
    }

    private String getLocalName(final String email) {
        return email.substring(0, email.indexOf('@'));
    }

    private String reduce(final String name) {
        final String nameBeforePlus = name.contains("+") ? name.substring(0, name.indexOf('+')) : name;
        return nameBeforePlus.replaceAll("\\.", "");
    }
}
