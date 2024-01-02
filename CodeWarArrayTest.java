import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CodeWarArrayTest {

    @Test
    public void testSquareElements() {
        int[] numbersToCheck = {7, -4, 3, 0, 50, 200, 10};
        int[] actual = CodeWarArray.squareElements(numbersToCheck);
        int[] expected = {0, 9, 16, 49, 100, 2500, 40000};

        assertArrayEquals(expected, actual);
    }
}