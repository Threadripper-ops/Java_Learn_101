package com.lol.OOPS.SIngleton_Class;

public class Maian {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();// obj 1 , 2  all 2 ref variable point the same obj
    }// all two ref variable point to the same obj
}
