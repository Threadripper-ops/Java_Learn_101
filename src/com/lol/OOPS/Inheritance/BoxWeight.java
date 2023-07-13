package com.lol.OOPS.Inheritance;

public class BoxWeight extends Box{
 double weight;

 public BoxWeight(){
     this.weight = -1;
 }
 BoxWeight (BoxWeight othrt){
     super(othrt);
     this.weight = othrt.weight;
 }
 BoxWeight(double side, double weight) {
     super(side);
     this.weight = weight;
 }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // its job ? calling the constructor of the super class
        // super() used  to initialize values present in the super class but only those which are public

     //   System.out.println(super.h);

        this.weight = weight;



    }
    // @Override
    static void greeting(){
        System.out.println(" Hey I am in BoxWeight class.Hello");
    }
}
