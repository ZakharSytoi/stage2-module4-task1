package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }

    public synchronized static ThreadSafeSingleton getInstance(){
        if (instance == null) {
            return new ThreadSafeSingleton();
        }
        return instance;
    }
}
