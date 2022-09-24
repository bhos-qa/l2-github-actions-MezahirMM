import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertAll(() -> assertEquals(8, Calculator.add(4, 4)),
                () -> assertEquals(-8, Calculator.add(-4, -4)),
                () -> assertEquals(-7, Calculator.add(-2, -5)),
                () -> assertEquals(0, Calculator.add(1, -1)));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(6, Calculator.multiply(3, 2)),
                () -> assertEquals(-8, Calculator.multiply(2, -4)),
                () -> assertEquals(10, Calculator.multiply(-2, -5)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}



