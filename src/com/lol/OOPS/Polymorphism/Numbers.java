package com.lol.OOPS.Polymorphism;

public class Numbers {

    // example of method overloading
    //or say compile time/static  polymorphism
    double sum(double a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers n = new Numbers();
        System.out.println(n.sum(1,2));
        System.out.println(n.sum(1,2,3));
    }
}
