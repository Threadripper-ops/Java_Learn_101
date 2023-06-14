package com.lol.OOPS;




public class Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
      //  s1.marks = 90.67f;
      //  s1.name = "Harsh";
       // s1.rno = 12;
        s1.greeting();

        System.out.println(s1.rno);

    }
}


class Student {

    //class are logical constructs
    // that represent real world entities

    // objects are physical reality of these logical constructs


    // class is a blueprint for an object
    int rno;
    String name;
    Float marks;


    void greeting(){
        System.out.println("Hello i am "+ name);
    }

    // to pre initialize the objects
    // we use constructors
    // constructors are special methods
    // that have the same name as the class


    /// we need a way to add valuees of above proPERTIRS
    // object by object
    Student(){
        this.rno = 123;
        // this keyword is used to
        // refer to the current object
        this.name = "Harsh";
        this.marks = 90.67f;
    }






}



