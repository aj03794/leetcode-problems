import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Do upper and lower characters count as the same character?
// What about spaces
class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    @DisplayName("Should return bab from babad")
    public void t1() {
        var input = "babad";
        var expectedOutput = "bab";

        var actualOutput = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("Should return cbbd from bb")
    public void t2() {
        var input = "cbb";
        var expectedOutput = "bb";

        var actualOutput = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("Should return a from a")
    public void t3() {
        var input = "a";
        var expectedOutput = "a";

        var actualOutput = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("Should return a from ac")
    public void t4() {
        var input = "ac";
        var expectedOutput = "a";

        var actualOutput = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("Should return racecar from racecar")
    public void t5() {
        var input = "racecar";
        var expectedOutput = "racecar";

        var actualOutput = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void t6() {
        var input = "dbbfcba";
        var expectedOutput = "bb";

        var actualOutput = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void t7() {
        var input = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        var expectedOutput = "raynar";

        var actualOutput = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expectedOutput, actualOutput);
    }

}