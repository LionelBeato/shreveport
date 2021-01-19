package com.tts.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PianoTest {


    @Test
    void test() {
        Piano myPiano = new Piano();
        myPiano.name = "my piano";
        System.out.println(myPiano.name);
        assertEquals("my piano", myPiano.name);
    }

}