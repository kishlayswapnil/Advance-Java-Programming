package com.bridgelabz.design_patterns.creational;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton() {

    }

    //static block initialization for exception handling
    static {
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
    public static void main(String[] args) {
        StaticBlockSingleton es= getInstance();
        System.out.println(es);

        // only one instance will be created.
        StaticBlockSingleton es1= getInstance();
        System.out.println(es1);
    }
}