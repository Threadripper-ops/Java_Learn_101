package com.lol.Recursion;

public class NumexRecuersion {
    public static void main(String[] args) {
        print(1);

    }
    // since all the other fxns have same definition
    // instead  of creating seperate fxns and calling them
    // call the same fxn inside the function.now the fxn becomes a recursive fxn.

    static void print(int n) {

        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

}