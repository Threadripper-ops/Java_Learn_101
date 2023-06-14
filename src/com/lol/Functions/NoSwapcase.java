package com.lol.Functions;

public class NoSwapcase {
    public static void main(String[] args) {
        int a = 10;
        int b =34;
// These are two cases where swap wont work.
        swap(a,b);
        System.out.println(a+"  "+b);
        String name = "tumpa";
        changeName(name);
        System.out.println(name);




    }
    static void changeName(String name){
        name="bonda";//creating a new object called"bonda"
        // which is pointed by the reference variable name.

        ///here we arnt changing the value of name,
        // we are just changing the value of the variable name.
// ie. we ant changing the object but creating a new object.
//scope
    }
    static void swap(int num1, int num2) {
        int temp= num1;
        num1=num2;
        num2= temp;

/// this change is only in the scope of the function.
// the value of a and b is not changed.
// the value of num1 and num2 is changed.
        
    }
}

