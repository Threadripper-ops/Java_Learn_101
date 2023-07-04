package com.lol.OOPS.Pakages.a;

import static com.lol.OOPS.Pakages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello World");
        message(); // here message is declared as public in destination package

    }
}
