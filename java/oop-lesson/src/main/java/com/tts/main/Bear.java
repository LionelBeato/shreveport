package com.tts.main;

import java.util.List;

public class Bear extends Animal implements Walkable, Communicatible {

    @Override
    public void doWalk() {
        System.out.println("This bear is walking...");
    }


    @Override
    public void doCommunication() {
        System.out.println("This bear peed on a tree");
    }

    @Override
    public void doEat() {
        // below is the original auto implementation of this method
        // super refers to the parent class of Bear
//        super.doEat();
        System.out.println("This bear is eating!");
    }
}
