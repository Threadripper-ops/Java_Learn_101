package com.lol.Assignments;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Find the largest number from 3 numbers
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
       /* int max = a;
        if (b>max){
            max = b;

        }
        if (c>max){
            max = c;
        }
        System.out.println(max);
*/
        int max= Math.max(a,Math.max(b,c));
        System.out.println(max);
    }
}
