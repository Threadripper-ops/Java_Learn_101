package com.lol.Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b =34;
//         //

//        //swap num code
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+"  "+b);
        String name = "tua";
        changeName(name);
        System.out.println(name);




    }
    static void changeName(String name){
        name="bonda";

    }
        static void swap(int a, int b) {
            int temp= a;
            a=b;
            b= temp;

            //this change is only valid in this fxn scope only
//the value of a and b is not changed.



        }
    }




