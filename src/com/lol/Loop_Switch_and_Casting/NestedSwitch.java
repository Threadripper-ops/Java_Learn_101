package com.lol.Loop_Switch_and_Casting;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1 -> System.out.println("bpp");
            case 2 -> System.out.println("bca");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("invalid department");
                }
            }
            default -> System.out.println("invalid employee id");
        }
        }
    }

