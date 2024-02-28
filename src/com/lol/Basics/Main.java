package com.lol.Basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String ch = in.next();

        switch (ch){
            case "Integer":
                System.out.println(4);
                break;
            case "Long":
                System.out.println(8);
                break;
                case "Float":
                    System.out.println(4);
                    break;
            case "Double":
                System.out.println(8);
                break;
            case "Character":
                System.out.println(1);
                break;
            default:
                System.out.println("Invalid Input");

        }
    }
}