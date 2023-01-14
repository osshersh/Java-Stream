package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    Numbers numbers = new Numbers();

    @Test
    void shouldReturnListNumbersDivideThree() {
        String numbersDivideThree = String.valueOf(numbers.getListNumbersDivideThree(1, 23));
        assertEquals("[3, 6, 9, 12, 15, 18, 21]", numbersDivideThree);
    }
}