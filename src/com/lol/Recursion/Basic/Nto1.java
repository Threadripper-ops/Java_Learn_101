package com.lol.Recursion.Basic;

public class Nto1 {
    public static void main(String[] args) {
      //  print(5);
        rev(5);
    }

    static void print(int n){
        if (n==0){
            return;
        }
        System.out.println(n);// this print whlie going up the stack / making  the calls
        print(n-1);
    }

    /// for printing 1 to n

    static void rev(int n){
        if (n==0) {
            return;
        }
        rev(n-1);
       System.out.println(n);// this will print while coming down the stack / returning from the calls
    }



    static void both(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }

}
