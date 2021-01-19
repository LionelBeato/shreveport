package com.tts.main.enumeration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

//    public static void checkDay(Day day){
//        switch (day) {
//            case MONDAY -> System.out.println("Monday's are bad");
//            case FRIDAY -> System.out.println("Friday's are better");
//            case SATURDAY, SUNDAY -> System.out.println("Weekends are best");
//            default -> System.out.println("midweeks are so-so");
//        }

//        switch (day) {
//            case MONDAY:
//                    System.out.println("hello this is monday");
//                    break;
//            case FRIDAY:
//
//        }
//    }

    @Test
    void test() {
        Day.checkDay(Day.TUESDAY);
    }

}