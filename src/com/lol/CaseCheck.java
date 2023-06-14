package com.lol;

import java.util.Scanner;


public class CaseCheck {
    public static void main(String[] args) {
        // Check if a character is uppercase or lowercase
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        if (ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }
        else {
            System.out.println("uppercase");
        }




    }
}
