import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("2 + 1 = 3")
    void addsTwoNr(){
        Calculator calculator = new Calculator();
        int expected = 3;
        assertEquals(expected, calculator.add(2, 1), message("2 + 1 should equal 3"));
    }
    @Test
    @DisplayName("2 - 1 = 1")
    void subTwoNr(){
        Calculator calculator = new Calculator();
        int expected = 1;
        assertEquals(expected, calculator.subtract(2, 1), message("2 - 1 should equal 1"));
    }
}