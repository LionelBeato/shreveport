package com.tts.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    // these variables are expected to be used in every test
    // and should be global
    int x = 4;
    int y = 6;

    // this resolves before each test and we can set up and initialize our
    // variables here if we wanted to
    @BeforeEach
    public void setUp() {
        System.out.println("Running test!");
    }

    @Test
    void echoBackTest() {
        String expected = "hello";
        assertEquals(expected, Utility.echoBack("hello"));
    }

    @Test
    public void addTest() {
        int expected = x + y;
        assertEquals(expected, Utility.add(x,y));
    }

    // this method is to show that you can force your test to fail
    // if its not implemented
    @Test
    void sampleTest() {
//       fail("Not yet implemented.");
        assertTrue(true);
    }

    @Test
    void multiplyTest() {
        int expected = x * y;
        int actual = Utility.multiply(x, y);

        assertEquals(expected, actual);
    }

}