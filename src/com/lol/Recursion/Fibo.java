package com.lol.Recursion;

public class Fibo {
    public static void main(String[] args) {

        System.out.println(fibo(3));

    }


    static int fibo(int n) {

        //base condition
        if (n<2){
            return n;
        }
        return fibo(n-1)+(n-2);
    }
}
