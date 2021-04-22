import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbStairsTest {

    ClimbStairs climbStairs = new ClimbStairs();

    @Test
    public void t1() {
        var input = 2;
        var expectedOutput = 2;

        var output = climbStairs.climbStairs(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t2() {
        var input = 3;
        var expectedOutput = 3;

        var output = climbStairs.climbStairs(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t3() {
        var input = 4;
        var expectedOutput = 5;

        var output = climbStairs.climbStairs(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t4() {
        var input = 5;
        var expectedOutput = 8;

        var output = climbStairs.climbStairs(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t5() {
        var input = 45;
        var expectedOutput = 8;

        var output = climbStairs.climbStairs(input);

        assertEquals(expectedOutput, output);
    }

}