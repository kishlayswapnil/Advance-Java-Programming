package com.bridgelabz.design_patterns.creational;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if(instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeSingleton es= getInstance();
        System.out.println(es);

        // only one instance will be created.
        ThreadSafeSingleton es1= getInstance();
        System.out.println(es1);
        ThreadSafeSingleton es2=getInstanceUsingDoubleLocking();
        System.out.println(es2);
    }
}