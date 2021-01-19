package com.tts.main.calculator;

public interface CalculatorService {

    // with default you can implement default implementations
    default int add(int x, int y) {
        return x + y;
    }

    int sub(int x, int y);
    int multiply(int x, int y);
    int divide(int x, int y);

}
