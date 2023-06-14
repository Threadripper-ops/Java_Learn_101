package com.lol.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,67,7,8,89,9);
        demo( "2", "4" ,"5");
        demo(1,2,3,4,5,6,7,8,9);

    }
    static void multiple( int a, int b, int c,String...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

