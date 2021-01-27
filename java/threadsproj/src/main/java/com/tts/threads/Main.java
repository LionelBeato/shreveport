package com.tts.threads;

import java.util.ArrayList;
import java.util.List;

// liveness - this describes a concurrent applications ability to execute in a timely manner
// deadlock - this describes when two threads are blocked forever, waiting for each other

// one thing to note about immutability:
// immutable objects are very important to concurrent development because they cannot be corrupted
// they also can't be observed in inconsistent state

// some strategies for immutability
// final and private on fields/ private on methods
// think of final as they const keyword in javascript and other languages
// disallow subclasses to override methods
// final can also provide this functionality in a class definition
public class Main {

    private String lastName;
    private int nameCount;
    private List<String> nameList = new ArrayList<>();

//    public void gaurdedJoy() {
//        while(!joy) {
//            try{
//                wait();
//            } catch (InterruptedException e) {
//
//            }
//        }
//        System.out.println("Joy has been achieved");
//    }
//
//    public synchronized notifyJoy() {
//        joy = true;
//        notifyAll();
//    }


    public void addName(String name) {
        // here we are utilizing a synchronized statement
        // this performs in the same way as the synchronized keyword on a method
        synchronized (this) {
            lastName = name;
            nameCount++;
        }
        nameList.add(name);
    }

    // within the Java API there is indeed a Thread object


    // there's something unique about our main method
    // this main method is also known as the main thread!
    public static void main(String[] args) throws InterruptedException {



        // you can instantiate as many threads as you want
        // all threads will accept a Runnable object
        // these threads will resolve independently of when they were instantiated and started
        Thread thread = new Thread(new HelloRunnable("Hello from the first thread"));
        Thread threadTwo = new Thread(new HelloRunnable("Hello from the second thread"));
        Thread threadThree = new Thread(new HelloRunnable("Hello from the third thread"));

        thread.start();
        threadTwo.start();
        threadThree.start();


        // below is the utilization of a lambda for creating a runnable
        // this is possible because Runnable is a functional interface
        Runnable runnable = () -> System.out.println("Hello from lambda");


        Thread functionalThread = new Thread(runnable);
        functionalThread.start();

        Runnable pausableRunnable = () -> {
            try {
                System.out.println("Hold on, I have to take a quick nap...");
                Thread.sleep(4000);
                System.out.println("Hello from pausable lambda");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread pausedThread = new Thread(pausableRunnable);
        pausedThread.start();

        // the join() method will wait for the calling thread to die
        // t.join();

        // an interrupt is an indication to a thread that it should stop what its doing and do something else

        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

        Runnable myRunnableSync = () -> {
            synchronizedCounter.increment();
            System.out.println("Number from sync counter: " + synchronizedCounter.value());
        };

        Thread myThreadSync = new Thread(myRunnableSync);
        Thread myOtherThreadSync = new Thread(myRunnableSync);

        myThreadSync.start();
// this join will make the effects of the code in the thread visible to the thread that performed
// the join
//        myThreadSync.join(1000);
        myOtherThreadSync.start();
//        myOtherThreadSync.join(1000);

        System.out.println("last number from sync counter: " + synchronizedCounter.value());


    }
}

// below is yet another approach to creating a thread
// note that this class extends Thread
//class HelloThread extends Thread {
//
//    public void run() {
//        System.out.println("Hello from a thread!");
//    }
//
//    public static void main(String args[]) {
//        (new HelloThread()).start();
//    }
//
//}

// class MyClass {
//    private long c1 = 0;
//    private long c2 = 0;
//    private Object lock1 = new Object();
//    private Object lock2 = new Object();
//
//    public void inc1() {
//        synchronized(lock1) {
//            c1++;
//        }
//    }
//
//    public void inc2() {
//        synchronized(lock2) {
//            c2++;
//        }
//    }
//}