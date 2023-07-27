package com.lol.Loop_Switch_and_Casting;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of fruit: ");
        String fruit = in.next();
      /*  if (fruit.equals("mango")) {
            System.out.println("king of fruits");
        } else if (fruit.equals("apple")) {

            System.out.println("red fruit");
        } else if (fruit.equals("banana")) {
            System.out.println("yellow fruit");
        } else {

            System.out.println("invalid fruit");
        }  */

        ///The above code can be written as: SWITCH STATEMENT


        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("red fruit");
            case "orange" -> System.out.println("round fruit ");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("invalid fruit");
        }


        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("invalid day");

        }


        int Day = in.nextInt();

        switch (Day) {
            case 1:
            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Weekday");
                break;
            case 6:

            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
        // The above code can be written as: ENHANCED SWITCH STATEMENT

      /*  int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("weekend");
            default -> System.out.println("invalid day");
        } */
    }
}



