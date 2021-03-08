package com.tts.threads;

import java.util.concurrent.atomic.AtomicInteger;

// what is synchronization?
// synchronization is the tool we utilize to avoid thread interference
// and memory consistency errors
// one thing to note, sync can also cause thread contention
// this is when two or more threads try to access the same resource simultaneously
// resource being same variable/memory location/what-have-you
// this is synchronization as in "working together"
public class SynchronizedCounter {

    private AtomicInteger c = new AtomicInteger(0) ;

//    public synchronized void increment() {
//        c++;
//    }
//
//    public synchronized void decrement() {
//        c--;
//    }
//
//    public synchronized int value() {
//        return c;
//    }


    public void increment() {
        c.incrementAndGet();
    }

    public void decrement() {
        c.decrementAndGet();
    }

    public int value() {
        return c.get();
    }

}
