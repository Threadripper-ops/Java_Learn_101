package com.lol.Recursion.Basic;

public class Fibo {
    public static void main(String[] args) {


            System.out.println(fibo(5));


    }


    static int fibo(int n) {

        //base condition
        if (n<2){

            return n;
        }



        return fibo(n-1)+(n-2);
    }

    //printing the fibo series:
    static void fibop(int n){

        //base condition
        if (n==0 || n==1){
            System.out.println(n+", ");
        }

        int a = 0;
        int b = 1;
        int c = a+b;


    }
}
