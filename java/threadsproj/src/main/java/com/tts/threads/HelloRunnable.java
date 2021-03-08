package com.tts.threads;

public class HelloRunnable implements Runnable {

    public HelloRunnable(String message) {
        this.message = message;
    }

    private final String message;

    @Override
    public void run() {
        System.out.println(message);
    }

}
