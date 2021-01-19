package com.tts.main.calculator;

public class Calculator implements CalculatorService {

    @Override
    public int sub(int x, int y) {
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        return 0;
    }

    @Override
    public int divide(int x, int y) {
        return 0;
    }
}
