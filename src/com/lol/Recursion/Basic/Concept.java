package com.lol.Recursion.Basic;

public class Concept {
    public static void main(String[] args) {

    }

    static void fin(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fin(--n);//n-- will give infinite loop and --n will give 5 4 3 2 1 as n-- will first print then decrement and --n will first decrement then print
    }
}
