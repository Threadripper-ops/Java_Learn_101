package com.lol.Basics;

public class Condition_if {
    public static void main(String[] args) {
        int Salary = 15000;
        if (Salary > 20000) {
            Salary = Salary + 4000;
        } else if (Salary > 10000) {
            Salary += 2000;

        } else {
            Salary += 1000;
        }
        System.out.println(Salary);


    }
}