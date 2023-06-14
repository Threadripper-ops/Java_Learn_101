package com.lol.Functions;

import java.util.Scanner;

public class Suum {
    public static void main(String[] args) {
      //  int ans = sum2();
        //System.out.println(ans);
        int ans = sum3(56,33);
        System.out.println(ans);

    }
    //pass the value  of numbers when you are calling
    // the method in main ()
    static int sum3( int a , int b){
        int Sum = a+b;
        return Sum;

    }
    //Return the sum

    static int  sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no 1 ");
        int Num1 = in.nextInt();
        System.out.println("Enter no 2 ");
        int Num2 = in.nextInt();
        int Sum = Num1+Num2;
        return Sum;
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no 1 ");
        int Num1 = in.nextInt();
        System.out.println("Enter no 2 ");
        int Num2 = in.nextInt();
        int Sum = Num1+Num2;
        System.out.println("Sum is "+Sum);
    }
}
