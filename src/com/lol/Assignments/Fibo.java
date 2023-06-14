package com.lol.Assignments;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        // find the nth fibonacci number
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int a = 0;
         int b = 1;
         int count = 2;

         while (count<=n) {
             int temp = b;
             b = a + b;
             a = temp;
             count++;
         }
        System.out.println(b);

         /*In this code, count is a variable that
         keeps track of the current position in the
         Fibonacci sequence. It starts at 2 because
         the first two numbers in the sequence are
         already defined as a = 0 and b = 1.
         The while loop runs until count is greater
         than n, which is the position of the desired
          Fibonacci number entered by the user.
          Inside the loop, count is incremented
          by 1 each time to move to the next
          position in the sequence. When the loop
           finishes, b will contain the nth Fibonacci
           number and it is printed to the console.
          */

         }




    }
