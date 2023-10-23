package com.lol.Recursion.Basic;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println(sumOf(1343));
        System.out.println(productof(1303));

    }

    static int sumOf(int n){
        if(n==0){
            return 0;

        }
        return sumOf(n/10)+n%10;

    }

    static int productof(int n){
        if(n%10==n){
            return n;
        }
        return n%10*productof(n/10);
    }
}
