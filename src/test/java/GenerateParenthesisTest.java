import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesisTest {

    GenerateParenthesis generateParenthesis = new GenerateParenthesis();

    @Test
    public void t1() {
        var input = 3;
        String[] arr = {"((()))","(()())","(())()","()(())","()()()"};
        var expectedOutput = new ArrayList<>(Arrays.asList(arr));

        var output = generateParenthesis.generateParenthesis(3);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void t2() {
        var input = 1;
        var expectedOutput = Arrays.asList("()");

        var output = generateParenthesis.generateParenthesis(3);

        assertEquals(expectedOutput, output);
    }

}