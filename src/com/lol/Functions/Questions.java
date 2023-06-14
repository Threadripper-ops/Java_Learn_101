package com.lol.Functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        // check for prime number
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
       // System.out.println(isPrime(n));
      //  System.out.println(isArmstrong(n));
        //All armstrong no between a range
        for(int i=1;i<1000; i++){
            if (isArmstrong(i)){
                System.out.print(i+" ");
            }
        }


    }
    // print is armstrong number
     static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n/=10;
            sum = sum + rem*rem*rem;


        }
         return sum == original;
     }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;

        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;


    }
}
