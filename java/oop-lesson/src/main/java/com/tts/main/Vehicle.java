package com.tts.main;

// what is a class?
// classes are blueprints for objects
// they're also just a bundle of data

public class Vehicle implements Driveable {
    // every instance of Vehicle will have the following prop
    int wheels = 4;

    //annotation
    // overrides change the method implementation
    @Override
    public void drive() {
        System.out.println("The vehicle is driving...");
    }

    // you do not need to create a constructor
    // all classes have an implicit constructor
}
