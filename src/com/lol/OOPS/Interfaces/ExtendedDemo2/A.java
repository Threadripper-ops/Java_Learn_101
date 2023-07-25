package com.lol.OOPS.Interfaces.ExtendedDemo2;

public interface A {

    //static method should have a valid body

    // call via the interface name
    static void greeting(){
        System.out.println("hey i am a static method in interface A");
    }

    default void fun(){
        System.out.println("I am in A");
    }


}
