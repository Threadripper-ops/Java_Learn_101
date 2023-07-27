package com.lol.OOP.Inheritance;

public class Box {
   private double l;
    double h;
    double w;

  //  @Override //
    // static methods cannot be overriden
    //as they are resolved at compile time
    static void greeting(){
        System.out.println(" Hey I am in Box class.Hello");
    }

    public double getL() {
        return l;
    }

    Box(){
        this.h= -1;
        this.l= -1;
        this.w = -1;

    }
    // cube
    Box(double side){
        this.l= side;
        this.h= side;
        this.w= side;

    }
    // these are constructors
    Box(double l, double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;

    }
    Box(Box old){
        this.l =old.l;
        this.h= old.h;
        this.w = old.w;

    }
// this is a method
    public void info(){
        System.out.println("running the box");

    }

}
