package pl.coderslab.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        int result = Calculator.add(5,10);

        assertEquals(15, result);
    }

    @Test
    void shouldAddTwoNegativeNumbers() {
        int result = Calculator.add(-5,-10);

        assertEquals(-15, result);
    }

    @Test
    void shouldAddNegativeAndPositiveNumbers() {
        int result = Calculator.add(-5,10);

        assertEquals(5, result);
    }
}