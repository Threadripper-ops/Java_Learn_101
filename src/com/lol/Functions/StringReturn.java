package com.lol.Functions;

import java.util.Scanner;

public class StringReturn {
    public static void main(String[] args) {
       // String message = greet();
        //System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        String name = in.next();
        String personlized= myGreet(name);
        System.out.println(personlized);
    }
    static String myGreet(String name){
        String message = "hello "+ name;
        return message;
    }
    static String greet(){
        String greeting = "how r u?";
        return greeting;
    }
}
