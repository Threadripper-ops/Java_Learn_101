package com.lol.Recursion;

public class NumbersEx {
    public static void main(String[] args) {
        // write a fxn that take a no and prints it
        // print no from 1 to 5

      print1(1);
//        print1(2);



    }

    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);

    }

    //fxn body is changed
    static void print5(int n){
        System.out.println(n);
    }}
// here all the fxns have same defination and body
    ///SO INSTEAD OF CREATING ANOTHER NEW FXN WE COUD