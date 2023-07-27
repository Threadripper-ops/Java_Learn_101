package com.lol.OOP.Polymorphism;

public class ObjectPrint {

    int num; //this is a variable

    ObjectPrint(int num) { //constructor
        this.num = num;
    }

    @Override // to check if the method is overriden or not
    // the default string which prints hashcode is overriden
    //by this method
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(33);
        System.out.println(obj); //this will print the address of the object called hashcode/ hashmap

                                 // hashcode is a unique number given to every object
                                  // it is a hexadecimal number
                                  // written in the given form
                               // classname@hashcode


    }
}
