package com.lol.OOP.access;

public class Subclass extends A{
    public Subclass (int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass obj= new Subclass(12,"ansh");
        int n = obj.num;

        System.out.println(obj instanceof A);
    }
}
