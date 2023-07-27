package com.lol.OOP.SIngleton_Class;

public class Singleton {

    private Singleton(){

    }

    private static Singleton instance ;


    public static Singleton getInstance(){

        //' Check whether one obj is created or not
        if(instance == null){
            instance = new Singleton();

        }
        return instance;

    }


}
