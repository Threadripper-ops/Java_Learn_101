package com.lol.Functions;

public class Shadowing { // this bracket is block of x
    static int x = 10;// x is avaliable for everyhing inside the block of x
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x;
        x= 678;// this will shadow the x of line 4
        System.out.println(x);//678
        fun(); // 90


    }
    static void fun(){
        System.out.println(x); // no error since this fxn is inside block of x
        // so x is availiable for this fxn
    }


}
