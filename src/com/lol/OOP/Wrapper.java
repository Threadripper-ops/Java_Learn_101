package com.lol.OOP;

public class Wrapper {
    public static void main(String[] args) {

        Integer a = 13;
        Integer b = 12;
        swap(a, b); // the value of a and b is changed
        // under this fxn scope only
        System.out.println(a + "  " + b); //but not the actual value of a and b
        // so when we print a and b it will print the actual value of a and b
         A kunal = new A("kunal kushwaha");
         kunal.name="other name";
//         when a non primitive is final ,
        // then you cnt reassign it to a new object,
         //kunal = new A("new object");

        A obj = new A("Rnamijd");
        System.out.println(obj);     // it prints some hash value /
        // but we want it to print the name we declared above
        // so in order to do this we use "Ovveride".





    }


    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println(a + "  " + b);


    }



}
class A{
    final int num = 10;
     String name;

    public A(String name) {
        this.name = name;
    }
}
