package com.lol.OOPS.Interfaces.ExtendDemo;

public class Main implements B {
    @Override
    public void fun() {
        System.out.println("I am fun");


    }

    @Override
    public void greet() {
        System.out.println("I am greet");

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.fun();
        m.greet();
    }
}
