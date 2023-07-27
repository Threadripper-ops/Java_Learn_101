package com.lol.OOP.AbstractDemo;

public class Daughter extends Parent{

    String name;
    int age;




    public Daughter(String name, int age) {
        this.age = age;
        this.name = name;

    }


    @Override
    void career(String name){
        System.out.println("I am "+this.name
                +" aged "+ this.age+" and I am going to be a housewife");

    }
    @Override
    void partner(String name, int age){
        System.out.println("I am going to marry "+name+" because i love him. And he is "+ age);

    }
}
