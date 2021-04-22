import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    public void t1() {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        var expectedOutput = 6;

        var output = maximumSubarray.maxSubArray(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t2() {
        int[] input = {1, -5, 100};
        var expectedOutput = 100;

        var output = maximumSubarray.maxSubArray(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t3() {
        int[] input = {1};
        var expectedOutput = 1;

        var output = maximumSubarray.maxSubArray(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t4() {
        int[] input = {-1111111};
        var expectedOutput = -1111111;

        var output = maximumSubarray.maxSubArray(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t5() {
        int[] input = {1, 2};
        var expectedOutput = 3;

        var output = maximumSubarray.maxSubArray(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t6() {
        int[] input = {1,2,-1,-2,2,1,-2,1,4,-5,4};
        var expectedOutput = 6;

        var output = maximumSubarray.maxSubArray(input);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t7() {
        int[] input = {1, -2, -2, -1};
        var expectedOutput = 1;

        var output = maximumSubarray.maxSubArray(input);

        assertEquals(expectedOutput, output);
    }

}