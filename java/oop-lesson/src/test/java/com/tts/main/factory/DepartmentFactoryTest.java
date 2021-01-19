package com.tts.main.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentFactoryTest {

    @Test
    void test() {
        Department actual = DepartmentFactory.createDepartment(DepartmentName.SALES, "Lisa");
        System.out.println(actual.getManager());
        assertEquals("Sales", actual.getName());
    }

}