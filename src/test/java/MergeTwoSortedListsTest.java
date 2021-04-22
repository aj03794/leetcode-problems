import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void t1() {
        var expectedOutput = 2;
        int[] input = {1,1,2};

        var output = removeDuplicatesFromSortedArray.removeDuplicates(input);

        assertEquals(expectedOutput, output);
    }

}