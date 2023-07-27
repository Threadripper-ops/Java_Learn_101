package com.lol.OOP.Object_Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(34,"Rahul");
       // Human clone = new Human(h1); // Using new keyword takes a lot of memory
        // and processing time as a new object is created. Thus making our code less efficient.

        // Thus we use cloning.

        Human twin1 = (Human) h1.deepClone();
        System.out.println(twin1.age);
        System.out.println(twin1.name);
        System.out.println(Arrays.toString(twin1.arr));

        twin1.arr[0]=99;
        System.out.println(Arrays.toString(twin1.arr));
        System.out.println(Arrays.toString(h1.arr));




    }
}
