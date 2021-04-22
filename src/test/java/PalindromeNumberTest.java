import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void t1() {
        var input = 121;
        var expectedOutput = true;

        var output = palindromeNumber.isPalindrome(input);

        assertEquals(output, expectedOutput);
    }

    @Test
    public void t2() {
        var input = -121;
        var expectedOutput = true;

        var output = palindromeNumber.isPalindrome(input);

        assertEquals(output, expectedOutput);
    }

    @Test
    public void t3() {
        var input = 10;
        var expectedOutput = false;

        var output = palindromeNumber.isPalindrome(input);

        assertEquals(output, expectedOutput);
    }

    @Test
    public void t4() {
        var input = 12344321;
        var expectedOutput = true;

        var output = palindromeNumber.isPalindrome(input);

        assertEquals(output, expectedOutput);
    }

}