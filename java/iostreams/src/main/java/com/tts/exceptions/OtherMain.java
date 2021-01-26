package com.tts.exceptions;

public class OtherMain {

    public static void tryToDoAThing(String thing) throws MyException, NoException {
        if (thing.equals("do thing")) {
            System.out.println("Thing was done");
        } else if (thing.equals("no")) {
             throw new NoException();
        } else {
            // keep in mind that exceptions can be explicitly thrown in your code
            throw new MyException();
        }
    }


    public static void main(String[] args) {

        try {
            tryToDoAThing("no");
        } catch (MyException e) {
            e.printStackTrace();
        } catch (NoException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Wrapping up...");
        }
    }


}
