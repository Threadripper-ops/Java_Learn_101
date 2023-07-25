package com.lol.OOPS.AbstractDemo;

public abstract class Parent {
//    int age;
//    final int Value;
//
//    public Parent(int age) {
//        this.age = age;
//        Value = 938439;
//    }

    abstract void career(String name); // abstract method
    abstract void partner(String name, int age);

    static void hello(){
        System.out.println("Hello");
    }
    void normal(){
        System.out.println("this is a normal method");

    }
}
