package com.tts.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatchTest {

    // global variable
    Watch myWatch = new Watch();

    String expected;
    String actual;

    @Test
    void getFaceTest() {
        expected = "miCkeY mOuSe";
        actual = myWatch.getFace();

//        assertEquals(expected, actual);
        assertEquals(0, expected.compareToIgnoreCase(actual));
    }

    @Test
    void getBandTest() {
        myWatch.setBand("leather");

        expected = "leather";
        actual = myWatch.getBand();

        assertEquals(0, expected.compareToIgnoreCase(actual));
    }



}