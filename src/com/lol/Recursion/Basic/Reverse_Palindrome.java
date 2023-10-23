package com.lol.Recursion.Basic;

public class Reverse_Palindrome {

    public static void main(String[] args) {
        int n = 454;
        rev(n);
        System.out.println(sum);
        System.out.println(rev2(n));
        System.out.println(Palindrome(n));

    }//for reverse

   static int sum =0;
    static void rev(int n){
        if (n==0){
            return;
        }
        int rem= n%10;
        sum = sum*10+rem;
        rev(n/10);
    }

    static int rev2(int n){
       //sometimes we need some additional variable in the argument
        //in that case make another function
        int digit = (int)Math.log10(n)+1;

        return helper(n,digit);


    }

    private static int helper(int n, int digit) {
        if (n%10==n){
            return n;
        }
        int rem = n%10;
        return rem* (int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
    }


    //palindrome

    static boolean Palindrome(int n){
        return n == rev2(n);
    }
}
