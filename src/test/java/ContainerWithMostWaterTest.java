import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    ContainerWithMostWater containerWithMostWater= new ContainerWithMostWater();

    @Test
    public void t1() {
        var input = new int[]{1,8,6,2,5,4,8,3,7};
        var expectedOutput = 49;

        var output = containerWithMostWater.maxArea(input);

        assertEquals(output, expectedOutput);
    }

    @Test
    public void t2() {
        var input = new int[]{1,1};
        var expectedOutput = 1;

        var output = containerWithMostWater.maxArea(input);

        assertEquals(output, expectedOutput);
    }
    @Test
    public void t3() {
        var input = new int[]{4, 3, 2, 1, 4};
        var expectedOutput = 16;

        var output = containerWithMostWater.maxArea(input);

        assertEquals(output, expectedOutput);
    }

    // My implementation had initially missed that for the right side of the array
    // we should take the larger index even if the height is teh same
    // Talking about 2 and 1 here specifically
    @Test
    public void t4() {
        var input = new int[]{1,2,1};
        var expectedOutput = 2;

        var output = containerWithMostWater.maxArea(input);

        assertEquals(output, expectedOutput);
    }

    // Had initially missed this as well
    // Initially I got 48 b/c I saw 8 as largest area of left
    // and 25 as largest area on left
    // But actually it was better to use 7 in this case
    @Test
    public void t5() {
        var input = new int[]{1, 8, 6, 2, 5, 4, 8, 25, 7};
        var expectedOutput = 49;

        var output = containerWithMostWater.maxArea(input);

        assertEquals(output, expectedOutput);
    }

    @Test
    public void t6() {
        var input = new int[]{1,2,4,3};
        var expectedOutput = 4;

        var output = containerWithMostWater.maxArea(input);

        assertEquals(output, expectedOutput);
    }

    @Test
    public void t7() {
        var input = new int[]{1,1,2,2};
        var expectedOutput = 3;

        var output = containerWithMostWater.maxArea(input);

        assertEquals(output, expectedOutput);
    }

    @Test
    public void t8() {
        var input = new int[]{1, 3, 20, 2, 2, 2};
        var expectedOutput = 8;

        var output = containerWithMostWater.maxArea(input);

        assertEquals(output, expectedOutput);
    }

    @Test
    public void t9() {
        var input = new int[]{2,3,4,5,18,17,6};
        var expectedOutput = 17;

        var output = containerWithMostWater.maxArea(input);

        assertEquals(output, expectedOutput);
    }

}