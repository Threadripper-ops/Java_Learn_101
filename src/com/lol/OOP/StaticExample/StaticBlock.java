package com.lol.OOP.StaticExample;

// demo to show initialization of static variables
public class StaticBlock {

    static int a = 4;
    static int b;

    // static block
    // will only run when the first obj is created
    // i,e when the class is loaded for the first time

    static {
        System.out.println("Static block initialized.");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock stat = new StaticBlock();
        System.out.println(
                StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(b);
        StaticBlock obj2 = new StaticBlock();

    }

}
