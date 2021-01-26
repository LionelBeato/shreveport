package com.tts.exceptions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.tts.exceptions.OtherMain.tryToDoAThing;
import static org.junit.jupiter.api.Assertions.*;

class OtherMainTest {

    String s;
    String otherS;

    @BeforeEach
    void setUp() {
        s = "I don't want to do a thing!";
        otherS = "no";
    }

    @Test
    void tryToDoAThingTest() {
        // this is a variable that will hold the actual message from our exception
        Exception exception = assertThrows(MyException.class,
                () -> tryToDoAThing(s));

        String actual = exception.getMessage();
        String expected = "You can't do that!";

        assertTrue(actual.contains(expected));
    }

    @Test
    void whenICallMethodWithNo_ThenIShouldGetBackNoExceptionMessage() {
        Exception exception = assertThrows(NoException.class,
                () -> tryToDoAThing(otherS));

        String actual = exception.getMessage();
        String expected = "Don't say no to me!";

        assertTrue(actual.contains(expected));
    }
}