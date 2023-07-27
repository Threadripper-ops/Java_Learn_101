package com.lol.OOP.AbstractDemo;

public class Son extends Parent{

    int age;

    public Son(int age) {
        this.age = age;
    }

    @Override
    void career(String name){
        System.out.println("I am going to be a "+ name);

    }
    @Override
    void partner(String name, int age){
        System.out.println("I am going to marry "+ name + ". And she is "+ age);

    }
}
