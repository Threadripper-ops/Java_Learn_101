package com.lol.OOP.SIngleton_Class;

import com.lol.OOP.access.A;

public class Subclass extends A {
    public Subclass (int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass obj= new Subclass(12,"ansh");
        int n = obj.num; //here you can acess the protected member of the parent class

        A obj1 = new A(12,"hello");
       // int n2 = obj1.num; //here you can acess the protected member of the parent class

        //it can be only accessed by the subclass of the parent class
        //not even the parent class object can
        // access it when initialised in different pakage

        // in simple words in the same package
        // the protected member can be accessed by the parent class object and subclass object

        // in different package
        // the protected member can be accessed by the subclass object only
    }
}

class SubSubclass extends Subclass{
    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(12,"ansh");
        int n = obj.num;
    }
}

class Subclass2 extends A{
    public Subclass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass2 obj = new Subclass2(12,"ansh");
        int n = obj.num;
    }
}
