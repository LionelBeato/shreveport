package com.tts.main.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {

        Calculator newCalculator = new Calculator();
        var actual = newCalculator.add(3, 3);
        assertEquals(6, actual);

    }
}