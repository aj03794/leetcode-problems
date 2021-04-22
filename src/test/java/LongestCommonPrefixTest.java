import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void t1() {
        var expectedRes = "fl";
        var input = new String[]{"flower", "flow", "flight"};

        var res = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(res, expectedRes);
    }

    @Test
    public void t2() {
        var expectedRes = "";
        var input = new String[]{""};

        var res = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(res, expectedRes);
    }

    @Test
    public void t3() {
        var expectedRes = "flower";
        var input = new String[]{"flower"};

        var res = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(res, expectedRes);
    }

    @Test
    public void t4() {
        var expectedRes = "flow";
        var input = new String[]{"flower", "flow"};

        var res = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(res, expectedRes);
    }

    @Test
    public void t5() {
        var expectedRes = "f";
        var input = new String[]{"f", "f"};

        var res = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(res, expectedRes);
    }

    @Test
    public void t6() {
        var expectedRes = "f";
        var input = new String[]{"fffff", "ffff", "fff", "ff", "f"};

        var res = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(res, expectedRes);
    }

    @Test
    public void t7() {
        var expectedRes = "";
        var input = new String[]{};

        var res = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(res, expectedRes);
    }

    @Test
    public void t8() {
        var expectedRes = "";
        var input = new String[]{"a", "a", "b"};

        var res = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(res, expectedRes);
    }

    @Test
    public void t9() {
        var expectedRes = "";
        var input = new String[]{"abb", "abb", ""};

        var res = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(res, expectedRes);
    }

}