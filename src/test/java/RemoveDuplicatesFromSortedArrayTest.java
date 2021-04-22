import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void t1() {
        int[] input = {1, 1, 2};
        var expectedOutput = 2;

        var output = removeDuplicatesFromSortedArray.removeDuplicates(input);

        assertEquals(expectedOutput, output);
    }
}