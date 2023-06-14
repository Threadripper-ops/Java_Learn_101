package com.lol.Assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user  does not press x or X
        int ans = 0;
        while (true) {
            // Take operator as input
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
                System.out.println("Enter the numbers: ");

                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;

                }
                if (op == '*') {
                    ans = num1 * num2;

                }
                if (op == '/') {
                    if (num2 == 0) {
                        System.out.println("Cant divide by 0");
                    } else{
                        ans = num1 / num2;
                    }

                }

                if (op == '%') {
                    ans = num1 % num2;

                }

            } else if (op == 'x' || op == 'X') {
                    System.out.println("Invalid operator");
                    break;

                } else{
                System.out.println("Invalid");

            }
            System.out.println(ans);
        }
    }
}