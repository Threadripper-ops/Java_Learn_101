package com.lol.OOPS.Interfaces.ExtendedDemo2;

public class Main implements B,A {

    @Override
    public void greet() {
        System.out.println("I am greet");

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.greet();
        obj.fun();
        A.greeting();
    }

}
