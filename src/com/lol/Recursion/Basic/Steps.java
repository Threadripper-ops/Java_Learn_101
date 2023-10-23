package com.lol.Recursion.Basic;
//Leetcode 1342
public class Steps {

    public static void main(String[] args) {

    }

    public int noofstep(int n){
        return helper(n,0);
    }

    private int helper(int n, int steps) {
        if (n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);
    }

}
