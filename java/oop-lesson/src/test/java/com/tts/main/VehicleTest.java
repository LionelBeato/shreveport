package com.tts.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void test() {
        Vehicle myVehicle = new Vehicle();
        myVehicle.drive();
        assertEquals(4, myVehicle.wheels);
    }

}