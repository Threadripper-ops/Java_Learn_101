package com.lol.OOPS.Inheritance;

public class Main {
    public static void main(String[] args){
        Box box= new Box(4.3,4.3,4.3);
//        Box box2 = new Box(box);


//        System.out.println(box.l+" "+ box.h+" "+box.w);
//        System.out.println(box2.l);
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 =new BoxWeight(2,3,4,5);
//
//        System.out.println(box3.h+" "+box3.weight);
//        System.out.println(box4.h+" "+box4.weight);
//
//
//        Box box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5.h+" "+box5.w);


        //there are many variable in both parent and child class
        // you are given the access to variables that are in the ref type i.e. BoxWeight
        // hence you should have access to weight variable
        // this means that the ones you are trying to access should be inlitialized
        // but here when the obj itself is of type parent class , How will you call  the constructor of the child class

      //  BoxWeight box6 = new Box(2,3,4);


        BoxPrice box7 = new BoxPrice(5 ,8,200);
    //    box.greeting();// it is conventionally incorrect

        // since greeting is static
        //though it can be called by the object

        // conventionally it should be called by the class name

        //i.e.

        Box.greeting();

        Box box8= new BoxWeight();
        box.greeting();
        BoxWeight.greeting();
        System.out.println(box.getL());
        // you can inherit but
        // you cant override static methods






    }
}
