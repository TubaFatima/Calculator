package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void subtract() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    void multiplication() {
        assertEquals(16, calculator.multiplication(8,  2));
    }

    @Test
    void divide() {
        assertEquals(3, calculator.divide(6, 2));
    }
}