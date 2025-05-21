import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    @DisplayName("Add two numbers")
    public void add() {
        assertEquals(4, Calculator.add(2, 2));
        assertEquals(0, Calculator.add(2, -2));
        assertEquals(-2, Calculator.add(-4, 2));
        assertEquals(-5, Calculator.add(-2, -3));

    }

    @Test
    @DisplayName("Multiply two numbers")
    public void multiply() {
        assertAll(
                () -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0))
        );
    }

    @Test
    @DisplayName("Subtract two numbers")
    public void subtract() {
        assertAll(
                () -> assertEquals(0, Calculator.subtract(2, 2)),
                () -> assertEquals(0, Calculator.subtract(-2, -2)),
                () -> assertEquals(4, Calculator.subtract(2, -2)),
                () -> assertEquals(-5, Calculator.subtract(-2, 3))
        );
    }

    @Test
    @DisplayName("Divide two numbers")
    public void divide() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(2, 0));

        assertAll(
                () -> assertEquals(1, Calculator.divide(2, 2)),
                () -> assertEquals(-1, Calculator.divide(2, -2)),
                () -> assertEquals(0.5, Calculator.divide(-1, -2)),
                () -> assertEquals(2, Calculator.divide(-2, -1))
        );
    }
}