package com.bridgelabz.design_patterns.creational;

public class EnumSingletonImplementation {
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        instance1.integer = 5;

        // Calling show() using instance1.
        instance1.show();
        System.out.println("Instance1 : "+instance1.hashCode());

        // Without Enum We might get the value of instance1.show() as 5 for no matter how many time you call the method
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        instance2.integer = 8;

        // Calling show() using instance1
        instance1.show();
        System.out.println("Instance2: "+instance2.hashCode());
    }
}

enum EnumSingleton {
    INSTANCE;
    int integer;
    public void show() {
        System.out.println(integer);
    }
}
