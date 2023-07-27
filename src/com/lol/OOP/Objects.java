package com.lol.OOP;




public class Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
      //  s1.marks = 90.67f;
      //  s1.name = "Harsh";
       // s1.rno = 12;
        Student s2 = new Student(13, "shivam", 90.67f);
        System.out.println(s2.marks);
        System.out.println(s2.name);




        s1.greeting();

      //  s1.changeName("Sneakerhead");
        s1.greeting();

        System.out.println(s1.rno);
         Student random = new Student(s1);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);










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

    void changeName(String newName){
        name = newName;
    }

    // to pre initialize the objects
    // we use constructors
    // constructors are special methods
    // that have the same name as the class


    /// we need a way to add valuees of above proPERTIRS
    // object by object
////

    Student(){

        //this how you call a constructor from
        // another constructor
        this(13, "default person", 100.0f); // internally
        // this is like new Student();

    }
    Student( Student other){
        this.rno = other.rno;
        this.name= other.name;
        this.marks = other.marks;

    }
    /*Student(){
        this.rno = 123;
        // this keyword is used to
        // refer to the current object
        this.name = "Harsh";
        this.marks = 90.67f;
        }
        */


    /// eg Student s2 = new Student(13, "arpit", 90.67f);

    /// here this will be replaced by s2

    // this called initializing the object

    Student(int rno, String naam, Float marks){//these are called parameters
        this.rno = rno;
                                   // this keyword is used to
                                // refer to the current object
        this.name = naam;           // you con skip using this if the
                              // name of the parameter is different from the name of the property
        this.marks = marks; // But it is a good practice
                            // to use this

    }





}



