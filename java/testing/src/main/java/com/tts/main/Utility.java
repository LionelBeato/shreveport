package com.tts.main;

public class Utility {

    public static int y = 3;

    public static String echoBack(String phrase) {
        return phrase;
    }

    public static void changeY(){
        y = y + 4; // this is a side effect in an impure function/method
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }



}
