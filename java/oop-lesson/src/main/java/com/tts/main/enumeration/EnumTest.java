package com.tts.main.enumeration;

public enum EnumTest {
    ONE("This is the first enum"), TWO("This is the second enum");

    private final String message;

    EnumTest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
