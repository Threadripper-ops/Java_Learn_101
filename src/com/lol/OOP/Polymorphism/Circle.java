package com.lol.OOP.Polymorphism;

public class Circle extends Shapes{
    @Override // this is called annotation
            // use this to check if the
        // method is actually overriden

    // this will run when obj of circle is created
    //hence it is ovveriding the parent method

    void area(){
    System.out.println("Area is pi*r*r");
}
}
