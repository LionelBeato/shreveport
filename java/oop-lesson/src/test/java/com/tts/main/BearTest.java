package com.tts.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void test(){
        Bear myBear = new Bear();
        Animal myAnimal = new Animal();
        myBear.doEat();
        myAnimal.doEat();
    }

}