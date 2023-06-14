package com.lol.Functions;

public class Overloading {
    public static void main(String[] args) {
        int ans = sum(1,2);
        System.out.println(ans);
        int bns = sum(1,2,3);
        System.out.println(bns);

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name ){
        System.out.println(name);
    }
    static int  sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c ){
        return a+b+c;


    }
}
