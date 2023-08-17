package com.lol.Strings;

import com.lol.Arrays_Arraylist.ArrayList_eg;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+ 'b'); // any mathematical operators performed in charaters are performed and returned as thier integer value

        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        // when an integer is concatinated with a string it will be converted to its wrapper class
        // Integer that calls the tostring() method

        System.out.println("Kullu"+ new ArrayList<>());
    }
}
