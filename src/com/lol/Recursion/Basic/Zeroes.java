package com.lol.Recursion.Basic;


public class Zeroes {
    public static void main(String[] args) {
        System.out.println(count(100));
    }

    static int count(int n){
        if (n==0){
            return 0;
        }
        //return n%10==0?1+count(n/10):count(n/10);

        if(n%10==0){
            return 1+count(n/10);
        }
        return count(n/10);
    }

    //m2
    static int count2(int n){

        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0) {
            return helper(n / 10, c + 1);
        }
        return helper(n/10,c);
    }
}
