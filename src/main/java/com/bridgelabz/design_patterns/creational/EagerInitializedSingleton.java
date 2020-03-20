package com.bridgelabz.design_patterns.creational;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //A private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {

    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {

        //Creating an instance
        EagerInitializedSingleton es= getInstance();
        System.out.println(es);

        //Only one instance will be created.
        EagerInitializedSingleton es1= getInstance();
        System.out.println(es1);
    }
}

