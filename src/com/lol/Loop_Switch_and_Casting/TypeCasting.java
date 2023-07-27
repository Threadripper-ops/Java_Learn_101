package com.lol.Loop_Switch_and_Casting;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
      /*  Scanner input = new  Scanner(System.in);
        float num = input.nextFloat();
        float num = input.nextInt();
        System.out.println(num);
        */
        //Type casting
      //  int num = (int)(97.789f);
        //System.out.println(num);
        //int a = 257;
        //byte b = (byte)(a);// in a byte max valn that can be stored is
                           // 256 here it is 257
        // so what compiler does 257 % 256 =1
        //System.out.println(b);
       /* byte a = 40;
        byte b= 88;
        byte c= 10;
        int d= a*b/c;
        System.out.println(d);


        byte b= 50;
        b = b*2;
        System.out.println(b);
        */
       // int n = 'A';
        //System.out.println(4*534.88);


        byte b = 42;
        char c = 'a';
        short s= 1024;
         int i = 50000;
         float f = 5.67f;
         double d= 0.1234;
         double result = ( f * b )+ (i/c) - (d - s);
         // resut float + int - double = double
        // here every thing is cnverted into bigger data type
        System.out.println(( f * b )+ " " + (i/c )+" " + (d-s));
        System.out.println(result);




    }
}
