package mit_course_6006.lecture_09.string_matching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void numberOfOccurrences_1() throws Exception {
        final int result = solution.numberOfOccurrences("ab", "abab");

        assertEquals(2, result);
    }

    @Test
    public void numberOfOccurrences_2() throws Exception {
        final int result = solution.numberOfOccurrences("abracadabra", "abacadabrabracabracadabrabrabracad");

        assertEquals(1, result);
    }

    @Test
    public void numberOfOccurrences_3() throws Exception {
        final int result = solution.numberOfOccurrences("abacad", "abacadabrabracabracadabrabrabracad");

        assertEquals(1, result);
    }

    @Test
    public void numberOfOccurrences_4() throws Exception {
        final int result = solution.numberOfOccurrences("bcara", "abacadabrabracabracadabrabrabracad");

        assertEquals(0, result);
    }

    @Test
    public void numberOfOccurrences_5() throws Exception {
        final int result = solution.numberOfOccurrences("sag", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eu dapibus dui, et viverra leo. Integer mollis dolor eget ante tempus lobortis vel eu diam. Etiam elementum faucibus ullamcorper. Morbi est magna, mattis vel tortor eu, pharetra aliquam tellus. Curabitur a luctus ante, non euismod tellus. Fusce et ligula luctus, molestie elit nec, ultrices orci. Morbi rhoncus turpis placerat lacus sollicitudin, quis ornare massa elementum. Quisque sed neque eros. Praesent felis ex, pharetra sed metus non, mollis placerat magna. Vivamus cursus, nunc eu dictum vulputate, orci nisi mollis orci, et elementum enim orci non augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Etiam ultrices ipsum eros, quis tincidunt velit tempus ac. Mauris ultricies aliquet odio quis hendrerit. Phasellus id orci eget risus facilisis tristique non vitae leo. Aliquam non elit vel sapien consequat varius. Ut tempor faucibus libero id sollicitudin.\n" +
                "\n" +
                "Fusce consectetur consectetur consequat. Nullam luctus turpis eu interdum pretium. Nulla tristique congue placerat. Curabitur tincidunt sagittis mi, in laoreet sem ultricies eu. Fusce risus mauris, efficitur sed porttitor consequat, eleifend sed ex. Donec dictum sapien semper, porta metus sit amet, sagittis mauris. Duis cursus libero quis leo facilisis feugiat a vitae purus. Ut vulputate dignissim pulvinar. Vestibulum a urna et ligula aliquet porttitor. Sed vel neque quis felis semper suscipit. Aenean rhoncus gravida aliquet. Proin eget consequat nisl.\n" +
                "\n" +
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus tempor auctor augue. Sed sit amet nisi vulputate, sodales quam sed, aliquam neque. Aliquam fermentum pulvinar nisi, a sodales augue cursus et. Morbi ullamcorper, velit et placerat dapibus, enim justo porta magna, et blandit velit metus ac turpis. Cras sed quam nec eros pulvinar rutrum vitae semper purus. Nulla rhoncus elementum sem in euismod. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Sed sed dignissim massa, eget tincidunt turpis. Suspendisse quam tellus, sagittis sit amet elit a, blandit bibendum nulla. Pellentesque tristique orci arcu, eu commodo massa finibus in. Pellentesque eget massa pharetra, malesuada tortor vel, consectetur neque.\n" +
                "\n" +
                "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Curabitur efficitur varius iaculis. Nunc ut ante et purus faucibus vulputate. Aliquam diam nisi, ultrices non dui pellentesque, ullamcorper mattis tellus. Vivamus sed magna aliquet, efficitur arcu vel, malesuada diam. Sed diam orci, rutrum sed felis sed, rutrum cursus arcu. Vivamus laoreet ultricies tempor. Cras volutpat, est in ornare viverra, nisi lectus semper elit, vitae ultricies nulla justo vitae ipsum.\n" +
                "\n" +
                "Mauris sollicitudin risus eu risus malesuada gravida. Sed nisi lorem, sodales at hendrerit et, pellentesque sit amet metus. Etiam finibus rhoncus libero, nec posuere tortor volutpat ac. In imperdiet sed ipsum a pretium. Suspendisse potenti. Maecenas sodales, nunc a blandit blandit, mi eros aliquet augue, sed varius tortor dui eget tortor. Morbi id metus libero. Integer mattis interdum augue. Donec gravida elit sed semper blandit. Phasellus sed interdum justo, vel imperdiet ex. Mauris et tortor diam. Sed rhoncus mauris eu arcu facilisis mattis.");

        assertEquals(3, result);
    }
}