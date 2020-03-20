package com.bridgelabz.design_patterns.creational;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){

    }

    public static LazyInitializedSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        LazyInitializedSingleton objInstance= getInstance();
        System.out.println(objInstance);

        // only one instance will be created.
        LazyInitializedSingleton obj2Instance= getInstance();
        System.out.println(obj2Instance);
    }
}

