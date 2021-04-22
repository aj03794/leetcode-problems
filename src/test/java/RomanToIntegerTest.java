import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    public void t1() {
        var input = "III";
        var expectedOutput = 3;

        var output = romanToInteger.romanToInt(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t2() {
        var input = "IV";
        var expectedOutput = 4;

        var output = romanToInteger.romanToInt(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t3() {
        var input = "IX";
        var expectedOutput = 9;

        var output = romanToInteger.romanToInt(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t4() {
        var input = "LVIII";
        var expectedOutput = 58;

        var output = romanToInteger.romanToInt(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t5() {
        var input = "MCMXCIV";
        var expectedOutput = 1994;

        var output = romanToInteger.romanToInt(input);

        assertEquals(expectedOutput, output);
    }


}