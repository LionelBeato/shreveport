package com.tts.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // there are two main ideas on how to handle exceptions

    // LBYL = Look Before You Leap
    // you test and check code implementation before properly writing and executing

    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x/y;
        } else {
            return 0;
        }
    }

    // EAFP = Easier to Ask Forgiveness than Permission

    private static int divideEAFP(int x, int y) {
        try {
            return x/y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }
    // this means when you write and execute your code, something goes wrong

    private static int divide(int x, int y) {
        return x / y;
    }

    // the below scanner objet will throw an exception if the input is not an int
    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

//    public static int getIntLBYL() {
//        Scanner s = new Scanner(System.in);
//        boolean isValid = true;
//        System.out.println("Please enter a number.");
//        String input = s.next();
//
//        for(int i = 0; i <input.length(); i++) {
//            if(!Character.isDigit(input.charAt(i))) {
//                isValid = false;
//                break;
//            }
//        }
//        if(isValid) {
//            return Integer.parseInt(input);
//        }
//        return 0;
//    }

    public static int getIntEAFP() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void main(String[] args) {

        // attempting a piece of code
        // "trying" it

        int x = 100;
        int y = 0;
//        System.out.println(divide(x, y));

        System.out.println(divideLBYL(100, 2));
        System.out.println(divideEAFP(100, 2));

//        try {
//
//        } catch(Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("I am in a finally block! I will always run!");
//        }

        int z = getInt();
        System.out.println("Input an integer: ");
        int a = getIntEAFP();
        System.out.println("a is: "+ a);

    }


}
